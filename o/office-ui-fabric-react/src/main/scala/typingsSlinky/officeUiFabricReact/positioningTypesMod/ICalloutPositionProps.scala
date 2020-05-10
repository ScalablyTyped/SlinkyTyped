package typingsSlinky.officeUiFabricReact.positioningTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalloutPositionProps extends IPositionProps {
  /**
    * The width of the beak.
    */
  var beakWidth: js.UndefOr[Double] = js.native
  /**
    * Whether or not the beak is visible
    */
  var isBeakVisible: js.UndefOr[Boolean] = js.native
}

object ICalloutPositionProps {
  @scala.inline
  def apply(): ICalloutPositionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICalloutPositionProps]
  }
  @scala.inline
  implicit class ICalloutPositionPropsOps[Self <: ICalloutPositionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeakWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beakWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeakWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beakWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withIsBeakVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBeakVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBeakVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBeakVisible")(js.undefined)
        ret
    }
  }
  
}

