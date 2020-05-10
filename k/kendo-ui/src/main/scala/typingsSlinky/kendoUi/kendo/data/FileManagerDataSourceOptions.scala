package typingsSlinky.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileManagerDataSourceOptions extends HierarchicalDataSourceOptions {
  @JSName("schema")
  var schema_FileManagerDataSourceOptions: js.UndefOr[FileManagerDataSourceSchema] = js.native
}

object FileManagerDataSourceOptions {
  @scala.inline
  def apply(): FileManagerDataSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerDataSourceOptions]
  }
  @scala.inline
  implicit class FileManagerDataSourceOptionsOps[Self <: FileManagerDataSourceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSchema(value: FileManagerDataSourceSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
        ret
    }
  }
  
}

