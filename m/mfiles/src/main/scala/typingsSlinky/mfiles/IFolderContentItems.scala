package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFolderContentItems extends js.Object {
  val Count: Double = js.native
  val MoreResults: Boolean = js.native
  def Item(Index: Double): IFolderContentItem = js.native
}

object IFolderContentItems {
  @scala.inline
  def apply(Count: Double, Item: Double => IFolderContentItem, MoreResults: Boolean): IFolderContentItems = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), MoreResults = MoreResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFolderContentItems]
  }
  @scala.inline
  implicit class IFolderContentItemsOps[Self <: IFolderContentItems] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: Double => IFolderContentItem): Self = {
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
  }
  
}

