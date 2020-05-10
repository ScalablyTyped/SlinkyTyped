package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFolderListingColumnSorting extends js.Object {
  var ID: Double = js.native
  var Index: Double = js.native
  var SortAscending: Boolean = js.native
  def Clone(): IFolderListingColumnSorting = js.native
}

object IFolderListingColumnSorting {
  @scala.inline
  def apply(Clone: () => IFolderListingColumnSorting, ID: Double, Index: Double, SortAscending: Boolean): IFolderListingColumnSorting = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ID = ID.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], SortAscending = SortAscending.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFolderListingColumnSorting]
  }
  @scala.inline
  implicit class IFolderListingColumnSortingOps[Self <: IFolderListingColumnSorting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IFolderListingColumnSorting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortAscending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortAscending")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

