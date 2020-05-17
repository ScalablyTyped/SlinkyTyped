package typingsSlinky.mapboxGl.mod

import typingsSlinky.mapboxGl.mapboxGlStrings.`line-center`
import typingsSlinky.mapboxGl.mapboxGlStrings.`viewport-y`
import typingsSlinky.mapboxGl.mapboxGlStrings.auto
import typingsSlinky.mapboxGl.mapboxGlStrings.both
import typingsSlinky.mapboxGl.mapboxGlStrings.center
import typingsSlinky.mapboxGl.mapboxGlStrings.height
import typingsSlinky.mapboxGl.mapboxGlStrings.horizontal
import typingsSlinky.mapboxGl.mapboxGlStrings.left
import typingsSlinky.mapboxGl.mapboxGlStrings.line
import typingsSlinky.mapboxGl.mapboxGlStrings.lowercase
import typingsSlinky.mapboxGl.mapboxGlStrings.map
import typingsSlinky.mapboxGl.mapboxGlStrings.none
import typingsSlinky.mapboxGl.mapboxGlStrings.point
import typingsSlinky.mapboxGl.mapboxGlStrings.right
import typingsSlinky.mapboxGl.mapboxGlStrings.source_
import typingsSlinky.mapboxGl.mapboxGlStrings.uppercase
import typingsSlinky.mapboxGl.mapboxGlStrings.vertical
import typingsSlinky.mapboxGl.mapboxGlStrings.viewport
import typingsSlinky.mapboxGl.mapboxGlStrings.width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SymbolLayout
  extends Layout
     with AnyLayout {
  var `icon-allow-overlap`: js.UndefOr[Boolean | StyleFunction | Expression] = js.native
  var `icon-anchor`: js.UndefOr[Anchor | StyleFunction | Expression] = js.native
  var `icon-ignore-placement`: js.UndefOr[Boolean] = js.native
  var `icon-image`: js.UndefOr[String | StyleFunction | Expression] = js.native
  var `icon-keep-upright`: js.UndefOr[Boolean] = js.native
  var `icon-offset`: js.UndefOr[js.Array[Double] | StyleFunction | Expression] = js.native
  var `icon-optional`: js.UndefOr[Boolean] = js.native
  var `icon-padding`: js.UndefOr[Double | Expression] = js.native
  var `icon-pitch-alignment`: js.UndefOr[map | viewport | auto] = js.native
  var `icon-rotate`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  var `icon-rotation-alignment`: js.UndefOr[map | viewport | auto] = js.native
  var `icon-size`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  var `icon-text-fit`: js.UndefOr[none | both | width | height] = js.native
  var `icon-text-fit-padding`: js.UndefOr[js.Array[Double] | Expression] = js.native
  var `symbol-avoid-edges`: js.UndefOr[Boolean] = js.native
  var `symbol-placement`: js.UndefOr[point | line | `line-center`] = js.native
  var `symbol-sort-key`: js.UndefOr[Double | Expression] = js.native
  var `symbol-spacing`: js.UndefOr[Double | Expression] = js.native
  var `symbol-z-order`: js.UndefOr[`viewport-y` | source_] = js.native
  var `text-allow-overlap`: js.UndefOr[Boolean] = js.native
  var `text-anchor`: js.UndefOr[Anchor | StyleFunction | Expression] = js.native
  var `text-field`: js.UndefOr[String | StyleFunction | Expression] = js.native
  var `text-font`: js.UndefOr[String | js.Array[String] | Expression] = js.native
  var `text-ignore-placement`: js.UndefOr[Boolean] = js.native
  var `text-justify`: js.UndefOr[left | center | right | Expression] = js.native
  var `text-keep-upright`: js.UndefOr[Boolean] = js.native
  var `text-letter-spacing`: js.UndefOr[Double | Expression] = js.native
  var `text-line-height`: js.UndefOr[Double | Expression] = js.native
  var `text-max-angle`: js.UndefOr[Double | Expression] = js.native
  var `text-max-width`: js.UndefOr[Double | Expression] = js.native
  var `text-offset`: js.UndefOr[js.Array[Double] | Expression] = js.native
  var `text-optional`: js.UndefOr[Boolean] = js.native
  var `text-padding`: js.UndefOr[Double | Expression] = js.native
  var `text-pitch-alignment`: js.UndefOr[map | viewport | auto] = js.native
  var `text-radial-offset`: js.UndefOr[Double | Expression] = js.native
  var `text-rotate`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  var `text-rotation-alignment`: js.UndefOr[map | viewport | auto] = js.native
  var `text-size`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  var `text-transform`: js.UndefOr[none | uppercase | lowercase | StyleFunction | Expression] = js.native
  var `text-variable-anchor`: js.UndefOr[js.Array[Anchor]] = js.native
  var `text-writing-mode`: js.UndefOr[js.Array[horizontal | vertical]] = js.native
}

