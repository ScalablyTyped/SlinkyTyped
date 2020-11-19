package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event extends js.Object {
  
  /**
    * The date of the event.
    */
  var Date: js.UndefOr[js.Date] = js.native
  
  /**
    * The event categories available for the specified source type.
    */
  var EventCategories: js.UndefOr[EventCategoriesList] = js.native
  
  /**
    * The event message.
    */
  var Message: js.UndefOr[String] = js.native
  
  /**
    *  The identifier of an event source.
    */
  var SourceIdentifier: js.UndefOr[String] = js.native
  
  /**
    *  The type of AWS DMS resource that generates events.  Valid values: replication-instance | endpoint | replication-task
    */
  var SourceType: js.UndefOr[typingsSlinky.awsSdk.dmsMod.SourceType] = js.native
}
object Event {
  
  @scala.inline
  def apply(): Event = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDate(value: js.Date): Self = this.set("Date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("Date", js.undefined)
    
    @scala.inline
    def setEventCategoriesVarargs(value: String*): Self = this.set("EventCategories", js.Array(value :_*))
    
    @scala.inline
    def setEventCategories(value: EventCategoriesList): Self = this.set("EventCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventCategories: Self = this.set("EventCategories", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    
    @scala.inline
    def setSourceIdentifier(value: String): Self = this.set("SourceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceIdentifier: Self = this.set("SourceIdentifier", js.undefined)
    
    @scala.inline
    def setSourceType(value: SourceType): Self = this.set("SourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceType: Self = this.set("SourceType", js.undefined)
  }
}
