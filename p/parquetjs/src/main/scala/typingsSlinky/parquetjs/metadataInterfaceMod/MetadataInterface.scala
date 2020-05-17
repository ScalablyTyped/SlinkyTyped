package typingsSlinky.parquetjs.metadataInterfaceMod

import typingsSlinky.nodeInt64.mod.^
import typingsSlinky.parquetjs.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataInterface extends js.Object {
  var created_by: String = js.native
  var key_value_metadata: js.Array[Key] = js.native
  var num_rows: ^ = js.native
  var row_groups: js.Array[MetadataRowGroupsInterface] = js.native
  var schema: js.Array[MetadataSchemaInterface] = js.native
  var version: Double = js.native
}

object MetadataInterface {
  @scala.inline
  def apply(
    created_by: String,
    key_value_metadata: js.Array[Key],
    num_rows: ^,
    row_groups: js.Array[MetadataRowGroupsInterface],
    schema: js.Array[MetadataSchemaInterface],
    version: Double
  ): MetadataInterface = {
    val __obj = js.Dynamic.literal(created_by = created_by.asInstanceOf[js.Any], key_value_metadata = key_value_metadata.asInstanceOf[js.Any], num_rows = num_rows.asInstanceOf[js.Any], row_groups = row_groups.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataInterface]
  }
  @scala.inline
  implicit class MetadataInterfaceOps[Self <: MetadataInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated_by(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_by")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey_value_metadata(value: js.Array[Key]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key_value_metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNum_rows(value: ^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRow_groups(value: js.Array[MetadataRowGroupsInterface]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row_groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchema(value: js.Array[MetadataSchemaInterface]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

