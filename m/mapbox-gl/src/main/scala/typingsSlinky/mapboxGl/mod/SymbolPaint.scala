package typingsSlinky.mapboxGl.mod

import typingsSlinky.mapboxGl.mapboxGlStrings.map
import typingsSlinky.mapboxGl.mapboxGlStrings.viewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SymbolPaint extends AnyPaint {
  var `icon-color`: js.UndefOr[String | StyleFunction | Expression] = js.native
  var `icon-color-transition`: js.UndefOr[Transition] = js.native
  var `icon-halo-blur`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  var `icon-halo-blur-transition`: js.UndefOr[Transition] = js.native
  var `icon-halo-color`: js.UndefOr[String | StyleFunction | Expression] = js.native
  var `icon-halo-color-transition`: js.UndefOr[Transition] = js.native
  var `icon-halo-width`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  var `icon-halo-width-transition`: js.UndefOr[Transition] = js.native
  var `icon-opacity`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  var `icon-opacity-transition`: js.UndefOr[Transition] = js.native
  var `icon-translate`: js.UndefOr[js.Array[Double] | Expression] = js.native
  var `icon-translate-anchor`: js.UndefOr[map | viewport] = js.native
  var `icon-translate-transition`: js.UndefOr[Transition] = js.native
  var `text-color`: js.UndefOr[String | StyleFunction | Expression] = js.native
  var `text-color-transition`: js.UndefOr[Transition] = js.native
  var `text-halo-blur`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  var `text-halo-blur-transition`: js.UndefOr[Transition] = js.native
  var `text-halo-color`: js.UndefOr[String | StyleFunction | Expression] = js.native
  var `text-halo-color-transition`: js.UndefOr[Transition] = js.native
  var `text-halo-width`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  var `text-halo-width-transition`: js.UndefOr[Transition] = js.native
  var `text-opacity`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  var `text-opacity-transition`: js.UndefOr[Transition] = js.native
  var `text-translate`: js.UndefOr[js.Array[Double] | Expression] = js.native
  var `text-translate-anchor`: js.UndefOr[map | viewport] = js.native
  var `text-translate-transition`: js.UndefOr[Transition] = js.native
}

object SymbolPaint {
  @scala.inline
  def apply(): SymbolPaint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SymbolPaint]
  }
  @scala.inline
  implicit class SymbolPaintOps[Self <: SymbolPaint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withIcon-color`(value: String | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIcon-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withIcon-color-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-color-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIcon-color-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-color-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withIcon-halo-blur`(value: Double | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-halo-blur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIcon-halo-blur`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-halo-blur")(js.undefined)
        ret
    }
    @scala.inline
    def `withIcon-halo-blur-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-halo-blur-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIcon-halo-blur-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-halo-blur-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withIcon-halo-color`(value: String | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-halo-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIcon-halo-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-halo-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withIcon-halo-color-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-halo-color-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIcon-halo-color-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-halo-color-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withIcon-halo-width`(value: Double | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-halo-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIcon-halo-width`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-halo-width")(js.undefined)
        ret
    }
    @scala.inline
    def `withIcon-halo-width-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-halo-width-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIcon-halo-width-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-halo-width-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withIcon-opacity`(value: Double | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIcon-opacity`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-opacity")(js.undefined)
        ret
    }
    @scala.inline
    def `withIcon-opacity-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-opacity-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIcon-opacity-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-opacity-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withIcon-translate`(value: js.Array[Double] | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-translate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIcon-translate`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-translate")(js.undefined)
        ret
    }
    @scala.inline
    def `withIcon-translate-anchor`(value: map | viewport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-translate-anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIcon-translate-anchor`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-translate-anchor")(js.undefined)
        ret
    }
    @scala.inline
    def `withIcon-translate-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-translate-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIcon-translate-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-translate-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-color`(value: String | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-color-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-color-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-color-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-color-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-halo-blur`(value: Double | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-halo-blur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-halo-blur`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-halo-blur")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-halo-blur-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-halo-blur-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-halo-blur-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-halo-blur-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-halo-color`(value: String | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-halo-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-halo-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-halo-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-halo-color-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-halo-color-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-halo-color-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-halo-color-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-halo-width`(value: Double | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-halo-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-halo-width`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-halo-width")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-halo-width-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-halo-width-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-halo-width-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-halo-width-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-opacity`(value: Double | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-opacity`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-opacity")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-opacity-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-opacity-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-opacity-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-opacity-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-translate`(value: js.Array[Double] | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-translate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-translate`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-translate")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-translate-anchor`(value: map | viewport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-translate-anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-translate-anchor`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-translate-anchor")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-translate-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-translate-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-translate-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-translate-transition")(js.undefined)
        ret
    }
  }
  
}

