package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientCardView.FocusedCellChanging event.
  */
@JSGlobal("ASPxClientCardViewFocusedCellChangingEventArgs")
@js.native
class ASPxClientCardViewFocusedCellChangingEventArgs protected ()
  extends typingsSlinky.devexpressWeb.ASPxClientCardViewFocusedCellChangingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCardViewFocusedCellChangingEventArgs class with specified settings.
    * @param cellInfo A ASPxClientCardViewCellInfo object providing information about the focused cell.
    */
  def this(cellInfo: typingsSlinky.devexpressWeb.ASPxClientCardViewCellInfo) = this()
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /**
    * Provides information of a card's cell currently being focused.
    */
  /* CompleteClass */
  override var cellInfo: typingsSlinky.devexpressWeb.ASPxClientCardViewCellInfo = js.native
}

