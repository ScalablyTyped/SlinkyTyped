package typingsSlinky.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the time zone of the recurrence.
  *
  * [Api set: Mailbox 1.7]
  *
  * @remarks
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@js.native
trait RecurrenceTimeZone extends StObject {
  
  /**
    * Represents the name of the recurrence time zone.
    */
  var name: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone | String = js.native
  
  /**
    * Integer value representing the difference in minutes between the local time zone and UTC at the date that the meeting series began.
    */
  var offset: js.UndefOr[Double] = js.native
}
object RecurrenceTimeZone {
  
  @scala.inline
  def apply(name: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone | String): RecurrenceTimeZone = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecurrenceTimeZone]
  }
  
  @scala.inline
  implicit class RecurrenceTimeZoneMutableBuilder[Self <: RecurrenceTimeZone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone | String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
