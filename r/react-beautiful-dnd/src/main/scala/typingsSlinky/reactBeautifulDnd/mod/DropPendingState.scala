package typingsSlinky.reactBeautifulDnd.mod

import typingsSlinky.reactBeautifulDnd.reactBeautifulDndBooleans.`true`
import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.DROP_PENDING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent react-beautiful-dnd.react-beautiful-dnd.Omit<react-beautiful-dnd.react-beautiful-dnd.DraggingState, 'phase'> */
@js.native
trait DropPendingState extends State {
  var afterCritical: LiftEffect = js.native
  var critical: Critical = js.native
  var current: DragPositions = js.native
  var dimensions: DimensionMap = js.native
  var forceShouldAnimate: js.UndefOr[Boolean] = js.native
  var impact: DragImpact = js.native
  var initial: DragPositions = js.native
  var isDragging: `true` = js.native
  var isWaiting: Boolean = js.native
  var isWindowScrollAllowed: Boolean = js.native
  var movementMode: MovementMode = js.native
  var onLiftImpact: DragImpact = js.native
  var phase: DROP_PENDING = js.native
  var reason: DropReason = js.native
  var scrollJumpRequest: js.UndefOr[Position] = js.native
  var userDirection: UserDirection = js.native
  var viewport: Viewport = js.native
}

object DropPendingState {
  @scala.inline
  def apply(
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
    userDirection: UserDirection,
    viewport: Viewport
  ): DropPendingState = {
    val __obj = js.Dynamic.literal(afterCritical = afterCritical.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], impact = impact.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], isWaiting = isWaiting.asInstanceOf[js.Any], isWindowScrollAllowed = isWindowScrollAllowed.asInstanceOf[js.Any], movementMode = movementMode.asInstanceOf[js.Any], onLiftImpact = onLiftImpact.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], userDirection = userDirection.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropPendingState]
  }
  @scala.inline
  implicit class DropPendingStateOps[Self <: DropPendingState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterCritical(value: LiftEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCritical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCritical(value: Critical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("critical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrent(value: DragPositions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDimensions(value: DimensionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImpact(value: DragImpact): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitial(value: DragPositions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDragging(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsWaiting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWaiting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsWindowScrollAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWindowScrollAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMovementMode(value: MovementMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movementMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnLiftImpact(value: DragImpact): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLiftImpact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhase(value: DROP_PENDING): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: DropReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserDirection(value: UserDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewport(value: Viewport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceShouldAnimate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceShouldAnimate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceShouldAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceShouldAnimate")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollJumpRequest(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollJumpRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollJumpRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollJumpRequest")(js.undefined)
        ret
    }
  }
  
}

