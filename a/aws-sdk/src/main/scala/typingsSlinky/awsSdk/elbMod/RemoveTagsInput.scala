package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveTagsInput extends js.Object {
  /**
    * The name of the load balancer. You can specify a maximum of one load balancer name.
    */
  var LoadBalancerNames: typingsSlinky.awsSdk.elbMod.LoadBalancerNames = js.native
  /**
    * The list of tag keys to remove.
    */
  var Tags: TagKeyList = js.native
}

object RemoveTagsInput {
  @scala.inline
  def apply(LoadBalancerNames: LoadBalancerNames, Tags: TagKeyList): RemoveTagsInput = {
    val __obj = js.Dynamic.literal(LoadBalancerNames = LoadBalancerNames.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsInput]
  }
  @scala.inline
  implicit class RemoveTagsInputOps[Self <: RemoveTagsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadBalancerNames(value: LoadBalancerNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadBalancerNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: TagKeyList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

