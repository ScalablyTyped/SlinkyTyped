package typingsSlinky.jointjs.mod.attributes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGPresentationAttributes extends js.Object {
  var `alignment-baseline`: js.UndefOr[js.Any] = js.native
  var `baseline-shift`: js.UndefOr[js.Any] = js.native
  var clip: js.UndefOr[js.Any] = js.native
  var `clip-path`: js.UndefOr[js.Any] = js.native
  var `clip-rule`: js.UndefOr[js.Any] = js.native
  var color: js.UndefOr[js.Any] = js.native
  var `color-interpolation`: js.UndefOr[js.Any] = js.native
  var `color-interpolation-filters`: js.UndefOr[js.Any] = js.native
  var `color-profile`: js.UndefOr[js.Any] = js.native
  var `color-rendering`: js.UndefOr[js.Any] = js.native
  var cursor: js.UndefOr[js.Any] = js.native
  var direction: js.UndefOr[js.Any] = js.native
  var display: js.UndefOr[js.Any] = js.native
  var `dominant-baseline`: js.UndefOr[js.Any] = js.native
  var `enable-background`: js.UndefOr[js.Any] = js.native
  var fill: js.UndefOr[js.Any] = js.native
  var `fill-opacity`: js.UndefOr[js.Any] = js.native
  var `fill-rule`: js.UndefOr[js.Any] = js.native
  var filter: js.UndefOr[js.Any] = js.native
  var `flood-color`: js.UndefOr[js.Any] = js.native
  var `flood-opacity`: js.UndefOr[js.Any] = js.native
  var `font-family`: js.UndefOr[js.Any] = js.native
  var `font-size`: js.UndefOr[js.Any] = js.native
  var `font-size-adjust`: js.UndefOr[js.Any] = js.native
  var `font-stretch`: js.UndefOr[js.Any] = js.native
  var `font-style`: js.UndefOr[js.Any] = js.native
  var `font-variant`: js.UndefOr[js.Any] = js.native
  var `font-weight`: js.UndefOr[js.Any] = js.native
  var `glyph-orientation-horizontal`: js.UndefOr[js.Any] = js.native
  var `glyph-orientation-vertical`: js.UndefOr[js.Any] = js.native
  var `image-rendering`: js.UndefOr[js.Any] = js.native
  var kerning: js.UndefOr[js.Any] = js.native
  var `letter-spacing`: js.UndefOr[js.Any] = js.native
  var `lighting-color`: js.UndefOr[js.Any] = js.native
  var `marker-end`: js.UndefOr[js.Any] = js.native
  var `marker-mid`: js.UndefOr[js.Any] = js.native
  var `marker-start`: js.UndefOr[js.Any] = js.native
  var mask: js.UndefOr[js.Any] = js.native
  var opacity: js.UndefOr[js.Any] = js.native
  var overflow: js.UndefOr[js.Any] = js.native
  var `pointer-events`: js.UndefOr[js.Any] = js.native
  var `shape-rendering`: js.UndefOr[js.Any] = js.native
  var `stop-color`: js.UndefOr[js.Any] = js.native
  var `stop-opacity`: js.UndefOr[js.Any] = js.native
  var stroke: js.UndefOr[js.Any] = js.native
  var `stroke-dasharray`: js.UndefOr[js.Any] = js.native
  var `stroke-dashoffset`: js.UndefOr[js.Any] = js.native
  var `stroke-linecap`: js.UndefOr[js.Any] = js.native
  var `stroke-linejoin`: js.UndefOr[js.Any] = js.native
  var `stroke-miterlimit`: js.UndefOr[js.Any] = js.native
  var `stroke-opacity`: js.UndefOr[js.Any] = js.native
  var `stroke-width`: js.UndefOr[js.Any] = js.native
  var `text-anchor`: js.UndefOr[js.Any] = js.native
  var `text-decoration`: js.UndefOr[js.Any] = js.native
  var `text-rendering`: js.UndefOr[js.Any] = js.native
  var `unicode-bidi`: js.UndefOr[js.Any] = js.native
  var visibility: js.UndefOr[js.Any] = js.native
  var `word-spacing`: js.UndefOr[js.Any] = js.native
  var `writing-mode`: js.UndefOr[js.Any] = js.native
}