object SymbolLayout {
  @scala.inline
  def apply(): SymbolLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SymbolLayout]
  }
  @scala.inline
  implicit class SymbolLayoutOps[Self <: SymbolLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withIcon-allow-overlap`(value: Boolean | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-allow-overlap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIcon-allow-overlap`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-allow-overlap")(js.undefined)
        ret
    }
    @scala.inline
    def `withIcon-anchor`(value: Anchor | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIcon-anchor`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-anchor")(js.undefined)
        ret
    }
    @scala.inline
    def `withIcon-ignore-placement`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-ignore-placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIcon-ignore-placement`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-ignore-placement")(js.undefined)
        ret
    }
    @scala.inline
    def `withIcon-image`(value: String | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIcon-image`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-image")(js.undefined)
        ret
    }
    @scala.inline
    def `withIcon-keep-upright`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-keep-upright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIcon-keep-upright`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-keep-upright")(js.undefined)
        ret
    }
    @scala.inline
    def `withIcon-offset`(value: js.Array[Double] | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIcon-offset`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-offset")(js.undefined)
        ret
    }
    @scala.inline
    def `withIcon-optional`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-optional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIcon-optional`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-optional")(js.undefined)
        ret
    }
    @scala.inline
    def `withIcon-padding`(value: Double | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIcon-padding`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-padding")(js.undefined)
        ret
    }
    @scala.inline
    def `withIcon-pitch-alignment`(value: map | viewport | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-pitch-alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIcon-pitch-alignment`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-pitch-alignment")(js.undefined)
        ret
    }
    @scala.inline
    def `withIcon-rotate`(value: Double | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIcon-rotate`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-rotate")(js.undefined)
        ret
    }
    @scala.inline
    def `withIcon-rotation-alignment`(value: map | viewport | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-rotation-alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIcon-rotation-alignment`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-rotation-alignment")(js.undefined)
        ret
    }
    @scala.inline
    def `withIcon-size`(value: Double | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIcon-size`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-size")(js.undefined)
        ret
    }
    @scala.inline
    def `withIcon-text-fit`(value: none | both | width | height): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-text-fit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIcon-text-fit`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-text-fit")(js.undefined)
        ret
    }
    @scala.inline
    def `withIcon-text-fit-padding`(value: js.Array[Double] | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-text-fit-padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIcon-text-fit-padding`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon-text-fit-padding")(js.undefined)
        ret
    }
    @scala.inline
    def `withSymbol-avoid-edges`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol-avoid-edges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSymbol-avoid-edges`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol-avoid-edges")(js.undefined)
        ret
    }
    @scala.inline
    def `withSymbol-placement`(value: point | line | `line-center`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol-placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSymbol-placement`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol-placement")(js.undefined)
        ret
    }
    @scala.inline
    def `withSymbol-sort-key`(value: Double | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol-sort-key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSymbol-sort-key`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol-sort-key")(js.undefined)
        ret
    }
    @scala.inline
    def `withSymbol-spacing`(value: Double | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol-spacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSymbol-spacing`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol-spacing")(js.undefined)
        ret
    }
    @scala.inline
    def `withSymbol-z-order`(value: `viewport-y` | source_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol-z-order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSymbol-z-order`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol-z-order")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-allow-overlap`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-allow-overlap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-allow-overlap`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-allow-overlap")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-anchor`(value: Anchor | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-anchor`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-anchor")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-field`(value: String | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-field`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-field")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-font`(value: String | js.Array[String] | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-font`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-font")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-ignore-placement`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-ignore-placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-ignore-placement`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-ignore-placement")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-justify`(value: left | center | right | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-justify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-justify`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-justify")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-keep-upright`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-keep-upright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-keep-upright`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-keep-upright")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-letter-spacing`(value: Double | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-letter-spacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-letter-spacing`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-letter-spacing")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-line-height`(value: Double | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-line-height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-line-height`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-line-height")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-max-angle`(value: Double | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-max-angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-max-angle`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-max-angle")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-max-width`(value: Double | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-max-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-max-width`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-max-width")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-offset`(value: js.Array[Double] | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-offset`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-offset")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-optional`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-optional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-optional`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-optional")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-padding`(value: Double | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-padding`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-padding")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-pitch-alignment`(value: map | viewport | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-pitch-alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-pitch-alignment`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-pitch-alignment")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-radial-offset`(value: Double | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-radial-offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-radial-offset`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-radial-offset")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-rotate`(value: Double | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-rotate`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-rotate")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-rotation-alignment`(value: map | viewport | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-rotation-alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-rotation-alignment`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-rotation-alignment")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-size`(value: Double | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-size`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-size")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-transform`(value: none | uppercase | lowercase | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-transform`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-transform")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-variable-anchor`(value: js.Array[Anchor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-variable-anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-variable-anchor`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-variable-anchor")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-writing-mode`(value: js.Array[horizontal | vertical]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-writing-mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-writing-mode`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-writing-mode")(js.undefined)
        ret
    }
  }
  
}

