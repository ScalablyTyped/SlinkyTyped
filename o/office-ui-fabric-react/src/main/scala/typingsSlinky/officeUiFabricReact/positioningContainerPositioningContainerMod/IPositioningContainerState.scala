package typingsSlinky.officeUiFabricReact.positioningContainerPositioningContainerMod

import typingsSlinky.officeUiFabricReact.positioningTypesMod.IPositionedData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPositioningContainerState extends js.Object {
  /**
    * Tracks the current height offset and updates during
    * the height animation when props.finalHeight is specified.
    */
  var heightOffset: js.UndefOr[Double] = js.native
  /**
    * Current set of calcualted positions for the outermost parent container.
    */
  var positions: js.UndefOr[IPositionedData] = js.native
}

object IPositioningContainerState {
  @scala.inline
  def apply(): IPositioningContainerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPositioningContainerState]
  }
  @scala.inline
  implicit class IPositioningContainerStateOps[Self <: IPositioningContainerState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeightOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeightOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withPositions(value: IPositionedData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positions")(js.undefined)
        ret
    }
  }
  
}

