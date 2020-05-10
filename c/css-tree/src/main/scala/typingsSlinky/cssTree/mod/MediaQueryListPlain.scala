package typingsSlinky.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaQueryListPlain
  extends CssNodeCommon
     with CssNodePlain {
  var children: js.Array[CssNodePlain] = js.native
  @JSName("type")
  var type_MediaQueryListPlain: typingsSlinky.cssTree.cssTreeStrings.MediaQueryList = js.native
}

object MediaQueryListPlain {
  @scala.inline
  def apply(children: js.Array[CssNodePlain], `type`: typingsSlinky.cssTree.cssTreeStrings.MediaQueryList): MediaQueryListPlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaQueryListPlain]
  }
  @scala.inline
  implicit class MediaQueryListPlainOps[Self <: MediaQueryListPlain] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: js.Array[CssNodePlain]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.cssTree.cssTreeStrings.MediaQueryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

