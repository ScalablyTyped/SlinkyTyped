package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SvgPropertiesHyphen[TLength] extends js.Object {
  var `alignment-baseline`: js.UndefOr[AlignmentBaselineProperty] = js.native
  var `baseline-shift`: js.UndefOr[BaselineShiftProperty[TLength]] = js.native
  var clip: js.UndefOr[ClipProperty] = js.native
  var `clip-path`: js.UndefOr[ClipPathProperty] = js.native
  var `clip-rule`: js.UndefOr[ClipRuleProperty] = js.native
  var color: js.UndefOr[ColorProperty] = js.native
  var `color-interpolation`: js.UndefOr[ColorInterpolationProperty] = js.native
  var `color-rendering`: js.UndefOr[ColorRenderingProperty] = js.native
  var cursor: js.UndefOr[CursorProperty] = js.native
  var direction: js.UndefOr[DirectionProperty] = js.native
  var display: js.UndefOr[DisplayProperty] = js.native
  var `dominant-baseline`: js.UndefOr[DominantBaselineProperty] = js.native
  var fill: js.UndefOr[FillProperty] = js.native
  var `fill-opacity`: js.UndefOr[GlobalsNumber] = js.native
  var `fill-rule`: js.UndefOr[FillRuleProperty] = js.native
  var filter: js.UndefOr[FilterProperty] = js.native
  var `flood-color`: js.UndefOr[FloodColorProperty] = js.native
  var `flood-opacity`: js.UndefOr[GlobalsNumber] = js.native
  var font: js.UndefOr[FontProperty] = js.native
  var `font-family`: js.UndefOr[FontFamilyProperty] = js.native
  var `font-size`: js.UndefOr[FontSizeProperty[TLength]] = js.native
  var `font-size-adjust`: js.UndefOr[FontSizeAdjustProperty] = js.native
  var `font-stretch`: js.UndefOr[FontStretchProperty] = js.native
  var `font-style`: js.UndefOr[FontStyleProperty] = js.native
  var `font-variant`: js.UndefOr[FontVariantProperty] = js.native
  var `font-weight`: js.UndefOr[FontWeightProperty] = js.native
  var `glyph-orientation-vertical`: js.UndefOr[GlyphOrientationVerticalProperty] = js.native
  var `image-rendering`: js.UndefOr[ImageRenderingProperty] = js.native
  var `letter-spacing`: js.UndefOr[LetterSpacingProperty[TLength]] = js.native
  var `lighting-color`: js.UndefOr[LightingColorProperty] = js.native
  var `line-height`: js.UndefOr[LineHeightProperty[TLength]] = js.native
  var marker: js.UndefOr[MarkerProperty] = js.native
  var `marker-end`: js.UndefOr[MarkerEndProperty] = js.native
  var `marker-mid`: js.UndefOr[MarkerMidProperty] = js.native
  var `marker-start`: js.UndefOr[MarkerStartProperty] = js.native
  var mask: js.UndefOr[MaskProperty[TLength]] = js.native
  var opacity: js.UndefOr[GlobalsNumber] = js.native
  var overflow: js.UndefOr[OverflowProperty] = js.native
  var `paint-order`: js.UndefOr[PaintOrderProperty] = js.native
  var `pointer-events`: js.UndefOr[PointerEventsProperty] = js.native
  var `shape-rendering`: js.UndefOr[ShapeRenderingProperty] = js.native
  var `stop-color`: js.UndefOr[StopColorProperty] = js.native
  var `stop-opacity`: js.UndefOr[GlobalsNumber] = js.native
  var stroke: js.UndefOr[StrokeProperty] = js.native
  var `stroke-dasharray`: js.UndefOr[StrokeDasharrayProperty[TLength]] = js.native
  var `stroke-dashoffset`: js.UndefOr[StrokeDashoffsetProperty[TLength]] = js.native
  var `stroke-linecap`: js.UndefOr[StrokeLinecapProperty] = js.native
  var `stroke-linejoin`: js.UndefOr[StrokeLinejoinProperty] = js.native
  var `stroke-miterlimit`: js.UndefOr[GlobalsNumber] = js.native
  var `stroke-opacity`: js.UndefOr[GlobalsNumber] = js.native
  var `stroke-width`: js.UndefOr[StrokeWidthProperty[TLength]] = js.native
  var `text-anchor`: js.UndefOr[TextAnchorProperty] = js.native
  var `text-decoration`: js.UndefOr[TextDecorationProperty] = js.native
  var `text-rendering`: js.UndefOr[TextRenderingProperty] = js.native
  var `unicode-bidi`: js.UndefOr[UnicodeBidiProperty] = js.native
  var `vector-effect`: js.UndefOr[VectorEffectProperty] = js.native
  var visibility: js.UndefOr[VisibilityProperty] = js.native
  var `white-space`: js.UndefOr[WhiteSpaceProperty] = js.native
  var `word-spacing`: js.UndefOr[WordSpacingProperty[TLength]] = js.native
  var `writing-mode`: js.UndefOr[WritingModeProperty] = js.native
}

