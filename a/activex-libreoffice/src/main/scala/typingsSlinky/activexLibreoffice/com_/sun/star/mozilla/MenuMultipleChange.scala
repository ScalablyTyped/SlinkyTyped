package typingsSlinky.activexLibreoffice.com_.sun.star.mozilla

import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Explains properties of a menu item */
@js.native
trait MenuMultipleChange extends js.Object {
  /** unique ID of the group this menu item belongs to */
  var GroupID: Double = js.native
  /** unique ID of this menu item */
  var ID: Double = js.native
  /** sequence of bytes representing a possible image */
  var Image: SafeArray[Double] = js.native
  /** true if active, so clickable */
  var IsActive: Boolean = js.native
  /** true if checkable, so there can be a checkmark */
  var IsCheckable: Boolean = js.native
  /** true if there is a checkmark */
  var IsChecked: Boolean = js.native
  /** true if visible */
  var IsVisible: Boolean = js.native
  /** text of the menu item */
  var ItemText: String = js.native
  /** unique ID of the item directly above this menu item, used for fuzzy placement */
  var PreItemID: Double = js.native
}

object MenuMultipleChange {
  @scala.inline
  def apply(
    GroupID: Double,
    ID: Double,
    Image: SafeArray[Double],
    IsActive: Boolean,
    IsCheckable: Boolean,
    IsChecked: Boolean,
    IsVisible: Boolean,
    ItemText: String,
    PreItemID: Double
  ): MenuMultipleChange = {
    val __obj = js.Dynamic.literal(GroupID = GroupID.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Image = Image.asInstanceOf[js.Any], IsActive = IsActive.asInstanceOf[js.Any], IsCheckable = IsCheckable.asInstanceOf[js.Any], IsChecked = IsChecked.asInstanceOf[js.Any], IsVisible = IsVisible.asInstanceOf[js.Any], ItemText = ItemText.asInstanceOf[js.Any], PreItemID = PreItemID.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuMultipleChange]
  }
  @scala.inline
  implicit class MenuMultipleChangeOps[Self <: MenuMultipleChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCheckable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsCheckable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreItemID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreItemID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

