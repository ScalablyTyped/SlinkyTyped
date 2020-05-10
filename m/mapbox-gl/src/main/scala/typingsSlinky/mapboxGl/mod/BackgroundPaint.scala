package typingsSlinky.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundPaint extends AnyPaint {
  var `background-color`: js.UndefOr[String | Expression] = js.native
  var `background-color-transition`: js.UndefOr[Transition] = js.native
  var `background-opacity`: js.UndefOr[Double | Expression] = js.native
  var `background-opacity-transition`: js.UndefOr[Transition] = js.native
  var `background-pattern`: js.UndefOr[String] = js.native
  var `background-pattern-transition`: js.UndefOr[Transition] = js.native
}

object BackgroundPaint {
  @scala.inline
  def apply(): BackgroundPaint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundPaint]
  }
  @scala.inline
  implicit class BackgroundPaintOps[Self <: BackgroundPaint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withBackground-color`(value: String | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withBackground-color-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-color-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-color-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-color-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withBackground-opacity`(value: Double | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-opacity`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-opacity")(js.undefined)
        ret
    }
    @scala.inline
    def `withBackground-opacity-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-opacity-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-opacity-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-opacity-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withBackground-pattern`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-pattern`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-pattern")(js.undefined)
        ret
    }
    @scala.inline
    def `withBackground-pattern-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-pattern-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-pattern-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-pattern-transition")(js.undefined)
        ret
    }
  }
  
}

