package typingsSlinky.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayMarkerChangedEvent extends StObject {
  
  /** Boolean indicating whether the marker had a tail before the change. */
  var hadTail: Boolean = js.native
  
  /** Boolean indicating whether the marker now has a tail */
  var hasTail: Boolean = js.native
  
  /** Boolean indicating whether the marker is now valid. */
  var isValid: Boolean = js.native
  
  /** Point representing the new head buffer position. */
  var newHeadBufferPosition: Point = js.native
  
  /** Point representing the new head screen position. */
  var newHeadScreenPosition: Point = js.native
  
  /**
    *  -DEPRECATED- Object containing the marker's custom properties after the change.
    *  @deprecated
    */
  var newProperties: js.Object = js.native
  
  /** Point representing the new tail buffer position. */
  var newTailBufferPosition: Point = js.native
  
  /** Point representing the new tail screen position. */
  var newTailScreenPosition: Point = js.native
  
  /** Point representing the former head buffer position. */
  var oldHeadBufferPosition: Point = js.native
  
  /** Point representing the former head screen position. */
  var oldHeadScreenPosition: Point = js.native
  
  /**
    *  -DEPRECATED- Object containing the marker's custom properties before the change.
    *  @deprecated
    */
  var oldProperties: js.Object = js.native
  
  // Point representing the former tail buffer position. */
  var oldTailBufferPosition: Point = js.native
  
  /** Point representing the former tail screen position. */
  var oldTailScreenPosition: Point = js.native
  
  /**
    *  Boolean indicating whether this change was caused by a textual change to the
    *  buffer or whether the marker was manipulated directly via its public API.
    */
  var textChanged: Boolean = js.native
  
  /** Boolean indicating whether the marker was valid before the change. */
  var wasValid: Boolean = js.native
}
object DisplayMarkerChangedEvent {
  
  @scala.inline
  def apply(
    hadTail: Boolean,
    hasTail: Boolean,
    isValid: Boolean,
    newHeadBufferPosition: Point,
    newHeadScreenPosition: Point,
    newProperties: js.Object,
    newTailBufferPosition: Point,
    newTailScreenPosition: Point,
    oldHeadBufferPosition: Point,
    oldHeadScreenPosition: Point,
    oldProperties: js.Object,
    oldTailBufferPosition: Point,
    oldTailScreenPosition: Point,
    textChanged: Boolean,
    wasValid: Boolean
  ): DisplayMarkerChangedEvent = {
    val __obj = js.Dynamic.literal(hadTail = hadTail.asInstanceOf[js.Any], hasTail = hasTail.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], newHeadBufferPosition = newHeadBufferPosition.asInstanceOf[js.Any], newHeadScreenPosition = newHeadScreenPosition.asInstanceOf[js.Any], newProperties = newProperties.asInstanceOf[js.Any], newTailBufferPosition = newTailBufferPosition.asInstanceOf[js.Any], newTailScreenPosition = newTailScreenPosition.asInstanceOf[js.Any], oldHeadBufferPosition = oldHeadBufferPosition.asInstanceOf[js.Any], oldHeadScreenPosition = oldHeadScreenPosition.asInstanceOf[js.Any], oldProperties = oldProperties.asInstanceOf[js.Any], oldTailBufferPosition = oldTailBufferPosition.asInstanceOf[js.Any], oldTailScreenPosition = oldTailScreenPosition.asInstanceOf[js.Any], textChanged = textChanged.asInstanceOf[js.Any], wasValid = wasValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayMarkerChangedEvent]
  }
  
  @scala.inline
  implicit class DisplayMarkerChangedEventMutableBuilder[Self <: DisplayMarkerChangedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHadTail(value: Boolean): Self = StObject.set(x, "hadTail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasTail(value: Boolean): Self = StObject.set(x, "hasTail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewHeadBufferPosition(value: Point): Self = StObject.set(x, "newHeadBufferPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewHeadScreenPosition(value: Point): Self = StObject.set(x, "newHeadScreenPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewProperties(value: js.Object): Self = StObject.set(x, "newProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewTailBufferPosition(value: Point): Self = StObject.set(x, "newTailBufferPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewTailScreenPosition(value: Point): Self = StObject.set(x, "newTailScreenPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldHeadBufferPosition(value: Point): Self = StObject.set(x, "oldHeadBufferPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldHeadScreenPosition(value: Point): Self = StObject.set(x, "oldHeadScreenPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldProperties(value: js.Object): Self = StObject.set(x, "oldProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldTailBufferPosition(value: Point): Self = StObject.set(x, "oldTailBufferPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldTailScreenPosition(value: Point): Self = StObject.set(x, "oldTailScreenPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextChanged(value: Boolean): Self = StObject.set(x, "textChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWasValid(value: Boolean): Self = StObject.set(x, "wasValid", value.asInstanceOf[js.Any])
  }
}
