package typingsSlinky.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Read-replica configuration specific to MySQL databases.
  */
@js.native
trait SchemaDemoteMasterMySqlReplicaConfiguration extends js.Object {
  /**
    * PEM representation of the trusted CA&#39;s x509 certificate.
    */
  var caCertificate: js.UndefOr[String] = js.native
  /**
    * PEM representation of the slave&#39;s x509 certificate.
    */
  var clientCertificate: js.UndefOr[String] = js.native
  /**
    * PEM representation of the slave&#39;s private key. The corresponsing
    * public key is encoded in the client&#39;s certificate. The format of the
    * slave&#39;s private key can be either PKCS #1 or PKCS #8.
    */
  var clientKey: js.UndefOr[String] = js.native
  /**
    * This is always sql#demoteMasterMysqlReplicaConfiguration.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The password for the replication connection.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * The username for the replication connection.
    */
  var username: js.UndefOr[String] = js.native
}

object SchemaDemoteMasterMySqlReplicaConfiguration {
  @scala.inline
  def apply(): SchemaDemoteMasterMySqlReplicaConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDemoteMasterMySqlReplicaConfiguration]
  }
  @scala.inline
  implicit class SchemaDemoteMasterMySqlReplicaConfigurationOps[Self <: SchemaDemoteMasterMySqlReplicaConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaCertificate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caCertificate")(js.undefined)
        ret
    }
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
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
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

