package typingsSlinky.officeUiFabricReact.colorSliderTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColorSliderStyles extends js.Object {
  /**
    * Style set for the root element.
    */
  var root: js.UndefOr[IStyle] = js.native
  /**
    * Style set for the overlay element.
    */
  var sliderOverlay: js.UndefOr[IStyle] = js.native
  /**
    * Style set for the draggable thumb element.
    */
  var sliderThumb: js.UndefOr[IStyle] = js.native
}

object IColorSliderStyles {
  @scala.inline
  def apply(): IColorSliderStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColorSliderStyles]
  }
  @scala.inline
  implicit class IColorSliderStylesOps[Self <: IColorSliderStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoot(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withRootNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(null)
        ret
    }
    @scala.inline
    def withSliderOverlay(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSliderOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderOverlay")(js.undefined)
        ret
    }
    @scala.inline
    def withSliderOverlayNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderOverlay")(null)
        ret
    }
    @scala.inline
    def withSliderThumb(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderThumb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSliderThumb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderThumb")(js.undefined)
        ret
    }
    @scala.inline
    def withSliderThumbNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderThumb")(null)
        ret
    }
  }
  
}

