package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.AnonComponentElementEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxProgressBarOptions extends dxTrackBarOptions[dxProgressBar] {
  /** A function that is executed when the value reaches the maximum. */
  var onComplete: js.UndefOr[js.Function1[/* e */ AnonComponentElementEvent, _]] = js.native
  /** Specifies whether or not the widget displays a progress status. */
  var showStatus: js.UndefOr[Boolean] = js.native
  /** Specifies a format for the progress status. */
  var statusFormat: js.UndefOr[String | (js.Function2[/* ratio */ Double, /* value */ Double, String])] = js.native
  /** The current widget value. */
  @JSName("value")
  var value_dxProgressBarOptions: js.UndefOr[Double] = js.native
}

object dxProgressBarOptions {
  @scala.inline
  def apply(): dxProgressBarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxProgressBarOptions]
  }
  @scala.inline
  implicit class dxProgressBarOptionsOps[Self <: dxProgressBarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnComplete(value: /* e */ AnonComponentElementEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withShowStatus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusFormatFunction2(value: (/* ratio */ Double, /* value */ Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusFormat")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStatusFormat(value: String | (js.Function2[/* ratio */ Double, /* value */ Double, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
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

