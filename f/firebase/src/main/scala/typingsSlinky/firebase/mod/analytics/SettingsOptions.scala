package typingsSlinky.firebase.mod.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettingsOptions extends js.Object {
  /** Sets custom name for `dataLayer` array used by gtag. */
  var dataLayerName: js.UndefOr[String] = js.native
  /** Sets custom name for `gtag` function. */
  var gtagName: js.UndefOr[String] = js.native
}

object SettingsOptions {
  @scala.inline
  def apply(): SettingsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingsOptions]
  }
  @scala.inline
  implicit class SettingsOptionsOps[Self <: SettingsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataLayerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLayerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataLayerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLayerName")(js.undefined)
        ret
    }
    @scala.inline
    def withGtagName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gtagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGtagName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gtagName")(js.undefined)
        ret
    }
  }
  
}

