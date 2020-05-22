package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.TSType, 'type'> */
trait TSConditionalType extends ASTNode {
  var checkType: TSTypeKind
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var extendsType: TSTypeKind
  var falseType: TSTypeKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var trueType: TSTypeKind
  var `type`: typingsSlinky.astTypes.astTypesStrings.TSConditionalType
}

object TSConditionalType {
  @scala.inline
  def apply(
    checkType: TSTypeKind,
    extendsType: TSTypeKind,
    falseType: TSTypeKind,
    trueType: TSTypeKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSConditionalType,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): TSConditionalType = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSConditionalType]
  }
}

