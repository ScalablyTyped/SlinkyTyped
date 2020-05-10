package typingsSlinky.mapboxGl.mod

import typingsSlinky.mapboxGl.mapboxGlStrings.map
import typingsSlinky.mapboxGl.mapboxGlStrings.viewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CirclePaint extends AnyPaint {
  var `circle-blur`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  var `circle-blur-transition`: js.UndefOr[Transition] = js.native
  var `circle-color`: js.UndefOr[String | StyleFunction | Expression] = js.native
  var `circle-color-transition`: js.UndefOr[Transition] = js.native
  var `circle-opacity`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  var `circle-opacity-transition`: js.UndefOr[Transition] = js.native
  var `circle-pitch-alignment`: js.UndefOr[map | viewport] = js.native
  var `circle-pitch-scale`: js.UndefOr[map | viewport] = js.native
  var `circle-radius`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  var `circle-radius-transition`: js.UndefOr[Transition] = js.native
  var `circle-stroke-color`: js.UndefOr[String | StyleFunction | Expression] = js.native
  var `circle-stroke-color-transition`: js.UndefOr[Transition] = js.native
  var `circle-stroke-opacity`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  var `circle-stroke-opacity-transition`: js.UndefOr[Transition] = js.native
  var `circle-stroke-width`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  var `circle-stroke-width-transition`: js.UndefOr[Transition] = js.native
  var `circle-translate`: js.UndefOr[js.Array[Double] | Expression] = js.native
  var `circle-translate-anchor`: js.UndefOr[map | viewport] = js.native
  var `circle-translate-transition`: js.UndefOr[Transition] = js.native
}

object CirclePaint {
  @scala.inline
  def apply(): CirclePaint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CirclePaint]
  }
  @scala.inline
  implicit class CirclePaintOps[Self <: CirclePaint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withCircle-blur`(value: Double | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-blur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCircle-blur`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-blur")(js.undefined)
        ret
    }
    @scala.inline
    def `withCircle-blur-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-blur-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCircle-blur-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-blur-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withCircle-color`(value: String | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCircle-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withCircle-color-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-color-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCircle-color-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-color-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withCircle-opacity`(value: Double | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCircle-opacity`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-opacity")(js.undefined)
        ret
    }
    @scala.inline
    def `withCircle-opacity-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-opacity-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCircle-opacity-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-opacity-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withCircle-pitch-alignment`(value: map | viewport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-pitch-alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCircle-pitch-alignment`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-pitch-alignment")(js.undefined)
        ret
    }
    @scala.inline
    def `withCircle-pitch-scale`(value: map | viewport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-pitch-scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCircle-pitch-scale`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-pitch-scale")(js.undefined)
        ret
    }
    @scala.inline
    def `withCircle-radius`(value: Double | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCircle-radius`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-radius")(js.undefined)
        ret
    }
    @scala.inline
    def `withCircle-radius-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-radius-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCircle-radius-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-radius-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withCircle-stroke-color`(value: String | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-stroke-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCircle-stroke-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-stroke-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withCircle-stroke-color-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-stroke-color-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCircle-stroke-color-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-stroke-color-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withCircle-stroke-opacity`(value: Double | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-stroke-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCircle-stroke-opacity`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-stroke-opacity")(js.undefined)
        ret
    }
    @scala.inline
    def `withCircle-stroke-opacity-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-stroke-opacity-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCircle-stroke-opacity-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-stroke-opacity-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withCircle-stroke-width`(value: Double | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-stroke-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCircle-stroke-width`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-stroke-width")(js.undefined)
        ret
    }
    @scala.inline
    def `withCircle-stroke-width-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-stroke-width-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCircle-stroke-width-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-stroke-width-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withCircle-translate`(value: js.Array[Double] | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-translate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCircle-translate`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-translate")(js.undefined)
        ret
    }
    @scala.inline
    def `withCircle-translate-anchor`(value: map | viewport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-translate-anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCircle-translate-anchor`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-translate-anchor")(js.undefined)
        ret
    }
    @scala.inline
    def `withCircle-translate-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-translate-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCircle-translate-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-translate-transition")(js.undefined)
        ret
    }
  }
  
}

