package typingsSlinky.parquetjs.metadataInterfaceMod

import typingsSlinky.nodeInt64.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataRowGroupsInterface extends js.Object {
  var columns: js.Array[MetadataRowGroupsColumnsInterface] = js.native
  var num_rows: ^ = js.native
  var sorting_columns: (js.Array[js.Array[String] | String]) | Null = js.native
  var total_byte_size: ^ = js.native
}

object MetadataRowGroupsInterface {
  @scala.inline
  def apply(columns: js.Array[MetadataRowGroupsColumnsInterface], num_rows: ^, total_byte_size: ^): MetadataRowGroupsInterface = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], num_rows = num_rows.asInstanceOf[js.Any], total_byte_size = total_byte_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataRowGroupsInterface]
  }
  @scala.inline
  implicit class MetadataRowGroupsInterfaceOps[Self <: MetadataRowGroupsInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[MetadataRowGroupsColumnsInterface]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNum_rows(value: ^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_byte_size(value: ^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_byte_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSorting_columns(value: js.Array[js.Array[String] | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorting_columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSorting_columnsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorting_columns")(null)
        ret
    }
  }
  
}

