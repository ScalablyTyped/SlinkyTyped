package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.FunctionTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Node, 'type'> */
trait ObjectTypeCallProperty extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var static: Boolean
  var `type`: typingsSlinky.astTypes.astTypesStrings.ObjectTypeCallProperty
  var value: FunctionTypeAnnotationKind
}

object ObjectTypeCallProperty {
  @scala.inline
  def apply(
    static: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.ObjectTypeCallProperty,
    value: FunctionTypeAnnotationKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ObjectTypeCallProperty = {
    val __obj = js.Dynamic.literal(static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeCallProperty]
  }
}

