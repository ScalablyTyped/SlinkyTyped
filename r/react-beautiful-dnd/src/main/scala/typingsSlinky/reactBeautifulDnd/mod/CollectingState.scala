package typingsSlinky.reactBeautifulDnd.mod

import typingsSlinky.reactBeautifulDnd.reactBeautifulDndBooleans.`true`
import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.COLLECTING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent react-beautiful-dnd.react-beautiful-dnd.Omit<react-beautiful-dnd.react-beautiful-dnd.DraggingState, 'phase'> */
@js.native
trait CollectingState
  extends State
     with StateWhenUpdatesAllowed {
  
  var afterCritical: LiftEffect = js.native
  
  var critical: Critical = js.native
  
  var current: DragPositions = js.native
  
  var dimensions: DimensionMap = js.native
  
  var forceShouldAnimate: js.UndefOr[Boolean] = js.native
  
  var impact: DragImpact = js.native
  
  var initial: DragPositions = js.native
  
  var isDragging: `true` = js.native
  
  var isWindowScrollAllowed: Boolean = js.native
  
  var movementMode: MovementMode = js.native
  
  var onLiftImpact: DragImpact = js.native
  
  var phase: COLLECTING = js.native
  
  var scrollJumpRequest: js.UndefOr[Position] = js.native
  
  var viewport: Viewport = js.native
}
object CollectingState {
  
  @scala.inline
  def apply(
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
  ): CollectingState = {
    val __obj = js.Dynamic.literal(afterCritical = afterCritical.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], impact = impact.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], isWindowScrollAllowed = isWindowScrollAllowed.asInstanceOf[js.Any], movementMode = movementMode.asInstanceOf[js.Any], onLiftImpact = onLiftImpact.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectingState]
  }
  
  @scala.inline
  implicit class CollectingStateMutableBuilder[Self <: CollectingState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterCritical(value: LiftEffect): Self = StObject.set(x, "afterCritical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCritical(value: Critical): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrent(value: DragPositions): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensions(value: DimensionMap): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceShouldAnimate(value: Boolean): Self = StObject.set(x, "forceShouldAnimate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceShouldAnimateUndefined: Self = StObject.set(x, "forceShouldAnimate", js.undefined)
    
    @scala.inline
    def setImpact(value: DragImpact): Self = StObject.set(x, "impact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitial(value: DragPositions): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDragging(value: `true`): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWindowScrollAllowed(value: Boolean): Self = StObject.set(x, "isWindowScrollAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovementMode(value: MovementMode): Self = StObject.set(x, "movementMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLiftImpact(value: DragImpact): Self = StObject.set(x, "onLiftImpact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhase(value: COLLECTING): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollJumpRequest(value: Position): Self = StObject.set(x, "scrollJumpRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollJumpRequestUndefined: Self = StObject.set(x, "scrollJumpRequest", js.undefined)
    
    @scala.inline
    def setViewport(value: Viewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
  }
}
