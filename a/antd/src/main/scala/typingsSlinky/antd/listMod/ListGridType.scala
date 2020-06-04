package typingsSlinky.antd.listMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGridType extends js.Object {
  var column: js.UndefOr[ColumnCount] = js.undefined
  var gutter: js.UndefOr[Double] = js.undefined
  var lg: js.UndefOr[ColumnCount] = js.undefined
  var md: js.UndefOr[ColumnCount] = js.undefined
  var sm: js.UndefOr[ColumnCount] = js.undefined
  var xl: js.UndefOr[ColumnCount] = js.undefined
  var xs: js.UndefOr[ColumnCount] = js.undefined
  var xxl: js.UndefOr[ColumnCount] = js.undefined
}

object ListGridType {
  @scala.inline
  def apply(): ListGridType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGridType]
  }
  @scala.inline
  implicit class ListGridTypeOps[Self <: ListGridType] (val x: Self) extends AnyVal {
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
    def setColumn(value: ColumnCount): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    @scala.inline
    def setGutter(value: Double): Self = this.set("gutter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGutter: Self = this.set("gutter", js.undefined)
    @scala.inline
    def setLg(value: ColumnCount): Self = this.set("lg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLg: Self = this.set("lg", js.undefined)
    @scala.inline
    def setMd(value: ColumnCount): Self = this.set("md", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMd: Self = this.set("md", js.undefined)
    @scala.inline
    def setSm(value: ColumnCount): Self = this.set("sm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSm: Self = this.set("sm", js.undefined)
    @scala.inline
    def setXl(value: ColumnCount): Self = this.set("xl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXl: Self = this.set("xl", js.undefined)
    @scala.inline
    def setXs(value: ColumnCount): Self = this.set("xs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXs: Self = this.set("xs", js.undefined)
    @scala.inline
    def setXxl(value: ColumnCount): Self = this.set("xxl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXxl: Self = this.set("xxl", js.undefined)
  }
  
}

