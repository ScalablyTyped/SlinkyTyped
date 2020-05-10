package typingsSlinky.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CDC
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  @JSName("type")
  var type_CDC: typingsSlinky.cssTree.cssTreeStrings.CDC = js.native
}

object CDC {
  @scala.inline
  def apply(`type`: typingsSlinky.cssTree.cssTreeStrings.CDC): CDC = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CDC]
  }
  @scala.inline
  implicit class CDCOps[Self <: CDC] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: typingsSlinky.cssTree.cssTreeStrings.CDC): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

