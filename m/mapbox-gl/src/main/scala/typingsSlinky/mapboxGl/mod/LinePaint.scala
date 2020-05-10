package typingsSlinky.mapboxGl.mod

import typingsSlinky.mapboxGl.mapboxGlStrings.map
import typingsSlinky.mapboxGl.mapboxGlStrings.viewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinePaint extends AnyPaint {
  var `line-blur`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  var `line-blur-transition`: js.UndefOr[Transition] = js.native
  var `line-color`: js.UndefOr[String | StyleFunction | Expression] = js.native
  var `line-color-transition`: js.UndefOr[Transition] = js.native
  var `line-dasharray`: js.UndefOr[js.Array[Double] | Expression] = js.native
  var `line-dasharray-transition`: js.UndefOr[Transition] = js.native
  var `line-gap-width`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  var `line-gap-width-transition`: js.UndefOr[Transition] = js.native
  var `line-gradient`: js.UndefOr[Expression] = js.native
  var `line-offset`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  var `line-offset-transition`: js.UndefOr[Transition] = js.native
  var `line-opacity`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  var `line-opacity-transition`: js.UndefOr[Transition] = js.native
  var `line-pattern`: js.UndefOr[String | Expression] = js.native
  var `line-pattern-transition`: js.UndefOr[Transition] = js.native
  var `line-translate`: js.UndefOr[js.Array[Double] | Expression] = js.native
  var `line-translate-anchor`: js.UndefOr[map | viewport] = js.native
  var `line-translate-transition`: js.UndefOr[Transition] = js.native
  var `line-width`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  var `line-width-transition`: js.UndefOr[Transition] = js.native
}

object LinePaint {
  @scala.inline
  def apply(): LinePaint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinePaint]
  }
  @scala.inline
  implicit class LinePaintOps[Self <: LinePaint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withLine-blur`(value: Double | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-blur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-blur`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-blur")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-blur-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-blur-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-blur-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-blur-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-color`(value: String | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-color-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-color-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-color-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-color-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-dasharray`(value: js.Array[Double] | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-dasharray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-dasharray`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-dasharray")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-dasharray-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-dasharray-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-dasharray-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-dasharray-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-gap-width`(value: Double | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-gap-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-gap-width`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-gap-width")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-gap-width-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-gap-width-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-gap-width-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-gap-width-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-gradient`(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-gradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-gradient`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-gradient")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-offset`(value: Double | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-offset`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-offset")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-offset-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-offset-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-offset-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-offset-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-opacity`(value: Double | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-opacity`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-opacity")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-opacity-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-opacity-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-opacity-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-opacity-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-pattern`(value: String | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-pattern`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-pattern")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-pattern-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-pattern-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-pattern-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-pattern-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-translate`(value: js.Array[Double] | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-translate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-translate`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-translate")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-translate-anchor`(value: map | viewport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-translate-anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-translate-anchor`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-translate-anchor")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-translate-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-translate-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-translate-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-translate-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-width`(value: Double | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-width`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-width")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-width-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-width-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-width-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-width-transition")(js.undefined)
        ret
    }
  }
  
}

