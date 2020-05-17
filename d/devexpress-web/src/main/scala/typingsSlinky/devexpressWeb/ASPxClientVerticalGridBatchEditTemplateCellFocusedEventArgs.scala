package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditTemplateCellFocused event.
  */
@js.native
trait ASPxClientVerticalGridBatchEditTemplateCellFocusedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets a value specifying whether the event was handled.
    */
  var handled: Boolean = js.native
  /**
    * Gets the currently processed row.
    */
  var row: ASPxClientVerticalGridRow = js.native
}

object ASPxClientVerticalGridBatchEditTemplateCellFocusedEventArgs {
  @scala.inline
  def apply(handled: Boolean, row: ASPxClientVerticalGridRow): ASPxClientVerticalGridBatchEditTemplateCellFocusedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridBatchEditTemplateCellFocusedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientVerticalGridBatchEditTemplateCellFocusedEventArgsOps[Self <: ASPxClientVerticalGridBatchEditTemplateCellFocusedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRow(value: ASPxClientVerticalGridRow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

