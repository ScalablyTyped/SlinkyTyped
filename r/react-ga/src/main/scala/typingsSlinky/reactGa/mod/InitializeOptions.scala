package typingsSlinky.reactGa.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitializeOptions extends js.Object {
  var alwaysSendToDefaultTracker: js.UndefOr[Boolean] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var gaAddress: js.UndefOr[String] = js.native
  var gaOptions: js.UndefOr[GaOptions] = js.native
  var standardImplementation: js.UndefOr[Boolean] = js.native
  var testMode: js.UndefOr[Boolean] = js.native
  var titleCase: js.UndefOr[Boolean] = js.native
}

object InitializeOptions {
  @scala.inline
  def apply(): InitializeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitializeOptions]
  }
  @scala.inline
  implicit class InitializeOptionsOps[Self <: InitializeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlwaysSendToDefaultTracker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysSendToDefaultTracker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysSendToDefaultTracker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysSendToDefaultTracker")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withGaAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGaAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withGaOptions(value: GaOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGaOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withStandardImplementation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardImplementation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandardImplementation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardImplementation")(js.undefined)
        ret
    }
    @scala.inline
    def withTestMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleCase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleCase")(js.undefined)
        ret
    }
  }
  
}

