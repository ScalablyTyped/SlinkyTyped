package typingsSlinky.dagreLayout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphLabel extends js.Object {
  var acyclicer: js.UndefOr[String] = js.native
  var align: js.UndefOr[String] = js.native
  var compound: js.UndefOr[Boolean] = js.native
  var edgesep: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var marginx: js.UndefOr[Double] = js.native
  var marginy: js.UndefOr[Double] = js.native
  var nodesep: js.UndefOr[Double] = js.native
  var rankdir: js.UndefOr[String] = js.native
  var ranker: js.UndefOr[String] = js.native
  var ranksep: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object GraphLabel {
  @scala.inline
  def apply(): GraphLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphLabel]
  }
  @scala.inline
  implicit class GraphLabelOps[Self <: GraphLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcyclicer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acyclicer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcyclicer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acyclicer")(js.undefined)
        ret
    }
    @scala.inline
    def withAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withCompound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compound")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgesep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgesep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgesep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgesep")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginx")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginy")(js.undefined)
        ret
    }
    @scala.inline
    def withNodesep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodesep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodesep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodesep")(js.undefined)
        ret
    }
    @scala.inline
    def withRankdir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rankdir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRankdir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rankdir")(js.undefined)
        ret
    }
    @scala.inline
    def withRanker(value: String): Self = {
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
    def withRanksep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranksep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRanksep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranksep")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

