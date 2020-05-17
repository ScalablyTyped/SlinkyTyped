package typingsSlinky.createEmotion.mod

import typingsSlinky.csstype.mod.AlignmentBaselineProperty
import typingsSlinky.csstype.mod.BaselineShiftProperty
import typingsSlinky.csstype.mod.ClipRuleProperty
import typingsSlinky.csstype.mod.ColorInterpolationProperty
import typingsSlinky.csstype.mod.ColorRenderingProperty
import typingsSlinky.csstype.mod.DominantBaselineProperty
import typingsSlinky.csstype.mod.FillProperty
import typingsSlinky.csstype.mod.FillRuleProperty
import typingsSlinky.csstype.mod.FloodColorProperty
import typingsSlinky.csstype.mod.GlobalsNumber
import typingsSlinky.csstype.mod.GlyphOrientationVerticalProperty
import typingsSlinky.csstype.mod.LightingColorProperty
import typingsSlinky.csstype.mod.MarkerEndProperty
import typingsSlinky.csstype.mod.MarkerMidProperty
import typingsSlinky.csstype.mod.MarkerProperty
import typingsSlinky.csstype.mod.MarkerStartProperty
import typingsSlinky.csstype.mod.ObsoletePropertiesFallback
import typingsSlinky.csstype.mod.ShapeRenderingProperty
import typingsSlinky.csstype.mod.StandardLonghandPropertiesFallback
import typingsSlinky.csstype.mod.StandardShorthandPropertiesFallback
import typingsSlinky.csstype.mod.StopColorProperty
import typingsSlinky.csstype.mod.StrokeDasharrayProperty
import typingsSlinky.csstype.mod.StrokeDashoffsetProperty
import typingsSlinky.csstype.mod.StrokeLinecapProperty
import typingsSlinky.csstype.mod.StrokeLinejoinProperty
import typingsSlinky.csstype.mod.StrokeProperty
import typingsSlinky.csstype.mod.StrokeWidthProperty
import typingsSlinky.csstype.mod.TextAnchorProperty
import typingsSlinky.csstype.mod.VectorEffectProperty
import typingsSlinky.csstype.mod.VendorLonghandPropertiesFallback
import typingsSlinky.csstype.mod.VendorShorthandPropertiesFallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.csstype.mod.SvgPropertiesFallback because var conflicts: clip, clipPath, color, cursor, direction, display, filter, font, fontFamily, fontSize, fontSizeAdjust, fontStretch, fontStyle, fontVariant, fontWeight, imageRendering, letterSpacing, lineHeight, mask, opacity, overflow, paintOrder, pointerEvents, textDecoration, textRendering, unicodeBidi, visibility, whiteSpace, wordSpacing, writingMode. Inlined alignmentBaseline, baselineShift, clipRule, colorInterpolation, colorRendering, dominantBaseline, fill, fillOpacity, fillRule, floodColor, floodOpacity, glyphOrientationVertical, lightingColor, marker, markerEnd, markerMid, markerStart, shapeRendering, stopColor, stopOpacity, stroke, strokeDasharray, strokeDashoffset, strokeLinecap, strokeLinejoin, strokeMiterlimit, strokeOpacity, strokeWidth, textAnchor, vectorEffect */ @js.native
trait CSSObject
  extends CSSOthersObject
     with StandardLonghandPropertiesFallback[Double | String]
     with StandardShorthandPropertiesFallback[Double | String]
     with VendorLonghandPropertiesFallback[Double | String]
     with VendorShorthandPropertiesFallback[Double | String]
     with ObsoletePropertiesFallback[Double | String]
     with CSSPseudoObject
     with Interpolation {
  var alignmentBaseline: js.UndefOr[AlignmentBaselineProperty | js.Array[AlignmentBaselineProperty]] = js.native
  var baselineShift: js.UndefOr[
    (BaselineShiftProperty[Double | String]) | (js.Array[BaselineShiftProperty[Double | String]])
  ] = js.native
  var clipRule: js.UndefOr[ClipRuleProperty | js.Array[ClipRuleProperty]] = js.native
  var colorInterpolation: js.UndefOr[ColorInterpolationProperty | js.Array[ColorInterpolationProperty]] = js.native
  var colorRendering: js.UndefOr[ColorRenderingProperty | js.Array[ColorRenderingProperty]] = js.native
  var dominantBaseline: js.UndefOr[DominantBaselineProperty | js.Array[DominantBaselineProperty]] = js.native
  var fill: js.UndefOr[FillProperty | js.Array[FillProperty]] = js.native
  var fillOpacity: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  var fillRule: js.UndefOr[FillRuleProperty | js.Array[FillRuleProperty]] = js.native
  var floodColor: js.UndefOr[FloodColorProperty | js.Array[FloodColorProperty]] = js.native
  var floodOpacity: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  var glyphOrientationVertical: js.UndefOr[GlyphOrientationVerticalProperty | js.Array[GlyphOrientationVerticalProperty]] = js.native
  var lightingColor: js.UndefOr[LightingColorProperty | js.Array[LightingColorProperty]] = js.native
  var marker: js.UndefOr[MarkerProperty | js.Array[MarkerProperty]] = js.native
  var markerEnd: js.UndefOr[MarkerEndProperty | js.Array[MarkerEndProperty]] = js.native
  var markerMid: js.UndefOr[MarkerMidProperty | js.Array[MarkerMidProperty]] = js.native
  var markerStart: js.UndefOr[MarkerStartProperty | js.Array[MarkerStartProperty]] = js.native
  var shapeRendering: js.UndefOr[ShapeRenderingProperty | js.Array[ShapeRenderingProperty]] = js.native
  var stopColor: js.UndefOr[StopColorProperty | js.Array[StopColorProperty]] = js.native
  var stopOpacity: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  var stroke: js.UndefOr[StrokeProperty | js.Array[StrokeProperty]] = js.native
  var strokeDasharray: js.UndefOr[
    (StrokeDasharrayProperty[Double | String]) | (js.Array[StrokeDasharrayProperty[Double | String]])
  ] = js.native
  var strokeDashoffset: js.UndefOr[
    (StrokeDashoffsetProperty[Double | String]) | (js.Array[StrokeDashoffsetProperty[Double | String]])
  ] = js.native
  var strokeLinecap: js.UndefOr[StrokeLinecapProperty | js.Array[StrokeLinecapProperty]] = js.native
  var strokeLinejoin: js.UndefOr[StrokeLinejoinProperty | js.Array[StrokeLinejoinProperty]] = js.native
  var strokeMiterlimit: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  var strokeOpacity: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  var strokeWidth: js.UndefOr[
    (StrokeWidthProperty[Double | String]) | (js.Array[StrokeWidthProperty[Double | String]])
  ] = js.native
  var textAnchor: js.UndefOr[TextAnchorProperty | js.Array[TextAnchorProperty]] = js.native
  var vectorEffect: js.UndefOr[VectorEffectProperty | js.Array[VectorEffectProperty]] = js.native
}

