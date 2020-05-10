package typingsSlinky.estreeJsx.mod

import typingsSlinky.estree.mod.BaseNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXNamespacedName
  extends BaseNode
     with _Node {
  @JSName("type")
  var type_JSXNamespacedName: typingsSlinky.estreeJsx.estreeJsxStrings.JSXNamespacedName = js.native
}

object JSXNamespacedName {
  @scala.inline
  def apply(`type`: typingsSlinky.estreeJsx.estreeJsxStrings.JSXNamespacedName): JSXNamespacedName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXNamespacedName]
  }
  @scala.inline
  implicit class JSXNamespacedNameOps[Self <: JSXNamespacedName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: typingsSlinky.estreeJsx.estreeJsxStrings.JSXNamespacedName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

