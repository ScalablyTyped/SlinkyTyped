package typingsSlinky.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSupportedResourceTypesOutput extends js.Object {
  /**
    * Contains a string with the supported AWS resource types:    EBS for Amazon Elastic Block Store    Storage Gateway for AWS Storage Gateway    RDS for Amazon Relational Database Service    DDB for Amazon DynamoDB    EFS for Amazon Elastic File System  
    */
  var ResourceTypes: js.UndefOr[typingsSlinky.awsSdk.backupMod.ResourceTypes] = js.native
}

object GetSupportedResourceTypesOutput {
  @scala.inline
  def apply(): GetSupportedResourceTypesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSupportedResourceTypesOutput]
  }
  @scala.inline
  implicit class GetSupportedResourceTypesOutputOps[Self <: GetSupportedResourceTypesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceTypes(value: ResourceTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceTypes")(js.undefined)
        ret
    }
  }
  
}

