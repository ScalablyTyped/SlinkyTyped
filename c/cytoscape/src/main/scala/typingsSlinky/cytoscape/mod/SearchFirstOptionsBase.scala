package typingsSlinky.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchFirstOptionsBase extends js.Object {
  /**
    * A boolean indicating whether the algorithm should only go along edges from source to target (default false).
    */
  var directed: js.UndefOr[Boolean] = js.native
  /**
    * A handler function that is called when a node is visited in the search.
    */
  var visit: js.UndefOr[SearchVisitFunction] = js.native
}

object SearchFirstOptionsBase {
  @scala.inline
  def apply(): SearchFirstOptionsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchFirstOptionsBase]
  }
  @scala.inline
  implicit class SearchFirstOptionsBaseOps[Self <: SearchFirstOptionsBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directed")(js.undefined)
        ret
    }
    @scala.inline
    def withVisit(
      value: (/* v */ NodeSingular, /* e */ EdgeSingular, /* u */ NodeSingular, /* i */ Double, /* depth */ Double) => Boolean | Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visit")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutVisit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visit")(js.undefined)
        ret
    }
  }
  
}

