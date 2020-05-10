package typingsSlinky.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LicenseOperationFailure extends js.Object {
  /**
    * Error message.
    */
  var ErrorMessage: js.UndefOr[String] = js.native
  /**
    * Failure time.
    */
  var FailureTime: js.UndefOr[js.Date] = js.native
  /**
    * Reserved.
    */
  var MetadataList: js.UndefOr[typingsSlinky.awsSdk.licensemanagerMod.MetadataList] = js.native
  /**
    * Name of the operation.
    */
  var OperationName: js.UndefOr[String] = js.native
  /**
    * The requester is "License Manager Automated Discovery".
    */
  var OperationRequestedBy: js.UndefOr[String] = js.native
  /**
    * Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArn: js.UndefOr[String] = js.native
  /**
    * ID of the AWS account that owns the resource.
    */
  var ResourceOwnerId: js.UndefOr[String] = js.native
  /**
    * Resource type.
    */
  var ResourceType: js.UndefOr[typingsSlinky.awsSdk.licensemanagerMod.ResourceType] = js.native
}

object LicenseOperationFailure {
  @scala.inline
  def apply(): LicenseOperationFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseOperationFailure]
  }
  @scala.inline
  implicit class LicenseOperationFailureOps[Self <: LicenseOperationFailure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadataList(value: MetadataList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetadataList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadataList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetadataList")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationName")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationRequestedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationRequestedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationRequestedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationRequestedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceOwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceOwnerId")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: ResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(js.undefined)
        ret
    }
  }
  
}

