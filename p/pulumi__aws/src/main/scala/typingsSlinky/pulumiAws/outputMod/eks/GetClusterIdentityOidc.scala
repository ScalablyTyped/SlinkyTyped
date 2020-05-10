package typingsSlinky.pulumiAws.outputMod.eks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClusterIdentityOidc extends js.Object {
  /**
    * Issuer URL for the OpenID Connect identity provider.
    */
  var issuer: String = js.native
}

object GetClusterIdentityOidc {
  @scala.inline
  def apply(issuer: String): GetClusterIdentityOidc = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClusterIdentityOidc]
  }
  @scala.inline
  implicit class GetClusterIdentityOidcOps[Self <: GetClusterIdentityOidc] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIssuer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

