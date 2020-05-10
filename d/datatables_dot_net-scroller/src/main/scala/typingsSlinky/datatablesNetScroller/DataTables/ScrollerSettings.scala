package typingsSlinky.datatablesNetScroller.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollerSettings extends js.Object {
  /*
    * Scroller uses the boundary scaling factor to decide when to redraw the table - which it
    * typically does before you reach the end of the currently loaded data set (in order to
    * allow the data to look continuous to a user scrolling through the data).
    */
  var boundaryScale: js.UndefOr[Double] = js.native
  /*
    * The display buffer is what Scroller uses to calculate how many rows it should pre-fetch
    * for scrolling.
    */
  var displayBuffer: js.UndefOr[Double] = js.native
  /*
    * Show (or not) the loading element in the background of the table. Note that you should
    * include the dataTables.scroller.css file for this to be displayed correctly.
    */
  var loadingIndicator: js.UndefOr[Boolean] = js.native
  /*
    * Scroller will attempt to automatically calculate the height of rows for it's internal
    * calculations. However the height that is used can be overridden using this parameter.
    */
  var rowHeight: js.UndefOr[Double | String] = js.native
  /*
    * When using server-side processing, Scroller will wait a small amount of time to allow
    * the scrolling to finish before requesting more data from the server.
    */
  var serverWait: js.UndefOr[Double] = js.native
  /*
    * Indicate if Scroller show show trace information on the console or not.
    */
  var trace: js.UndefOr[Boolean] = js.native
}

object ScrollerSettings {
  @scala.inline
  def apply(): ScrollerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollerSettings]
  }
  @scala.inline
  implicit class ScrollerSettingsOps[Self <: ScrollerSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundaryScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundaryScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundaryScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundaryScale")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayBuffer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingIndicator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withServerWait(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverWait")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerWait: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverWait")(js.undefined)
        ret
    }
    @scala.inline
    def withTrace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace")(js.undefined)
        ret
    }
  }
  
}

