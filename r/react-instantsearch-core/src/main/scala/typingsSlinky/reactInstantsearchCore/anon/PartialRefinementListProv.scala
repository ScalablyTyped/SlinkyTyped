package typingsSlinky.reactInstantsearchCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-instantsearch-core.react-instantsearch-core.RefinementListProvided> */
@js.native
trait PartialRefinementListProv extends js.Object {
  var canRefine: js.UndefOr[Boolean] = js.native
  var createURL: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var currentRefinement: js.UndefOr[js.Array[String]] = js.native
  var isFromSearch: js.UndefOr[Boolean] = js.native
  var items: js.UndefOr[js.Array[HitcountnumberisRefinedbo]] = js.native
  var refine: js.UndefOr[js.Function1[/* value */ js.Array[String], _]] = js.native
  var searchForItems: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
}

object PartialRefinementListProv {
  @scala.inline
  def apply(): PartialRefinementListProv = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRefinementListProv]
  }
  @scala.inline
  implicit class PartialRefinementListProvOps[Self <: PartialRefinementListProv] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanRefine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canRefine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanRefine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canRefine")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateURL(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createURL")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreateURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createURL")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentRefinement(value: js.Array[String]): Self = {
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
    def withIsFromSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFromSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFromSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFromSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[HitcountnumberisRefinedbo]): Self = {
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
    def withRefine(value: /* value */ js.Array[String] => _): Self = {
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
    @scala.inline
    def withSearchForItems(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchForItems")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSearchForItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchForItems")(js.undefined)
        ret
    }
  }
  
}

