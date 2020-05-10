package typingsSlinky.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HierarchicalDataSourceSchemaModel extends DataSourceSchemaModel {
  var children: js.UndefOr[js.Any] = js.native
  var hasChildren: js.UndefOr[js.Any] = js.native
}

object HierarchicalDataSourceSchemaModel {
  @scala.inline
  def apply(): HierarchicalDataSourceSchemaModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HierarchicalDataSourceSchemaModel]
  }
  @scala.inline
  implicit class HierarchicalDataSourceSchemaModelOps[Self <: HierarchicalDataSourceSchemaModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withHasChildren(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasChildren")(js.undefined)
        ret
    }
  }
  
}

