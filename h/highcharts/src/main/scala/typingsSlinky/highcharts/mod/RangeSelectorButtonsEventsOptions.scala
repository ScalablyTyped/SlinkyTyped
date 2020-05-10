package typingsSlinky.highcharts.mod

import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeSelectorButtonsEventsOptions extends js.Object {
  /**
    * (Highstock, Gantt) Fires when clicking on the rangeSelector button. One
    * parameter, event, is passed to the function, containing common event
    * information.
    *
    *  (see online documentation for example)
    *
    * Return false to stop default button's click action.
    */
  var click: js.UndefOr[RangeSelectorClickCallbackFunction] = js.native
}

object RangeSelectorButtonsEventsOptions {
  @scala.inline
  def apply(): RangeSelectorButtonsEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeSelectorButtonsEventsOptions]
  }
  @scala.inline
  implicit class RangeSelectorButtonsEventsOptionsOps[Self <: RangeSelectorButtonsEventsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClick(value: (/* e */ Event_, /* Return */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.undefined)
        ret
    }
  }
  
}

