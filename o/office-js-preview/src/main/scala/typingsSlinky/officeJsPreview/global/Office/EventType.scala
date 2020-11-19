package typingsSlinky.officeJsPreview.global.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the kind of event that was raised. Returned by the `type` property of an `*EventArgs` object.
  *
  * Add-ins for Project support the `Office.EventType.ResourceSelectionChanged`, `Office.EventType.TaskSelectionChanged`, and
  * `Office.EventType.ViewSelectionChanged` event types.
  *
  * Only task pane add-ins for Outlook support Mailbox API set event types.
  *
  * @remarks
  *
  * **`BindingDataChanged` and `BindingSelectionChanged` hosts**: Excel, Word.
  *
  */
@JSGlobal("Office.EventType")
@js.native
object EventType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsSlinky.officeJsPreview.Office.EventType with Double] = js.native
  
  /* 0 */ val ActiveViewChanged: typingsSlinky.officeJsPreview.Office.EventType.ActiveViewChanged with Double = js.native
  
  /* 1 */ val AppointmentTimeChanged: typingsSlinky.officeJsPreview.Office.EventType.AppointmentTimeChanged with Double = js.native
  
  /* 2 */ val AttachmentsChanged: typingsSlinky.officeJsPreview.Office.EventType.AttachmentsChanged with Double = js.native
  
  /* 3 */ val BindingDataChanged: typingsSlinky.officeJsPreview.Office.EventType.BindingDataChanged with Double = js.native
  
  /* 4 */ val BindingSelectionChanged: typingsSlinky.officeJsPreview.Office.EventType.BindingSelectionChanged with Double = js.native
  
  /* 5 */ val DialogEventReceived: typingsSlinky.officeJsPreview.Office.EventType.DialogEventReceived with Double = js.native
  
  /* 6 */ val DialogMessageReceived: typingsSlinky.officeJsPreview.Office.EventType.DialogMessageReceived with Double = js.native
  
  /* 7 */ val DialogParentMessageReceived: typingsSlinky.officeJsPreview.Office.EventType.DialogParentMessageReceived with Double = js.native
  
  /* 8 */ val DocumentSelectionChanged: typingsSlinky.officeJsPreview.Office.EventType.DocumentSelectionChanged with Double = js.native
  
  /* 9 */ val EnhancedLocationsChanged: typingsSlinky.officeJsPreview.Office.EventType.EnhancedLocationsChanged with Double = js.native
  
  /* 10 */ val ItemChanged: typingsSlinky.officeJsPreview.Office.EventType.ItemChanged with Double = js.native
  
  /* 11 */ val NodeDeleted: typingsSlinky.officeJsPreview.Office.EventType.NodeDeleted with Double = js.native
  
  /* 12 */ val NodeInserted: typingsSlinky.officeJsPreview.Office.EventType.NodeInserted with Double = js.native
  
  /* 13 */ val NodeReplaced: typingsSlinky.officeJsPreview.Office.EventType.NodeReplaced with Double = js.native
  
  /* 14 */ val OfficeThemeChanged: typingsSlinky.officeJsPreview.Office.EventType.OfficeThemeChanged with Double = js.native
  
  /* 15 */ val RecipientsChanged: typingsSlinky.officeJsPreview.Office.EventType.RecipientsChanged with Double = js.native
  
  /* 16 */ val RecurrenceChanged: typingsSlinky.officeJsPreview.Office.EventType.RecurrenceChanged with Double = js.native
  
  /* 17 */ val ResourceSelectionChanged: typingsSlinky.officeJsPreview.Office.EventType.ResourceSelectionChanged with Double = js.native
  
  /* 18 */ val SettingsChanged: typingsSlinky.officeJsPreview.Office.EventType.SettingsChanged with Double = js.native
  
  /* 19 */ val TaskSelectionChanged: typingsSlinky.officeJsPreview.Office.EventType.TaskSelectionChanged with Double = js.native
  
  /* 20 */ val ViewSelectionChanged: typingsSlinky.officeJsPreview.Office.EventType.ViewSelectionChanged with Double = js.native
}
