package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.FocusedCellChanging event.
  */
@JSGlobal("ASPxClientVerticalGridFocusedCellChangingEventArgs")
@js.native
class ASPxClientVerticalGridFocusedCellChangingEventArgs protected ()
  extends typingsSlinky.devexpressWeb.ASPxClientVerticalGridFocusedCellChangingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridFocusedCellChangingEventArgs class with specified settings.
    * @param cellInfo A ASPxClientVerticalGridCellInfo object providing information about the focused cell.
    */
  def this(cellInfo: typingsSlinky.devexpressWeb.ASPxClientVerticalGridCellInfo) = this()
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /**
    * Provides information on a cell currently being focused.
    */
  /* CompleteClass */
  override var cellInfo: typingsSlinky.devexpressWeb.ASPxClientVerticalGridCellInfo = js.native
}

