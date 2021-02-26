package typingsSlinky.reactBeautifulDnd.mod

import typingsSlinky.reactBeautifulDnd.reactBeautifulDndBooleans.`true`
import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.COLLECTING
import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.DRAGGING
import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.DROP_ANIMATING
import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.DROP_PENDING
import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.IDLE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactBeautifulDnd.mod.IdleState
  - typingsSlinky.reactBeautifulDnd.mod.DraggingState
  - typingsSlinky.reactBeautifulDnd.mod.CollectingState
  - typingsSlinky.reactBeautifulDnd.mod.DropPendingState
  - typingsSlinky.reactBeautifulDnd.mod.DropAnimatingState
*/
trait State extends StObject
object State {
  
  @scala.inline
  def CollectingState(
    afterCritical: LiftEffect,
    critical: Critical,
    current: DragPositions,
    dimensions: DimensionMap,
    impact: DragImpact,
    initial: DragPositions,
    isDragging: `true`,
    isWindowScrollAllowed: Boolean,
    movementMode: MovementMode,
    onLiftImpact: DragImpact,
    phase: COLLECTING,
    viewport: Viewport
  ): typingsSlinky.reactBeautifulDnd.mod.CollectingState = {
    val __obj = js.Dynamic.literal(afterCritical = afterCritical.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], impact = impact.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], isWindowScrollAllowed = isWindowScrollAllowed.asInstanceOf[js.Any], movementMode = movementMode.asInstanceOf[js.Any], onLiftImpact = onLiftImpact.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactBeautifulDnd.mod.CollectingState]
  }
  
  @scala.inline
  def DraggingState(
    afterCritical: LiftEffect,
    critical: Critical,
    current: DragPositions,
    dimensions: DimensionMap,
    impact: DragImpact,
    initial: DragPositions,
    isDragging: `true`,
    isWindowScrollAllowed: Boolean,
    movementMode: MovementMode,
    onLiftImpact: DragImpact,
    phase: DRAGGING,
    viewport: Viewport
  ): typingsSlinky.reactBeautifulDnd.mod.DraggingState = {
    val __obj = js.Dynamic.literal(afterCritical = afterCritical.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], impact = impact.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], isWindowScrollAllowed = isWindowScrollAllowed.asInstanceOf[js.Any], movementMode = movementMode.asInstanceOf[js.Any], onLiftImpact = onLiftImpact.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactBeautifulDnd.mod.DraggingState]
  }
  
  @scala.inline
  def DropAnimatingState(
    completed: CompletedDrag,
    dimensions: DimensionMap,
    dropDuration: Double,
    newHomeClientOffset: Position,
    phase: DROP_ANIMATING
  ): typingsSlinky.reactBeautifulDnd.mod.DropAnimatingState = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], dropDuration = dropDuration.asInstanceOf[js.Any], newHomeClientOffset = newHomeClientOffset.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactBeautifulDnd.mod.DropAnimatingState]
  }
  
  @scala.inline
  def DropPendingState(
    afterCritical: LiftEffect,
    critical: Critical,
    current: DragPositions,
    dimensions: DimensionMap,
    impact: DragImpact,
    initial: DragPositions,
    isDragging: `true`,
    isWaiting: Boolean,
    isWindowScrollAllowed: Boolean,
    movementMode: MovementMode,
    onLiftImpact: DragImpact,
    phase: DROP_PENDING,
    reason: DropReason,
    viewport: Viewport
  ): typingsSlinky.reactBeautifulDnd.mod.DropPendingState = {
    val __obj = js.Dynamic.literal(afterCritical = afterCritical.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], impact = impact.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], isWaiting = isWaiting.asInstanceOf[js.Any], isWindowScrollAllowed = isWindowScrollAllowed.asInstanceOf[js.Any], movementMode = movementMode.asInstanceOf[js.Any], onLiftImpact = onLiftImpact.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactBeautifulDnd.mod.DropPendingState]
  }
  
  @scala.inline
  def IdleState(phase: IDLE, shouldFlush: Boolean): typingsSlinky.reactBeautifulDnd.mod.IdleState = {
    val __obj = js.Dynamic.literal(phase = phase.asInstanceOf[js.Any], shouldFlush = shouldFlush.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactBeautifulDnd.mod.IdleState]
  }
}
