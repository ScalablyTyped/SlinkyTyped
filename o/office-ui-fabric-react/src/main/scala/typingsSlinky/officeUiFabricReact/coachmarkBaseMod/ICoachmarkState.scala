package typingsSlinky.officeUiFabricReact.coachmarkBaseMod

import typingsSlinky.officeUiFabricReact.positioningTypesMod.RectangleEdge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICoachmarkState extends js.Object {
  /**
    * ARIA alert text to read aloud with Narrator once the Coachmark is mounted
    */
  var alertText: js.UndefOr[String] = js.native
  /**
    * The bottom position of the beak
    */
  var beakBottom: js.UndefOr[String] = js.native
  /**
    * The left position of the beak
    */
  var beakLeft: js.UndefOr[String] = js.native
  /**
    * The right position of the beak
    */
  var beakRight: js.UndefOr[String] = js.native
  /**
    * The right position of the beak
    */
  var beakTop: js.UndefOr[String] = js.native
  /**
    * Cached width and height of _entityInnerHostElement
    */
  var entityInnerHostRect: IEntityRect = js.native
  /**
    * Enables/Disables the beacon that radiates
    * from the center of the coachmark.
    */
  var isBeaconAnimating: Boolean = js.native
  /**
    * Is the Coachmark currently collapsed into
    * a tear drop shape
    */
  var isCollapsed: Boolean = js.native
  /**
    * Is the Coachmark done measuring the hosted entity
    */
  var isMeasured: Boolean = js.native
  /**
    * Is the teaching bubble currently retreiving the
    * original dimensions of the hosted entity.
    */
  var isMeasuring: Boolean = js.native
  /**
    * Is the mouse in proximity of the default target element
    */
  var isMouseInProximity: Boolean = js.native
  /**
    * Alignment edge of callout in relation to target
    */
  var targetAlignment: js.UndefOr[RectangleEdge] = js.native
  /**
    * Position of Coachmark/TeachingBubble in relation to target
    */
  var targetPosition: js.UndefOr[RectangleEdge] = js.native
  /**
    * Transform origin of teaching bubble callout
    */
  var transformOrigin: js.UndefOr[String] = js.native
}

object ICoachmarkState {
  @scala.inline
  def apply(
    entityInnerHostRect: IEntityRect,
    isBeaconAnimating: Boolean,
    isCollapsed: Boolean,
    isMeasured: Boolean,
    isMeasuring: Boolean,
    isMouseInProximity: Boolean
  ): ICoachmarkState = {
    val __obj = js.Dynamic.literal(entityInnerHostRect = entityInnerHostRect.asInstanceOf[js.Any], isBeaconAnimating = isBeaconAnimating.asInstanceOf[js.Any], isCollapsed = isCollapsed.asInstanceOf[js.Any], isMeasured = isMeasured.asInstanceOf[js.Any], isMeasuring = isMeasuring.asInstanceOf[js.Any], isMouseInProximity = isMouseInProximity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICoachmarkState]
  }
  @scala.inline
  implicit class ICoachmarkStateOps[Self <: ICoachmarkState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntityInnerHostRect(value: IEntityRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityInnerHostRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBeaconAnimating(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBeaconAnimating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCollapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMeasured(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMeasured")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMeasuring(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMeasuring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMouseInProximity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMouseInProximity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlertText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlertText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertText")(js.undefined)
        ret
    }
    @scala.inline
    def withBeakBottom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beakBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeakBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beakBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withBeakLeft(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beakLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeakLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beakLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withBeakRight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beakRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeakRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beakRight")(js.undefined)
        ret
    }
    @scala.inline
    def withBeakTop(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beakTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeakTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beakTop")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetAlignment(value: RectangleEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetPosition(value: RectangleEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformOrigin")(js.undefined)
        ret
    }
  }
  
}

