package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AffineTransform uses a 3x3 matrix with an implied last row of [ 0 0 1 ] to
  * transform source coordinates (x,y) into destination coordinates (x&#39;,
  * y&#39;) according to:        x&#39;  x  =   shear_y  scale_y  translate_y
  * 1  [ 1 ]  After transformation,       x&#39; = scale_x * x + shear_x * y +
  * translate_x;      y&#39; = scale_y * y + shear_y * x + translate_y;  This
  * message is therefore composed of these six matrix elements.
  */
@js.native
trait SchemaAffineTransform extends js.Object {
  /**
    * The X coordinate scaling element.
    */
  var scaleX: js.UndefOr[Double] = js.native
  /**
    * The Y coordinate scaling element.
    */
  var scaleY: js.UndefOr[Double] = js.native
  /**
    * The X coordinate shearing element.
    */
  var shearX: js.UndefOr[Double] = js.native
  /**
    * The Y coordinate shearing element.
    */
  var shearY: js.UndefOr[Double] = js.native
  /**
    * The X coordinate translation element.
    */
  var translateX: js.UndefOr[Double] = js.native
  /**
    * The Y coordinate translation element.
    */
  var translateY: js.UndefOr[Double] = js.native
  /**
    * The units for translate elements.
    */
  var unit: js.UndefOr[String] = js.native
}

object SchemaAffineTransform {
  @scala.inline
  def apply(): SchemaAffineTransform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAffineTransform]
  }
  @scala.inline
  implicit class SchemaAffineTransformOps[Self <: SchemaAffineTransform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScaleX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleX")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleY")(js.undefined)
        ret
    }
    @scala.inline
    def withShearX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shearX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShearX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shearX")(js.undefined)
        ret
    }
    @scala.inline
    def withShearY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shearY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShearY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shearY")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslateX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslateX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateX")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslateY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslateY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateY")(js.undefined)
        ret
    }
    @scala.inline
    def withUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(js.undefined)
        ret
    }
  }
  
}

