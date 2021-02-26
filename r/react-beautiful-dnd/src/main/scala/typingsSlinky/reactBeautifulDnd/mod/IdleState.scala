package typingsSlinky.reactBeautifulDnd.mod

import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.IDLE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdleState extends State {
  
  var completed: js.UndefOr[CompletedDrag] = js.native
  
  var phase: IDLE = js.native
  
  var shouldFlush: Boolean = js.native
}
object IdleState {
  
  @scala.inline
  def apply(phase: IDLE, shouldFlush: Boolean): IdleState = {
    val __obj = js.Dynamic.literal(phase = phase.asInstanceOf[js.Any], shouldFlush = shouldFlush.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdleState]
  }
  
  @scala.inline
  implicit class IdleStateMutableBuilder[Self <: IdleState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompleted(value: CompletedDrag): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedUndefined: Self = StObject.set(x, "completed", js.undefined)
    
    @scala.inline
    def setPhase(value: IDLE): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldFlush(value: Boolean): Self = StObject.set(x, "shouldFlush", value.asInstanceOf[js.Any])
  }
}
