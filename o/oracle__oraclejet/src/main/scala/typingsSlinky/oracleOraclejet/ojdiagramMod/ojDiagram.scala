package typingsSlinky.oracleOraclejet.ojdiagramMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.anon.AnimationDuration
import typingsSlinky.oracleOraclejet.anon.Drop
import typingsSlinky.oracleOraclejet.anon.ElementHeight
import typingsSlinky.oracleOraclejet.anon.Expanded
import typingsSlinky.oracleOraclejet.anon.Halign
import typingsSlinky.oracleOraclejet.anon.InsertSVGElement
import typingsSlinky.oracleOraclejet.anon.LabelClearSelection
import typingsSlinky.oracleOraclejet.anon.`5`
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojdiagramMod.ojDiagram.RendererContext
import typingsSlinky.oracleOraclejet.ojdvtBaseMod.dvtBaseComponent
import typingsSlinky.oracleOraclejet.ojkeysetMod.KeySet
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.`lazy`
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.all
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationOnDataChange
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationOnDataChangeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationOnDisplay
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationOnDisplayChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.any
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.as
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.asChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dim
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dnd
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dndChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.expanded
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.expandedChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.focusRenderer
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.focusRendererChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.full
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
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.layoutChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.link
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.linkAndNodes
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.linkData
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.linkDataChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.linkHighlightMode
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.linkHighlightModeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.maxZoom
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.maxZoomChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.minZoom
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.minZoomChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.multiple
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.node
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.nodeAndIncomingLinks
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.nodeAndLinks
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.nodeAndOutgoingLinks
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.nodeData
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.nodeDataChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.nodeHighlightMode
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.nodeHighlightModeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojBeforeCollapse
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojBeforeExpand
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojCollapse
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojExpand
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.overview
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.overviewChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.panDirection
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.panDirectionChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.panning
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.panningChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.promotedLinkBehavior
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.promotedLinkBehaviorChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rendererChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selection
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectionChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectionMode
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectionModeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectionRenderer
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectionRendererChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.single
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.styleDefaults
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.styleDefaultsChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.tooltip
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.tooltipChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.touchResponse
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.touchResponseChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.touchStart
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.translations
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.x
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.y
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.zoomRenderer
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.zoomRendererChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.zooming
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.zoomingChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojDiagram[K1, K2, D1, D2] extends dvtBaseComponent[ojDiagramSettableProperties[K1, K2, D1, D2]] {
  
  def addEventListener(
    `type`: animationOnDataChangeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDataChangeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
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
  def addEventListener(
    `type`: linkHighlightModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  def addEventListener(
    `type`: linkHighlightModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: nodeHighlightModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  def addEventListener(
    `type`: nodeHighlightModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: panDirectionChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: panDirectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: panningChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: panningChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: promotedLinkBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  def addEventListener(
    `type`: promotedLinkBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: selectionModeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: selectionModeChanged,
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
  def addEventListener_asChanged(`type`: asChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(`type`: dndChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: dndChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_expandedChanged(`type`: expandedChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_expandedChanged(
    `type`: expandedChanged,
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
  def addEventListener_layoutChanged(`type`: layoutChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_layoutChanged(
    `type`: layoutChanged,
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
  def addEventListener_maxZoomChanged(`type`: maxZoomChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxZoomChanged(
    `type`: maxZoomChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minZoomChanged(`type`: minZoomChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minZoomChanged(
    `type`: minZoomChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_nodeDataChanged(`type`: nodeDataChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_nodeDataChanged(
    `type`: nodeDataChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCollapse(`type`: ojBeforeCollapse, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCollapse(
    `type`: ojBeforeCollapse,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeExpand(`type`: ojBeforeExpand, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeExpand(
    `type`: ojBeforeExpand,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCollapse(`type`: ojCollapse, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCollapse(
    `type`: ojCollapse,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojExpand(`type`: ojExpand, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojExpand(
    `type`: ojExpand,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_overviewChanged(`type`: overviewChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_overviewChanged(
    `type`: overviewChanged,
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
  @JSName("addEventListener")
  def addEventListener_zoomRendererChanged(`type`: zoomRendererChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_zoomRendererChanged(
    `type`: zoomRendererChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  
  var animationOnDataChange: auto | none = js.native
  
  var animationOnDisplay: auto | none = js.native
  
  var as: String = js.native
  
  var dnd: Drop = js.native
  
  var expanded: KeySet[K1] = js.native
  
  var focusRenderer: (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null = js.native
  
  def getContextByNode(node: Element): js.Object | Null = js.native
  
  def getLink(linkIndex: Double): js.Object | Null = js.native
  
  def getLinkCount(): Double = js.native
  
  def getNode(nodeIndex: Double): js.Object | Null = js.native
  
  def getNodeCount(): Double = js.native
  
  def getPromotedLink(startNodeIndex: Double, endNodeIndex: Double): js.Object | Null = js.native
  
  @JSName("getProperty")
  def getProperty_animationOnDataChange(property: animationOnDataChange): auto | none = js.native
  @JSName("getProperty")
  def getProperty_animationOnDisplay(property: animationOnDisplay): auto | none = js.native
  @JSName("getProperty")
  def getProperty_as(property: as): String = js.native
  @JSName("getProperty")
  def getProperty_dnd(property: dnd): Drop = js.native
  @JSName("getProperty")
  def getProperty_expanded(property: expanded): KeySet[K1] = js.native
  @JSName("getProperty")
  def getProperty_focusRenderer(property: focusRenderer): (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null = js.native
  @JSName("getProperty")
  def getProperty_hiddenCategories(property: hiddenCategories): js.Array[String] = js.native
  @JSName("getProperty")
  def getProperty_highlightMatch(property: highlightMatch): any | all = js.native
  @JSName("getProperty")
  def getProperty_highlightedCategories(property: highlightedCategories): js.Array[String] = js.native
  @JSName("getProperty")
  def getProperty_hoverBehavior(property: hoverBehavior): dim | none = js.native
  @JSName("getProperty")
  def getProperty_hoverRenderer(property: hoverRenderer): (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null = js.native
  @JSName("getProperty")
  def getProperty_linkData(property: linkData): (DataProvider[K2, D2]) | Null = js.native
  @JSName("getProperty")
  def getProperty_linkHighlightMode(property: linkHighlightMode): linkAndNodes | link = js.native
  @JSName("getProperty")
  def getProperty_maxZoom(property: maxZoom): Double = js.native
  @JSName("getProperty")
  def getProperty_minZoom(property: minZoom): Double = js.native
  @JSName("getProperty")
  def getProperty_nodeData(property: nodeData): (DataProvider[K1, D1]) | Null = js.native
  @JSName("getProperty")
  def getProperty_nodeHighlightMode(property: nodeHighlightMode): nodeAndIncomingLinks | nodeAndOutgoingLinks | nodeAndLinks | node = js.native
  @JSName("getProperty")
  def getProperty_overview(property: overview): Halign = js.native
  @JSName("getProperty")
  def getProperty_panDirection(property: panDirection): x | y | auto = js.native
  @JSName("getProperty")
  def getProperty_panning(property: panning): auto | none = js.native
  @JSName("getProperty")
  def getProperty_promotedLinkBehavior(property: promotedLinkBehavior): none | full | `lazy` = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): js.Array[K1 | K2] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: selectionMode): single | multiple | none = js.native
  @JSName("getProperty")
  def getProperty_selectionRenderer(property: selectionRenderer): (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null = js.native
  @JSName("getProperty")
  def getProperty_styleDefaults(property: styleDefaults): AnimationDuration = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: tooltip): `5`[K1, K2, D1, D2] = js.native
  @JSName("getProperty")
  def getProperty_touchResponse(property: touchResponse): touchStart | auto = js.native
  @JSName("getProperty")
  def getProperty_zoomRenderer(property: zoomRenderer): (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null = js.native
  @JSName("getProperty")
  def getProperty_zooming(property: zooming): auto | none = js.native
  
  var hiddenCategories: js.Array[String] = js.native
  
  var highlightMatch: any | all = js.native
  
  var highlightedCategories: js.Array[String] = js.native
  
  var hoverBehavior: dim | none = js.native
  
  var hoverRenderer: (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null = js.native
  
  def layout(param0: DvtDiagramLayoutContext): Unit = js.native
  
  var linkData: (DataProvider[K2, D2]) | Null = js.native
  
  var linkHighlightMode: linkAndNodes | link = js.native
  
  var maxZoom: Double = js.native
  
  var minZoom: Double = js.native
  
  var nodeData: (DataProvider[K1, D1]) | Null = js.native
  
  var nodeHighlightMode: nodeAndIncomingLinks | nodeAndOutgoingLinks | nodeAndLinks | node = js.native
  
  var onAnimationOnDataChangeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onAnimationOnDisplayChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onAsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onDndChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onExpandedChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onFocusRendererChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onHiddenCategoriesChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onHighlightMatchChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onHighlightedCategoriesChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onHoverBehaviorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onHoverRendererChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onLayoutChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onLinkDataChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onLinkHighlightModeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onMaxZoomChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onMinZoomChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onNodeDataChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onNodeHighlightModeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onOjBeforeCollapse: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onOjBeforeExpand: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onOjCollapse: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onOjExpand: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onOverviewChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onPanDirectionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onPanningChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onPromotedLinkBehaviorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onRendererChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onSelectionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onSelectionModeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onSelectionRendererChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onStyleDefaultsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onTooltipChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onTouchResponseChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onZoomRendererChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onZoomingChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var overview: Halign = js.native
  
  var panDirection: x | y | auto = js.native
  
  var panning: auto | none = js.native
  
  var promotedLinkBehavior: none | full | `lazy` = js.native
  
  def renderer(context: RendererContext[K1, D1]): InsertSVGElement = js.native
  
  var selection: js.Array[K1 | K2] = js.native
  
  var selectionMode: single | multiple | none = js.native
  
  var selectionRenderer: (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null = js.native
  
  def setProperties(properties: ojDiagramSettablePropertiesLenient[K1, K2, D1, D2]): Unit = js.native
  
  def setProperty(property: animationOnDataChange, value: auto): Unit = js.native
  def setProperty(property: animationOnDataChange, value: none): Unit = js.native
  def setProperty(property: animationOnDisplay, value: auto): Unit = js.native
  def setProperty(property: animationOnDisplay, value: none): Unit = js.native
  def setProperty(property: highlightMatch, value: all): Unit = js.native
  def setProperty(property: highlightMatch, value: any): Unit = js.native
  def setProperty(property: hoverBehavior, value: dim): Unit = js.native
  def setProperty(property: hoverBehavior, value: none): Unit = js.native
  def setProperty(property: linkHighlightMode, value: link): Unit = js.native
  def setProperty(property: linkHighlightMode, value: linkAndNodes): Unit = js.native
  def setProperty(property: nodeHighlightMode, value: node): Unit = js.native
  def setProperty(property: nodeHighlightMode, value: nodeAndIncomingLinks): Unit = js.native
  def setProperty(property: nodeHighlightMode, value: nodeAndLinks): Unit = js.native
  def setProperty(property: nodeHighlightMode, value: nodeAndOutgoingLinks): Unit = js.native
  def setProperty(property: panDirection, value: auto): Unit = js.native
  def setProperty(property: panDirection, value: x): Unit = js.native
  def setProperty(property: panDirection, value: y): Unit = js.native
  def setProperty(property: panning, value: auto): Unit = js.native
  def setProperty(property: panning, value: none): Unit = js.native
  def setProperty(property: promotedLinkBehavior, value: `lazy`): Unit = js.native
  def setProperty(property: promotedLinkBehavior, value: full): Unit = js.native
  def setProperty(property: promotedLinkBehavior, value: none): Unit = js.native
  def setProperty(property: selectionMode, value: multiple): Unit = js.native
  def setProperty(property: selectionMode, value: none): Unit = js.native
  def setProperty(property: selectionMode, value: single): Unit = js.native
  def setProperty(property: touchResponse, value: auto): Unit = js.native
  def setProperty(property: touchResponse, value: touchStart): Unit = js.native
  def setProperty(property: zooming, value: auto): Unit = js.native
  def setProperty(property: zooming, value: none): Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: as, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_dnd(property: dnd, value: Drop): Unit = js.native
  @JSName("setProperty")
  def setProperty_expanded(property: expanded, value: KeySet[K1]): Unit = js.native
  @JSName("setProperty")
  def setProperty_focusRenderer(property: focusRenderer): Unit = js.native
  @JSName("setProperty")
  def setProperty_focusRenderer(
    property: focusRenderer,
    value: js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]
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
    value: js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_linkData(property: linkData): Unit = js.native
  @JSName("setProperty")
  def setProperty_linkData(property: linkData, value: DataProvider[K2, D2]): Unit = js.native
  @JSName("setProperty")
  def setProperty_maxZoom(property: maxZoom, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_minZoom(property: minZoom, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_nodeData(property: nodeData): Unit = js.native
  @JSName("setProperty")
  def setProperty_nodeData(property: nodeData, value: DataProvider[K1, D1]): Unit = js.native
  @JSName("setProperty")
  def setProperty_overview(property: overview, value: Halign): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: selection, value: js.Array[K1 | K2]): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionRenderer(property: selectionRenderer): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionRenderer(
    property: selectionRenderer,
    value: js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_styleDefaults(property: styleDefaults, value: AnimationDuration): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(property: tooltip, value: `5`[K1, K2, D1, D2]): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: LabelClearSelection): Unit = js.native
  @JSName("setProperty")
  def setProperty_zoomRenderer(property: zoomRenderer): Unit = js.native
  @JSName("setProperty")
  def setProperty_zoomRenderer(
    property: zoomRenderer,
    value: js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]
  ): Unit = js.native
  
  var styleDefaults: AnimationDuration = js.native
  
  var tooltip: `5`[K1, K2, D1, D2] = js.native
  
  var touchResponse: touchStart | auto = js.native
  
  @JSName("translations")
  var translations_ojDiagram: LabelClearSelection = js.native
  
  var zoomRenderer: (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null = js.native
  
  var zooming: auto | none = js.native
}
object ojDiagram {
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait RendererContext[K1, D1] extends StObject {
    
    var componentElement: Element = js.native
    
    var content: ElementHeight = js.native
    
    var data: js.Object = js.native
    
    var id: K1 = js.native
    
    var itemData: D1 = js.native
    
    var parentElement: Element = js.native
    
    var previousState: Expanded = js.native
    
    def renderDefaultFocus(): Unit = js.native
    
    def renderDefaultHover(): Unit = js.native
    
    def renderDefaultSelection(): Unit = js.native
    
    var state: Expanded = js.native
    
    var `type`: String = js.native
  }
  object RendererContext {
    
    @scala.inline
    def apply[K1, D1](
      componentElement: Element,
      content: ElementHeight,
      data: js.Object,
      id: K1,
      itemData: D1,
      parentElement: Element,
      previousState: Expanded,
      renderDefaultFocus: () => Unit,
      renderDefaultHover: () => Unit,
      renderDefaultSelection: () => Unit,
      state: Expanded,
      `type`: String
    ): RendererContext[K1, D1] = {
      val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], previousState = previousState.asInstanceOf[js.Any], renderDefaultFocus = js.Any.fromFunction0(renderDefaultFocus), renderDefaultHover = js.Any.fromFunction0(renderDefaultHover), renderDefaultSelection = js.Any.fromFunction0(renderDefaultSelection), state = state.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RendererContext[K1, D1]]
    }
    
    @scala.inline
    implicit class RendererContextMutableBuilder[Self <: RendererContext[_, _], K1, D1] (val x: Self with (RendererContext[K1, D1])) extends AnyVal {
      
      @scala.inline
      def setComponentElement(value: Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: ElementHeight): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: K1): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemData(value: D1): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentElement(value: Element): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousState(value: Expanded): Self = StObject.set(x, "previousState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderDefaultFocus(value: () => Unit): Self = StObject.set(x, "renderDefaultFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderDefaultHover(value: () => Unit): Self = StObject.set(x, "renderDefaultHover", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderDefaultSelection(value: () => Unit): Self = StObject.set(x, "renderDefaultSelection", js.Any.fromFunction0(value))
      
      @scala.inline
      def setState(value: Expanded): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait TooltipContext[K1, K2, D1, D2] extends StObject {
    
    var componentElement: Element = js.native
    
    var data: js.Object | js.Array[js.Object] = js.native
    
    var id: K1 | K2 = js.native
    
    var itemData: D1 | D2 | js.Array[D2] = js.native
    
    var label: String = js.native
    
    var parentElement: Element = js.native
    
    var `type`: String = js.native
  }
  object TooltipContext {
    
    @scala.inline
    def apply[K1, K2, D1, D2](
      componentElement: Element,
      data: js.Object | js.Array[js.Object],
      id: K1 | K2,
      itemData: D1 | D2 | js.Array[D2],
      label: String,
      parentElement: Element,
      `type`: String
    ): TooltipContext[K1, K2, D1, D2] = {
      val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipContext[K1, K2, D1, D2]]
    }
    
    @scala.inline
    implicit class TooltipContextMutableBuilder[Self <: TooltipContext[_, _, _, _], K1, K2, D1, D2] (val x: Self with (TooltipContext[K1, K2, D1, D2])) extends AnyVal {
      
      @scala.inline
      def setComponentElement(value: Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Object | js.Array[js.Object]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: js.Object*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setId(value: K1 | K2): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemData(value: D1 | D2 | js.Array[D2]): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemDataVarargs(value: D2*): Self = StObject.set(x, "itemData", js.Array(value :_*))
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentElement(value: Element): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ojBeforeCollapse = CustomEvent
  
  type ojBeforeExpand = CustomEvent
  
  type ojCollapse = CustomEvent
  
  type ojExpand = CustomEvent
}
