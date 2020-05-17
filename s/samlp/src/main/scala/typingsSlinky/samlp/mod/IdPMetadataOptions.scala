package typingsSlinky.samlp.mod

import typingsSlinky.node.Buffer
import typingsSlinky.samlp.anon.Post
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdPMetadataOptions extends js.Object {
  var cert: String | Buffer = js.native
  var issuer: String = js.native
  var logoutEndpointPaths: js.UndefOr[Post] = js.native
  var postEndpointPath: js.UndefOr[String] = js.native
  var profileMapper: js.UndefOr[ProfileMapperConstructor] = js.native
  var redirectEndpointPath: js.UndefOr[String] = js.native
}

object IdPMetadataOptions {
  @scala.inline
  def apply(cert: String | Buffer, issuer: String): IdPMetadataOptions = {
    val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdPMetadataOptions]
  }
  @scala.inline
  implicit class IdPMetadataOptionsOps[Self <: IdPMetadataOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCert(value: String | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssuer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogoutEndpointPaths(value: Post): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logoutEndpointPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogoutEndpointPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logoutEndpointPaths")(js.undefined)
        ret
    }
    @scala.inline
    def withPostEndpointPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postEndpointPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostEndpointPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postEndpointPath")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileMapper(value: ProfileMapperConstructor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileMapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileMapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileMapper")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirectEndpointPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectEndpointPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectEndpointPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectEndpointPath")(js.undefined)
        ret
    }
  }
  
}

