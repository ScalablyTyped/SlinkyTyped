package typingsSlinky.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.aStar
  */
@js.native
trait SearchAStarOptions extends js.Object {
  var directed: js.UndefOr[Boolean] = js.native
  var goal: Selector | CollectionArgument = js.native
  var heuristic: js.UndefOr[js.Function1[/* node */ NodeCollection, Double]] = js.native
  var root: Selector | CollectionArgument = js.native
  var weight: js.UndefOr[WeightFn] = js.native
}

object SearchAStarOptions {
  @scala.inline
  def apply(goal: Selector | CollectionArgument, root: Selector | CollectionArgument): SearchAStarOptions = {
    val __obj = js.Dynamic.literal(goal = goal.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchAStarOptions]
  }
  @scala.inline
  implicit class SearchAStarOptionsOps[Self <: SearchAStarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGoal(value: Selector | CollectionArgument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goal")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withHeuristic(value: /* node */ NodeCollection => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heuristic")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHeuristic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heuristic")(js.undefined)
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

