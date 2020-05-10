package typingsSlinky.mapboxGl.mod

import typingsSlinky.mapboxGl.mapboxGlStrings.map
import typingsSlinky.mapboxGl.mapboxGlStrings.viewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HillshadePaint extends AnyPaint {
  var `hillshade-accent-color`: js.UndefOr[String | Expression] = js.native
  var `hillshade-accent-color-transition`: js.UndefOr[Transition] = js.native
  var `hillshade-exaggeration`: js.UndefOr[Double | Expression] = js.native
  var `hillshade-exaggeration-transition`: js.UndefOr[Transition] = js.native
  var `hillshade-highlight-color`: js.UndefOr[String | Expression] = js.native
  var `hillshade-highlight-color-transition`: js.UndefOr[Transition] = js.native
  var `hillshade-illumination-anchor`: js.UndefOr[map | viewport] = js.native
  var `hillshade-illumination-direction`: js.UndefOr[Double | Expression] = js.native
  var `hillshade-shadow-color`: js.UndefOr[String | Expression] = js.native
  var `hillshade-shadow-color-transition`: js.UndefOr[Transition] = js.native
}

object HillshadePaint {
  @scala.inline
  def apply(): HillshadePaint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HillshadePaint]
  }
  @scala.inline
  implicit class HillshadePaintOps[Self <: HillshadePaint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withHillshade-accent-color`(value: String | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hillshade-accent-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHillshade-accent-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hillshade-accent-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withHillshade-accent-color-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hillshade-accent-color-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHillshade-accent-color-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hillshade-accent-color-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withHillshade-exaggeration`(value: Double | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hillshade-exaggeration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHillshade-exaggeration`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hillshade-exaggeration")(js.undefined)
        ret
    }
    @scala.inline
    def `withHillshade-exaggeration-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hillshade-exaggeration-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHillshade-exaggeration-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hillshade-exaggeration-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withHillshade-highlight-color`(value: String | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hillshade-highlight-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHillshade-highlight-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hillshade-highlight-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withHillshade-highlight-color-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hillshade-highlight-color-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHillshade-highlight-color-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hillshade-highlight-color-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withHillshade-illumination-anchor`(value: map | viewport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hillshade-illumination-anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHillshade-illumination-anchor`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hillshade-illumination-anchor")(js.undefined)
        ret
    }
    @scala.inline
    def `withHillshade-illumination-direction`(value: Double | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hillshade-illumination-direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHillshade-illumination-direction`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hillshade-illumination-direction")(js.undefined)
        ret
    }
    @scala.inline
    def `withHillshade-shadow-color`(value: String | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hillshade-shadow-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHillshade-shadow-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hillshade-shadow-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withHillshade-shadow-color-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hillshade-shadow-color-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHillshade-shadow-color-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hillshade-shadow-color-transition")(js.undefined)
        ret
    }
  }
  
}

