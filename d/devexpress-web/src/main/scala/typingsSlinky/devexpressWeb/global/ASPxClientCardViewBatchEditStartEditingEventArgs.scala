package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientCardView.BatchEditStartEditing event.
  */
@JSGlobal("ASPxClientCardViewBatchEditStartEditingEventArgs")
@js.native
class ASPxClientCardViewBatchEditStartEditingEventArgs protected ()
  extends typingsSlinky.devexpressWeb.ASPxClientCardViewBatchEditStartEditingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCardViewBatchEditStartEditingEventArgs class with the specified settings.
    * @param visibleIndex An integer value that specifies the visible index of the card. This value is assigned to the ASPxClientCardViewBatchEditStartEditingEventArgs.visibleIndex property.
    * @param focusedColumn An ASPxClientCardViewColumn object that is the focused CardView column. This value is assigned to the ASPxClientCardViewBatchEditStartEditingEventArgs.focusedColumn property.
    * @param cardValues A hashtable that stores information about editable cells. This value is assigned to the ASPxClientCardViewBatchEditStartEditingEventArgs.cardValues property.
    */
  def this(
    visibleIndex: Double,
    focusedColumn: typingsSlinky.devexpressWeb.ASPxClientCardViewColumn,
    cardValues: js.Any
  ) = this()
}
