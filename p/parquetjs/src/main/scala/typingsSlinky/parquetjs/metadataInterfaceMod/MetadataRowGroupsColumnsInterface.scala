package typingsSlinky.parquetjs.metadataInterfaceMod

import typingsSlinky.nodeInt64.mod.^
import typingsSlinky.parquetjs.anon.Codec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataRowGroupsColumnsInterface extends js.Object {
  var file_offset: ^ = js.native
  var file_path: String | Null = js.native
  var meta_data: Codec = js.native
}

object MetadataRowGroupsColumnsInterface {
  @scala.inline
  def apply(file_offset: ^, meta_data: Codec): MetadataRowGroupsColumnsInterface = {
    val __obj = js.Dynamic.literal(file_offset = file_offset.asInstanceOf[js.Any], meta_data = meta_data.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataRowGroupsColumnsInterface]
  }
  @scala.inline
  implicit class MetadataRowGroupsColumnsInterfaceOps[Self <: MetadataRowGroupsColumnsInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFile_offset(value: ^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeta_data(value: Codec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta_data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFile_path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFile_pathNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_path")(null)
        ret
    }
  }
  
}