object SVGPresentationAttributes {
  @scala.inline
  def apply(): SVGPresentationAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGPresentationAttributes]
  }
  @scala.inline
  implicit class SVGPresentationAttributesOps[Self <: SVGPresentationAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withAlignment-baseline`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment-baseline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAlignment-baseline`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment-baseline")(js.undefined)
        ret
    }
    @scala.inline
    def `withBaseline-shift`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseline-shift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBaseline-shift`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseline-shift")(js.undefined)
        ret
    }
    @scala.inline
    def withClip(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clip")(js.undefined)
        ret
    }
    @scala.inline
    def `withClip-path`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clip-path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutClip-path`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clip-path")(js.undefined)
        ret
    }
    @scala.inline
    def `withClip-rule`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clip-rule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutClip-rule`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clip-rule")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: js.Any): Self = {
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
    def `withColor-interpolation`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color-interpolation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutColor-interpolation`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color-interpolation")(js.undefined)
        ret
    }
    @scala.inline
    def `withColor-interpolation-filters`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color-interpolation-filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutColor-interpolation-filters`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color-interpolation-filters")(js.undefined)
        ret
    }
    @scala.inline
    def `withColor-profile`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color-profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutColor-profile`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color-profile")(js.undefined)
        ret
    }
    @scala.inline
    def `withColor-rendering`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color-rendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutColor-rendering`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color-rendering")(js.undefined)
        ret
    }
    @scala.inline
    def withCursor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.undefined)
        ret
    }
    @scala.inline
    def `withDominant-baseline`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dominant-baseline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDominant-baseline`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dominant-baseline")(js.undefined)
        ret
    }
    @scala.inline
    def `withEnable-background`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable-background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutEnable-background`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable-background")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def `withFill-opacity`(value: js.Any): Self = {
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
    def `withFill-rule`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-rule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFill-rule`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-rule")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def `withFlood-color`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flood-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFlood-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flood-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withFlood-opacity`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flood-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFlood-opacity`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flood-opacity")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-family`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-family`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-family")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-size`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-size`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-size")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-size-adjust`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-size-adjust")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-size-adjust`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-size-adjust")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-stretch`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-stretch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-stretch`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-stretch")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-style`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-style`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-style")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-variant`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-variant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-variant`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-variant")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-weight`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-weight`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-weight")(js.undefined)
        ret
    }
    @scala.inline
    def `withGlyph-orientation-horizontal`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyph-orientation-horizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutGlyph-orientation-horizontal`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyph-orientation-horizontal")(js.undefined)
        ret
    }
    @scala.inline
    def `withGlyph-orientation-vertical`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyph-orientation-vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutGlyph-orientation-vertical`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyph-orientation-vertical")(js.undefined)
        ret
    }
    @scala.inline
    def `withImage-rendering`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image-rendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutImage-rendering`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image-rendering")(js.undefined)
        ret
    }
    @scala.inline
    def withKerning(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kerning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKerning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kerning")(js.undefined)
        ret
    }
    @scala.inline
    def `withLetter-spacing`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letter-spacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLetter-spacing`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letter-spacing")(js.undefined)
        ret
    }
    @scala.inline
    def `withLighting-color`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lighting-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLighting-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lighting-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withMarker-end`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker-end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMarker-end`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker-end")(js.undefined)
        ret
    }
    @scala.inline
    def `withMarker-mid`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker-mid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMarker-mid`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker-mid")(js.undefined)
        ret
    }
    @scala.inline
    def `withMarker-start`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker-start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMarker-start`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker-start")(js.undefined)
        ret
    }
    @scala.inline
    def withMask(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow")(js.undefined)
        ret
    }
    @scala.inline
    def `withPointer-events`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointer-events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPointer-events`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointer-events")(js.undefined)
        ret
    }
    @scala.inline
    def `withShape-rendering`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape-rendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutShape-rendering`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape-rendering")(js.undefined)
        ret
    }
    @scala.inline
    def `withStop-color`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStop-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withStop-opacity`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStop-opacity`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop-opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withStroke(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(js.undefined)
        ret
    }
    @scala.inline
    def `withStroke-dasharray`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-dasharray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStroke-dasharray`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-dasharray")(js.undefined)
        ret
    }
    @scala.inline
    def `withStroke-dashoffset`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-dashoffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStroke-dashoffset`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-dashoffset")(js.undefined)
        ret
    }
    @scala.inline
    def `withStroke-linecap`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-linecap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStroke-linecap`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-linecap")(js.undefined)
        ret
    }
    @scala.inline
    def `withStroke-linejoin`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-linejoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStroke-linejoin`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-linejoin")(js.undefined)
        ret
    }
    @scala.inline
    def `withStroke-miterlimit`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-miterlimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStroke-miterlimit`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-miterlimit")(js.undefined)
        ret
    }
    @scala.inline
    def `withStroke-opacity`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStroke-opacity`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-opacity")(js.undefined)
        ret
    }
    @scala.inline
    def `withStroke-width`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStroke-width`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-width")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-anchor`(value: js.Any): Self = {
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
    def `withText-decoration`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-decoration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-decoration`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-decoration")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-rendering`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-rendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-rendering`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-rendering")(js.undefined)
        ret
    }
    @scala.inline
    def `withUnicode-bidi`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicode-bidi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUnicode-bidi`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicode-bidi")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibility(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(js.undefined)
        ret
    }
    @scala.inline
    def `withWord-spacing`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("word-spacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutWord-spacing`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("word-spacing")(js.undefined)
        ret
    }
    @scala.inline
    def `withWriting-mode`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writing-mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutWriting-mode`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writing-mode")(js.undefined)
        ret
    }
  }
  
}

