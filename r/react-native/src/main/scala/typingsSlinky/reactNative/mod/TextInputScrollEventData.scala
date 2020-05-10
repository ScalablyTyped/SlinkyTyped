package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.AnonX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextInputScrollEventData extends js.Object {
  var contentOffset: AnonX = js.native
}

object TextInputScrollEventData {
  @scala.inline
  def apply(contentOffset: AnonX): TextInputScrollEventData = {
    val __obj = js.Dynamic.literal(contentOffset = contentOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInputScrollEventData]
  }
  @scala.inline
  implicit class TextInputScrollEventDataOps[Self <: TextInputScrollEventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentOffset(value: AnonX): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentOffset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

