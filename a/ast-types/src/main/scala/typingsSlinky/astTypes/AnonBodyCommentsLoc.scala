package typingsSlinky.astTypes

import typingsSlinky.astTypes.kindsMod.ClassMethodKind
import typingsSlinky.astTypes.kindsMod.ClassPrivateMethodKind
import typingsSlinky.astTypes.kindsMod.ClassPrivatePropertyKind
import typingsSlinky.astTypes.kindsMod.ClassPropertyDefinitionKind
import typingsSlinky.astTypes.kindsMod.ClassPropertyKind
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.MethodDefinitionKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSCallSignatureDeclarationKind
import typingsSlinky.astTypes.kindsMod.TSConstructSignatureDeclarationKind
import typingsSlinky.astTypes.kindsMod.TSDeclareMethodKind
import typingsSlinky.astTypes.kindsMod.TSIndexSignatureKind
import typingsSlinky.astTypes.kindsMod.TSMethodSignatureKind
import typingsSlinky.astTypes.kindsMod.TSPropertySignatureKind
import typingsSlinky.astTypes.kindsMod.VariableDeclaratorKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyCommentsLoc extends js.Object {
  var body: js.Array[
    MethodDefinitionKind | VariableDeclaratorKind | ClassPropertyDefinitionKind | ClassPropertyKind | ClassPrivatePropertyKind | ClassMethodKind | ClassPrivateMethodKind | TSDeclareMethodKind | TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
  ]
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object AnonBodyCommentsLoc {
  @scala.inline
  def apply(
    body: js.Array[
      MethodDefinitionKind | VariableDeclaratorKind | ClassPropertyDefinitionKind | ClassPropertyKind | ClassPrivatePropertyKind | ClassMethodKind | ClassPrivateMethodKind | TSDeclareMethodKind | TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ],
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): AnonBodyCommentsLoc = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyCommentsLoc]
  }
}

