package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceCountFilters extends js.Object {
  /**
    * The 12-digit ID of the account.
    */
  var AccountId: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.AccountId] = js.native
  /**
    * The region where the account is located.
    */
  var Region: js.UndefOr[AwsRegion] = js.native
  /**
    * The type of the AWS resource.
    */
  var ResourceType: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ResourceType] = js.native
}

object ResourceCountFilters {
  @scala.inline
  def apply(): ResourceCountFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceCountFilters]
  }
  @scala.inline
  implicit class ResourceCountFiltersOps[Self <: ResourceCountFilters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: AccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: AwsRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Region")(js.undefined)
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

