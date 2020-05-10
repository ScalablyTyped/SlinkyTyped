package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationEventsOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Event fired when button state should change, for
    * example after adding an annotation.
    */
  var deselectButton: js.UndefOr[js.Function] = js.native
  /**
    * (Highcharts, Highstock) A `hidePopop` event. Fired when Popup should be
    * hidden, for exampole when clicking on an annotation again.
    */
  var hidePopup: js.UndefOr[js.Function] = js.native
  /**
    * (Highcharts, Highstock) Event fired on a button click.
    */
  var selectButton: js.UndefOr[js.Function] = js.native
  /**
    * (Highcharts, Highstock) A `showPopup` event. Fired when selecting for
    * example an annotation.
    */
  var showPopup: js.UndefOr[js.Function] = js.native
}

object NavigationEventsOptions {
  @scala.inline
  def apply(): NavigationEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationEventsOptions]
  }
  @scala.inline
  implicit class NavigationEventsOptionsOps[Self <: NavigationEventsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeselectButton(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselectButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeselectButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselectButton")(js.undefined)
        ret
    }
    @scala.inline
    def withHidePopup(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidePopup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidePopup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidePopup")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectButton(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPopup(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPopup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPopup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPopup")(js.undefined)
        ret
    }
  }
  
}

