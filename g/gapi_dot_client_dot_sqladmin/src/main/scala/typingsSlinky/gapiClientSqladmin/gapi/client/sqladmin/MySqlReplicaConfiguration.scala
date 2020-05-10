package typingsSlinky.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MySqlReplicaConfiguration extends js.Object {
  /** PEM representation of the trusted CA's x509 certificate. */
  var caCertificate: js.UndefOr[String] = js.native
  /** PEM representation of the slave's x509 certificate. */
  var clientCertificate: js.UndefOr[String] = js.native
  /** PEM representation of the slave's private key. The corresponsing public key is encoded in the client's certificate. */
  var clientKey: js.UndefOr[String] = js.native
  /** Seconds to wait between connect retries. MySQL's default is 60 seconds. */
  var connectRetryInterval: js.UndefOr[Double] = js.native
  /**
    * Path to a SQL dump file in Google Cloud Storage from which the slave instance is to be created. The URI is in the form gs://bucketName/fileName.
    * Compressed gzip files (.gz) are also supported. Dumps should have the binlog co-ordinates from which replication should begin. This can be accomplished
    * by setting --master-data to 1 when using mysqldump.
    */
  var dumpFilePath: js.UndefOr[String] = js.native
  /** This is always sql#mysqlReplicaConfiguration. */
  var kind: js.UndefOr[String] = js.native
  /** Interval in milliseconds between replication heartbeats. */
  var masterHeartbeatPeriod: js.UndefOr[String] = js.native
  /** The password for the replication connection. */
  var password: js.UndefOr[String] = js.native
  /** A list of permissible ciphers to use for SSL encryption. */
  var sslCipher: js.UndefOr[String] = js.native
  /** The username for the replication connection. */
  var username: js.UndefOr[String] = js.native
  /** Whether or not to check the master's Common Name value in the certificate that it sends during the SSL handshake. */
  var verifyServerCertificate: js.UndefOr[Boolean] = js.native
}

object MySqlReplicaConfiguration {
  @scala.inline
  def apply(): MySqlReplicaConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MySqlReplicaConfiguration]
  }
  @scala.inline
  implicit class MySqlReplicaConfigurationOps[Self <: MySqlReplicaConfiguration] (val x: Self) extends AnyVal {
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
    def withConnectRetryInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectRetryInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectRetryInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectRetryInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withDumpFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dumpFilePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDumpFilePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dumpFilePath")(js.undefined)
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
    def withMasterHeartbeatPeriod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterHeartbeatPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterHeartbeatPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterHeartbeatPeriod")(js.undefined)
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
    def withSslCipher(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslCipher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslCipher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslCipher")(js.undefined)
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
    @scala.inline
    def withVerifyServerCertificate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyServerCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerifyServerCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyServerCertificate")(js.undefined)
        ret
    }
  }
  
}

