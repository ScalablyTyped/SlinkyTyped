package typingsSlinky.estreeJsx.mod

import typingsSlinky.estree.mod.BaseNode
import typingsSlinky.estree.mod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXSpreadAttribute
  extends BaseNode
     with Node {
  var argument: Expression = js.native
  @JSName("type")
  var type_JSXSpreadAttribute: typingsSlinky.estreeJsx.estreeJsxStrings.JSXSpreadAttribute = js.native
}

object JSXSpreadAttribute {
  @scala.inline
  def apply(argument: Expression, `type`: typingsSlinky.estreeJsx.estreeJsxStrings.JSXSpreadAttribute): JSXSpreadAttribute = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXSpreadAttribute]
  }
  @scala.inline
  implicit class JSXSpreadAttributeOps[Self <: JSXSpreadAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgument(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.estreeJsx.estreeJsxStrings.JSXSpreadAttribute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

