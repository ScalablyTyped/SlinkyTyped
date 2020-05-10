package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.csstype.mod.SvgPropertiesHyphenFallback because var conflicts: clip, `clip-path`, color, cursor, direction, display, filter, font, `font-family`, `font-size`, `font-size-adjust`, `font-stretch`, `font-style`, `font-variant`, `font-weight`, `image-rendering`, `letter-spacing`, `line-height`, mask, opacity, overflow, `paint-order`, `pointer-events`, `text-decoration`, `text-rendering`, `unicode-bidi`, visibility, `white-space`, `word-spacing`, `writing-mode`. Inlined `alignment-baseline`, `baseline-shift`, `clip-rule`, `color-interpolation`, `color-rendering`, `dominant-baseline`, fill, `fill-opacity`, `fill-rule`, `flood-color`, `flood-opacity`, `glyph-orientation-vertical`, `lighting-color`, marker, `marker-end`, `marker-mid`, `marker-start`, `shape-rendering`, `stop-color`, `stop-opacity`, stroke, `stroke-dasharray`, `stroke-dashoffset`, `stroke-linecap`, `stroke-linejoin`, `stroke-miterlimit`, `stroke-opacity`, `stroke-width`, `text-anchor`, `vector-effect` */ @js.native
trait PropertiesHyphenFallback[TLength]
  extends StandardLonghandPropertiesHyphenFallback[TLength]
     with StandardShorthandPropertiesHyphenFallback[TLength]
     with VendorLonghandPropertiesHyphenFallback[TLength]
     with VendorShorthandPropertiesHyphenFallback[TLength]
     with ObsoletePropertiesHyphenFallback[TLength] {
  var `alignment-baseline`: js.UndefOr[AlignmentBaselineProperty | js.Array[AlignmentBaselineProperty]] = js.native
  var `baseline-shift`: js.UndefOr[BaselineShiftProperty[TLength] | js.Array[BaselineShiftProperty[TLength]]] = js.native
  var `clip-rule`: js.UndefOr[ClipRuleProperty | js.Array[ClipRuleProperty]] = js.native
  var `color-interpolation`: js.UndefOr[ColorInterpolationProperty | js.Array[ColorInterpolationProperty]] = js.native
  var `color-rendering`: js.UndefOr[ColorRenderingProperty | js.Array[ColorRenderingProperty]] = js.native
  var `dominant-baseline`: js.UndefOr[DominantBaselineProperty | js.Array[DominantBaselineProperty]] = js.native
  var fill: js.UndefOr[FillProperty | js.Array[FillProperty]] = js.native
  var `fill-opacity`: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  var `fill-rule`: js.UndefOr[FillRuleProperty | js.Array[FillRuleProperty]] = js.native
  var `flood-color`: js.UndefOr[FloodColorProperty | js.Array[FloodColorProperty]] = js.native
  var `flood-opacity`: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  var `glyph-orientation-vertical`: js.UndefOr[GlyphOrientationVerticalProperty | js.Array[GlyphOrientationVerticalProperty]] = js.native
  var `lighting-color`: js.UndefOr[LightingColorProperty | js.Array[LightingColorProperty]] = js.native
  var marker: js.UndefOr[MarkerProperty | js.Array[MarkerProperty]] = js.native
  var `marker-end`: js.UndefOr[MarkerEndProperty | js.Array[MarkerEndProperty]] = js.native
  var `marker-mid`: js.UndefOr[MarkerMidProperty | js.Array[MarkerMidProperty]] = js.native
  var `marker-start`: js.UndefOr[MarkerStartProperty | js.Array[MarkerStartProperty]] = js.native
  var `shape-rendering`: js.UndefOr[ShapeRenderingProperty | js.Array[ShapeRenderingProperty]] = js.native
  var `stop-color`: js.UndefOr[StopColorProperty | js.Array[StopColorProperty]] = js.native
  var `stop-opacity`: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  var stroke: js.UndefOr[StrokeProperty | js.Array[StrokeProperty]] = js.native
  var `stroke-dasharray`: js.UndefOr[StrokeDasharrayProperty[TLength] | js.Array[StrokeDasharrayProperty[TLength]]] = js.native
  var `stroke-dashoffset`: js.UndefOr[StrokeDashoffsetProperty[TLength] | js.Array[StrokeDashoffsetProperty[TLength]]] = js.native
  var `stroke-linecap`: js.UndefOr[StrokeLinecapProperty | js.Array[StrokeLinecapProperty]] = js.native
  var `stroke-linejoin`: js.UndefOr[StrokeLinejoinProperty | js.Array[StrokeLinejoinProperty]] = js.native
  var `stroke-miterlimit`: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  var `stroke-opacity`: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  var `stroke-width`: js.UndefOr[StrokeWidthProperty[TLength] | js.Array[StrokeWidthProperty[TLength]]] = js.native
  var `text-anchor`: js.UndefOr[TextAnchorProperty | js.Array[TextAnchorProperty]] = js.native
  var `vector-effect`: js.UndefOr[VectorEffectProperty | js.Array[VectorEffectProperty]] = js.native
}

