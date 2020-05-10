package typingsSlinky.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResourcesForWebACLResponse extends js.Object {
  /**
    * The array of Amazon Resource Names (ARNs) of the associated resources.
    */
  var ResourceArns: js.UndefOr[typingsSlinky.awsSdk.wafv2Mod.ResourceArns] = js.native
}

object ListResourcesForWebACLResponse {
  @scala.inline
  def apply(): ListResourcesForWebACLResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourcesForWebACLResponse]
  }
  @scala.inline
  implicit class ListResourcesForWebACLResponseOps[Self <: ListResourcesForWebACLResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceArns(value: ResourceArns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceArns")(js.undefined)
        ret
    }
  }
  
}

