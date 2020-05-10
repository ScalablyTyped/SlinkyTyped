package typingsSlinky.mapboxGl.mod

import typingsSlinky.mapboxGl.mapboxGlStrings.map
import typingsSlinky.mapboxGl.mapboxGlStrings.viewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Light extends js.Object {
  var anchor: js.UndefOr[map | viewport] = js.native
  var color: js.UndefOr[String] = js.native
  var `color-transition`: js.UndefOr[Transition] = js.native
  var intensity: js.UndefOr[Double] = js.native
  var `intensity-transition`: js.UndefOr[Transition] = js.native
  var position: js.UndefOr[js.Array[Double]] = js.native
  var `position-transition`: js.UndefOr[Transition] = js.native
}

object Light {
  @scala.inline
  def apply(): Light = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Light]
  }
  @scala.inline
  implicit class LightOps[Self <: Light] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchor(value: map | viewport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def `withColor-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutColor-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color-transition")(js.undefined)
        ret
    }
    @scala.inline
    def withIntensity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intensity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntensity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intensity")(js.undefined)
        ret
    }
    @scala.inline
    def `withIntensity-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intensity-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIntensity-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intensity-transition")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def `withPosition-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPosition-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position-transition")(js.undefined)
        ret
    }
  }
  
}

