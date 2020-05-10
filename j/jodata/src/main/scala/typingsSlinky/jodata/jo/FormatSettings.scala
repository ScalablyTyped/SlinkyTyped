package typingsSlinky.jodata.jo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatSettings extends ISettings {
  var DefaultFormat: String = js.native
  var Format: String = js.native
}

object FormatSettings {
  @scala.inline
  def apply(DefaultFormat: String, Format: String, isSet: () => Boolean, reset: () => Unit): FormatSettings = {
    val __obj = js.Dynamic.literal(DefaultFormat = DefaultFormat.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[FormatSettings]
  }
  @scala.inline
  implicit class FormatSettingsOps[Self <: FormatSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

