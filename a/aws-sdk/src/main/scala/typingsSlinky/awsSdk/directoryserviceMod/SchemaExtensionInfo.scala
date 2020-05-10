package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaExtensionInfo extends js.Object {
  /**
    * A description of the schema extension.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.Description] = js.native
  /**
    * The identifier of the directory to which the schema extension is applied.
    */
  var DirectoryId: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.DirectoryId] = js.native
  /**
    * The date and time that the schema extension was completed.
    */
  var EndDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The identifier of the schema extension.
    */
  var SchemaExtensionId: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.SchemaExtensionId] = js.native
  /**
    * The current status of the schema extension.
    */
  var SchemaExtensionStatus: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.SchemaExtensionStatus] = js.native
  /**
    * The reason for the SchemaExtensionStatus.
    */
  var SchemaExtensionStatusReason: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.SchemaExtensionStatusReason] = js.native
  /**
    * The date and time that the schema extension started being applied to the directory.
    */
  var StartDateTime: js.UndefOr[js.Date] = js.native
}

object SchemaExtensionInfo {
  @scala.inline
  def apply(): SchemaExtensionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExtensionInfo]
  }
  @scala.inline
  implicit class SchemaExtensionInfoOps[Self <: SchemaExtensionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectoryId(value: DirectoryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryId")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaExtensionId(value: SchemaExtensionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaExtensionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaExtensionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaExtensionId")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaExtensionStatus(value: SchemaExtensionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaExtensionStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaExtensionStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaExtensionStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaExtensionStatusReason(value: SchemaExtensionStatusReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaExtensionStatusReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaExtensionStatusReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaExtensionStatusReason")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartDateTime")(js.undefined)
        ret
    }
  }
  
}

