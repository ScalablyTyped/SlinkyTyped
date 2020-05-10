package typingsSlinky.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KanbanFilter extends js.Object {
  /** Send a clear request to filter cards in the kanban.
    * @returns {void}
    */
  def clearFilter(): Unit = js.native
  /** Method used for send a clear search request to Kanban.
    * @returns {void}
    */
  def clearSearch(): Unit = js.native
  /** Send a filtering request to cards in the kanban.
    * @returns {void}
    */
  def filterCards(): Unit = js.native
  /** Send a search request to Kanban with specified string passed in it.
    * @param {string} Pass the string to search in Kanban card
    * @returns {void}
    */
  def searchCards(searchString: String): Unit = js.native
}

object KanbanFilter {
  @scala.inline
  def apply(
    clearFilter: () => Unit,
    clearSearch: () => Unit,
    filterCards: () => Unit,
    searchCards: String => Unit
  ): KanbanFilter = {
    val __obj = js.Dynamic.literal(clearFilter = js.Any.fromFunction0(clearFilter), clearSearch = js.Any.fromFunction0(clearSearch), filterCards = js.Any.fromFunction0(filterCards), searchCards = js.Any.fromFunction1(searchCards))
    __obj.asInstanceOf[KanbanFilter]
  }
  @scala.inline
  implicit class KanbanFilterOps[Self <: KanbanFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearFilter(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearFilter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClearSearch(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearSearch")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFilterCards(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterCards")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSearchCards(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchCards")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

