package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IValueListItemSearchResults extends js.Object {
  val Count: Double = js.native
  var MoreResults: Boolean = js.native
  def Add(Index: Double, ValueListItem: IValueListItem): Unit = js.native
  def Clone(): IValueListItemSearchResults = js.native
  def Item(Index: Double): IValueListItem = js.native
  def Remove(Index: Double): Unit = js.native
}

object IValueListItemSearchResults {
  @scala.inline
  def apply(
    Add: (Double, IValueListItem) => Unit,
    Clone: () => IValueListItemSearchResults,
    Count: Double,
    Item: Double => IValueListItem,
    MoreResults: Boolean,
    Remove: Double => Unit
  ): IValueListItemSearchResults = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), MoreResults = MoreResults.asInstanceOf[js.Any], Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IValueListItemSearchResults]
  }
  @scala.inline
  implicit class IValueListItemSearchResultsOps[Self <: IValueListItemSearchResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (Double, IValueListItem) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClone(value: () => IValueListItemSearchResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: Double => IValueListItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMoreResults(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MoreResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Remove")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

