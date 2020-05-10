package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenIDConnectProviderListEntry extends js.Object {
  var Arn: js.UndefOr[arnType] = js.native
}

object OpenIDConnectProviderListEntry {
  @scala.inline
  def apply(): OpenIDConnectProviderListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenIDConnectProviderListEntry]
  }
  @scala.inline
  implicit class OpenIDConnectProviderListEntryOps[Self <: OpenIDConnectProviderListEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: arnType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
  }
  
}