object CSSObject {
  @scala.inline
  def apply(): CSSObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSSObject]
  }
  @scala.inline
  implicit class CSSObjectOps[Self <: CSSObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignmentBaseline(value: AlignmentBaselineProperty | js.Array[AlignmentBaselineProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignmentBaseline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignmentBaseline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignmentBaseline")(js.undefined)
        ret
    }
    @scala.inline
    def withBaselineShift(
      value: (BaselineShiftProperty[Double | String]) | (js.Array[BaselineShiftProperty[Double | String]])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineShift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaselineShift: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineShift")(js.undefined)
        ret
    }
    @scala.inline
    def withClipRule(value: ClipRuleProperty | js.Array[ClipRuleProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipRule")(js.undefined)
        ret
    }
    @scala.inline
    def withColorInterpolation(value: ColorInterpolationProperty | js.Array[ColorInterpolationProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorInterpolation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorInterpolation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorInterpolation")(js.undefined)
        ret
    }
    @scala.inline
    def withColorRendering(value: ColorRenderingProperty | js.Array[ColorRenderingProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorRendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withDominantBaseline(value: DominantBaselineProperty | js.Array[DominantBaselineProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dominantBaseline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDominantBaseline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dominantBaseline")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: FillProperty | js.Array[FillProperty]): Self = {
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
    def withFillOpacity(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withFillRule(value: FillRuleProperty | js.Array[FillRuleProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillRule")(js.undefined)
        ret
    }
    @scala.inline
    def withFloodColor(value: FloodColorProperty | js.Array[FloodColorProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloodColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFloodOpacity(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloodOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withGlyphOrientationVertical(value: GlyphOrientationVerticalProperty | js.Array[GlyphOrientationVerticalProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphOrientationVertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlyphOrientationVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphOrientationVertical")(js.undefined)
        ret
    }
    @scala.inline
    def withLightingColor(value: LightingColorProperty | js.Array[LightingColorProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightingColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLightingColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightingColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: MarkerProperty | js.Array[MarkerProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerEnd(value: MarkerEndProperty | js.Array[MarkerEndProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerMid(value: MarkerMidProperty | js.Array[MarkerMidProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerMid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerMid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerMid")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerStart(value: MarkerStartProperty | js.Array[MarkerStartProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerStart")(js.undefined)
        ret
    }
    @scala.inline
    def withShapeRendering(value: ShapeRenderingProperty | js.Array[ShapeRenderingProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeRendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShapeRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withStopColor(value: StopColorProperty | js.Array[StopColorProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopColor")(js.undefined)
        ret
    }
    @scala.inline
    def withStopOpacity(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withStroke(value: StrokeProperty | js.Array[StrokeProperty]): Self = {
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
    def withStrokeDasharray(
      value: (StrokeDasharrayProperty[Double | String]) | (js.Array[StrokeDasharrayProperty[Double | String]])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDasharray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeDasharray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDasharray")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeDashoffset(
      value: (StrokeDashoffsetProperty[Double | String]) | (js.Array[StrokeDashoffsetProperty[Double | String]])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDashoffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeDashoffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDashoffset")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeLinecap(value: StrokeLinecapProperty | js.Array[StrokeLinecapProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeLinecap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeLinecap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeLinecap")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeLinejoin(value: StrokeLinejoinProperty | js.Array[StrokeLinejoinProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeLinejoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeLinejoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeLinejoin")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeMiterlimit(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeMiterlimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeMiterlimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeMiterlimit")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeOpacity(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeWidth(value: (StrokeWidthProperty[Double | String]) | (js.Array[StrokeWidthProperty[Double | String]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAnchor(value: TextAnchorProperty | js.Array[TextAnchorProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAnchor")(js.undefined)
        ret
    }
    @scala.inline
    def withVectorEffect(value: VectorEffectProperty | js.Array[VectorEffectProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vectorEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVectorEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vectorEffect")(js.undefined)
        ret
    }
  }
  
}

