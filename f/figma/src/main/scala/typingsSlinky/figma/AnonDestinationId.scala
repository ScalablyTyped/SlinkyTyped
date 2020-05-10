package typingsSlinky.figma

import typingsSlinky.figma.figmaStrings.NODE
import typingsSlinky.figma.mod._Global_.Action
import typingsSlinky.figma.mod._Global_.Navigation
import typingsSlinky.figma.mod._Global_.Transition
import typingsSlinky.figma.mod._Global_.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDestinationId extends Action {
  val destinationId: String | Null = js.native
  val navigation: Navigation = js.native
  // Only present if navigation == "OVERLAY" and the destination uses
  // overlay position type "RELATIVE"
  val overlayRelativePosition: js.UndefOr[Vector] = js.native
  val preserveScrollPosition: Boolean = js.native
  val transition: Transition | Null = js.native
  val `type`: NODE = js.native
}

object AnonDestinationId {
  @scala.inline
  def apply(navigation: Navigation, preserveScrollPosition: Boolean, `type`: NODE): AnonDestinationId = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], preserveScrollPosition = preserveScrollPosition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDestinationId]
  }
  @scala.inline
  implicit class AnonDestinationIdOps[Self <: AnonDestinationId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNavigation(value: Navigation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreserveScrollPosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveScrollPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: NODE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationId")(null)
        ret
    }
    @scala.inline
    def withOverlayRelativePosition(value: Vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayRelativePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayRelativePosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayRelativePosition")(js.undefined)
        ret
    }
    @scala.inline
    def withTransition(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(null)
        ret
    }
  }
  
}

