package typingsSlinky.blueprintjsCore.multiSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISliderState extends js.Object {
  var labelPrecision: js.UndefOr[Double] = js.native
  /** the client size, in pixels, of one tick */
  var tickSize: js.UndefOr[Double] = js.native
  /** the size of one tick as a ratio of the component's client size */
  var tickSizeRatio: js.UndefOr[Double] = js.native
}

object ISliderState {
  @scala.inline
  def apply(): ISliderState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISliderState]
  }
  @scala.inline
  implicit class ISliderStateOps[Self <: ISliderState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPrecision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPrecision")(js.undefined)
        ret
    }
    @scala.inline
    def withTickSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTickSizeRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickSizeRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickSizeRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickSizeRatio")(js.undefined)
        ret
    }
  }
  
}

