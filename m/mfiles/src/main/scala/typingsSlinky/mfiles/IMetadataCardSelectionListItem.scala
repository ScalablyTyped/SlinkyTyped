package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMetadataCardSelectionListItem extends js.Object {
  val ChildItems: js.Any = js.native
  val HasParent: Boolean = js.native
  val ParentID: Double = js.native
  val Selectable: Boolean = js.native
  val Value: js.Any = js.native
}

object IMetadataCardSelectionListItem {
  @scala.inline
  def apply(ChildItems: js.Any, HasParent: Boolean, ParentID: Double, Selectable: Boolean, Value: js.Any): IMetadataCardSelectionListItem = {
    val __obj = js.Dynamic.literal(ChildItems = ChildItems.asInstanceOf[js.Any], HasParent = HasParent.asInstanceOf[js.Any], ParentID = ParentID.asInstanceOf[js.Any], Selectable = Selectable.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetadataCardSelectionListItem]
  }
  @scala.inline
  implicit class IMetadataCardSelectionListItemOps[Self <: IMetadataCardSelectionListItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildItems(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChildItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasParent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Selectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

