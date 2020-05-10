package typingsSlinky.nodeForge

import typingsSlinky.nodeForge.mod.pki.Certificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAuthenticatedAttributes extends js.Object {
  var authenticatedAttributes: js.Array[AnonType] = js.native
  var certificate: Certificate | String = js.native
  var digestAlgorithm: String = js.native
  var key: String = js.native
}

object AnonAuthenticatedAttributes {
  @scala.inline
  def apply(
    authenticatedAttributes: js.Array[AnonType],
    certificate: Certificate | String,
    digestAlgorithm: String,
    key: String
  ): AnonAuthenticatedAttributes = {
    val __obj = js.Dynamic.literal(authenticatedAttributes = authenticatedAttributes.asInstanceOf[js.Any], certificate = certificate.asInstanceOf[js.Any], digestAlgorithm = digestAlgorithm.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthenticatedAttributes]
  }
  @scala.inline
  implicit class AnonAuthenticatedAttributesOps[Self <: AnonAuthenticatedAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthenticatedAttributes(value: js.Array[AnonType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticatedAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCertificate(value: Certificate | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDigestAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digestAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

