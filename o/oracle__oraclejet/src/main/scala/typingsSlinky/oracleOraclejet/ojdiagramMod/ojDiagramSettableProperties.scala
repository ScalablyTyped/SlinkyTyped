package typingsSlinky.oracleOraclejet.ojdiagramMod

import typingsSlinky.oracleOraclejet.anon.AnimationDuration
import typingsSlinky.oracleOraclejet.anon.Drop
import typingsSlinky.oracleOraclejet.anon.Halign
import typingsSlinky.oracleOraclejet.anon.InsertSVGElement
import typingsSlinky.oracleOraclejet.anon.LabelClearSelection
import typingsSlinky.oracleOraclejet.anon.`5`
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

@js.native
trait ojDiagramSettableProperties[K1, K2, D1, D2] extends dvtBaseComponentSettableProperties {
  var animationOnDataChange: auto | none = js.native
  var animationOnDisplay: auto | none = js.native
  var as: String = js.native
  var dnd: Drop = js.native
  var expanded: KeySet[K1] = js.native
  var focusRenderer: (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null = js.native
  var hiddenCategories: js.Array[String] = js.native
  var highlightMatch: any | all = js.native
  var highlightedCategories: js.Array[String] = js.native
  var hoverBehavior: dim | none = js.native
  var hoverRenderer: (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null = js.native
  var linkData: (DataProvider[K2, D2]) | Null = js.native
  var linkHighlightMode: linkAndNodes | link = js.native
  var maxZoom: Double = js.native
  var minZoom: Double = js.native
  var nodeData: (DataProvider[K1, D1]) | Null = js.native
  var nodeHighlightMode: nodeAndIncomingLinks | nodeAndOutgoingLinks | nodeAndLinks | node = js.native
  var overview: Halign = js.native
  var panDirection: x | y | auto = js.native
  var panning: auto | none = js.native
  var promotedLinkBehavior: none | full | `lazy` = js.native
  var selection: js.Array[K1 | K2] = js.native
  var selectionMode: single | multiple | none = js.native
  var selectionRenderer: (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null = js.native
  var styleDefaults: AnimationDuration = js.native
  var tooltip: `5`[K1, K2, D1, D2] = js.native
  var touchResponse: touchStart | auto = js.native
  @JSName("translations")
  var translations_ojDiagramSettableProperties: LabelClearSelection = js.native
  var zoomRenderer: (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null = js.native
  var zooming: auto | none = js.native
  def layout(param0: DvtDiagramLayoutContext): Unit = js.native
  def renderer(context: RendererContext[K1, D1]): InsertSVGElement = js.native
}

object ojDiagramSettableProperties {
  @scala.inline
  def apply[K1, K2, D1, D2](
    animationOnDataChange: auto | none,
    animationOnDisplay: auto | none,
    as: String,
    dnd: Drop,
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
    overview: Halign,
    panDirection: x | y | auto,
    panning: auto | none,
    promotedLinkBehavior: none | full | `lazy`,
    renderer: RendererContext[K1, D1] => InsertSVGElement,
    selection: js.Array[K1 | K2],
    selectionMode: single | multiple | none,
    styleDefaults: AnimationDuration,
    tooltip: `5`[K1, K2, D1, D2],
    touchResponse: touchStart | auto,
    trackResize: on | off,
    translations: LabelClearSelection,
    zooming: auto | none
  ): ojDiagramSettableProperties[K1, K2, D1, D2] = {
    val __obj = js.Dynamic.literal(animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], dnd = dnd.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], hiddenCategories = hiddenCategories.asInstanceOf[js.Any], highlightMatch = highlightMatch.asInstanceOf[js.Any], highlightedCategories = highlightedCategories.asInstanceOf[js.Any], hoverBehavior = hoverBehavior.asInstanceOf[js.Any], layout = js.Any.fromFunction1(layout), linkHighlightMode = linkHighlightMode.asInstanceOf[js.Any], maxZoom = maxZoom.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], nodeHighlightMode = nodeHighlightMode.asInstanceOf[js.Any], overview = overview.asInstanceOf[js.Any], panDirection = panDirection.asInstanceOf[js.Any], panning = panning.asInstanceOf[js.Any], promotedLinkBehavior = promotedLinkBehavior.asInstanceOf[js.Any], renderer = js.Any.fromFunction1(renderer), selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], styleDefaults = styleDefaults.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], touchResponse = touchResponse.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], zooming = zooming.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojDiagramSettableProperties[K1, K2, D1, D2]]
  }
  @scala.inline
  implicit class ojDiagramSettablePropertiesOps[Self[k1, k2, d1, d2] <: ojDiagramSettableProperties[k1, k2, d1, d2], K1, K2, D1, D2] (val x: Self[K1, K2, D1, D2]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K1, K2, D1, D2] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K1, K2, D1, D2]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K1, K2, D1, D2]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K1, K2, D1, D2]) with Other]
    @scala.inline
    def withAnimationOnDataChange(value: auto | none): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOnDataChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimationOnDisplay(value: auto | none): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOnDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAs(value: String): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDnd(value: Drop): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpanded(value: KeySet[K1]): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHiddenCategories(value: js.Array[String]): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightMatch(value: any | all): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightedCategories(value: js.Array[String]): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoverBehavior(value: dim | none): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayout(value: DvtDiagramLayoutContext => Unit): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLinkHighlightMode(value: linkAndNodes | link): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkHighlightMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxZoom(value: Double): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinZoom(value: Double): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeHighlightMode(value: nodeAndIncomingLinks | nodeAndOutgoingLinks | nodeAndLinks | node): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeHighlightMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverview(value: Halign): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPanDirection(value: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.x | y | auto): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPanning(value: auto | none): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPromotedLinkBehavior(value: none | full | `lazy`): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotedLinkBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderer(value: RendererContext[K1, D1] => InsertSVGElement): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelection(value: js.Array[K1 | K2]): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionMode(value: single | multiple | none): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyleDefaults(value: AnimationDuration): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltip(value: `5`[K1, K2, D1, D2]): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchResponse(value: touchStart | auto): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslations(value: LabelClearSelection): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZooming(value: auto | none): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zooming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusRenderer(value: /* context */ RendererContext[K1, D1] => InsertSVGElement | Unit): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFocusRendererNull: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusRenderer")(null)
        ret
    }
    @scala.inline
    def withHoverRenderer(value: /* context */ RendererContext[K1, D1] => InsertSVGElement | Unit): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHoverRendererNull: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverRenderer")(null)
        ret
    }
    @scala.inline
    def withLinkData(value: DataProvider[K2, D2]): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkDataNull: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkData")(null)
        ret
    }
    @scala.inline
    def withNodeData(value: DataProvider[K1, D1]): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeDataNull: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeData")(null)
        ret
    }
    @scala.inline
    def withSelectionRenderer(value: /* context */ RendererContext[K1, D1] => InsertSVGElement | Unit): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelectionRendererNull: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionRenderer")(null)
        ret
    }
    @scala.inline
    def withZoomRenderer(value: /* context */ RendererContext[K1, D1] => InsertSVGElement | Unit): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withZoomRendererNull: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomRenderer")(null)
        ret
    }
  }
  
}

