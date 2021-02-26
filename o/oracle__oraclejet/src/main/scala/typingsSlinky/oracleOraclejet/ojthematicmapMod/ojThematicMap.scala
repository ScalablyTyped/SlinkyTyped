package typingsSlinky.oracleOraclejet.ojthematicmapMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.anon.AreaSvgStyle
import typingsSlinky.oracleOraclejet.anon.Focused
import typingsSlinky.oracleOraclejet.anon.Geo
import typingsSlinky.oracleOraclejet.anon.InsertSVGElement
import typingsSlinky.oracleOraclejet.anon.LabelAndValue
import typingsSlinky.oracleOraclejet.anon.`27`
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojdvtBaseMod.dvtBaseComponent
import typingsSlinky.oracleOraclejet.ojthematicmapMod.ojThematicMap.DataContext
import typingsSlinky.oracleOraclejet.ojthematicmapMod.ojThematicMap.NodeContext
import typingsSlinky.oracleOraclejet.ojthematicmapMod.ojThematicMap.RendererContext
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.all
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationDuration
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationDurationChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationOnDisplay
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationOnDisplayChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.any
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.areaData
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.areaDataChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.as
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.asChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dim
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.fixed
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.focusRenderer
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.focusRendererChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hiddenCategories
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hiddenCategoriesChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.highlightMatch
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.highlightMatchChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.highlightedCategories
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.highlightedCategoriesChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hoverBehavior
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hoverBehaviorChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hoverRenderer
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hoverRendererChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.initialZooming
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.initialZoomingChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.isolatedItem
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.isolatedItemChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.labelAndShortDesc
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.labelDisplay
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.labelDisplayChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.labelType
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.labelTypeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.linkData
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.linkDataChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.long
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.mapProvider
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.mapProviderChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.markerData
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.markerDataChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.markerZoomBehavior
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.markerZoomBehaviorChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.maxZoom
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.maxZoomChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.multiple
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.panning
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.panningChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.renderer
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rendererChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selection
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectionChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectionMode
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectionModeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectionRenderer
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectionRendererChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.short
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.shortDesc
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.single
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.styleDefaults
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.styleDefaultsChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.tooltip
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.tooltipChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.tooltipDisplay
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.tooltipDisplayChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.touchResponse
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.touchResponseChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.touchStart
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.translations
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.zoom
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.zooming
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.zoomingChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojThematicMap[K1, K2, K3, D1, D2, D3] extends dvtBaseComponent[ojThematicMapSettableProperties[K1, K2, K3, D1, D2, D3]] {
  
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: highlightMatchChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: highlightMatchChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: hoverBehaviorChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: hoverBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: initialZoomingChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: initialZoomingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: labelDisplayChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: labelDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: labelTypeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: labelTypeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: markerZoomBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  def addEventListener(
    `type`: markerZoomBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: panningChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: panningChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: selectionModeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: tooltipDisplayChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: tooltipDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: touchResponseChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: touchResponseChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: zoomingChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: zoomingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationDurationChanged(
    `type`: animationDurationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationDurationChanged(
    `type`: animationDurationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_areaDataChanged(`type`: areaDataChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_areaDataChanged(
    `type`: areaDataChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(`type`: asChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusRendererChanged(`type`: focusRendererChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusRendererChanged(
    `type`: focusRendererChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiddenCategoriesChanged(
    `type`: hiddenCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiddenCategoriesChanged(
    `type`: hiddenCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highlightedCategoriesChanged(
    `type`: highlightedCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highlightedCategoriesChanged(
    `type`: highlightedCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hoverRendererChanged(`type`: hoverRendererChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hoverRendererChanged(
    `type`: hoverRendererChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_isolatedItemChanged(`type`: isolatedItemChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_isolatedItemChanged(
    `type`: isolatedItemChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_linkDataChanged(`type`: linkDataChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_linkDataChanged(
    `type`: linkDataChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mapProviderChanged(`type`: mapProviderChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mapProviderChanged(
    `type`: mapProviderChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_markerDataChanged(`type`: markerDataChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_markerDataChanged(
    `type`: markerDataChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxZoomChanged(`type`: maxZoomChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxZoomChanged(
    `type`: maxZoomChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rendererChanged(`type`: rendererChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rendererChanged(
    `type`: rendererChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(`type`: selectionChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionRendererChanged(
    `type`: selectionRendererChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionRendererChanged(
    `type`: selectionRendererChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_styleDefaultsChanged(`type`: styleDefaultsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_styleDefaultsChanged(
    `type`: styleDefaultsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(`type`: tooltipChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  
  var animationDuration: Double = js.native
  
  var animationOnDisplay: auto | none = js.native
  
  var areaData: (DataProvider[K1, D1]) | Null = js.native
  
  var as: String = js.native
  
  var focusRenderer: (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null = js.native
  
  def getArea(index: Double): DataContext | Null = js.native
  
  def getContextByNode(node: Element): NodeContext | Null = js.native
  
  def getLink(index: Double): DataContext | Null = js.native
  
  def getMarker(index: Double): DataContext | Null = js.native
  
  @JSName("getProperty")
  def getProperty_animationDuration(property: animationDuration): Double = js.native
  @JSName("getProperty")
  def getProperty_animationOnDisplay(property: animationOnDisplay): auto | none = js.native
  @JSName("getProperty")
  def getProperty_areaData(property: areaData): (DataProvider[K1, D1]) | Null = js.native
  @JSName("getProperty")
  def getProperty_as(property: as): String = js.native
  @JSName("getProperty")
  def getProperty_focusRenderer(property: focusRenderer): (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null = js.native
  @JSName("getProperty")
  def getProperty_hiddenCategories(property: hiddenCategories): js.Array[String] = js.native
  @JSName("getProperty")
  def getProperty_highlightMatch(property: highlightMatch): any | all = js.native
  @JSName("getProperty")
  def getProperty_highlightedCategories(property: highlightedCategories): js.Array[String] = js.native
  @JSName("getProperty")
  def getProperty_hoverBehavior(property: hoverBehavior): dim | none = js.native
  @JSName("getProperty")
  def getProperty_hoverRenderer(property: hoverRenderer): (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null = js.native
  @JSName("getProperty")
  def getProperty_initialZooming(property: initialZooming): auto | none = js.native
  @JSName("getProperty")
  def getProperty_isolatedItem(property: isolatedItem): K1 = js.native
  @JSName("getProperty")
  def getProperty_labelDisplay(property: labelDisplay): on | off | auto = js.native
  @JSName("getProperty")
  def getProperty_labelType(property: labelType): long | short = js.native
  @JSName("getProperty")
  def getProperty_linkData(property: linkData): (DataProvider[K2, D2]) | Null = js.native
  @JSName("getProperty")
  def getProperty_mapProvider(property: mapProvider): Geo = js.native
  @JSName("getProperty")
  def getProperty_markerData(property: markerData): (DataProvider[K3, D3]) | Null = js.native
  @JSName("getProperty")
  def getProperty_markerZoomBehavior(property: markerZoomBehavior): zoom | fixed = js.native
  @JSName("getProperty")
  def getProperty_maxZoom(property: maxZoom): Double = js.native
  @JSName("getProperty")
  def getProperty_panning(property: panning): auto | none = js.native
  @JSName("getProperty")
  def getProperty_renderer(property: renderer): (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): js.Array[K1 | K2 | K3] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: selectionMode): single | multiple | none = js.native
  @JSName("getProperty")
  def getProperty_selectionRenderer(property: selectionRenderer): (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null = js.native
  @JSName("getProperty")
  def getProperty_styleDefaults(property: styleDefaults): AreaSvgStyle = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: tooltip): `27`[K1, K2, K3, D1, D2, D3] = js.native
  @JSName("getProperty")
  def getProperty_tooltipDisplay(property: tooltipDisplay): auto | labelAndShortDesc | none | shortDesc = js.native
  @JSName("getProperty")
  def getProperty_touchResponse(property: touchResponse): touchStart | auto = js.native
  @JSName("getProperty")
  def getProperty_zooming(property: zooming): auto | none = js.native
  
  var hiddenCategories: js.Array[String] = js.native
  
  var highlightMatch: any | all = js.native
  
  var highlightedCategories: js.Array[String] = js.native
  
  var hoverBehavior: dim | none = js.native
  
  var hoverRenderer: (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null = js.native
  
  var initialZooming: auto | none = js.native
  
  var isolatedItem: K1 = js.native
  
  var labelDisplay: on | off | auto = js.native
  
  var labelType: long | short = js.native
  
  var linkData: (DataProvider[K2, D2]) | Null = js.native
  
  var mapProvider: Geo = js.native
  
  var markerData: (DataProvider[K3, D3]) | Null = js.native
  
  var markerZoomBehavior: zoom | fixed = js.native
  
  var maxZoom: Double = js.native
  
  var onAnimationDurationChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onAnimationOnDisplayChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onAreaDataChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onAsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onFocusRendererChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onHiddenCategoriesChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onHighlightMatchChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onHighlightedCategoriesChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onHoverBehaviorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onHoverRendererChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onInitialZoomingChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onIsolatedItemChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onLabelDisplayChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onLabelTypeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onLinkDataChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onMapProviderChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onMarkerDataChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onMarkerZoomBehaviorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onMaxZoomChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onPanningChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onRendererChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onSelectionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onSelectionModeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onSelectionRendererChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onStyleDefaultsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onTooltipChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onTooltipDisplayChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onTouchResponseChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onZoomingChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var panning: auto | none = js.native
  
  var renderer: (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null = js.native
  
  var selection: js.Array[K1 | K2 | K3] = js.native
  
  var selectionMode: single | multiple | none = js.native
  
  var selectionRenderer: (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null = js.native
  
  def setProperties(properties: ojThematicMapSettablePropertiesLenient[K1, K2, K3, D1, D2, D3]): Unit = js.native
  
  def setProperty(property: animationOnDisplay, value: auto): Unit = js.native
  def setProperty(property: animationOnDisplay, value: none): Unit = js.native
  def setProperty(property: highlightMatch, value: all): Unit = js.native
  def setProperty(property: highlightMatch, value: any): Unit = js.native
  def setProperty(property: hoverBehavior, value: dim): Unit = js.native
  def setProperty(property: hoverBehavior, value: none): Unit = js.native
  def setProperty(property: initialZooming, value: auto): Unit = js.native
  def setProperty(property: initialZooming, value: none): Unit = js.native
  def setProperty(property: labelDisplay, value: auto): Unit = js.native
  def setProperty(property: labelDisplay, value: off): Unit = js.native
  def setProperty(property: labelDisplay, value: on): Unit = js.native
  def setProperty(property: labelType, value: long): Unit = js.native
  def setProperty(property: labelType, value: short): Unit = js.native
  def setProperty(property: markerZoomBehavior, value: fixed): Unit = js.native
  def setProperty(property: markerZoomBehavior, value: zoom): Unit = js.native
  def setProperty(property: panning, value: auto): Unit = js.native
  def setProperty(property: panning, value: none): Unit = js.native
  def setProperty(property: selectionMode, value: multiple): Unit = js.native
  def setProperty(property: selectionMode, value: none): Unit = js.native
  def setProperty(property: selectionMode, value: single): Unit = js.native
  def setProperty(property: tooltipDisplay, value: auto): Unit = js.native
  def setProperty(property: tooltipDisplay, value: labelAndShortDesc): Unit = js.native
  def setProperty(property: tooltipDisplay, value: none): Unit = js.native
  def setProperty(property: tooltipDisplay, value: shortDesc): Unit = js.native
  def setProperty(property: touchResponse, value: auto): Unit = js.native
  def setProperty(property: touchResponse, value: touchStart): Unit = js.native
  def setProperty(property: zooming, value: auto): Unit = js.native
  def setProperty(property: zooming, value: none): Unit = js.native
  @JSName("setProperty")
  def setProperty_animationDuration(property: animationDuration, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_areaData(property: areaData): Unit = js.native
  @JSName("setProperty")
  def setProperty_areaData(property: areaData, value: DataProvider[K1, D1]): Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: as, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_focusRenderer(property: focusRenderer): Unit = js.native
  @JSName("setProperty")
  def setProperty_focusRenderer(
    property: focusRenderer,
    value: js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_hiddenCategories(property: hiddenCategories, value: js.Array[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_highlightedCategories(property: highlightedCategories, value: js.Array[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_hoverRenderer(property: hoverRenderer): Unit = js.native
  @JSName("setProperty")
  def setProperty_hoverRenderer(
    property: hoverRenderer,
    value: js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_isolatedItem(property: isolatedItem, value: K1): Unit = js.native
  @JSName("setProperty")
  def setProperty_linkData(property: linkData): Unit = js.native
  @JSName("setProperty")
  def setProperty_linkData(property: linkData, value: DataProvider[K2, D2]): Unit = js.native
  @JSName("setProperty")
  def setProperty_mapProvider(property: mapProvider, value: Geo): Unit = js.native
  @JSName("setProperty")
  def setProperty_markerData(property: markerData): Unit = js.native
  @JSName("setProperty")
  def setProperty_markerData(property: markerData, value: DataProvider[K3, D3]): Unit = js.native
  @JSName("setProperty")
  def setProperty_maxZoom(property: maxZoom, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_renderer(property: renderer): Unit = js.native
  @JSName("setProperty")
  def setProperty_renderer(
    property: renderer,
    value: js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: selection, value: js.Array[K1 | K2 | K3]): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionRenderer(property: selectionRenderer): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionRenderer(
    property: selectionRenderer,
    value: js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_styleDefaults(property: styleDefaults, value: AreaSvgStyle): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(property: tooltip, value: `27`[K1, K2, K3, D1, D2, D3]): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: LabelAndValue): Unit = js.native
  
  var styleDefaults: AreaSvgStyle = js.native
  
  var tooltip: `27`[K1, K2, K3, D1, D2, D3] = js.native
  
  var tooltipDisplay: auto | labelAndShortDesc | none | shortDesc = js.native
  
  var touchResponse: touchStart | auto = js.native
  
  @JSName("translations")
  var translations_ojThematicMap: LabelAndValue = js.native
  
  var zooming: auto | none = js.native
}
object ojThematicMap {
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait DataContext extends StObject {
    
    var color: String = js.native
    
    var label: String = js.native
    
    var selected: Boolean = js.native
    
    var tooltip: String = js.native
  }
  object DataContext {
    
    @scala.inline
    def apply(color: String, label: String, selected: Boolean, tooltip: String): DataContext = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataContext]
    }
    
    @scala.inline
    implicit class DataContextMutableBuilder[Self <: DataContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait NodeContext extends StObject {
    
    var index: Double = js.native
    
    var subId: String = js.native
  }
  object NodeContext {
    
    @scala.inline
    def apply(index: Double, subId: String): NodeContext = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeContext]
    }
    
    @scala.inline
    implicit class NodeContextMutableBuilder[Self <: NodeContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubId(value: String): Self = StObject.set(x, "subId", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait RendererContext[K1, K2, K3, D1, D2, D3] extends StObject {
    
    var color: String = js.native
    
    var componentElement: Element = js.native
    
    var data: js.Object = js.native
    
    var id: K1 | K2 | K3 = js.native
    
    var itemData: D1 | D2 | D3 = js.native
    
    var label: String = js.native
    
    var location: String | Null = js.native
    
    var parentElement: Element = js.native
    
    var previousState: Focused = js.native
    
    def renderDefaultFocus(): Unit = js.native
    
    def renderDefaultHover(): Unit = js.native
    
    def renderDefaultSelection(): Unit = js.native
    
    var root: Element | Null = js.native
    
    var state: Focused = js.native
    
    var x: Double | Null = js.native
    
    var y: Double | Null = js.native
  }
  object RendererContext {
    
    @scala.inline
    def apply[K1, K2, K3, D1, D2, D3](
      color: String,
      componentElement: Element,
      data: js.Object,
      id: K1 | K2 | K3,
      itemData: D1 | D2 | D3,
      label: String,
      parentElement: Element,
      previousState: Focused,
      renderDefaultFocus: () => Unit,
      renderDefaultHover: () => Unit,
      renderDefaultSelection: () => Unit,
      state: Focused
    ): RendererContext[K1, K2, K3, D1, D2, D3] = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], previousState = previousState.asInstanceOf[js.Any], renderDefaultFocus = js.Any.fromFunction0(renderDefaultFocus), renderDefaultHover = js.Any.fromFunction0(renderDefaultHover), renderDefaultSelection = js.Any.fromFunction0(renderDefaultSelection), state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[RendererContext[K1, K2, K3, D1, D2, D3]]
    }
    
    @scala.inline
    implicit class RendererContextMutableBuilder[Self <: RendererContext[_, _, _, _, _, _], K1, K2, K3, D1, D2, D3] (val x: Self with (RendererContext[K1, K2, K3, D1, D2, D3])) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentElement(value: Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: K1 | K2 | K3): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemData(value: D1 | D2 | D3): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationNull: Self = StObject.set(x, "location", null)
      
      @scala.inline
      def setParentElement(value: Element): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousState(value: Focused): Self = StObject.set(x, "previousState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderDefaultFocus(value: () => Unit): Self = StObject.set(x, "renderDefaultFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderDefaultHover(value: () => Unit): Self = StObject.set(x, "renderDefaultHover", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderDefaultSelection(value: () => Unit): Self = StObject.set(x, "renderDefaultSelection", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRoot(value: Element): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setState(value: Focused): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXNull: Self = StObject.set(x, "x", null)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYNull: Self = StObject.set(x, "y", null)
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait TooltipContext[K1, K2, K3, D1, D2, D3] extends StObject {
    
    var color: String | Null = js.native
    
    var componentElement: Element = js.native
    
    var data: js.Object | Null = js.native
    
    var id: K1 | K2 | K3 = js.native
    
    var itemData: D1 | D2 | D3 = js.native
    
    var label: String | Null = js.native
    
    var location: String | Null = js.native
    
    var locationName: String | Null = js.native
    
    var parentElement: Element = js.native
    
    var tooltip: String = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object TooltipContext {
    
    @scala.inline
    def apply[K1, K2, K3, D1, D2, D3](
      componentElement: Element,
      id: K1 | K2 | K3,
      itemData: D1 | D2 | D3,
      parentElement: Element,
      tooltip: String,
      x: Double,
      y: Double
    ): TooltipContext[K1, K2, K3, D1, D2, D3] = {
      val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipContext[K1, K2, K3, D1, D2, D3]]
    }
    
    @scala.inline
    implicit class TooltipContextMutableBuilder[Self <: TooltipContext[_, _, _, _, _, _], K1, K2, K3, D1, D2, D3] (val x: Self with (TooltipContext[K1, K2, K3, D1, D2, D3])) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorNull: Self = StObject.set(x, "color", null)
      
      @scala.inline
      def setComponentElement(value: Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataNull: Self = StObject.set(x, "data", null)
      
      @scala.inline
      def setId(value: K1 | K2 | K3): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemData(value: D1 | D2 | D3): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelNull: Self = StObject.set(x, "label", null)
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationName(value: String): Self = StObject.set(x, "locationName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationNameNull: Self = StObject.set(x, "locationName", null)
      
      @scala.inline
      def setLocationNull: Self = StObject.set(x, "location", null)
      
      @scala.inline
      def setParentElement(value: Element): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
