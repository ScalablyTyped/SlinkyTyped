package typingsSlinky.awsSdk.resourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Summary extends js.Object {
  /**
    * The timestamp that shows when this summary was generated in this Region. 
    */
  var LastUpdated: js.UndefOr[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.LastUpdated] = js.native
  /**
    * The count of noncompliant resources.
    */
  var NonCompliantResources: js.UndefOr[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.NonCompliantResources] = js.native
  /**
    * The AWS Region that the summary applies to.
    */
  var Region: js.UndefOr[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.Region] = js.native
  /**
    * The AWS resource type.
    */
  var ResourceType: js.UndefOr[AmazonResourceType] = js.native
  /**
    * The account identifier or the root identifier of the organization. If you don't know the root ID, you can call the AWS Organizations ListRoots API.
    */
  var TargetId: js.UndefOr[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.TargetId] = js.native
  /**
    * Whether the target is an account, an OU, or the organization root.
    */
  var TargetIdType: js.UndefOr[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.TargetIdType] = js.native
}

object Summary {
  @scala.inline
  def apply(): Summary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Summary]
  }
  @scala.inline
  implicit class SummaryOps[Self <: Summary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastUpdated(value: LastUpdated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withNonCompliantResources(value: NonCompliantResources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NonCompliantResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonCompliantResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NonCompliantResources")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: Region): Self = {
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
    def withResourceType(value: AmazonResourceType): Self = {
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
    @scala.inline
    def withTargetId(value: TargetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetId")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetIdType(value: TargetIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetIdType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetIdType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetIdType")(js.undefined)
        ret
    }
  }
  
}

