package typingsSlinky.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.bellmanFord
  */
@js.native
trait SearchBellmanFordOptions extends js.Object {
  /**
    * Indicating whether the algorithm should only go along
    * edges from source to target (default false).
    */
  var directed: Boolean = js.native
  /**
    * The root node (selector or collection) where the search starts.
    */
  var root: js.Any = js.native
  /**
    * A function that returns the positive numeric weight for this edge.
    */
  var weight: js.UndefOr[WeightFn] = js.native
}

object SearchBellmanFordOptions {
  @scala.inline
  def apply(directed: Boolean, root: js.Any): SearchBellmanFordOptions = {
    val __obj = js.Dynamic.literal(directed = directed.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBellmanFordOptions]
  }
  @scala.inline
  implicit class SearchBellmanFordOptionsOps[Self <: SearchBellmanFordOptions] (val x: Self) extends AnyVal {
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
    def withRoot(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
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

