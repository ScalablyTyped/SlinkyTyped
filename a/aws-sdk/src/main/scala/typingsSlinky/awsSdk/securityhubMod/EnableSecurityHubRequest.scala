package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableSecurityHubRequest extends js.Object {
  /**
    * The tags to add to the Hub resource when you enable Security Hub.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}

object EnableSecurityHubRequest {
  @scala.inline
  def apply(): EnableSecurityHubRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableSecurityHubRequest]
  }
  @scala.inline
  implicit class EnableSecurityHubRequestOps[Self <: EnableSecurityHubRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTags(value: TagMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

