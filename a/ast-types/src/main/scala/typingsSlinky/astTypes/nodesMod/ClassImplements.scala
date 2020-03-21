package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TypeParameterInstantiationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Node, 'type'> */
trait ClassImplements extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var id: IdentifierKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var superClass: ExpressionKind | Null
  var `type`: typingsSlinky.astTypes.astTypesStrings.ClassImplements
  var typeParameters: TypeParameterInstantiationKind | Null
}

object ClassImplements {
  @scala.inline
  def apply(
    id: IdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ClassImplements,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    superClass: ExpressionKind = null,
    typeParameters: TypeParameterInstantiationKind = null
  ): ClassImplements = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (superClass != null) __obj.updateDynamic("superClass")(superClass.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassImplements]
  }
}

