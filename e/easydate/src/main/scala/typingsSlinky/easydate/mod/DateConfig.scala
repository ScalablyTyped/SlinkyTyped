package typingsSlinky.easydate.mod

import typingsSlinky.easydate.easydateStrings.local
import typingsSlinky.easydate.easydateStrings.utc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateConfig extends js.Object {
  var adjust: js.UndefOr[Boolean] = js.native
  var setDate: js.UndefOr[String] = js.native
  var timeZone: js.UndefOr[utc | local] = js.native
}

object DateConfig {
  @scala.inline
  def apply(): DateConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateConfig]
  }
  @scala.inline
  implicit class DateConfigOps[Self <: DateConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdjust(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjust")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdjust: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjust")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDate")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeZone(value: utc | local): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(js.undefined)
        ret
    }
  }
  
}

