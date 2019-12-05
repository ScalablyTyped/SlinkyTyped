package typingsSlinky.astDashTypes

import typingsSlinky.astDashTypes.genKindsMod.ClassMethodKind
import typingsSlinky.astDashTypes.genKindsMod.ClassPrivateMethodKind
import typingsSlinky.astDashTypes.genKindsMod.ClassPrivatePropertyKind
import typingsSlinky.astDashTypes.genKindsMod.ClassPropertyDefinitionKind
import typingsSlinky.astDashTypes.genKindsMod.ClassPropertyKind
import typingsSlinky.astDashTypes.genKindsMod.CommentKind
import typingsSlinky.astDashTypes.genKindsMod.MethodDefinitionKind
import typingsSlinky.astDashTypes.genKindsMod.SourceLocationKind
import typingsSlinky.astDashTypes.genKindsMod.TSCallSignatureDeclarationKind
import typingsSlinky.astDashTypes.genKindsMod.TSConstructSignatureDeclarationKind
import typingsSlinky.astDashTypes.genKindsMod.TSDeclareMethodKind
import typingsSlinky.astDashTypes.genKindsMod.TSIndexSignatureKind
import typingsSlinky.astDashTypes.genKindsMod.TSMethodSignatureKind
import typingsSlinky.astDashTypes.genKindsMod.TSPropertySignatureKind
import typingsSlinky.astDashTypes.genKindsMod.VariableDeclaratorKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyCommentsLocArray extends js.Object {
  var body: js.Array[
    MethodDefinitionKind | VariableDeclaratorKind | ClassPropertyDefinitionKind | ClassPropertyKind | ClassPrivatePropertyKind | ClassMethodKind | ClassPrivateMethodKind | TSDeclareMethodKind | TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
  ]
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object Anon_BodyCommentsLocArray {
  @scala.inline
  def apply(
    body: js.Array[
      MethodDefinitionKind | VariableDeclaratorKind | ClassPropertyDefinitionKind | ClassPropertyKind | ClassPrivatePropertyKind | ClassMethodKind | ClassPrivateMethodKind | TSDeclareMethodKind | TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ],
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): Anon_BodyCommentsLocArray = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyCommentsLocArray]
  }
}

