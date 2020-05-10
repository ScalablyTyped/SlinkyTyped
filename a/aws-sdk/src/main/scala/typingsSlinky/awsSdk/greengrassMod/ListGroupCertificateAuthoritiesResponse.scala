package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGroupCertificateAuthoritiesResponse extends js.Object {
  /**
    * A list of certificate authorities associated with the group.
    */
  var GroupCertificateAuthorities: js.UndefOr[listOfGroupCertificateAuthorityProperties] = js.native
}

object ListGroupCertificateAuthoritiesResponse {
  @scala.inline
  def apply(): ListGroupCertificateAuthoritiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGroupCertificateAuthoritiesResponse]
  }
  @scala.inline
  implicit class ListGroupCertificateAuthoritiesResponseOps[Self <: ListGroupCertificateAuthoritiesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupCertificateAuthorities(value: listOfGroupCertificateAuthorityProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupCertificateAuthorities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupCertificateAuthorities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupCertificateAuthorities")(js.undefined)
        ret
    }
  }
  
}

