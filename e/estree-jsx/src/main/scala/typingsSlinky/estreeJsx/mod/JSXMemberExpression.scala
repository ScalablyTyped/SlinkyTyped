package typingsSlinky.estreeJsx.mod

import typingsSlinky.estree.mod.BaseNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXMemberExpression
  extends BaseNode
     with _Node {
  @JSName("type")
  var type_JSXMemberExpression: typingsSlinky.estreeJsx.estreeJsxStrings.JSXMemberExpression = js.native
}

object JSXMemberExpression {
  @scala.inline
  def apply(`type`: typingsSlinky.estreeJsx.estreeJsxStrings.JSXMemberExpression): JSXMemberExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXMemberExpression]
  }
  @scala.inline
  implicit class JSXMemberExpressionOps[Self <: JSXMemberExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: typingsSlinky.estreeJsx.estreeJsxStrings.JSXMemberExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

