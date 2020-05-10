package typingsSlinky.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSchemaVersionRequest extends js.Object {
  var RegistryName: string = js.native
  var SchemaName: string = js.native
  var SchemaVersion: string = js.native
}

object DeleteSchemaVersionRequest {
  @scala.inline
  def apply(RegistryName: string, SchemaName: string, SchemaVersion: string): DeleteSchemaVersionRequest = {
    val __obj = js.Dynamic.literal(RegistryName = RegistryName.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any], SchemaVersion = SchemaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSchemaVersionRequest]
  }
  @scala.inline
  implicit class DeleteSchemaVersionRequestOps[Self <: DeleteSchemaVersionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegistryName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegistryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchemaName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchemaVersion(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaVersion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

