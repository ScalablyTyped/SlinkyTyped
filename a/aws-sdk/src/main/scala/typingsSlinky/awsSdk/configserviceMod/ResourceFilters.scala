package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceFilters extends js.Object {
  /**
    * The 12-digit source account ID.
    */
  var AccountId: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.AccountId] = js.native
  /**
    * The source region.
    */
  var Region: js.UndefOr[AwsRegion] = js.native
  /**
    * The ID of the resource.
    */
  var ResourceId: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ResourceId] = js.native
  /**
    * The name of the resource.
    */
  var ResourceName: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ResourceName] = js.native
}

object ResourceFilters {
  @scala.inline
  def apply(): ResourceFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceFilters]
  }
  @scala.inline
  implicit class ResourceFiltersOps[Self <: ResourceFilters] (val x: Self) extends AnyVal {
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
    def withResourceId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceName")(js.undefined)
        ret
    }
  }
  
}

