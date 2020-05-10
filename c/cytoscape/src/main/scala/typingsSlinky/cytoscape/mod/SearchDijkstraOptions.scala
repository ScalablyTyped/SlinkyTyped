package typingsSlinky.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.dijkstra
  */
@js.native
trait SearchDijkstraOptions extends js.Object {
  /**
    * A boolean indicating whether the algorithm should only go along edges from source to target (default false).
    */
  var directed: js.UndefOr[Boolean] = js.native
  /**
    * The root node (selector or collection) where the algorithm starts.
    */
  var root: Selector | CollectionArgument = js.native
  /**
    * A function that returns the positive numeric weight for this edge.
    *
    * If no weight function is defined, a constant weight of 1 is used for each edge.
    */
  var weight: js.UndefOr[WeightFn] = js.native
}

object SearchDijkstraOptions {
  @scala.inline
  def apply(root: Selector | CollectionArgument): SearchDijkstraOptions = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchDijkstraOptions]
  }
  @scala.inline
  implicit class SearchDijkstraOptionsOps[Self <: SearchDijkstraOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoot(value: Selector | CollectionArgument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withWeight(value: /* edge */ EdgeCollection => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(js.undefined)
        ret
    }
  }
  
}

