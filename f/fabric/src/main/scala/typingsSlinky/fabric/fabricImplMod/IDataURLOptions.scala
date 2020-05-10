package typingsSlinky.fabric.fabricImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////////
// Data Object Interfaces - These interface are not specific part of fabric,
// They are just helpful for for defining function parameters
//////////////////////////////////////////////////////////////////////////////
@js.native
trait IDataURLOptions extends js.Object {
  var enableRetinaScaling: js.UndefOr[Boolean] = js.native
  /**
  	 * The format of the output image. Either "jpeg" or "png"
  	 */
  var format: js.UndefOr[String] = js.native
  /**
  	 * Cropping height. Introduced in v1.2.14
  	 */
  var height: js.UndefOr[Double] = js.native
  /**
  	 * Cropping left offset. Introduced in v1.2.14
  	 */
  var left: js.UndefOr[Double] = js.native
  /**
  	 * Multiplier to scale by
  	 */
  var multiplier: js.UndefOr[Double] = js.native
  /**
  	 * Quality level (0..1). Only used for jpeg
  	 */
  var quality: js.UndefOr[Double] = js.native
  /**
  	 * Cropping top offset. Introduced in v1.2.14
  	 */
  var top: js.UndefOr[Double] = js.native
  /**
  	 * Cropping width. Introduced in v1.2.14
  	 */
  var width: js.UndefOr[Double] = js.native
  var withoutShadow: js.UndefOr[Boolean] = js.native
  var withoutTransform: js.UndefOr[Boolean] = js.native
}

object IDataURLOptions {
  @scala.inline
  def apply(): IDataURLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDataURLOptions]
  }
  @scala.inline
  implicit class IDataURLOptionsOps[Self <: IDataURLOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableRetinaScaling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRetinaScaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRetinaScaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRetinaScaling")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiplier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiplier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiplier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiplier")(js.undefined)
        ret
    }
    @scala.inline
    def withQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withWithoutShadow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withoutShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithoutShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withoutShadow")(js.undefined)
        ret
    }
    @scala.inline
    def withWithoutTransform(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withoutTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withoutTransform")(js.undefined)
        ret
    }
  }
  
}

