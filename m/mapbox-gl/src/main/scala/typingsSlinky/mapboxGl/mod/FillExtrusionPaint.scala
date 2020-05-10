package typingsSlinky.mapboxGl.mod

import typingsSlinky.mapboxGl.mapboxGlStrings.map
import typingsSlinky.mapboxGl.mapboxGlStrings.viewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FillExtrusionPaint extends AnyPaint {
  var `fill-extrusion-base`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  var `fill-extrusion-base-transition`: js.UndefOr[Transition] = js.native
  var `fill-extrusion-color`: js.UndefOr[String | StyleFunction | Expression] = js.native
  var `fill-extrusion-color-transition`: js.UndefOr[Transition] = js.native
  var `fill-extrusion-height`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  var `fill-extrusion-height-transition`: js.UndefOr[Transition] = js.native
  var `fill-extrusion-opacity`: js.UndefOr[Double | Expression] = js.native
  var `fill-extrusion-opacity-transition`: js.UndefOr[Transition] = js.native
  var `fill-extrusion-pattern`: js.UndefOr[String | Expression] = js.native
  var `fill-extrusion-pattern-transition`: js.UndefOr[Transition] = js.native
  var `fill-extrusion-translate`: js.UndefOr[js.Array[Double] | Expression] = js.native
  var `fill-extrusion-translate-anchor`: js.UndefOr[map | viewport] = js.native
  var `fill-extrusion-translate-transition`: js.UndefOr[Transition] = js.native
  var `fill-extrusion-vertical-gradient`: js.UndefOr[Boolean] = js.native
}

object FillExtrusionPaint {
  @scala.inline
  def apply(): FillExtrusionPaint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillExtrusionPaint]
  }
  @scala.inline
  implicit class FillExtrusionPaintOps[Self <: FillExtrusionPaint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withFill-extrusion-base`(value: Double | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-extrusion-base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFill-extrusion-base`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-extrusion-base")(js.undefined)
        ret
    }
    @scala.inline
    def `withFill-extrusion-base-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-extrusion-base-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFill-extrusion-base-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-extrusion-base-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withFill-extrusion-color`(value: String | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-extrusion-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFill-extrusion-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-extrusion-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withFill-extrusion-color-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-extrusion-color-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFill-extrusion-color-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-extrusion-color-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withFill-extrusion-height`(value: Double | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-extrusion-height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFill-extrusion-height`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-extrusion-height")(js.undefined)
        ret
    }
    @scala.inline
    def `withFill-extrusion-height-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-extrusion-height-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFill-extrusion-height-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-extrusion-height-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withFill-extrusion-opacity`(value: Double | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-extrusion-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFill-extrusion-opacity`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-extrusion-opacity")(js.undefined)
        ret
    }
    @scala.inline
    def `withFill-extrusion-opacity-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-extrusion-opacity-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFill-extrusion-opacity-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-extrusion-opacity-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withFill-extrusion-pattern`(value: String | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-extrusion-pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFill-extrusion-pattern`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-extrusion-pattern")(js.undefined)
        ret
    }
    @scala.inline
    def `withFill-extrusion-pattern-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-extrusion-pattern-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFill-extrusion-pattern-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-extrusion-pattern-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withFill-extrusion-translate`(value: js.Array[Double] | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-extrusion-translate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFill-extrusion-translate`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-extrusion-translate")(js.undefined)
        ret
    }
    @scala.inline
    def `withFill-extrusion-translate-anchor`(value: map | viewport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-extrusion-translate-anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFill-extrusion-translate-anchor`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-extrusion-translate-anchor")(js.undefined)
        ret
    }
    @scala.inline
    def `withFill-extrusion-translate-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-extrusion-translate-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFill-extrusion-translate-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-extrusion-translate-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withFill-extrusion-vertical-gradient`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-extrusion-vertical-gradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFill-extrusion-vertical-gradient`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-extrusion-vertical-gradient")(js.undefined)
        ret
    }
  }
  
}

