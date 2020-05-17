package typingsSlinky.reactInstantsearchCore.mod

import typingsSlinky.reactInstantsearchCore.anon.Count
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuProvided extends js.Object {
  var currentRefinement: String = js.native
  var isFromSearch: Boolean = js.native
  var items: js.Array[Count] = js.native
  def createURL(args: js.Any*): js.Any = js.native
  def refine(args: js.Any*): js.Any = js.native
  def searchForItems(args: js.Any*): js.Any = js.native
}

object MenuProvided {
  @scala.inline
  def apply(
    createURL: /* repeated */ js.Any => js.Any,
    currentRefinement: String,
    isFromSearch: Boolean,
    items: js.Array[Count],
    refine: /* repeated */ js.Any => js.Any,
    searchForItems: /* repeated */ js.Any => js.Any
  ): MenuProvided = {
    val __obj = js.Dynamic.literal(createURL = js.Any.fromFunction1(createURL), currentRefinement = currentRefinement.asInstanceOf[js.Any], isFromSearch = isFromSearch.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], refine = js.Any.fromFunction1(refine), searchForItems = js.Any.fromFunction1(searchForItems))
    __obj.asInstanceOf[MenuProvided]
  }
  @scala.inline
  implicit class MenuProvidedOps[Self <: MenuProvided] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateURL(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createURL")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCurrentRefinement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentRefinement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFromSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFromSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[Count]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefine(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refine")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSearchForItems(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchForItems")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

