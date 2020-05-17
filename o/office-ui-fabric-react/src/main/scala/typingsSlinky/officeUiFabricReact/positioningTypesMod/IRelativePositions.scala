package typingsSlinky.officeUiFabricReact.positioningTypesMod

import typingsSlinky.officeUiFabricReact.directionalHintMod.DirectionalHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRelativePositions extends js.Object {
  var beakPosition: typingsSlinky.officeUiFabricReact.anon.Position = js.native
  var calloutPosition: IPosition = js.native
  var directionalClassName: String = js.native
  var submenuDirection: DirectionalHint = js.native
}

object IRelativePositions {
  @scala.inline
  def apply(
    beakPosition: typingsSlinky.officeUiFabricReact.anon.Position,
    calloutPosition: IPosition,
    directionalClassName: String,
    submenuDirection: DirectionalHint
  ): IRelativePositions = {
    val __obj = js.Dynamic.literal(beakPosition = beakPosition.asInstanceOf[js.Any], calloutPosition = calloutPosition.asInstanceOf[js.Any], directionalClassName = directionalClassName.asInstanceOf[js.Any], submenuDirection = submenuDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRelativePositions]
  }
  @scala.inline
  implicit class IRelativePositionsOps[Self <: IRelativePositions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeakPosition(value: typingsSlinky.officeUiFabricReact.anon.Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beakPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalloutPosition(value: IPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectionalClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubmenuDirection(value: DirectionalHint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submenuDirection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

