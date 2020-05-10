package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIdentityDkimAttributesResponse extends js.Object {
  /**
    * The DKIM attributes for an email address or a domain.
    */
  var DkimAttributes: typingsSlinky.awsSdk.sesMod.DkimAttributes = js.native
}

object GetIdentityDkimAttributesResponse {
  @scala.inline
  def apply(DkimAttributes: DkimAttributes): GetIdentityDkimAttributesResponse = {
    val __obj = js.Dynamic.literal(DkimAttributes = DkimAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityDkimAttributesResponse]
  }
  @scala.inline
  implicit class GetIdentityDkimAttributesResponseOps[Self <: GetIdentityDkimAttributesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDkimAttributes(value: DkimAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DkimAttributes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

