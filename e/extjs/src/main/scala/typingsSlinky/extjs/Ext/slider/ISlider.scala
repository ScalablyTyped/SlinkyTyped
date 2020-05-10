package typingsSlinky.extjs.Ext.slider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISlider extends IMulti {
  /** [Method] Programmatically sets the value of the Slider
  		* @param value Number The value to set the slider to. (This will be constrained within minValue and maxValue)
  		* @param animate Boolean Turn on or off animation
  		*/
  @JSName("setValue")
  var setValue_ISlider: js.UndefOr[
    js.Function2[/* value */ js.UndefOr[Double], /* animate */ js.UndefOr[Boolean], Unit]
  ] = js.native
}

object ISlider {
  @scala.inline
  def apply(): ISlider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISlider]
  }
  @scala.inline
  implicit class ISliderOps[Self <: ISlider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetValue(value: (/* value */ js.UndefOr[Double], /* animate */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.undefined)
        ret
    }
  }
  
}

