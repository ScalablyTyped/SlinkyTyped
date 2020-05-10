package typingsSlinky.mapnik

import typingsSlinky.mapnik.mapnikStrings.jpeg
import typingsSlinky.mapnik.mapnikStrings.png
import typingsSlinky.mapnik.mapnikStrings.tiff
import typingsSlinky.mapnik.mapnikStrings.webp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCallback extends js.Object {
  var area_threshold: js.UndefOr[Double] = js.native
  var callback: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.native
  var fill_type: js.UndefOr[Double] = js.native
  var image_format: js.UndefOr[webp | jpeg | png | tiff] = js.native
  var max_extent: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.native
  var multi_polygon_union: js.UndefOr[Boolean] = js.native
  var offset_x: js.UndefOr[Double] = js.native
  var offset_y: js.UndefOr[Double] = js.native
  var process_all_rings: js.UndefOr[Boolean] = js.native
  var reencode: js.UndefOr[Boolean] = js.native
  var scale_denominator: js.UndefOr[Double] = js.native
  var scale_factor: js.UndefOr[Double] = js.native
  var scaling_method: js.UndefOr[String] = js.native
  var simplify_distance: js.UndefOr[Double] = js.native
  var strictly_simple: js.UndefOr[Boolean] = js.native
  var threading_mode: js.UndefOr[String] = js.native
}

object AnonCallback {
  @scala.inline
  def apply(): AnonCallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCallback]
  }
  @scala.inline
  implicit class AnonCallbackOps[Self <: AnonCallback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArea_threshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area_threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArea_threshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area_threshold")(js.undefined)
        ret
    }
    @scala.inline
    def withCallback(value: /* err */ js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withFill_type(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill_type")(js.undefined)
        ret
    }
    @scala.inline
    def withImage_format(value: webp | jpeg | png | tiff): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image_format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage_format: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image_format")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_extent(value: js.Tuple4[Double, Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_extent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_extent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_extent")(js.undefined)
        ret
    }
    @scala.inline
    def withMulti_polygon_union(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi_polygon_union")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMulti_polygon_union: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi_polygon_union")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset_x(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset_x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset_x: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset_x")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset_y(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset_y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset_y: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset_y")(js.undefined)
        ret
    }
    @scala.inline
    def withProcess_all_rings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("process_all_rings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcess_all_rings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("process_all_rings")(js.undefined)
        ret
    }
    @scala.inline
    def withReencode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reencode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReencode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reencode")(js.undefined)
        ret
    }
    @scala.inline
    def withScale_denominator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale_denominator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale_denominator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale_denominator")(js.undefined)
        ret
    }
    @scala.inline
    def withScale_factor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale_factor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale_factor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale_factor")(js.undefined)
        ret
    }
    @scala.inline
    def withScaling_method(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaling_method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaling_method: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaling_method")(js.undefined)
        ret
    }
    @scala.inline
    def withSimplify_distance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simplify_distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimplify_distance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simplify_distance")(js.undefined)
        ret
    }
    @scala.inline
    def withStrictly_simple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictly_simple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictly_simple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictly_simple")(js.undefined)
        ret
    }
    @scala.inline
    def withThreading_mode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threading_mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreading_mode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threading_mode")(js.undefined)
        ret
    }
  }
  
}

