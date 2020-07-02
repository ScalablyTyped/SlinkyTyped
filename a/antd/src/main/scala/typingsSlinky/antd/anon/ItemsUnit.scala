package typingsSlinky.antd.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsUnit extends js.Object {
  var itemUnit: String
  var itemsUnit: String
  var notFoundContent: ReactElement
  var remove: String
  var removeAll: String
  var removeCurrent: String
  var searchPlaceholder: String
  var selectAll: String
  var selectCurrent: String
  var selectInvert: String
  var titles: js.Array[String]
}

object ItemsUnit {
  @scala.inline
  def apply(
    itemUnit: String,
    itemsUnit: String,
    remove: String,
    removeAll: String,
    removeCurrent: String,
    searchPlaceholder: String,
    selectAll: String,
    selectCurrent: String,
    selectInvert: String,
    titles: js.Array[String]
  ): ItemsUnit = {
    val __obj = js.Dynamic.literal(itemUnit = itemUnit.asInstanceOf[js.Any], itemsUnit = itemsUnit.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], removeAll = removeAll.asInstanceOf[js.Any], removeCurrent = removeCurrent.asInstanceOf[js.Any], searchPlaceholder = searchPlaceholder.asInstanceOf[js.Any], selectAll = selectAll.asInstanceOf[js.Any], selectCurrent = selectCurrent.asInstanceOf[js.Any], selectInvert = selectInvert.asInstanceOf[js.Any], titles = titles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsUnit]
  }
  @scala.inline
  implicit class ItemsUnitOps[Self <: ItemsUnit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setItemUnit(value: String): Self = this.set("itemUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsUnit(value: String): Self = this.set("itemsUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemove(value: String): Self = this.set("remove", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveAll(value: String): Self = this.set("removeAll", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveCurrent(value: String): Self = this.set("removeCurrent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchPlaceholder(value: String): Self = this.set("searchPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectAll(value: String): Self = this.set("selectAll", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectCurrent(value: String): Self = this.set("selectCurrent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectInvert(value: String): Self = this.set("selectInvert", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitles(value: js.Array[String]): Self = this.set("titles", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotFoundContent(value: ReactElement): Self = this.set("notFoundContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotFoundContent: Self = this.set("notFoundContent", js.undefined)
  }
  
}

