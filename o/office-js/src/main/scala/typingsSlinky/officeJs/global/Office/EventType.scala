package typingsSlinky.officeJs.global.Office

import org.scalablytyped.runtime.StObject
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
object EventType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsSlinky.officeJs.Office.EventType with Double] = js.native
  
  /* 0 */ val ActiveViewChanged: typingsSlinky.officeJs.Office.EventType.ActiveViewChanged with Double = js.native
  
  /* 1 */ val AppointmentTimeChanged: typingsSlinky.officeJs.Office.EventType.AppointmentTimeChanged with Double = js.native
  
  /* 2 */ val AttachmentsChanged: typingsSlinky.officeJs.Office.EventType.AttachmentsChanged with Double = js.native
  
  /* 3 */ val BindingDataChanged: typingsSlinky.officeJs.Office.EventType.BindingDataChanged with Double = js.native
  
  /* 4 */ val BindingSelectionChanged: typingsSlinky.officeJs.Office.EventType.BindingSelectionChanged with Double = js.native
  
  /* 5 */ val DialogEventReceived: typingsSlinky.officeJs.Office.EventType.DialogEventReceived with Double = js.native
  
  /* 6 */ val DialogMessageReceived: typingsSlinky.officeJs.Office.EventType.DialogMessageReceived with Double = js.native
  
  /* 7 */ val DialogParentMessageReceived: typingsSlinky.officeJs.Office.EventType.DialogParentMessageReceived with Double = js.native
  
  /* 8 */ val DocumentSelectionChanged: typingsSlinky.officeJs.Office.EventType.DocumentSelectionChanged with Double = js.native
  
  /* 9 */ val EnhancedLocationsChanged: typingsSlinky.officeJs.Office.EventType.EnhancedLocationsChanged with Double = js.native
  
  /* 10 */ val ItemChanged: typingsSlinky.officeJs.Office.EventType.ItemChanged with Double = js.native
  
  /* 11 */ val NodeDeleted: typingsSlinky.officeJs.Office.EventType.NodeDeleted with Double = js.native
  
  /* 12 */ val NodeInserted: typingsSlinky.officeJs.Office.EventType.NodeInserted with Double = js.native
  
  /* 13 */ val NodeReplaced: typingsSlinky.officeJs.Office.EventType.NodeReplaced with Double = js.native
  
  /* 14 */ val RecipientsChanged: typingsSlinky.officeJs.Office.EventType.RecipientsChanged with Double = js.native
  
  /* 15 */ val RecurrenceChanged: typingsSlinky.officeJs.Office.EventType.RecurrenceChanged with Double = js.native
  
  /* 16 */ val ResourceSelectionChanged: typingsSlinky.officeJs.Office.EventType.ResourceSelectionChanged with Double = js.native
  
  /* 17 */ val SettingsChanged: typingsSlinky.officeJs.Office.EventType.SettingsChanged with Double = js.native
  
  /* 18 */ val TaskSelectionChanged: typingsSlinky.officeJs.Office.EventType.TaskSelectionChanged with Double = js.native
  
  /* 19 */ val ViewSelectionChanged: typingsSlinky.officeJs.Office.EventType.ViewSelectionChanged with Double = js.native
}
