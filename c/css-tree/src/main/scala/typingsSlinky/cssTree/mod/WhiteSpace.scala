package typingsSlinky.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhiteSpace
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  @JSName("type")
  var type_WhiteSpace: typingsSlinky.cssTree.cssTreeStrings.WhiteSpace = js.native
  var value: String = js.native
}

object WhiteSpace {
  @scala.inline
  def apply(`type`: typingsSlinky.cssTree.cssTreeStrings.WhiteSpace, value: String): WhiteSpace = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhiteSpace]
  }
  @scala.inline
  implicit class WhiteSpaceOps[Self <: WhiteSpace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: typingsSlinky.cssTree.cssTreeStrings.WhiteSpace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