object SvgPropertiesHyphen {
  @scala.inline
  def apply[TLength](): SvgPropertiesHyphen[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SvgPropertiesHyphen[TLength]]
  }
  @scala.inline
  implicit class SvgPropertiesHyphenOps[Self[tlength] <: SvgPropertiesHyphen[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def `withAlignment-baseline`(value: AlignmentBaselineProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment-baseline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAlignment-baseline`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment-baseline")(js.undefined)
        ret
    }
    @scala.inline
    def `withBaseline-shift`(value: BaselineShiftProperty[TLength]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseline-shift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBaseline-shift`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseline-shift")(js.undefined)
        ret
    }
    @scala.inline
    def withClip(value: ClipProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClip: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clip")(js.undefined)
        ret
    }
    @scala.inline
    def `withClip-path`(value: ClipPathProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clip-path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutClip-path`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clip-path")(js.undefined)
        ret
    }
    @scala.inline
    def `withClip-rule`(value: ClipRuleProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clip-rule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutClip-rule`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clip-rule")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: ColorProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def `withColor-interpolation`(value: ColorInterpolationProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color-interpolation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutColor-interpolation`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color-interpolation")(js.undefined)
        ret
    }
    @scala.inline
    def `withColor-rendering`(value: ColorRenderingProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color-rendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutColor-rendering`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color-rendering")(js.undefined)
        ret
    }
    @scala.inline
    def withCursor(value: CursorProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursor: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: DirectionProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay(value: DisplayProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.undefined)
        ret
    }
    @scala.inline
    def `withDominant-baseline`(value: DominantBaselineProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dominant-baseline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDominant-baseline`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dominant-baseline")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: FillProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def `withFill-opacity`(value: GlobalsNumber): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFill-opacity`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-opacity")(js.undefined)
        ret
    }
    @scala.inline
    def `withFill-rule`(value: FillRuleProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-rule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFill-rule`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-rule")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: FilterProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def `withFlood-color`(value: FloodColorProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flood-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFlood-color`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flood-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withFlood-opacity`(value: GlobalsNumber): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flood-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFlood-opacity`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flood-opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: FontProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-family`(value: FontFamilyProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-family`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-family")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-size`(value: FontSizeProperty[TLength]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-size`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-size")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-size-adjust`(value: FontSizeAdjustProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-size-adjust")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-size-adjust`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-size-adjust")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-stretch`(value: FontStretchProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-stretch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-stretch`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-stretch")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-style`(value: FontStyleProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-style`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-style")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-variant`(value: FontVariantProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-variant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-variant`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-variant")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-weight`(value: FontWeightProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-weight`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-weight")(js.undefined)
        ret
    }
    @scala.inline
    def `withGlyph-orientation-vertical`(value: GlyphOrientationVerticalProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyph-orientation-vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutGlyph-orientation-vertical`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyph-orientation-vertical")(js.undefined)
        ret
    }
    @scala.inline
    def `withImage-rendering`(value: ImageRenderingProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image-rendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutImage-rendering`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image-rendering")(js.undefined)
        ret
    }
    @scala.inline
    def `withLetter-spacing`(value: LetterSpacingProperty[TLength]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letter-spacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLetter-spacing`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letter-spacing")(js.undefined)
        ret
    }
    @scala.inline
    def `withLighting-color`(value: LightingColorProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lighting-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLighting-color`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lighting-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-height`(value: LineHeightProperty[TLength]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-height`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-height")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: MarkerProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(js.undefined)
        ret
    }
    @scala.inline
    def `withMarker-end`(value: MarkerEndProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker-end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMarker-end`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker-end")(js.undefined)
        ret
    }
    @scala.inline
    def `withMarker-mid`(value: MarkerMidProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker-mid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMarker-mid`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker-mid")(js.undefined)
        ret
    }
    @scala.inline
    def `withMarker-start`(value: MarkerStartProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker-start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMarker-start`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker-start")(js.undefined)
        ret
    }
    @scala.inline
    def withMask(value: MaskProperty[TLength]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMask: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: GlobalsNumber): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflow(value: OverflowProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflow: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow")(js.undefined)
        ret
    }
    @scala.inline
    def `withPaint-order`(value: PaintOrderProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paint-order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPaint-order`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paint-order")(js.undefined)
        ret
    }
    @scala.inline
    def `withPointer-events`(value: PointerEventsProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointer-events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPointer-events`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointer-events")(js.undefined)
        ret
    }
    @scala.inline
    def `withShape-rendering`(value: ShapeRenderingProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape-rendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutShape-rendering`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape-rendering")(js.undefined)
        ret
    }
    @scala.inline
    def `withStop-color`(value: StopColorProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStop-color`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withStop-opacity`(value: GlobalsNumber): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStop-opacity`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop-opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withStroke(value: StrokeProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStroke: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(js.undefined)
        ret
    }
    @scala.inline
    def `withStroke-dasharray`(value: StrokeDasharrayProperty[TLength]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-dasharray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStroke-dasharray`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-dasharray")(js.undefined)
        ret
    }
    @scala.inline
    def `withStroke-dashoffset`(value: StrokeDashoffsetProperty[TLength]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-dashoffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStroke-dashoffset`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-dashoffset")(js.undefined)
        ret
    }
    @scala.inline
    def `withStroke-linecap`(value: StrokeLinecapProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-linecap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStroke-linecap`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-linecap")(js.undefined)
        ret
    }
    @scala.inline
    def `withStroke-linejoin`(value: StrokeLinejoinProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-linejoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStroke-linejoin`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-linejoin")(js.undefined)
        ret
    }
    @scala.inline
    def `withStroke-miterlimit`(value: GlobalsNumber): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-miterlimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStroke-miterlimit`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-miterlimit")(js.undefined)
        ret
    }
    @scala.inline
    def `withStroke-opacity`(value: GlobalsNumber): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStroke-opacity`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-opacity")(js.undefined)
        ret
    }
    @scala.inline
    def `withStroke-width`(value: StrokeWidthProperty[TLength]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStroke-width`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-width")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-anchor`(value: TextAnchorProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-anchor`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-anchor")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-decoration`(value: TextDecorationProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-decoration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-decoration`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-decoration")(js.undefined)
        ret
    }
    @scala.inline
    def `withText-rendering`(value: TextRenderingProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-rendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutText-rendering`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-rendering")(js.undefined)
        ret
    }
    @scala.inline
    def `withUnicode-bidi`(value: UnicodeBidiProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicode-bidi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUnicode-bidi`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicode-bidi")(js.undefined)
        ret
    }
    @scala.inline
    def `withVector-effect`(value: VectorEffectProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vector-effect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutVector-effect`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vector-effect")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibility(value: VisibilityProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(js.undefined)
        ret
    }
    @scala.inline
    def `withWhite-space`(value: WhiteSpaceProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("white-space")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutWhite-space`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("white-space")(js.undefined)
        ret
    }
    @scala.inline
    def `withWord-spacing`(value: WordSpacingProperty[TLength]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("word-spacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutWord-spacing`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("word-spacing")(js.undefined)
        ret
    }
    @scala.inline
    def `withWriting-mode`(value: WritingModeProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writing-mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutWriting-mode`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writing-mode")(js.undefined)
        ret
    }
  }
  
}

