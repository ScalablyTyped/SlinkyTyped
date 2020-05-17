package typingsSlinky.oracleOraclejet.ojthematicmapMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.anon.AreaSvgStyle
import typingsSlinky.oracleOraclejet.anon.Geo
import typingsSlinky.oracleOraclejet.anon.InsertSVGElement
import typingsSlinky.oracleOraclejet.anon.LabelAndValue
import typingsSlinky.oracleOraclejet.anon.`25`
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojthematicmapMod.ojThematicMap.RendererContext
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.all
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.any
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dim
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.fixed
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.labelAndShortDesc
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.long
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.multiple
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.short
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.shortDesc
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.single
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.touchStart
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.zoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojthematicmap.ojThematicMapSettableProperties<K1, K2, K3, D1, D2, D3>> */
@js.native
trait ojThematicMapSettablePropertiesLenient[K1, K2, K3, D1, D2, D3]
  extends /* key */ StringDictionary[js.Any] {
  var animationDuration: js.UndefOr[Double] = js.native
  var animationOnDisplay: js.UndefOr[auto | none] = js.native
  var areaData: js.UndefOr[DataProvider[K1, D1]] = js.native
  var as: js.UndefOr[String] = js.native
  var focusRenderer: js.UndefOr[
    js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]
  ] = js.native
  var hiddenCategories: js.UndefOr[js.Array[String]] = js.native
  var highlightMatch: js.UndefOr[any | all] = js.native
  var highlightedCategories: js.UndefOr[js.Array[String]] = js.native
  var hoverBehavior: js.UndefOr[dim | none] = js.native
  var hoverRenderer: js.UndefOr[
    js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]
  ] = js.native
  var initialZooming: js.UndefOr[auto | none] = js.native
  var isolatedItem: js.UndefOr[K1] = js.native
  var labelDisplay: js.UndefOr[on | off | auto] = js.native
  var labelType: js.UndefOr[long | short] = js.native
  var linkData: js.UndefOr[DataProvider[K2, D2]] = js.native
  var mapProvider: js.UndefOr[Geo] = js.native
  var markerData: js.UndefOr[DataProvider[K3, D3]] = js.native
  var markerZoomBehavior: js.UndefOr[zoom | fixed] = js.native
  var maxZoom: js.UndefOr[Double] = js.native
  var panning: js.UndefOr[auto | none] = js.native
  var renderer: js.UndefOr[
    js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]
  ] = js.native
  var selection: js.UndefOr[js.Array[K1 | K2 | K3]] = js.native
  var selectionMode: js.UndefOr[single | multiple | none] = js.native
  var selectionRenderer: js.UndefOr[
    js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]
  ] = js.native
  var styleDefaults: js.UndefOr[AreaSvgStyle] = js.native
  var tooltip: js.UndefOr[`25`[K1, K2, K3, D1, D2, D3]] = js.native
  var tooltipDisplay: js.UndefOr[auto | labelAndShortDesc | none | shortDesc] = js.native
  var touchResponse: js.UndefOr[touchStart | auto] = js.native
  var trackResize: js.UndefOr[on | off] = js.native
  var translations: js.UndefOr[LabelAndValue] = js.native
  var zooming: js.UndefOr[auto | none] = js.native
}

object ojThematicMapSettablePropertiesLenient {
  @scala.inline
  def apply[K1, K2, K3, D1, D2, D3](): ojThematicMapSettablePropertiesLenient[K1, K2, K3, D1, D2, D3] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojThematicMapSettablePropertiesLenient[K1, K2, K3, D1, D2, D3]]
  }
  @scala.inline
  implicit class ojThematicMapSettablePropertiesLenientOps[Self[k1, k2, k3, d1, d2, d3] <: ojThematicMapSettablePropertiesLenient[k1, k2, k3, d1, d2, d3], K1, K2, K3, D1, D2, D3] (val x: Self[K1, K2, K3, D1, D2, D3]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K1, K2, K3, D1, D2, D3] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K1, K2, K3, D1, D2, D3]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K1, K2, K3, D1, D2, D3]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K1, K2, K3, D1, D2, D3]) with Other]
    @scala.inline
    def withAnimationDuration(value: Double): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDuration: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationOnDisplay(value: auto | none): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOnDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationOnDisplay: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOnDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withAreaData(value: DataProvider[K1, D1]): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areaData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAreaData: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areaData")(js.undefined)
        ret
    }
    @scala.inline
    def withAs(value: String): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAs: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusRenderer(value: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => InsertSVGElement | Unit): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFocusRenderer: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withHiddenCategories(value: js.Array[String]): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenCategories: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenCategories")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightMatch(value: any | all): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightMatch: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightedCategories(value: js.Array[String]): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightedCategories: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedCategories")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverBehavior(value: dim | none): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverBehavior: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverRenderer(value: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => InsertSVGElement | Unit): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHoverRenderer: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialZooming(value: auto | none): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialZooming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialZooming: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialZooming")(js.undefined)
        ret
    }
    @scala.inline
    def withIsolatedItem(value: K1): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isolatedItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsolatedItem: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isolatedItem")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelDisplay(value: on | off | auto): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelDisplay: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelType(value: long | short): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelType: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelType")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkData(value: DataProvider[K2, D2]): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkData: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkData")(js.undefined)
        ret
    }
    @scala.inline
    def withMapProvider(value: Geo): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapProvider: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerData(value: DataProvider[K3, D3]): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerData: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerData")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerZoomBehavior(value: zoom | fixed): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerZoomBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerZoomBehavior: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerZoomBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxZoom(value: Double): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxZoom: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withPanning(value: auto | none): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanning: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panning")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderer(value: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => InsertSVGElement | Unit): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderer: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.undefined)
        ret
    }
    @scala.inline
    def withSelection(value: js.Array[K1 | K2 | K3]): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelection: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionMode(value: single | multiple | none): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionMode: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionRenderer(value: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => InsertSVGElement | Unit): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelectionRenderer: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleDefaults(value: AreaSvgStyle): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleDefaults: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleDefaults")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: `25`[K1, K2, K3, D1, D2, D3]): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipDisplay(value: auto | labelAndShortDesc | none | shortDesc): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipDisplay: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchResponse(value: touchStart | auto): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchResponse: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackResize(value: on | off): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackResize: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackResize")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslations(value: LabelAndValue): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslations: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(js.undefined)
        ret
    }
    @scala.inline
    def withZooming(value: auto | none): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zooming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZooming: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zooming")(js.undefined)
        ret
    }
  }
  
}

