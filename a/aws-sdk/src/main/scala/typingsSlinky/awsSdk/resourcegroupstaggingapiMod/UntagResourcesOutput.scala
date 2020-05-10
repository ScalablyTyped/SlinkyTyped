package typingsSlinky.awsSdk.resourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourcesOutput extends js.Object {
  /**
    * Details of resources that could not be untagged. An error code, status code, and error message are returned for each failed item. 
    */
  var FailedResourcesMap: js.UndefOr[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.FailedResourcesMap] = js.native
}

object UntagResourcesOutput {
  @scala.inline
  def apply(): UntagResourcesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UntagResourcesOutput]
  }
  @scala.inline
  implicit class UntagResourcesOutputOps[Self <: UntagResourcesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailedResourcesMap(value: FailedResourcesMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedResourcesMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedResourcesMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedResourcesMap")(js.undefined)
        ret
    }
  }
  
}

