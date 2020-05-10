package typingsSlinky.reactNativeVideo

import typingsSlinky.reactNativeVideo.reactNativeVideoStrings.auto
import typingsSlinky.reactNativeVideo.reactNativeVideoStrings.disabled
import typingsSlinky.reactNativeVideo.reactNativeVideoStrings.index
import typingsSlinky.reactNativeVideo.reactNativeVideoStrings.resolution
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonValue extends js.Object {
  var `type`: auto | disabled | resolution | index = js.native
  var value: js.UndefOr[String | Double] = js.native
}

object AnonValue {
  @scala.inline
  def apply(`type`: auto | disabled | resolution | index): AnonValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValue]
  }
  @scala.inline
  implicit class AnonValueOps[Self <: AnonValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: auto | disabled | resolution | index): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

