package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelSchemaExtensionRequest extends js.Object {
  /**
    * The identifier of the directory whose schema extension will be canceled.
    */
  var DirectoryId: typingsSlinky.awsSdk.directoryserviceMod.DirectoryId = js.native
  /**
    * The identifier of the schema extension that will be canceled.
    */
  var SchemaExtensionId: typingsSlinky.awsSdk.directoryserviceMod.SchemaExtensionId = js.native
}

object CancelSchemaExtensionRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, SchemaExtensionId: SchemaExtensionId): CancelSchemaExtensionRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], SchemaExtensionId = SchemaExtensionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelSchemaExtensionRequest]
  }
  @scala.inline
  implicit class CancelSchemaExtensionRequestOps[Self <: CancelSchemaExtensionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectoryId(value: DirectoryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchemaExtensionId(value: SchemaExtensionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaExtensionId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

