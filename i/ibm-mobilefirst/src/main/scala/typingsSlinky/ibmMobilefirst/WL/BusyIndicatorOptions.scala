package typingsSlinky.ibmMobilefirst.WL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BusyIndicatorOptions extends js.Object {
  var className: js.UndefOr[String] = js.native
  var contentTextText: js.UndefOr[String] = js.native
  var contentTitle: js.UndefOr[String] = js.native
  var icon: js.UndefOr[String] = js.native
  var notificationId: js.UndefOr[Double] = js.native
  var tickerText: js.UndefOr[String] = js.native
}

object BusyIndicatorOptions {
  @scala.inline
  def apply(): BusyIndicatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusyIndicatorOptions]
  }
  @scala.inline
  implicit class BusyIndicatorOptionsOps[Self <: BusyIndicatorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withContentTextText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTextText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentTextText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTextText")(js.undefined)
        ret
    }
    @scala.inline
    def withContentTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationId")(js.undefined)
        ret
    }
    @scala.inline
    def withTickerText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickerText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickerText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickerText")(js.undefined)
        ret
    }
  }
  
}

