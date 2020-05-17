package typingsSlinky.oracleOraclejet.ojdiagramMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.anon.AnimationDuration
import typingsSlinky.oracleOraclejet.anon.Drop
import typingsSlinky.oracleOraclejet.anon.Halign
import typingsSlinky.oracleOraclejet.anon.InsertSVGElement
import typingsSlinky.oracleOraclejet.anon.LabelClearSelection
import typingsSlinky.oracleOraclejet.anon.`5`
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojdiagramMod.ojDiagram.RendererContext
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

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojdiagram.ojDiagramSettableProperties<K1, K2, D1, D2>> */
@js.native
trait ojDiagramSettablePropertiesLenient[K1, K2, D1, D2]
  extends /* key */ StringDictionary[js.Any] {
  var animationOnDataChange: js.UndefOr[auto | none] = js.native
  var animationOnDisplay: js.UndefOr[auto | none] = js.native
  var as: js.UndefOr[String] = js.native
  var dnd: js.UndefOr[Drop] = js.native
  var expanded: js.UndefOr[KeySet[K1]] = js.native
  var focusRenderer: js.UndefOr[js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]] = js.native
  var hiddenCategories: js.UndefOr[js.Array[String]] = js.native
  var highlightMatch: js.UndefOr[any | all] = js.native
  var highlightedCategories: js.UndefOr[js.Array[String]] = js.native
  var hoverBehavior: js.UndefOr[dim | none] = js.native
  var hoverRenderer: js.UndefOr[js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]] = js.native
  var layout: js.UndefOr[js.Function1[/* param0 */ DvtDiagramLayoutContext, Unit]] = js.native
  var linkData: js.UndefOr[DataProvider[K2, D2]] = js.native
  var linkHighlightMode: js.UndefOr[linkAndNodes | link] = js.native
  var maxZoom: js.UndefOr[Double] = js.native
  var minZoom: js.UndefOr[Double] = js.native
  var nodeData: js.UndefOr[DataProvider[K1, D1]] = js.native
  var nodeHighlightMode: js.UndefOr[nodeAndIncomingLinks | nodeAndOutgoingLinks | nodeAndLinks | node] = js.native
  var overview: js.UndefOr[Halign] = js.native
  var panDirection: js.UndefOr[x | y | auto] = js.native
  var panning: js.UndefOr[auto | none] = js.native
  var promotedLinkBehavior: js.UndefOr[none | full | `lazy`] = js.native
  var renderer: js.UndefOr[js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement]] = js.native
  var selection: js.UndefOr[js.Array[K1 | K2]] = js.native
  var selectionMode: js.UndefOr[single | multiple | none] = js.native
  var selectionRenderer: js.UndefOr[js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]] = js.native
  var styleDefaults: js.UndefOr[AnimationDuration] = js.native
  var tooltip: js.UndefOr[`5`[K1, K2, D1, D2]] = js.native
  var touchResponse: js.UndefOr[touchStart | auto] = js.native
  var trackResize: js.UndefOr[on | off] = js.native
  var translations: js.UndefOr[LabelClearSelection] = js.native
  var zoomRenderer: js.UndefOr[js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]] = js.native
  var zooming: js.UndefOr[auto | none] = js.native
}

object ojDiagramSettablePropertiesLenient {
  @scala.inline
  def apply[K1, K2, D1, D2](): ojDiagramSettablePropertiesLenient[K1, K2, D1, D2] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojDiagramSettablePropertiesLenient[K1, K2, D1, D2]]
  }
  @scala.inline
  implicit class ojDiagramSettablePropertiesLenientOps[Self[k1, k2, d1, d2] <: ojDiagramSettablePropertiesLenient[k1, k2, d1, d2], K1, K2, D1, D2] (val x: Self[K1, K2, D1, D2]) extends AnyVal {
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
    def withoutAnimationOnDataChange: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOnDataChange")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationOnDisplay(value: auto | none): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOnDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationOnDisplay: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOnDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withAs(value: String): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAs: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(js.undefined)
        ret
    }
    @scala.inline
    def withDnd(value: Drop): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnd: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnd")(js.undefined)
        ret
    }
    @scala.inline
    def withExpanded(value: KeySet[K1]): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpanded: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusRenderer(value: /* context */ RendererContext[K1, D1] => InsertSVGElement | Unit): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFocusRenderer: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withHiddenCategories(value: js.Array[String]): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenCategories: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenCategories")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightMatch(value: any | all): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightMatch: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightedCategories(value: js.Array[String]): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightedCategories: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedCategories")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverBehavior(value: dim | none): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverBehavior: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverRenderer(value: /* context */ RendererContext[K1, D1] => InsertSVGElement | Unit): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHoverRenderer: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: /* param0 */ DvtDiagramLayoutContext => Unit): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLayout: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkData(value: DataProvider[K2, D2]): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkData: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkData")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkHighlightMode(value: linkAndNodes | link): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkHighlightMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkHighlightMode: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkHighlightMode")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxZoom(value: Double): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxZoom: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withMinZoom(value: Double): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinZoom: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeData(value: DataProvider[K1, D1]): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeData: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeData")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeHighlightMode(value: nodeAndIncomingLinks | nodeAndOutgoingLinks | nodeAndLinks | node): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeHighlightMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeHighlightMode: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeHighlightMode")(js.undefined)
        ret
    }
    @scala.inline
    def withOverview(value: Halign): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverview: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overview")(js.undefined)
        ret
    }
    @scala.inline
    def withPanDirection(value: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.x | y | auto): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanDirection: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withPanning(value: auto | none): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanning: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panning")(js.undefined)
        ret
    }
    @scala.inline
    def withPromotedLinkBehavior(value: none | full | `lazy`): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotedLinkBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromotedLinkBehavior: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotedLinkBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderer(value: /* context */ RendererContext[K1, D1] => InsertSVGElement): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderer: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.undefined)
        ret
    }
    @scala.inline
    def withSelection(value: js.Array[K1 | K2]): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelection: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionMode(value: single | multiple | none): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionMode: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionRenderer(value: /* context */ RendererContext[K1, D1] => InsertSVGElement | Unit): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelectionRenderer: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleDefaults(value: AnimationDuration): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleDefaults: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleDefaults")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: `5`[K1, K2, D1, D2]): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchResponse(value: touchStart | auto): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchResponse: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackResize(value: on | off): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackResize: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackResize")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslations(value: LabelClearSelection): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslations: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomRenderer(value: /* context */ RendererContext[K1, D1] => InsertSVGElement | Unit): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutZoomRenderer: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withZooming(value: auto | none): Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zooming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZooming: Self[K1, K2, D1, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zooming")(js.undefined)
        ret
    }
  }
  
}

