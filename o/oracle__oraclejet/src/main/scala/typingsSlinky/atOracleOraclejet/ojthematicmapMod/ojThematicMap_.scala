package typingsSlinky.atOracleOraclejet.ojthematicmapMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Element
import typingsSlinky.atOracleOraclejet.Anon_AreaSvgStyle
import typingsSlinky.atOracleOraclejet.Anon_ComponentNameLabelAndValue
import typingsSlinky.atOracleOraclejet.Anon_ContextRendererAnonInsertAnonPreventDefaultD1
import typingsSlinky.atOracleOraclejet.Anon_Geo
import typingsSlinky.atOracleOraclejet.Anon_InsertSVGElement
import typingsSlinky.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.all
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.animationDuration
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.animationDurationChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.animationOnDisplay
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.animationOnDisplayChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.any
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.areaData
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.areaDataChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.as
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.asChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.auto
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dim
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.fixed
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.focusRenderer
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.focusRendererChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.hiddenCategories
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.hiddenCategoriesChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.highlightMatch
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.highlightMatchChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.highlightedCategories
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.highlightedCategoriesChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.hoverBehavior
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.hoverBehaviorChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.hoverRenderer
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.hoverRendererChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.initialZooming
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.initialZoomingChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.isolatedItem
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.isolatedItemChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.labelAndShortDesc
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.labelDisplay
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.labelDisplayChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.labelType
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.labelTypeChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.linkData
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.linkDataChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.long
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.mapProvider
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.mapProviderChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.markerData
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.markerDataChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.markerZoomBehavior
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.markerZoomBehaviorChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.maxZoom
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.maxZoomChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.multiple
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.none
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.off
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.on
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.panning
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.panningChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.renderer
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.rendererChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.selection
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.selectionChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.selectionMode
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.selectionModeChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.selectionRenderer
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.selectionRendererChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.short
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.shortDesc
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.single
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.styleDefaults
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.styleDefaultsChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.tooltip
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.tooltipChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.tooltipDisplay
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.tooltipDisplayChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.touchResponse
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.touchResponseChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.touchStart
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.translations
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.zoom
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.zooming
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.zoomingChanged
import typingsSlinky.atOracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.atOracleOraclejet.ojdvtDashBaseMod.dvtBaseComponent
import typingsSlinky.atOracleOraclejet.ojthematicmapMod.ojThematicMap.DataContext
import typingsSlinky.atOracleOraclejet.ojthematicmapMod.ojThematicMap.NodeContext
import typingsSlinky.atOracleOraclejet.ojthematicmapMod.ojThematicMap.RendererContext
import typingsSlinky.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("ojThematicMap")
@js.native
trait ojThematicMap_[K1, K2, K3, D1, D2, D3] extends dvtBaseComponent[ojThematicMapSettableProperties[K1, K2, K3, D1, D2, D3]] {
  var animationDuration: Double = js.native
  var animationOnDisplay: auto | none = js.native
  var areaData: (DataProvider[K1, D1]) | Null = js.native
  var as: String = js.native
  var focusRenderer: (js.Function1[
    /* context */ RendererContext[K1, K2, K3, D1, D2, D3], 
    Anon_InsertSVGElement | Unit
  ]) | Null = js.native
  var hiddenCategories: js.Array[String] = js.native
  var highlightMatch: any | all = js.native
  var highlightedCategories: js.Array[String] = js.native
  var hoverBehavior: dim | none = js.native
  var hoverRenderer: (js.Function1[
    /* context */ RendererContext[K1, K2, K3, D1, D2, D3], 
    Anon_InsertSVGElement | Unit
  ]) | Null = js.native
  var initialZooming: auto | none = js.native
  var isolatedItem: K1 = js.native
  var labelDisplay: on | off | auto = js.native
  var labelType: long | short = js.native
  var linkData: (DataProvider[K2, D2]) | Null = js.native
  var mapProvider: Anon_Geo = js.native
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
  var renderer: (js.Function1[
    /* context */ RendererContext[K1, K2, K3, D1, D2, D3], 
    Anon_InsertSVGElement | Unit
  ]) | Null = js.native
  var selection: js.Array[K1 | K2 | K3] = js.native
  var selectionMode: single | multiple | none = js.native
  var selectionRenderer: (js.Function1[
    /* context */ RendererContext[K1, K2, K3, D1, D2, D3], 
    Anon_InsertSVGElement | Unit
  ]) | Null = js.native
  var styleDefaults: Anon_AreaSvgStyle = js.native
  var tooltip: Anon_ContextRendererAnonInsertAnonPreventDefaultD1[D3, K1, K2, D1, K3, D2] = js.native
  var tooltipDisplay: auto | labelAndShortDesc | none | shortDesc = js.native
  var touchResponse: touchStart | auto = js.native
  @JSName("translations")
  var translations_ojThematicMap_ : Anon_ComponentNameLabelAndValue = js.native
  var zooming: auto | none = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: highlightMatchChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[any | all], _]
  ): Unit = js.native
  def addEventListener(
    `type`: highlightMatchChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[any | all], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: hoverBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[dim | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: hoverBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[dim | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: initialZoomingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: initialZoomingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: labelDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off | auto], _]
  ): Unit = js.native
  def addEventListener(
    `type`: labelDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off | auto], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: labelTypeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[long | short], _]
  ): Unit = js.native
  def addEventListener(
    `type`: labelTypeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[long | short], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: markerZoomBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[zoom | fixed], _]
  ): Unit = js.native
  def addEventListener(
    `type`: markerZoomBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[zoom | fixed], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: panningChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: panningChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[single | multiple | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[single | multiple | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: tooltipDisplayChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | labelAndShortDesc | none | shortDesc], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: tooltipDisplayChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | labelAndShortDesc | none | shortDesc], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: touchResponseChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[touchStart | auto], _]
  ): Unit = js.native
  def addEventListener(
    `type`: touchResponseChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[touchStart | auto], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: zoomingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: zoomingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationDurationChanged(
    `type`: animationDurationChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationDurationChanged(
    `type`: animationDurationChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_areaDataChanged(
    `type`: areaDataChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_areaDataChanged(
    `type`: areaDataChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusRendererChanged(
    `type`: focusRendererChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusRendererChanged(
    `type`: focusRendererChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiddenCategoriesChanged(
    `type`: hiddenCategoriesChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiddenCategoriesChanged(
    `type`: hiddenCategoriesChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highlightedCategoriesChanged(
    `type`: highlightedCategoriesChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highlightedCategoriesChanged(
    `type`: highlightedCategoriesChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hoverRendererChanged(
    `type`: hoverRendererChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hoverRendererChanged(
    `type`: hoverRendererChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_isolatedItemChanged(
    `type`: isolatedItemChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_isolatedItemChanged(
    `type`: isolatedItemChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_linkDataChanged(
    `type`: linkDataChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_linkDataChanged(
    `type`: linkDataChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mapProviderChanged(
    `type`: mapProviderChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mapProviderChanged(
    `type`: mapProviderChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_markerDataChanged(
    `type`: markerDataChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_markerDataChanged(
    `type`: markerDataChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxZoomChanged(
    `type`: maxZoomChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxZoomChanged(
    `type`: maxZoomChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rendererChanged(
    `type`: rendererChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rendererChanged(
    `type`: rendererChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionRendererChanged(
    `type`: selectionRendererChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionRendererChanged(
    `type`: selectionRendererChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_styleDefaultsChanged(
    `type`: styleDefaultsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_styleDefaultsChanged(
    `type`: styleDefaultsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
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
  def getProperty_focusRenderer(property: focusRenderer): (js.Function1[
    /* context */ RendererContext[K1, K2, K3, D1, D2, D3], 
    Anon_InsertSVGElement | Unit
  ]) | Null = js.native
  @JSName("getProperty")
  def getProperty_hiddenCategories(property: hiddenCategories): js.Array[String] = js.native
  @JSName("getProperty")
  def getProperty_highlightMatch(property: highlightMatch): any | all = js.native
  @JSName("getProperty")
  def getProperty_highlightedCategories(property: highlightedCategories): js.Array[String] = js.native
  @JSName("getProperty")
  def getProperty_hoverBehavior(property: hoverBehavior): dim | none = js.native
  @JSName("getProperty")
  def getProperty_hoverRenderer(property: hoverRenderer): (js.Function1[
    /* context */ RendererContext[K1, K2, K3, D1, D2, D3], 
    Anon_InsertSVGElement | Unit
  ]) | Null = js.native
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
  def getProperty_mapProvider(property: mapProvider): Anon_Geo = js.native
  @JSName("getProperty")
  def getProperty_markerData(property: markerData): (DataProvider[K3, D3]) | Null = js.native
  @JSName("getProperty")
  def getProperty_markerZoomBehavior(property: markerZoomBehavior): zoom | fixed = js.native
  @JSName("getProperty")
  def getProperty_maxZoom(property: maxZoom): Double = js.native
  @JSName("getProperty")
  def getProperty_panning(property: panning): auto | none = js.native
  @JSName("getProperty")
  def getProperty_renderer(property: renderer): (js.Function1[
    /* context */ RendererContext[K1, K2, K3, D1, D2, D3], 
    Anon_InsertSVGElement | Unit
  ]) | Null = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): js.Array[K1 | K2 | K3] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: selectionMode): single | multiple | none = js.native
  @JSName("getProperty")
  def getProperty_selectionRenderer(property: selectionRenderer): (js.Function1[
    /* context */ RendererContext[K1, K2, K3, D1, D2, D3], 
    Anon_InsertSVGElement | Unit
  ]) | Null = js.native
  @JSName("getProperty")
  def getProperty_styleDefaults(property: styleDefaults): Anon_AreaSvgStyle = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: tooltip): Anon_ContextRendererAnonInsertAnonPreventDefaultD1[D3, K1, K2, D1, K3, D2] = js.native
  @JSName("getProperty")
  def getProperty_tooltipDisplay(property: tooltipDisplay): auto | labelAndShortDesc | none | shortDesc = js.native
  @JSName("getProperty")
  def getProperty_touchResponse(property: touchResponse): touchStart | auto = js.native
  @JSName("getProperty")
  def getProperty_zooming(property: zooming): auto | none = js.native
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
    value: js.Function1[
      /* context */ RendererContext[K1, K2, K3, D1, D2, D3], 
      Anon_InsertSVGElement | Unit
    ]
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
    value: js.Function1[
      /* context */ RendererContext[K1, K2, K3, D1, D2, D3], 
      Anon_InsertSVGElement | Unit
    ]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_isolatedItem(property: isolatedItem, value: K1): Unit = js.native
  @JSName("setProperty")
  def setProperty_linkData(property: linkData): Unit = js.native
  @JSName("setProperty")
  def setProperty_linkData(property: linkData, value: DataProvider[K2, D2]): Unit = js.native
  @JSName("setProperty")
  def setProperty_mapProvider(property: mapProvider, value: Anon_Geo): Unit = js.native
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
    value: js.Function1[
      /* context */ RendererContext[K1, K2, K3, D1, D2, D3], 
      Anon_InsertSVGElement | Unit
    ]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: selection, value: js.Array[K1 | K2 | K3]): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionRenderer(property: selectionRenderer): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionRenderer(
    property: selectionRenderer,
    value: js.Function1[
      /* context */ RendererContext[K1, K2, K3, D1, D2, D3], 
      Anon_InsertSVGElement | Unit
    ]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_styleDefaults(property: styleDefaults, value: Anon_AreaSvgStyle): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(
    property: tooltip,
    value: Anon_ContextRendererAnonInsertAnonPreventDefaultD1[D3, K1, K2, D1, K3, D2]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Anon_ComponentNameLabelAndValue): Unit = js.native
}

