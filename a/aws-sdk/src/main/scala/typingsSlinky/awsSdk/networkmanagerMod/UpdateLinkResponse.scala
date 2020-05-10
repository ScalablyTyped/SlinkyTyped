package typingsSlinky.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateLinkResponse extends js.Object {
  /**
    * Information about the link.
    */
  var Link: js.UndefOr[typingsSlinky.awsSdk.networkmanagerMod.Link] = js.native
}

object UpdateLinkResponse {
  @scala.inline
  def apply(): UpdateLinkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateLinkResponse]
  }
  @scala.inline
  implicit class UpdateLinkResponseOps[Self <: UpdateLinkResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLink(value: Link): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Link")(js.undefined)
        ret
    }
  }
  
}

