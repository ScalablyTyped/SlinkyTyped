package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SvgProperties[TLength] extends js.Object {
  var alignmentBaseline: js.UndefOr[AlignmentBaselineProperty] = js.native
  var baselineShift: js.UndefOr[BaselineShiftProperty[TLength]] = js.native
  var clip: js.UndefOr[ClipProperty] = js.native
  var clipPath: js.UndefOr[ClipPathProperty] = js.native
  var clipRule: js.UndefOr[ClipRuleProperty] = js.native
  var color: js.UndefOr[ColorProperty] = js.native
  var colorInterpolation: js.UndefOr[ColorInterpolationProperty] = js.native
  var colorRendering: js.UndefOr[ColorRenderingProperty] = js.native
  var cursor: js.UndefOr[CursorProperty] = js.native
  var direction: js.UndefOr[DirectionProperty] = js.native
  var display: js.UndefOr[DisplayProperty] = js.native
  var dominantBaseline: js.UndefOr[DominantBaselineProperty] = js.native
  var fill: js.UndefOr[FillProperty] = js.native
  var fillOpacity: js.UndefOr[GlobalsNumber] = js.native
  var fillRule: js.UndefOr[FillRuleProperty] = js.native
  var filter: js.UndefOr[FilterProperty] = js.native
  var floodColor: js.UndefOr[FloodColorProperty] = js.native
  var floodOpacity: js.UndefOr[GlobalsNumber] = js.native
  var font: js.UndefOr[FontProperty] = js.native
  var fontFamily: js.UndefOr[FontFamilyProperty] = js.native
  var fontSize: js.UndefOr[FontSizeProperty[TLength]] = js.native
  var fontSizeAdjust: js.UndefOr[FontSizeAdjustProperty] = js.native
  var fontStretch: js.UndefOr[FontStretchProperty] = js.native
  var fontStyle: js.UndefOr[FontStyleProperty] = js.native
  var fontVariant: js.UndefOr[FontVariantProperty] = js.native
  var fontWeight: js.UndefOr[FontWeightProperty] = js.native
  var glyphOrientationVertical: js.UndefOr[GlyphOrientationVerticalProperty] = js.native
  var imageRendering: js.UndefOr[ImageRenderingProperty] = js.native
  var letterSpacing: js.UndefOr[LetterSpacingProperty[TLength]] = js.native
  var lightingColor: js.UndefOr[LightingColorProperty] = js.native
  var lineHeight: js.UndefOr[LineHeightProperty[TLength]] = js.native
  var marker: js.UndefOr[MarkerProperty] = js.native
  var markerEnd: js.UndefOr[MarkerEndProperty] = js.native
  var markerMid: js.UndefOr[MarkerMidProperty] = js.native
  var markerStart: js.UndefOr[MarkerStartProperty] = js.native
  var mask: js.UndefOr[MaskProperty[TLength]] = js.native
  var opacity: js.UndefOr[GlobalsNumber] = js.native
  var overflow: js.UndefOr[OverflowProperty] = js.native
  var paintOrder: js.UndefOr[PaintOrderProperty] = js.native
  var pointerEvents: js.UndefOr[PointerEventsProperty] = js.native
  var shapeRendering: js.UndefOr[ShapeRenderingProperty] = js.native
  var stopColor: js.UndefOr[StopColorProperty] = js.native
  var stopOpacity: js.UndefOr[GlobalsNumber] = js.native
  var stroke: js.UndefOr[StrokeProperty] = js.native
  var strokeDasharray: js.UndefOr[StrokeDasharrayProperty[TLength]] = js.native
  var strokeDashoffset: js.UndefOr[StrokeDashoffsetProperty[TLength]] = js.native
  var strokeLinecap: js.UndefOr[StrokeLinecapProperty] = js.native
  var strokeLinejoin: js.UndefOr[StrokeLinejoinProperty] = js.native
  var strokeMiterlimit: js.UndefOr[GlobalsNumber] = js.native
  var strokeOpacity: js.UndefOr[GlobalsNumber] = js.native
  var strokeWidth: js.UndefOr[StrokeWidthProperty[TLength]] = js.native
  var textAnchor: js.UndefOr[TextAnchorProperty] = js.native
  var textDecoration: js.UndefOr[TextDecorationProperty] = js.native
  var textRendering: js.UndefOr[TextRenderingProperty] = js.native
  var unicodeBidi: js.UndefOr[UnicodeBidiProperty] = js.native
  var vectorEffect: js.UndefOr[VectorEffectProperty] = js.native
  var visibility: js.UndefOr[VisibilityProperty] = js.native
  var whiteSpace: js.UndefOr[WhiteSpaceProperty] = js.native
  var wordSpacing: js.UndefOr[WordSpacingProperty[TLength]] = js.native
  var writingMode: js.UndefOr[WritingModeProperty] = js.native
}

