package typingsSlinky.jsforce.createOptionsMod

import typingsSlinky.jsforce.salesforceIdMod.SalesforceId
import typingsSlinky.jsforce.salesforceObjectOptionsMod.SObjectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SObjectCreateOptions extends SObjectOptions {
  var AccountSource: js.UndefOr[String] = js.native
  var BillingCity: js.UndefOr[String] = js.native
  var BillingCountry: js.UndefOr[String] = js.native
  var BillingLatitude: js.UndefOr[Double] = js.native
  var BillingLongitude: js.UndefOr[Double] = js.native
  var BillingPostalCode: js.UndefOr[String] = js.native
  var BillingState: js.UndefOr[String] = js.native
  var BillingStreet: js.UndefOr[String] = js.native
  var CreatedById: js.UndefOr[SalesforceId] = js.native
  var CreatedDate: js.UndefOr[js.Date] = js.native
  var Description: js.UndefOr[String] = js.native
  var Industry: js.UndefOr[String] = js.native
  var IsDeleted: js.UndefOr[Boolean] = js.native
  var Jigsaw: js.UndefOr[String] = js.native
  var JigsawCompanyId: js.UndefOr[String] = js.native
  var LastActivityDate: js.UndefOr[js.Date] = js.native
  var LastModifiedById: js.UndefOr[SalesforceId] = js.native
  var LastModifiedDate: js.UndefOr[js.Date] = js.native
  var LastReferencedDate: js.UndefOr[js.Date] = js.native
  var LastViewedDate: js.UndefOr[js.Date] = js.native
  var MasterRecordId: js.UndefOr[SalesforceId] = js.native
  var NumberOfEmployees: js.UndefOr[Double] = js.native
  var OwnerId: js.UndefOr[SalesforceId] = js.native
  var ParentId: js.UndefOr[SalesforceId] = js.native
  var Phone: js.UndefOr[String] = js.native
  var ShippingCity: js.UndefOr[String] = js.native
  var ShippingCountry: js.UndefOr[String] = js.native
  var ShippingLatitude: js.UndefOr[Double] = js.native
  var ShippingLongitude: js.UndefOr[Double] = js.native
  var ShippingPostalCode: js.UndefOr[String] = js.native
  var ShippingState: js.UndefOr[String] = js.native
  var ShippingStreet: js.UndefOr[String] = js.native
  var SicDesc: js.UndefOr[String] = js.native
  var SystemModstamp: js.UndefOr[js.Date] = js.native
  var Type: js.UndefOr[String] = js.native
  var Website: js.UndefOr[String] = js.native
}

object SObjectCreateOptions {
  @scala.inline
  def apply(): SObjectCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SObjectCreateOptions]
  }
  @scala.inline
  implicit class SObjectCreateOptionsOps[Self <: SObjectCreateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountSource")(js.undefined)
        ret
    }
    @scala.inline
    def withBillingCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BillingCity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingCity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BillingCity")(js.undefined)
        ret
    }
    @scala.inline
    def withBillingCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BillingCountry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BillingCountry")(js.undefined)
        ret
    }
    @scala.inline
    def withBillingLatitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BillingLatitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingLatitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BillingLatitude")(js.undefined)
        ret
    }
    @scala.inline
    def withBillingLongitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BillingLongitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingLongitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BillingLongitude")(js.undefined)
        ret
    }
    @scala.inline
    def withBillingPostalCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BillingPostalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingPostalCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BillingPostalCode")(js.undefined)
        ret
    }
    @scala.inline
    def withBillingState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BillingState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BillingState")(js.undefined)
        ret
    }
    @scala.inline
    def withBillingStreet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BillingStreet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingStreet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BillingStreet")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedById(value: SalesforceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedById")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedById: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedById")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
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
    def withIndustry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Industry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndustry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Industry")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsDeleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsDeleted")(js.undefined)
        ret
    }
    @scala.inline
    def withJigsaw(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Jigsaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJigsaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Jigsaw")(js.undefined)
        ret
    }
    @scala.inline
    def withJigsawCompanyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JigsawCompanyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJigsawCompanyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JigsawCompanyId")(js.undefined)
        ret
    }
    @scala.inline
    def withLastActivityDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastActivityDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastActivityDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastActivityDate")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedById(value: SalesforceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedById")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedById: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedById")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withLastReferencedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastReferencedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastReferencedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastReferencedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withLastViewedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastViewedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastViewedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastViewedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterRecordId(value: SalesforceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MasterRecordId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterRecordId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MasterRecordId")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfEmployees(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfEmployees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfEmployees: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfEmployees")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerId(value: SalesforceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(js.undefined)
        ret
    }
    @scala.inline
    def withParentId(value: SalesforceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentId")(js.undefined)
        ret
    }
    @scala.inline
    def withPhone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Phone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Phone")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShippingCity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingCity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShippingCity")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShippingCountry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShippingCountry")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingLatitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShippingLatitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingLatitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShippingLatitude")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingLongitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShippingLongitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingLongitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShippingLongitude")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingPostalCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShippingPostalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingPostalCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShippingPostalCode")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShippingState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShippingState")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingStreet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShippingStreet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingStreet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShippingStreet")(js.undefined)
        ret
    }
    @scala.inline
    def withSicDesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SicDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSicDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SicDesc")(js.undefined)
        ret
    }
    @scala.inline
    def withSystemModstamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SystemModstamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystemModstamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SystemModstamp")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
    @scala.inline
    def withWebsite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Website")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebsite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Website")(js.undefined)
        ret
    }
  }
  
}

