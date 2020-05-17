package typingsSlinky.reactInstantsearchCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-instantsearch-core.react-instantsearch-core.SearchBoxProvided> */
@js.native
trait PartialSearchBoxProvided extends js.Object {
  var currentRefinement: js.UndefOr[String] = js.native
  var isSearchStalled: js.UndefOr[Boolean] = js.native
  var refine: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
}

object PartialSearchBoxProvided {
  @scala.inline
  def apply(): PartialSearchBoxProvided = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSearchBoxProvided]
  }
  @scala.inline
  implicit class PartialSearchBoxProvidedOps[Self <: PartialSearchBoxProvided] (val x: Self) extends AnyVal {
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
    def withoutCurrentRefinement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentRefinement")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSearchStalled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSearchStalled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSearchStalled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSearchStalled")(js.undefined)
        ret
    }
    @scala.inline
    def withRefine(value: /* repeated */ js.Any => _): Self = {
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

