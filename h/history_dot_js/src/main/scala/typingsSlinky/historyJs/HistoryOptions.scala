package typingsSlinky.historyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryOptions extends js.Object {
  var busyDelay: js.UndefOr[Double] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var delayInit: js.UndefOr[Double] = js.native
  var disableSuid: js.UndefOr[Boolean] = js.native
  var doubleCheckInterval: js.UndefOr[Double] = js.native
  var hashChangeInterval: js.UndefOr[Double] = js.native
  var html4Mode: js.UndefOr[Boolean] = js.native
  var initialTitle: js.UndefOr[String] = js.native
  var safariPollInterval: js.UndefOr[Double] = js.native
  var storeInterval: js.UndefOr[Double] = js.native
}

object HistoryOptions {
  @scala.inline
  def apply(): HistoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryOptions]
  }
  @scala.inline
  implicit class HistoryOptionsOps[Self <: HistoryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBusyDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("busyDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBusyDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("busyDelay")(js.undefined)
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
    def withDelayInit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayInit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayInit")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableSuid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableSuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSuid")(js.undefined)
        ret
    }
    @scala.inline
    def withDoubleCheckInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleCheckInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoubleCheckInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleCheckInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withHashChangeInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashChangeInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashChangeInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashChangeInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml4Mode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html4Mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml4Mode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html4Mode")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withSafariPollInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safariPollInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafariPollInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safariPollInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withStoreInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoreInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeInterval")(js.undefined)
        ret
    }
  }
  
}

