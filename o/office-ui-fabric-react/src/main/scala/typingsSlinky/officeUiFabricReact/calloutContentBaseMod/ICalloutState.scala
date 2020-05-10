package typingsSlinky.officeUiFabricReact.calloutContentBaseMod

import org.scalajs.dom.raw.ClientRect
import typingsSlinky.officeUiFabricReact.positioningTypesMod.ICalloutPositionedInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalloutState extends js.Object {
  var calloutElementRect: js.UndefOr[ClientRect] = js.native
  var heightOffset: js.UndefOr[Double] = js.native
  var positions: js.UndefOr[ICalloutPositionedInfo] = js.native
  var slideDirectionalClassName: js.UndefOr[String] = js.native
}

object ICalloutState {
  @scala.inline
  def apply(): ICalloutState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICalloutState]
  }
  @scala.inline
  implicit class ICalloutStateOps[Self <: ICalloutState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalloutElementRect(value: ClientRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutElementRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutElementRect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutElementRect")(js.undefined)
        ret
    }
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
    def withPositions(value: ICalloutPositionedInfo): Self = {
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
    @scala.inline
    def withSlideDirectionalClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideDirectionalClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideDirectionalClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideDirectionalClassName")(js.undefined)
        ret
    }
  }
  
}

