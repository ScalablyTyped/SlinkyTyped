package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.TSLiteralType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod._Node because Already inherited */ @js.native
trait TSLiteralType_
  extends TSType
     with BaseNode {
  var literal: NumericLiteral_ | StringLiteral_ | BooleanLiteral_ = js.native
  @JSName("type")
  var type_TSLiteralType_ : TSLiteralType = js.native
}

object TSLiteralType_ {
  @scala.inline
  def apply(literal: NumericLiteral_ | StringLiteral_ | BooleanLiteral_, `type`: TSLiteralType): TSLiteralType_ = {
    val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSLiteralType_]
  }
  @scala.inline
  implicit class TSLiteralType_Ops[Self <: TSLiteralType_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLiteral(value: NumericLiteral_ | StringLiteral_ | BooleanLiteral_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("literal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: TSLiteralType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

