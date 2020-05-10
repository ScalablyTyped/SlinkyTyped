package typingsSlinky.mapboxGl.mod

import typingsSlinky.mapboxGl.mapboxGlStrings.map
import typingsSlinky.mapboxGl.mapboxGlStrings.viewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FillPaint extends AnyPaint {
  var `fill-antialias`: js.UndefOr[Boolean | Expression] = js.native
  var `fill-color`: js.UndefOr[String | StyleFunction | Expression] = js.native
  var `fill-color-transition`: js.UndefOr[Transition] = js.native
  var `fill-opacity`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  var `fill-opacity-transition`: js.UndefOr[Transition] = js.native
  var `fill-outline-color`: js.UndefOr[String | StyleFunction | Expression] = js.native
  var `fill-outline-color-transition`: js.UndefOr[Transition] = js.native
  var `fill-pattern`: js.UndefOr[String | Expression] = js.native
  var `fill-pattern-transition`: js.UndefOr[Transition] = js.native
  var `fill-translate`: js.UndefOr[js.Array[Double]] = js.native
  var `fill-translate-anchor`: js.UndefOr[map | viewport] = js.native
  var `fill-translate-transition`: js.UndefOr[Transition] = js.native
}

object FillPaint {
  @scala.inline
  def apply(): FillPaint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillPaint]
  }
  @scala.inline
  implicit class FillPaintOps[Self <: FillPaint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withFill-antialias`(value: Boolean | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-antialias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFill-antialias`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-antialias")(js.undefined)
        ret
    }
    @scala.inline
    def `withFill-color`(value: String | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFill-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withFill-color-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-color-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFill-color-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-color-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withFill-opacity`(value: Double | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFill-opacity`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-opacity")(js.undefined)
        ret
    }
    @scala.inline
    def `withFill-opacity-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-opacity-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFill-opacity-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-opacity-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withFill-outline-color`(value: String | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-outline-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFill-outline-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-outline-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withFill-outline-color-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-outline-color-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFill-outline-color-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-outline-color-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withFill-pattern`(value: String | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFill-pattern`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-pattern")(js.undefined)
        ret
    }
    @scala.inline
    def `withFill-pattern-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-pattern-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFill-pattern-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-pattern-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withFill-translate`(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-translate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFill-translate`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-translate")(js.undefined)
        ret
    }
    @scala.inline
    def `withFill-translate-anchor`(value: map | viewport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-translate-anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFill-translate-anchor`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-translate-anchor")(js.undefined)
        ret
    }
    @scala.inline
    def `withFill-translate-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-translate-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFill-translate-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-translate-transition")(js.undefined)
        ret
    }
  }
  
}

