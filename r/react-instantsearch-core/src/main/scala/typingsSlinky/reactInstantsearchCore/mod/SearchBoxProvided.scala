package typingsSlinky.reactInstantsearchCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchBoxProvided extends js.Object {
  /** the current query used */
  var currentRefinement: String = js.native
  /** a flag that indicates if InstantSearch has detected that searches are stalled */
  var isSearchStalled: Boolean = js.native
  /** a function to change the current query */
  def refine(args: js.Any*): js.Any = js.native
}

object SearchBoxProvided {
  @scala.inline
  def apply(currentRefinement: String, isSearchStalled: Boolean, refine: /* repeated */ js.Any => js.Any): SearchBoxProvided = {
    val __obj = js.Dynamic.literal(currentRefinement = currentRefinement.asInstanceOf[js.Any], isSearchStalled = isSearchStalled.asInstanceOf[js.Any], refine = js.Any.fromFunction1(refine))
    __obj.asInstanceOf[SearchBoxProvided]
  }
  @scala.inline
  implicit class SearchBoxProvidedOps[Self <: SearchBoxProvided] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentRefinement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentRefinement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSearchStalled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSearchStalled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefine(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refine")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

