package typingsSlinky.pulumiAws.inputMod.eks

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterIdentityOidc extends js.Object {
  /**
    * Issuer URL for the OpenID Connect identity provider.
    */
  var issuer: js.UndefOr[Input[String]] = js.native
}

object ClusterIdentityOidc {
  @scala.inline
  def apply(): ClusterIdentityOidc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterIdentityOidc]
  }
  @scala.inline
  implicit class ClusterIdentityOidcOps[Self <: ClusterIdentityOidc] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIssuer(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssuer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(js.undefined)
        ret
    }
  }
  
}

