package typingsSlinky.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileManagerDataSourceSchemaModel extends HierarchicalDataSourceSchemaModel {
  var isDirectory: js.UndefOr[js.Any] = js.native
}

object FileManagerDataSourceSchemaModel {
  @scala.inline
  def apply(): FileManagerDataSourceSchemaModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerDataSourceSchemaModel]
  }
  @scala.inline
  implicit class FileManagerDataSourceSchemaModelOps[Self <: FileManagerDataSourceSchemaModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsDirectory(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirectory")(js.undefined)
        ret
    }
  }
  
}

