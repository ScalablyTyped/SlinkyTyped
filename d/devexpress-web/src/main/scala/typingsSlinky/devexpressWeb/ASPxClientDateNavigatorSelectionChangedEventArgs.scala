package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDateNavigator.SelectionChanged event.
  */
@js.native
trait ASPxClientDateNavigatorSelectionChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Returns the selected dates related to the event.
    */
  var selectedDates: js.Array[js.Date] = js.native
}

object ASPxClientDateNavigatorSelectionChangedEventArgs {
  @scala.inline
  def apply(selectedDates: js.Array[js.Date]): ASPxClientDateNavigatorSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(selectedDates = selectedDates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDateNavigatorSelectionChangedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientDateNavigatorSelectionChangedEventArgsOps[Self <: ASPxClientDateNavigatorSelectionChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelectedDates(value: js.Array[js.Date]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDates")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

