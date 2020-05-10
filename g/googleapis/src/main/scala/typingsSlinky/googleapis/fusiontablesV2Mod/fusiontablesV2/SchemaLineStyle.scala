package typingsSlinky.googleapis.fusiontablesV2Mod.fusiontablesV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a LineStyle within a StyleSetting
  */
@js.native
trait SchemaLineStyle extends js.Object {
  /**
    * Color of the line in #RRGGBB format.
    */
  var strokeColor: js.UndefOr[String] = js.native
  /**
    * Column-value, gradient or buckets styler that is used to determine the
    * line color and opacity.
    */
  var strokeColorStyler: js.UndefOr[SchemaStyleFunction] = js.native
  /**
    * Opacity of the line : 0.0 (transparent) to 1.0 (opaque).
    */
  var strokeOpacity: js.UndefOr[Double] = js.native
  /**
    * Width of the line in pixels.
    */
  var strokeWeight: js.UndefOr[Double] = js.native
  /**
    * Column-value or bucket styler that is used to determine the width of the
    * line.
    */
  var strokeWeightStyler: js.UndefOr[SchemaStyleFunction] = js.native
}

object SchemaLineStyle {
  @scala.inline
  def apply(): SchemaLineStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLineStyle]
  }
  @scala.inline
  implicit class SchemaLineStyleOps[Self <: SchemaLineStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStrokeColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeColorStyler(value: SchemaStyleFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColorStyler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeColorStyler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColorStyler")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeWeightStyler(value: SchemaStyleFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWeightStyler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeWeightStyler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWeightStyler")(js.undefined)
        ret
    }
  }
  
}

