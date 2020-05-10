package typingsSlinky.jodata.jo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InlineCountSettings extends ISettings {
  var DefaultInlineCount: String = js.native
  var InlineCount: String = js.native
}

object InlineCountSettings {
  @scala.inline
  def apply(DefaultInlineCount: String, InlineCount: String, isSet: () => Boolean, reset: () => Unit): InlineCountSettings = {
    val __obj = js.Dynamic.literal(DefaultInlineCount = DefaultInlineCount.asInstanceOf[js.Any], InlineCount = InlineCount.asInstanceOf[js.Any], isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[InlineCountSettings]
  }
  @scala.inline
  implicit class InlineCountSettingsOps[Self <: InlineCountSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultInlineCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultInlineCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInlineCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InlineCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

