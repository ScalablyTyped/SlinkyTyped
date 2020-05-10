package typingsSlinky.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxSliderOptions extends dxSliderBaseOptions[dxSlider] {
  /** The current slider value. */
  @JSName("value")
  var value_dxSliderOptions: js.UndefOr[Double] = js.native
}

object dxSliderOptions {
  @scala.inline
  def apply(): dxSliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSliderOptions]
  }
  @scala.inline
  implicit class dxSliderOptionsOps[Self <: dxSliderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

