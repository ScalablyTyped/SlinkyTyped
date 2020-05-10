package typingsSlinky.luxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateTimeOptions extends LocaleOptions {
  var setZone: js.UndefOr[Boolean] = js.native
  var zone: js.UndefOr[String | Zone] = js.native
}

object DateTimeOptions {
  @scala.inline
  def apply(): DateTimeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeOptions]
  }
  @scala.inline
  implicit class DateTimeOptionsOps[Self <: DateTimeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetZone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setZone")(js.undefined)
        ret
    }
    @scala.inline
    def withZone(value: String | Zone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(js.undefined)
        ret
    }
  }
  
}

