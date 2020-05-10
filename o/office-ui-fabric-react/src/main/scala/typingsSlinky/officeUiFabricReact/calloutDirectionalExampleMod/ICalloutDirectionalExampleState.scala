package typingsSlinky.officeUiFabricReact.calloutDirectionalExampleMod

import typingsSlinky.officeUiFabricReact.directionalHintMod.DirectionalHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalloutDirectionalExampleState extends js.Object {
  var beakWidth: js.UndefOr[Double] = js.native
  var directionalHint: js.UndefOr[DirectionalHint] = js.native
  var gapSpace: js.UndefOr[Double] = js.native
  var isBeakVisible: js.UndefOr[Boolean] = js.native
  var isCalloutVisible: js.UndefOr[Boolean] = js.native
}

object ICalloutDirectionalExampleState {
  @scala.inline
  def apply(): ICalloutDirectionalExampleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICalloutDirectionalExampleState]
  }
  @scala.inline
  implicit class ICalloutDirectionalExampleStateOps[Self <: ICalloutDirectionalExampleState] (val x: Self) extends AnyVal {
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
    def withDirectionalHint(value: DirectionalHint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectionalHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalHint")(js.undefined)
        ret
    }
    @scala.inline
    def withGapSpace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGapSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapSpace")(js.undefined)
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
    @scala.inline
    def withIsCalloutVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCalloutVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCalloutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCalloutVisible")(js.undefined)
        ret
    }
  }
  
}

