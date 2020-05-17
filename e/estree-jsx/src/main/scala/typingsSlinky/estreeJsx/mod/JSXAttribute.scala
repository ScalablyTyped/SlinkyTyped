package typingsSlinky.estreeJsx.mod

import typingsSlinky.estree.mod.BaseNode
import typingsSlinky.estree.mod.Literal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXAttribute
  extends BaseNode
     with Node {
  var name: JSXIdentifier | JSXNamespacedName = js.native
  @JSName("type")
  var type_JSXAttribute: typingsSlinky.estreeJsx.estreeJsxStrings.JSXAttribute = js.native
  var value: Literal | JSXExpressionContainer | JSXElement | JSXFragment | Null = js.native
}

object JSXAttribute {
  @scala.inline
  def apply(
    name: JSXIdentifier | JSXNamespacedName,
    `type`: typingsSlinky.estreeJsx.estreeJsxStrings.JSXAttribute
  ): JSXAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXAttribute]
  }
  @scala.inline
  implicit class JSXAttributeOps[Self <: JSXAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: JSXIdentifier | JSXNamespacedName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.estreeJsx.estreeJsxStrings.JSXAttribute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Literal | JSXExpressionContainer | JSXElement | JSXFragment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(null)
        ret
    }
  }
  
}

