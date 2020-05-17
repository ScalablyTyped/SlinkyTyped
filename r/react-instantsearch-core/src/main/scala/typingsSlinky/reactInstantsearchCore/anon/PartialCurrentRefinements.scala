package typingsSlinky.reactInstantsearchCore.anon

import typingsSlinky.reactInstantsearchCore.mod.Refinement
import typingsSlinky.reactInstantsearchCore.mod.RefinementValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-instantsearch-core.react-instantsearch-core.CurrentRefinementsProvided> */
@js.native
trait PartialCurrentRefinements extends js.Object {
  var items: js.UndefOr[js.Array[Refinement]] = js.native
  var query: js.UndefOr[String] = js.native
  var refine: js.UndefOr[js.Function1[/* refinement */ RefinementValue | js.Array[RefinementValue], Unit]] = js.native
}

object PartialCurrentRefinements {
  @scala.inline
  def apply(): PartialCurrentRefinements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCurrentRefinements]
  }
  @scala.inline
  implicit class PartialCurrentRefinementsOps[Self <: PartialCurrentRefinements] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[Refinement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withRefine(value: /* refinement */ RefinementValue | js.Array[RefinementValue] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refine")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRefine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refine")(js.undefined)
        ret
    }
  }
  
}

