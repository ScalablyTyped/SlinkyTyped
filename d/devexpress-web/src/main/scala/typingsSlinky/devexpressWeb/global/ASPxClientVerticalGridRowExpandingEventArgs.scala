package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.RowExpandedChanging event.
  */
@JSGlobal("ASPxClientVerticalGridRowExpandingEventArgs")
@js.native
class ASPxClientVerticalGridRowExpandingEventArgs protected ()
  extends typingsSlinky.devexpressWeb.ASPxClientVerticalGridRowExpandingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridRowExpandingEventArgs class with the specified row.
    * @param row An ASPxClientVerticalGridRowobject that represents the row to expand.
    */
  def this(row: typingsSlinky.devexpressWeb.ASPxClientVerticalGridRow) = this()
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /**
    * Gets the expanded row.
    */
  /* CompleteClass */
  override var row: typingsSlinky.devexpressWeb.ASPxClientVerticalGridRow = js.native
}

