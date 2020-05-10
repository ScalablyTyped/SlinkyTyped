package typingsSlinky.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `slicerItem.toJSON()`. */
@js.native
trait SlicerItemData extends js.Object {
  /**
    *
    * True if the slicer item has data.
    *
    * [Api set: ExcelApi 1.10]
    */
  var hasData: js.UndefOr[Boolean] = js.native
  /**
    *
    * True if the slicer item is selected.
    Setting this value will not clear other SlicerItems' selected state.
    By default, if the slicer item is the only one selected, when it is deselected, all items will be selected.
    *
    * [Api set: ExcelApi 1.10]
    */
  var isSelected: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the unique value representing the slicer item.
    *
    * [Api set: ExcelApi 1.10]
    */
  var key: js.UndefOr[String] = js.native
  /**
    *
    * Represents the title displayed in the UI.
    *
    * [Api set: ExcelApi 1.10]
    */
  var name: js.UndefOr[String] = js.native
}

object SlicerItemData {
  @scala.inline
  def apply(): SlicerItemData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlicerItemData]
  }
  @scala.inline
  implicit class SlicerItemDataOps[Self <: SlicerItemData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasData")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