object PropertiesHyphenFallback {
  @scala.inline
  def apply[TLength](): PropertiesHyphenFallback[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertiesHyphenFallback[TLength]]
  }
  @scala.inline
  implicit class PropertiesHyphenFallbackOps[Self[tlength] <: PropertiesHyphenFallback[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def `withAlignment-baseline`(value: AlignmentBaselineProperty | js.Array[AlignmentBaselineProperty]): Self[TLength] = {
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
    def `withBaseline-shift`(value: BaselineShiftProperty[TLength] | js.Array[BaselineShiftProperty[TLength]]): Self[TLength] = {
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
    def `withClip-rule`(value: ClipRuleProperty | js.Array[ClipRuleProperty]): Self[TLength] = {
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
    def `withColor-interpolation`(value: ColorInterpolationProperty | js.Array[ColorInterpolationProperty]): Self[TLength] = {
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
    def `withColor-rendering`(value: ColorRenderingProperty | js.Array[ColorRenderingProperty]): Self[TLength] = {
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
    def `withDominant-baseline`(value: DominantBaselineProperty | js.Array[DominantBaselineProperty]): Self[TLength] = {
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
    def withFill(value: FillProperty | js.Array[FillProperty]): Self[TLength] = {
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
    def `withFill-opacity`(value: GlobalsNumber | js.Array[GlobalsNumber]): Self[TLength] = {
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
    def `withFill-rule`(value: FillRuleProperty | js.Array[FillRuleProperty]): Self[TLength] = {
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
    def `withFlood-color`(value: FloodColorProperty | js.Array[FloodColorProperty]): Self[TLength] = {
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
    def `withFlood-opacity`(value: GlobalsNumber | js.Array[GlobalsNumber]): Self[TLength] = {
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
    def `withGlyph-orientation-vertical`(value: GlyphOrientationVerticalProperty | js.Array[GlyphOrientationVerticalProperty]): Self[TLength] = {
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
    def `withLighting-color`(value: LightingColorProperty | js.Array[LightingColorProperty]): Self[TLength] = {
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
    def withMarker(value: MarkerProperty | js.Array[MarkerProperty]): Self[TLength] = {
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
    def `withMarker-end`(value: MarkerEndProperty | js.Array[MarkerEndProperty]): Self[TLength] = {
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
    def `withMarker-mid`(value: MarkerMidProperty | js.Array[MarkerMidProperty]): Self[TLength] = {
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
    def `withMarker-start`(value: MarkerStartProperty | js.Array[MarkerStartProperty]): Self[TLength] = {
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
    def `withShape-rendering`(value: ShapeRenderingProperty | js.Array[ShapeRenderingProperty]): Self[TLength] = {
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
    def `withStop-color`(value: StopColorProperty | js.Array[StopColorProperty]): Self[TLength] = {
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
    def `withStop-opacity`(value: GlobalsNumber | js.Array[GlobalsNumber]): Self[TLength] = {
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
    def withStroke(value: StrokeProperty | js.Array[StrokeProperty]): Self[TLength] = {
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
    def `withStroke-dasharray`(value: StrokeDasharrayProperty[TLength] | js.Array[StrokeDasharrayProperty[TLength]]): Self[TLength] = {
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
    def `withStroke-dashoffset`(value: StrokeDashoffsetProperty[TLength] | js.Array[StrokeDashoffsetProperty[TLength]]): Self[TLength] = {
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
    def `withStroke-linecap`(value: StrokeLinecapProperty | js.Array[StrokeLinecapProperty]): Self[TLength] = {
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
    def `withStroke-linejoin`(value: StrokeLinejoinProperty | js.Array[StrokeLinejoinProperty]): Self[TLength] = {
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
    def `withStroke-miterlimit`(value: GlobalsNumber | js.Array[GlobalsNumber]): Self[TLength] = {
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
    def `withStroke-opacity`(value: GlobalsNumber | js.Array[GlobalsNumber]): Self[TLength] = {
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
    def `withStroke-width`(value: StrokeWidthProperty[TLength] | js.Array[StrokeWidthProperty[TLength]]): Self[TLength] = {
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
    def `withText-anchor`(value: TextAnchorProperty | js.Array[TextAnchorProperty]): Self[TLength] = {
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
    def `withVector-effect`(value: VectorEffectProperty | js.Array[VectorEffectProperty]): Self[TLength] = {
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
  }
  
}

