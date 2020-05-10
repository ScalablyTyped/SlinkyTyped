package typingsSlinky.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateLinkResponse extends js.Object {
  /**
    * The link association.
    */
  var LinkAssociation: js.UndefOr[typingsSlinky.awsSdk.networkmanagerMod.LinkAssociation] = js.native
}

object AssociateLinkResponse {
  @scala.inline
  def apply(): AssociateLinkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateLinkResponse]
  }
  @scala.inline
  implicit class AssociateLinkResponseOps[Self <: AssociateLinkResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLinkAssociation(value: LinkAssociation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkAssociation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkAssociation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkAssociation")(js.undefined)
        ret
    }
  }
  
}