object SvgProperties {
  @scala.inline
  def apply[TLength](): SvgProperties[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SvgProperties[TLength]]
  }
  @scala.inline
  implicit class SvgPropertiesOps[Self[tlength] <: SvgProperties[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withAlignmentBaseline(value: AlignmentBaselineProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignmentBaseline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignmentBaseline: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignmentBaseline")(js.undefined)
        ret
    }
    @scala.inline
    def withBaselineShift(value: BaselineShiftProperty[TLength]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineShift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaselineShift: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineShift")(js.undefined)
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
    def withClipPath(value: ClipPathProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipPath: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipPath")(js.undefined)
        ret
    }
    @scala.inline
    def withClipRule(value: ClipRuleProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipRule: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipRule")(js.undefined)
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
    def withColorInterpolation(value: ColorInterpolationProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorInterpolation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorInterpolation: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorInterpolation")(js.undefined)
        ret
    }
    @scala.inline
    def withColorRendering(value: ColorRenderingProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorRendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorRendering: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorRendering")(js.undefined)
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
    def withDominantBaseline(value: DominantBaselineProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dominantBaseline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDominantBaseline: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dominantBaseline")(js.undefined)
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
    def withFillOpacity(value: GlobalsNumber): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillOpacity: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withFillRule(value: FillRuleProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillRule: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillRule")(js.undefined)
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
    def withFloodColor(value: FloodColorProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloodColor: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFloodOpacity(value: GlobalsNumber): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloodOpacity: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodOpacity")(js.undefined)
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
    def withFontFamily(value: FontFamilyProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontFamily: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSize(value: FontSizeProperty[TLength]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSizeAdjust(value: FontSizeAdjustProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSizeAdjust")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSizeAdjust: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSizeAdjust")(js.undefined)
        ret
    }
    @scala.inline
    def withFontStretch(value: FontStretchProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStretch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontStretch: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStretch")(js.undefined)
        ret
    }
    @scala.inline
    def withFontStyle(value: FontStyleProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontStyle: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFontVariant(value: FontVariantProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontVariant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontVariant: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontVariant")(js.undefined)
        ret
    }
    @scala.inline
    def withFontWeight(value: FontWeightProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontWeight: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withGlyphOrientationVertical(value: GlyphOrientationVerticalProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphOrientationVertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlyphOrientationVertical: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphOrientationVertical")(js.undefined)
        ret
    }
    @scala.inline
    def withImageRendering(value: ImageRenderingProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageRendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageRendering: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withLetterSpacing(value: LetterSpacingProperty[TLength]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letterSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLetterSpacing: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letterSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withLightingColor(value: LightingColorProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightingColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLightingColor: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightingColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLineHeight(value: LineHeightProperty[TLength]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineHeight: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(js.undefined)
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
    def withMarkerEnd(value: MarkerEndProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerEnd: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerMid(value: MarkerMidProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerMid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerMid: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerMid")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerStart(value: MarkerStartProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerStart: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerStart")(js.undefined)
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
    def withPaintOrder(value: PaintOrderProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paintOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaintOrder: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paintOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withPointerEvents(value: PointerEventsProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointerEvents: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withShapeRendering(value: ShapeRenderingProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeRendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShapeRendering: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withStopColor(value: StopColorProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopColor: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopColor")(js.undefined)
        ret
    }
    @scala.inline
    def withStopOpacity(value: GlobalsNumber): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopOpacity: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopOpacity")(js.undefined)
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
    def withStrokeDasharray(value: StrokeDasharrayProperty[TLength]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDasharray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeDasharray: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDasharray")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeDashoffset(value: StrokeDashoffsetProperty[TLength]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDashoffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeDashoffset: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDashoffset")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeLinecap(value: StrokeLinecapProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeLinecap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeLinecap: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeLinecap")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeLinejoin(value: StrokeLinejoinProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeLinejoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeLinejoin: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeLinejoin")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeMiterlimit(value: GlobalsNumber): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeMiterlimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeMiterlimit: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeMiterlimit")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeOpacity(value: GlobalsNumber): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeOpacity: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeWidth(value: StrokeWidthProperty[TLength]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeWidth: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAnchor(value: TextAnchorProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAnchor: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAnchor")(js.undefined)
        ret
    }
    @scala.inline
    def withTextDecoration(value: TextDecorationProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDecoration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextDecoration: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDecoration")(js.undefined)
        ret
    }
    @scala.inline
    def withTextRendering(value: TextRenderingProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textRendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextRendering: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withUnicodeBidi(value: UnicodeBidiProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicodeBidi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnicodeBidi: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicodeBidi")(js.undefined)
        ret
    }
    @scala.inline
    def withVectorEffect(value: VectorEffectProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vectorEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVectorEffect: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vectorEffect")(js.undefined)
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
    def withWhiteSpace(value: WhiteSpaceProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiteSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhiteSpace: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiteSpace")(js.undefined)
        ret
    }
    @scala.inline
    def withWordSpacing(value: WordSpacingProperty[TLength]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordSpacing: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withWritingMode(value: WritingModeProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWritingMode: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writingMode")(js.undefined)
        ret
    }
  }
  
}

