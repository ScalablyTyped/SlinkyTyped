package typingsSlinky.googleapis.containerV1Mod.containerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The authentication information for accessing the master endpoint.
  * Authentication can be done using HTTP basic auth or using client
  * certificates.
  */
@js.native
trait SchemaMasterAuth extends js.Object {
  /**
    * [Output only] Base64-encoded public certificate used by clients to
    * authenticate to the cluster endpoint.
    */
  var clientCertificate: js.UndefOr[String] = js.native
  /**
    * Configuration for client certificate authentication on the cluster. For
    * clusters before v1.12, if no configuration is specified, a client
    * certificate is issued.
    */
  var clientCertificateConfig: js.UndefOr[SchemaClientCertificateConfig] = js.native
  /**
    * [Output only] Base64-encoded private key used by clients to authenticate
    * to the cluster endpoint.
    */
  var clientKey: js.UndefOr[String] = js.native
  /**
    * [Output only] Base64-encoded public certificate that is the root of trust
    * for the cluster.
    */
  var clusterCaCertificate: js.UndefOr[String] = js.native
  /**
    * The password to use for HTTP basic authentication to the master endpoint.
    * Because the master endpoint is open to the Internet, you should create a
    * strong password.  If a password is provided for cluster creation,
    * username must be non-empty.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * The username to use for HTTP basic authentication to the master endpoint.
    * For clusters v1.6.0 and later, basic authentication can be disabled by
    * leaving username unspecified (or setting it to the empty string).
    */
  var username: js.UndefOr[String] = js.native
}

object SchemaMasterAuth {
  @scala.inline
  def apply(): SchemaMasterAuth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMasterAuth]
  }
  @scala.inline
  implicit class SchemaMasterAuthOps[Self <: SchemaMasterAuth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientCertificate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientCertificate")(js.undefined)
        ret
    }
    @scala.inline
    def withClientCertificateConfig(value: SchemaClientCertificateConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientCertificateConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientCertificateConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientCertificateConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withClientKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientKey")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterCaCertificate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterCaCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterCaCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterCaCertificate")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
  }
  
}

