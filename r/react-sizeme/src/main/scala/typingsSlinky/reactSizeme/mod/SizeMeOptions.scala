package typingsSlinky.reactSizeme.mod

import typingsSlinky.reactSizeme.reactSizemeStrings.debounce
import typingsSlinky.reactSizeme.reactSizemeStrings.throttle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeMeOptions extends js.Object {
  var monitorHeight: js.UndefOr[Boolean] = js.native
  var monitorPosition: js.UndefOr[Boolean] = js.native
  var monitorWidth: js.UndefOr[Boolean] = js.native
  var noPlaceholder: js.UndefOr[Boolean] = js.native
  var refreshMode: js.UndefOr[throttle | debounce] = js.native
  var refreshRate: js.UndefOr[Double] = js.native
}

object SizeMeOptions {
  @scala.inline
  def apply(): SizeMeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeMeOptions]
  }
  @scala.inline
  implicit class SizeMeOptionsOps[Self <: SizeMeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMonitorHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitorHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitorHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitorHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMonitorPosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitorPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitorPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitorPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withMonitorWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitorWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitorWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitorWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withNoPlaceholder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noPlaceholder")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshMode(value: throttle | debounce): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshMode")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshRate")(js.undefined)
        ret
    }
  }
  
}

