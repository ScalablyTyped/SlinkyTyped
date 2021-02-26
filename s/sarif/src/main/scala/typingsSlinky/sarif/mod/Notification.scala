package typingsSlinky.sarif.mod

import typingsSlinky.sarif.mod.Notification.level
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Notification extends StObject {
  
  /**
    * A reference used to locate the rule descriptor associated with this notification.
    */
  var associatedRule: js.UndefOr[ReportingDescriptorReference] = js.native
  
  /**
    * A reference used to locate the descriptor relevant to this notification.
    */
  var descriptor: js.UndefOr[ReportingDescriptorReference] = js.native
  
  /**
    * The runtime exception, if any, relevant to this notification.
    */
  var exception: js.UndefOr[Exception] = js.native
  
  /**
    * A value specifying the severity level of the notification.
    */
  var level: js.UndefOr[level] = js.native
  
  /**
    * The locations relevant to this notification.
    */
  var locations: js.UndefOr[js.Array[Location]] = js.native
  
  /**
    * A message that describes the condition that was encountered.
    */
  var message: Message = js.native
  
  /**
    * Key/value pairs that provide additional information about the notification.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  
  /**
    * The thread identifier of the code that generated the notification.
    */
  var threadId: js.UndefOr[Double] = js.native
  
  /**
    * The Coordinated Universal Time (UTC) date and time at which the analysis tool generated the notification.
    */
  var timeUtc: js.UndefOr[String] = js.native
}
object Notification {
  
  @scala.inline
  def apply(message: Message): Notification = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notification]
  }
  
  @scala.inline
  implicit class NotificationMutableBuilder[Self <: Notification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociatedRule(value: ReportingDescriptorReference): Self = StObject.set(x, "associatedRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatedRuleUndefined: Self = StObject.set(x, "associatedRule", js.undefined)
    
    @scala.inline
    def setDescriptor(value: ReportingDescriptorReference): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptorUndefined: Self = StObject.set(x, "descriptor", js.undefined)
    
    @scala.inline
    def setException(value: Exception): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptionUndefined: Self = StObject.set(x, "exception", js.undefined)
    
    @scala.inline
    def setLevel(value: level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setLocations(value: js.Array[Location]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    @scala.inline
    def setLocationsVarargs(value: Location*): Self = StObject.set(x, "locations", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setThreadId(value: Double): Self = StObject.set(x, "threadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadIdUndefined: Self = StObject.set(x, "threadId", js.undefined)
    
    @scala.inline
    def setTimeUtc(value: String): Self = StObject.set(x, "timeUtc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUtcUndefined: Self = StObject.set(x, "timeUtc", js.undefined)
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.sarif.sarifStrings.none
    - typingsSlinky.sarif.sarifStrings.note
    - typingsSlinky.sarif.sarifStrings.warning
    - typingsSlinky.sarif.sarifStrings.error
  */
  trait level extends StObject
  object level {
    
    @scala.inline
    def error: typingsSlinky.sarif.sarifStrings.error = "error".asInstanceOf[typingsSlinky.sarif.sarifStrings.error]
    
    @scala.inline
    def none: typingsSlinky.sarif.sarifStrings.none = "none".asInstanceOf[typingsSlinky.sarif.sarifStrings.none]
    
    @scala.inline
    def note: typingsSlinky.sarif.sarifStrings.note = "note".asInstanceOf[typingsSlinky.sarif.sarifStrings.note]
    
    @scala.inline
    def warning: typingsSlinky.sarif.sarifStrings.warning = "warning".asInstanceOf[typingsSlinky.sarif.sarifStrings.warning]
  }
}
