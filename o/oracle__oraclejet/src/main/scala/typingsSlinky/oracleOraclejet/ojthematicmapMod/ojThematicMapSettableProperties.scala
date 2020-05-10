package typingsSlinky.oracleOraclejet.ojthematicmapMod

import typingsSlinky.oracleOraclejet.Anon25
import typingsSlinky.oracleOraclejet.AnonAreaSvgStyle
import typingsSlinky.oracleOraclejet.AnonGeo
import typingsSlinky.oracleOraclejet.AnonInsertSVGElement
import typingsSlinky.oracleOraclejet.AnonLabelAndValue
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentSettableProperties
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

@js.native
trait ojThematicMapSettableProperties[K1, K2, K3, D1, D2, D3] extends dvtBaseComponentSettableProperties {
  var animationDuration: Double = js.native
  var animationOnDisplay: auto | none = js.native
  var areaData: (DataProvider[K1, D1]) | Null = js.native
  var as: String = js.native
  var focusRenderer: (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], AnonInsertSVGElement | Unit]) | Null = js.native
  var hiddenCategories: js.Array[String] = js.native
  var highlightMatch: any | all = js.native
  var highlightedCategories: js.Array[String] = js.native
  var hoverBehavior: dim | none = js.native
  var hoverRenderer: (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], AnonInsertSVGElement | Unit]) | Null = js.native
  var initialZooming: auto | none = js.native
  var isolatedItem: K1 = js.native
  var labelDisplay: on | off | auto = js.native
  var labelType: long | short = js.native
  var linkData: (DataProvider[K2, D2]) | Null = js.native
  var mapProvider: AnonGeo = js.native
  var markerData: (DataProvider[K3, D3]) | Null = js.native
  var markerZoomBehavior: zoom | fixed = js.native
  var maxZoom: Double = js.native
  var panning: auto | none = js.native
  var renderer: (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], AnonInsertSVGElement | Unit]) | Null = js.native
  var selection: js.Array[K1 | K2 | K3] = js.native
  var selectionMode: single | multiple | none = js.native
  var selectionRenderer: (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], AnonInsertSVGElement | Unit]) | Null = js.native
  var styleDefaults: AnonAreaSvgStyle = js.native
  var tooltip: Anon25[K1, K2, K3, D1, D2, D3] = js.native
  var tooltipDisplay: auto | labelAndShortDesc | none | shortDesc = js.native
  var touchResponse: touchStart | auto = js.native
  @JSName("translations")
  var translations_ojThematicMapSettableProperties: AnonLabelAndValue = js.native
  var zooming: auto | none = js.native
}

object ojThematicMapSettableProperties {
  @scala.inline
  def apply[K1, K2, K3, D1, D2, D3](
    animationDuration: Double,
    animationOnDisplay: auto | none,
    as: String,
    hiddenCategories: js.Array[String],
    highlightMatch: any | all,
    highlightedCategories: js.Array[String],
    hoverBehavior: dim | none,
    initialZooming: auto | none,
    isolatedItem: K1,
    labelDisplay: on | off | auto,
    labelType: long | short,
    mapProvider: AnonGeo,
    markerZoomBehavior: zoom | fixed,
    maxZoom: Double,
    panning: auto | none,
    selection: js.Array[K1 | K2 | K3],
    selectionMode: single | multiple | none,
    styleDefaults: AnonAreaSvgStyle,
    tooltip: Anon25[K1, K2, K3, D1, D2, D3],
    tooltipDisplay: auto | labelAndShortDesc | none | shortDesc,
    touchResponse: touchStart | auto,
    trackResize: on | off,
    translations: AnonLabelAndValue,
    zooming: auto | none
  ): ojThematicMapSettableProperties[K1, K2, K3, D1, D2, D3] = {
    val __obj = js.Dynamic.literal(animationDuration = animationDuration.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], hiddenCategories = hiddenCategories.asInstanceOf[js.Any], highlightMatch = highlightMatch.asInstanceOf[js.Any], highlightedCategories = highlightedCategories.asInstanceOf[js.Any], hoverBehavior = hoverBehavior.asInstanceOf[js.Any], initialZooming = initialZooming.asInstanceOf[js.Any], isolatedItem = isolatedItem.asInstanceOf[js.Any], labelDisplay = labelDisplay.asInstanceOf[js.Any], labelType = labelType.asInstanceOf[js.Any], mapProvider = mapProvider.asInstanceOf[js.Any], markerZoomBehavior = markerZoomBehavior.asInstanceOf[js.Any], maxZoom = maxZoom.asInstanceOf[js.Any], panning = panning.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], styleDefaults = styleDefaults.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], tooltipDisplay = tooltipDisplay.asInstanceOf[js.Any], touchResponse = touchResponse.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], zooming = zooming.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojThematicMapSettableProperties[K1, K2, K3, D1, D2, D3]]
  }
  @scala.inline
  implicit class ojThematicMapSettablePropertiesOps[Self[k1, k2, k3, d1, d2, d3] <: ojThematicMapSettableProperties[k1, k2, k3, d1, d2, d3], K1, K2, K3, D1, D2, D3] (val x: Self[K1, K2, K3, D1, D2, D3]) extends AnyVal {
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
    def withAnimationOnDisplay(value: auto | none): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOnDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAs(value: String): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHiddenCategories(value: js.Array[String]): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightMatch(value: any | all): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightedCategories(value: js.Array[String]): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoverBehavior(value: dim | none): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialZooming(value: auto | none): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialZooming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsolatedItem(value: K1): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isolatedItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelDisplay(value: on | off | auto): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelType(value: long | short): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapProvider(value: AnonGeo): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkerZoomBehavior(value: zoom | fixed): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerZoomBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxZoom(value: Double): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPanning(value: auto | none): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelection(value: js.Array[K1 | K2 | K3]): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionMode(value: single | multiple | none): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyleDefaults(value: AnonAreaSvgStyle): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltip(value: Anon25[K1, K2, K3, D1, D2, D3]): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltipDisplay(value: auto | labelAndShortDesc | none | shortDesc): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchResponse(value: touchStart | auto): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslations(value: AnonLabelAndValue): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZooming(value: auto | none): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zooming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAreaData(value: DataProvider[K1, D1]): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areaData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAreaDataNull: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areaData")(null)
        ret
    }
    @scala.inline
    def withFocusRenderer(value: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => AnonInsertSVGElement | Unit): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFocusRendererNull: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusRenderer")(null)
        ret
    }
    @scala.inline
    def withHoverRenderer(value: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => AnonInsertSVGElement | Unit): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHoverRendererNull: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverRenderer")(null)
        ret
    }
    @scala.inline
    def withLinkData(value: DataProvider[K2, D2]): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkDataNull: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkData")(null)
        ret
    }
    @scala.inline
    def withMarkerData(value: DataProvider[K3, D3]): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkerDataNull: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerData")(null)
        ret
    }
    @scala.inline
    def withRenderer(value: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => AnonInsertSVGElement | Unit): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRendererNull: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(null)
        ret
    }
    @scala.inline
    def withSelectionRenderer(value: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => AnonInsertSVGElement | Unit): Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelectionRendererNull: Self[K1, K2, K3, D1, D2, D3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionRenderer")(null)
        ret
    }
  }
  
}

