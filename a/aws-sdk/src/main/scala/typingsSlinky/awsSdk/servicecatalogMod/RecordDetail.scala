package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordDetail extends js.Object {
  /**
    * The UTC time stamp of the creation time.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.native
  /**
    * The path identifier.
    */
  var PathId: js.UndefOr[Id] = js.native
  /**
    * The product identifier.
    */
  var ProductId: js.UndefOr[Id] = js.native
  /**
    * The identifier of the provisioned product.
    */
  var ProvisionedProductId: js.UndefOr[Id] = js.native
  /**
    * The user-friendly name of the provisioned product.
    */
  var ProvisionedProductName: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ProvisionedProductName] = js.native
  /**
    * The type of provisioned product. The supported values are CFN_STACK and CFN_STACKSET.
    */
  var ProvisionedProductType: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ProvisionedProductType] = js.native
  /**
    * The identifier of the provisioning artifact.
    */
  var ProvisioningArtifactId: js.UndefOr[Id] = js.native
  /**
    * The errors that occurred.
    */
  var RecordErrors: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.RecordErrors] = js.native
  /**
    * The identifier of the record.
    */
  var RecordId: js.UndefOr[Id] = js.native
  /**
    * One or more tags.
    */
  var RecordTags: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.RecordTags] = js.native
  /**
    * The record type.    PROVISION_PRODUCT     UPDATE_PROVISIONED_PRODUCT     TERMINATE_PROVISIONED_PRODUCT   
    */
  var RecordType: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.RecordType] = js.native
  /**
    * The status of the provisioned product.    CREATED - The request was created but the operation has not started.    IN_PROGRESS - The requested operation is in progress.    IN_PROGRESS_IN_ERROR - The provisioned product is under change but the requested operation failed and some remediation is occurring. For example, a rollback.    SUCCEEDED - The requested operation has successfully completed.    FAILED - The requested operation has unsuccessfully completed. Investigate using the error messages returned.  
    */
  var Status: js.UndefOr[RecordStatus] = js.native
  /**
    * The time when the record was last updated.
    */
  var UpdatedTime: js.UndefOr[js.Date] = js.native
}

object RecordDetail {
  @scala.inline
  def apply(): RecordDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordDetail]
  }
  @scala.inline
  implicit class RecordDetailOps[Self <: RecordDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withPathId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PathId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PathId")(js.undefined)
        ret
    }
    @scala.inline
    def withProductId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductId")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisionedProductId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedProductId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisionedProductId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedProductId")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisionedProductName(value: ProvisionedProductName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedProductName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisionedProductName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedProductName")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisionedProductType(value: ProvisionedProductType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedProductType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisionedProductType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedProductType")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisioningArtifactId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisioningArtifactId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisioningArtifactId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisioningArtifactId")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordErrors(value: RecordErrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordId")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordTags(value: RecordTags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordTags")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordType(value: RecordType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordType")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: RecordStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedTime")(js.undefined)
        ret
    }
  }
  
}

