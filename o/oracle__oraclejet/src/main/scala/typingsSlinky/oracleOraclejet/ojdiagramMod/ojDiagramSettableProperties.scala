package typingsSlinky.oracleOraclejet.ojdiagramMod

import typingsSlinky.oracleOraclejet.Anon5
import typingsSlinky.oracleOraclejet.AnonAnimationDuration
import typingsSlinky.oracleOraclejet.AnonDrop
import typingsSlinky.oracleOraclejet.AnonHalign
import typingsSlinky.oracleOraclejet.AnonInsertSVGElement
import typingsSlinky.oracleOraclejet.AnonLabelClearSelection
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojdiagramMod.ojDiagram.RendererContext
import typingsSlinky.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentSettableProperties
import typingsSlinky.oracleOraclejet.ojkeysetMod.KeySet
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.`lazy`
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.all
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.any
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dim
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.full
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.link
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.linkAndNodes
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.multiple
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.node
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.nodeAndIncomingLinks
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.nodeAndLinks
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.nodeAndOutgoingLinks
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.single
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.touchStart
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.x
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojDiagramSettableProperties[K1, K2, D1, D2] extends dvtBaseComponentSettableProperties {
  var animationOnDataChange: auto | none
  var animationOnDisplay: auto | none
  var as: String
  var dnd: AnonDrop
  var expanded: KeySet[K1]
  var focusRenderer: (js.Function1[/* context */ RendererContext[K1, D1], AnonInsertSVGElement | Unit]) | Null
  var hiddenCategories: js.Array[String]
  var highlightMatch: any | all
  var highlightedCategories: js.Array[String]
  var hoverBehavior: dim | none
  var hoverRenderer: (js.Function1[/* context */ RendererContext[K1, D1], AnonInsertSVGElement | Unit]) | Null
  var linkData: (DataProvider[K2, D2]) | Null
  var linkHighlightMode: linkAndNodes | link
  var maxZoom: Double
  var minZoom: Double
  var nodeData: (DataProvider[K1, D1]) | Null
  var nodeHighlightMode: nodeAndIncomingLinks | nodeAndOutgoingLinks | nodeAndLinks | node
  var overview: AnonHalign
  var panDirection: x | y | auto
  var panning: auto | none
  var promotedLinkBehavior: none | full | `lazy`
  var selection: js.Array[K1 | K2]
  var selectionMode: single | multiple | none
  var selectionRenderer: (js.Function1[/* context */ RendererContext[K1, D1], AnonInsertSVGElement | Unit]) | Null
  var styleDefaults: AnonAnimationDuration
  var tooltip: Anon5[K1, K2, D1, D2]
  var touchResponse: touchStart | auto
  @JSName("translations")
  var translations_ojDiagramSettableProperties: AnonLabelClearSelection
  var zoomRenderer: (js.Function1[/* context */ RendererContext[K1, D1], AnonInsertSVGElement | Unit]) | Null
  var zooming: auto | none
  def layout(param0: DvtDiagramLayoutContext): Unit
  def renderer(context: RendererContext[K1, D1]): AnonInsertSVGElement
}

object ojDiagramSettableProperties {
  @scala.inline
  def apply[K1, K2, D1, D2](
    animationOnDataChange: auto | none,
    animationOnDisplay: auto | none,
    as: String,
    dnd: AnonDrop,
    expanded: KeySet[K1],
    hiddenCategories: js.Array[String],
    highlightMatch: any | all,
    highlightedCategories: js.Array[String],
    hoverBehavior: dim | none,
    layout: DvtDiagramLayoutContext => Unit,
    linkHighlightMode: linkAndNodes | link,
    maxZoom: Double,
    minZoom: Double,
    nodeHighlightMode: nodeAndIncomingLinks | nodeAndOutgoingLinks | nodeAndLinks | node,
    overview: AnonHalign,
    panDirection: x | y | auto,
    panning: auto | none,
    promotedLinkBehavior: none | full | `lazy`,
    renderer: RendererContext[K1, D1] => AnonInsertSVGElement,
    selection: js.Array[K1 | K2],
    selectionMode: single | multiple | none,
    styleDefaults: AnonAnimationDuration,
    tooltip: Anon5[K1, K2, D1, D2],
    touchResponse: touchStart | auto,
    trackResize: on | off,
    translations: AnonLabelClearSelection,
    zooming: auto | none,
    focusRenderer: /* context */ RendererContext[K1, D1] => AnonInsertSVGElement | Unit = null,
    hoverRenderer: /* context */ RendererContext[K1, D1] => AnonInsertSVGElement | Unit = null,
    linkData: DataProvider[K2, D2] = null,
    nodeData: DataProvider[K1, D1] = null,
    selectionRenderer: /* context */ RendererContext[K1, D1] => AnonInsertSVGElement | Unit = null,
    zoomRenderer: /* context */ RendererContext[K1, D1] => AnonInsertSVGElement | Unit = null
  ): ojDiagramSettableProperties[K1, K2, D1, D2] = {
    val __obj = js.Dynamic.literal(animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], dnd = dnd.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], hiddenCategories = hiddenCategories.asInstanceOf[js.Any], highlightMatch = highlightMatch.asInstanceOf[js.Any], highlightedCategories = highlightedCategories.asInstanceOf[js.Any], hoverBehavior = hoverBehavior.asInstanceOf[js.Any], layout = js.Any.fromFunction1(layout), linkHighlightMode = linkHighlightMode.asInstanceOf[js.Any], maxZoom = maxZoom.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], nodeHighlightMode = nodeHighlightMode.asInstanceOf[js.Any], overview = overview.asInstanceOf[js.Any], panDirection = panDirection.asInstanceOf[js.Any], panning = panning.asInstanceOf[js.Any], promotedLinkBehavior = promotedLinkBehavior.asInstanceOf[js.Any], renderer = js.Any.fromFunction1(renderer), selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], styleDefaults = styleDefaults.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], touchResponse = touchResponse.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], zooming = zooming.asInstanceOf[js.Any])
    if (focusRenderer != null) __obj.updateDynamic("focusRenderer")(js.Any.fromFunction1(focusRenderer))
    if (hoverRenderer != null) __obj.updateDynamic("hoverRenderer")(js.Any.fromFunction1(hoverRenderer))
    if (linkData != null) __obj.updateDynamic("linkData")(linkData.asInstanceOf[js.Any])
    if (nodeData != null) __obj.updateDynamic("nodeData")(nodeData.asInstanceOf[js.Any])
    if (selectionRenderer != null) __obj.updateDynamic("selectionRenderer")(js.Any.fromFunction1(selectionRenderer))
    if (zoomRenderer != null) __obj.updateDynamic("zoomRenderer")(js.Any.fromFunction1(zoomRenderer))
    __obj.asInstanceOf[ojDiagramSettableProperties[K1, K2, D1, D2]]
  }
}

