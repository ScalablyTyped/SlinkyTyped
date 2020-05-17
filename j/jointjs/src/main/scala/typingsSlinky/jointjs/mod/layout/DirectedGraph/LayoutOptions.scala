package typingsSlinky.jointjs.mod.layout.DirectedGraph

import typingsSlinky.jointjs.jointjsStrings.BT
import typingsSlinky.jointjs.jointjsStrings.LR
import typingsSlinky.jointjs.jointjsStrings.RL
import typingsSlinky.jointjs.jointjsStrings.TB
import typingsSlinky.jointjs.jointjsStrings.`longest-path`
import typingsSlinky.jointjs.jointjsStrings.`network-simplex`
import typingsSlinky.jointjs.jointjsStrings.`tight-tree`
import typingsSlinky.jointjs.mod.dia.BBox
import typingsSlinky.jointjs.mod.dia.Element
import typingsSlinky.jointjs.mod.dia.Link
import typingsSlinky.jointjs.mod.dia.Padding
import typingsSlinky.jointjs.mod.dia.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutOptions extends js.Object {
  var clusterPadding: js.UndefOr[Padding] = js.native
  var dagre: js.UndefOr[js.Any] = js.native
  var debugTiming: js.UndefOr[Boolean] = js.native
  var edgeSep: js.UndefOr[Double] = js.native
  var exportElement: js.UndefOr[js.Function1[/* element */ Element, Node]] = js.native
  var exportLink: js.UndefOr[js.Function1[/* link */ Link, Edge]] = js.native
  var graphlib: js.UndefOr[js.Any] = js.native
  var marginX: js.UndefOr[Double] = js.native
  var marginY: js.UndefOr[Double] = js.native
  var nodeSep: js.UndefOr[Double] = js.native
  var rankDir: js.UndefOr[TB | BT | LR | RL] = js.native
  var rankSep: js.UndefOr[Double] = js.native
  var ranker: js.UndefOr[`network-simplex` | `tight-tree` | `longest-path`] = js.native
  var resizeClusters: js.UndefOr[Boolean] = js.native
  var setLabels: js.UndefOr[
    Boolean | (js.Function3[/* link */ Link, /* position */ Point, /* points */ js.Array[Point], Unit])
  ] = js.native
  // deprecated
  var setLinkVertices: js.UndefOr[Boolean] = js.native
  var setPosition: js.UndefOr[js.Function2[/* element */ Element, /* position */ BBox, Unit]] = js.native
  var setVertices: js.UndefOr[Boolean | (js.Function2[/* link */ Link, /* vertices */ js.Array[Point], Unit])] = js.native
}

object LayoutOptions {
  @scala.inline
  def apply(): LayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutOptions]
  }
  @scala.inline
  implicit class LayoutOptionsOps[Self <: LayoutOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterPadding(value: Padding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withDagre(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dagre")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDagre: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dagre")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugTiming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugTiming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugTiming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugTiming")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeSep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeSep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeSep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeSep")(js.undefined)
        ret
    }
    @scala.inline
    def withExportElement(value: /* element */ Element => Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExportElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportElement")(js.undefined)
        ret
    }
    @scala.inline
    def withExportLink(value: /* link */ Link => Edge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportLink")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExportLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportLink")(js.undefined)
        ret
    }
    @scala.inline
    def withGraphlib(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphlib")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraphlib: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphlib")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginX")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginY")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeSep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeSep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeSep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeSep")(js.undefined)
        ret
    }
    @scala.inline
    def withRankDir(value: TB | BT | LR | RL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rankDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRankDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rankDir")(js.undefined)
        ret
    }
    @scala.inline
    def withRankSep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rankSep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRankSep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rankSep")(js.undefined)
        ret
    }
    @scala.inline
    def withRanker(value: `network-simplex` | `tight-tree` | `longest-path`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRanker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranker")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeClusters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeClusters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeClusters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeClusters")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLabelsFunction3(value: (/* link */ Link, /* position */ Point, /* points */ js.Array[Point]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabels")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetLabels(
      value: Boolean | (js.Function3[/* link */ Link, /* position */ Point, /* points */ js.Array[Point], Unit])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLinkVertices(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLinkVertices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetLinkVertices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLinkVertices")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPosition(value: (/* element */ Element, /* position */ BBox) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPosition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withSetVerticesFunction2(value: (/* link */ Link, /* vertices */ js.Array[Point]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVertices")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetVertices(value: Boolean | (js.Function2[/* link */ Link, /* vertices */ js.Array[Point], Unit])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVertices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetVertices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVertices")(js.undefined)
        ret
    }
  }
  
}

