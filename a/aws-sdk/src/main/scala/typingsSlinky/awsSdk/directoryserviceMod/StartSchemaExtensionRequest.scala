package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartSchemaExtensionRequest extends js.Object {
  /**
    * If true, creates a snapshot of the directory before applying the schema extension.
    */
  var CreateSnapshotBeforeSchemaExtension: typingsSlinky.awsSdk.directoryserviceMod.CreateSnapshotBeforeSchemaExtension = js.native
  /**
    * A description of the schema extension.
    */
  var Description: typingsSlinky.awsSdk.directoryserviceMod.Description = js.native
  /**
    * The identifier of the directory for which the schema extension will be applied to.
    */
  var DirectoryId: typingsSlinky.awsSdk.directoryserviceMod.DirectoryId = js.native
  /**
    * The LDIF file represented as a string. To construct the LdifContent string, precede each line as it would be formatted in an ldif file with \n. See the example request below for more details. The file size can be no larger than 1MB.
    */
  var LdifContent: typingsSlinky.awsSdk.directoryserviceMod.LdifContent = js.native
}

object StartSchemaExtensionRequest {
  @scala.inline
  def apply(
    CreateSnapshotBeforeSchemaExtension: CreateSnapshotBeforeSchemaExtension,
    Description: Description,
    DirectoryId: DirectoryId,
    LdifContent: LdifContent
  ): StartSchemaExtensionRequest = {
    val __obj = js.Dynamic.literal(CreateSnapshotBeforeSchemaExtension = CreateSnapshotBeforeSchemaExtension.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], DirectoryId = DirectoryId.asInstanceOf[js.Any], LdifContent = LdifContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSchemaExtensionRequest]
  }
  @scala.inline
  implicit class StartSchemaExtensionRequestOps[Self <: StartSchemaExtensionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateSnapshotBeforeSchemaExtension(value: CreateSnapshotBeforeSchemaExtension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateSnapshotBeforeSchemaExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectoryId(value: DirectoryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLdifContent(value: LdifContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LdifContent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

