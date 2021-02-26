package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.mod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICursorPositionChangedEvent extends StObject {
  
  /**
    * Primary cursor's position.
    */
  val position: Position = js.native
  
  /**
    * Reason.
    */
  val reason: CursorChangeReason = js.native
  
  /**
    * Secondary cursors' position.
    */
  val secondaryPositions: js.Array[Position] = js.native
  
  /**
    * Source of the call that caused the event.
    */
  val source: String = js.native
}
object ICursorPositionChangedEvent {
  
  @scala.inline
  def apply(
    position: Position,
    reason: CursorChangeReason,
    secondaryPositions: js.Array[Position],
    source: String
  ): ICursorPositionChangedEvent = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], secondaryPositions = secondaryPositions.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICursorPositionChangedEvent]
  }
  
  @scala.inline
  implicit class ICursorPositionChangedEventMutableBuilder[Self <: ICursorPositionChangedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: CursorChangeReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryPositions(value: js.Array[Position]): Self = StObject.set(x, "secondaryPositions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryPositionsVarargs(value: Position*): Self = StObject.set(x, "secondaryPositions", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
