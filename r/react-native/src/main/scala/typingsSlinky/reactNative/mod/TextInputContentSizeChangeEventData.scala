package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextInputContentSizeChangeEventData extends js.Object {
  var contentSize: AnonHeight = js.native
}

object TextInputContentSizeChangeEventData {
  @scala.inline
  def apply(contentSize: AnonHeight): TextInputContentSizeChangeEventData = {
    val __obj = js.Dynamic.literal(contentSize = contentSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInputContentSizeChangeEventData]
  }
  @scala.inline
  implicit class TextInputContentSizeChangeEventDataOps[Self <: TextInputContentSizeChangeEventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentSize(value: AnonHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

