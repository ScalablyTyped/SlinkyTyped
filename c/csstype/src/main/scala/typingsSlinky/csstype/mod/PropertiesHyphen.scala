package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.csstype.mod.SvgPropertiesHyphen because var conflicts: clip, `clip-path`, color, cursor, direction, display, filter, font, `font-family`, `font-size`, `font-size-adjust`, `font-stretch`, `font-style`, `font-variant`, `font-weight`, `image-rendering`, `letter-spacing`, `line-height`, mask, opacity, overflow, `paint-order`, `pointer-events`, `text-decoration`, `text-rendering`, `unicode-bidi`, visibility, `white-space`, `word-spacing`, `writing-mode`. Inlined `alignment-baseline`, `baseline-shift`, `clip-rule`, `color-interpolation`, `color-rendering`, `dominant-baseline`, fill, `fill-opacity`, `fill-rule`, `flood-color`, `flood-opacity`, `glyph-orientation-vertical`, `lighting-color`, marker, `marker-end`, `marker-mid`, `marker-start`, `shape-rendering`, `stop-color`, `stop-opacity`, stroke, `stroke-dasharray`, `stroke-dashoffset`, `stroke-linecap`, `stroke-linejoin`, `stroke-miterlimit`, `stroke-opacity`, `stroke-width`, `text-anchor`, `vector-effect` */ @js.native
trait PropertiesHyphen[TLength]
  extends StandardLonghandPropertiesHyphen[TLength]
     with StandardShorthandPropertiesHyphen[TLength]
     with VendorLonghandPropertiesHyphen[TLength]
     with VendorShorthandPropertiesHyphen[TLength]
     with ObsoletePropertiesHyphen[TLength] {
  var `alignment-baseline`: js.UndefOr[AlignmentBaselineProperty] = js.native
  var `baseline-shift`: js.UndefOr[BaselineShiftProperty[TLength]] = js.native
  var `clip-rule`: js.UndefOr[ClipRuleProperty] = js.native
  var `color-interpolation`: js.UndefOr[ColorInterpolationProperty] = js.native
  var `color-rendering`: js.UndefOr[ColorRenderingProperty] = js.native
  var `dominant-baseline`: js.UndefOr[DominantBaselineProperty] = js.native
  var fill: js.UndefOr[FillProperty] = js.native
  var `fill-opacity`: js.UndefOr[GlobalsNumber] = js.native
  var `fill-rule`: js.UndefOr[FillRuleProperty] = js.native
  var `flood-color`: js.UndefOr[FloodColorProperty] = js.native
  var `flood-opacity`: js.UndefOr[GlobalsNumber] = js.native
  var `glyph-orientation-vertical`: js.UndefOr[GlyphOrientationVerticalProperty] = js.native
  var `lighting-color`: js.UndefOr[LightingColorProperty] = js.native
  var marker: js.UndefOr[MarkerProperty] = js.native
  var `marker-end`: js.UndefOr[MarkerEndProperty] = js.native
  var `marker-mid`: js.UndefOr[MarkerMidProperty] = js.native
  var `marker-start`: js.UndefOr[MarkerStartProperty] = js.native
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
  var `vector-effect`: js.UndefOr[VectorEffectProperty] = js.native
}

object PropertiesHyphen {
  @scala.inline
  def apply[TLength](): PropertiesHyphen[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertiesHyphen[TLength]]
  }
  @scala.inline
  implicit class PropertiesHyphenOps[Self[tlength] <: PropertiesHyphen[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
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
  }
  
}

