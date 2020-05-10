package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordingGroup extends js.Object {
  /**
    * Specifies whether AWS Config records configuration changes for every supported type of regional resource. If you set this option to true, when AWS Config adds support for a new type of regional resource, it starts recording resources of that type automatically. If you set this option to true, you cannot enumerate a list of resourceTypes.
    */
  var allSupported: js.UndefOr[AllSupported] = js.native
  /**
    * Specifies whether AWS Config includes all supported types of global resources (for example, IAM resources) with the resources that it records. Before you can set this option to true, you must set the allSupported option to true. If you set this option to true, when AWS Config adds support for a new type of global resource, it starts recording resources of that type automatically. The configuration details for any global resource are the same in all regions. To prevent duplicate configuration items, you should consider customizing AWS Config in only one region to record global resources.
    */
  var includeGlobalResourceTypes: js.UndefOr[IncludeGlobalResourceTypes] = js.native
  /**
    * A comma-separated list that specifies the types of AWS resources for which AWS Config records configuration changes (for example, AWS::EC2::Instance or AWS::CloudTrail::Trail). Before you can set this option to true, you must set the allSupported option to false. If you set this option to true, when AWS Config adds support for a new type of resource, it will not record resources of that type unless you manually add that type to your recording group. For a list of valid resourceTypes values, see the resourceType Value column in Supported AWS Resource Types.
    */
  var resourceTypes: js.UndefOr[ResourceTypeList] = js.native
}

object RecordingGroup {
  @scala.inline
  def apply(): RecordingGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordingGroup]
  }
  @scala.inline
  implicit class RecordingGroupOps[Self <: RecordingGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllSupported(value: AllSupported): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllSupported: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allSupported")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeGlobalResourceTypes(value: IncludeGlobalResourceTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeGlobalResourceTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeGlobalResourceTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeGlobalResourceTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceTypes(value: ResourceTypeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceTypes")(js.undefined)
        ret
    }
  }
  
}

