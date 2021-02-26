package typingsSlinky.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MySqlReplicaConfiguration extends StObject {
  
  /** PEM representation of the trusted CA's x509 certificate. */
  var caCertificate: js.UndefOr[String] = js.native
  
  /** PEM representation of the replica's x509 certificate. */
  var clientCertificate: js.UndefOr[String] = js.native
  
  /** PEM representation of the replica's private key. The corresponsing public key is encoded in the client's certificate. */
  var clientKey: js.UndefOr[String] = js.native
  
  /** Seconds to wait between connect retries. MySQL's default is 60 seconds. */
  var connectRetryInterval: js.UndefOr[Double] = js.native
  
  /**
    * Path to a SQL dump file in Google Cloud Storage from which the replica instance is to be created. The URI is in the form gs://bucketName/fileName. Compressed gzip files (.gz) are
    * also supported. Dumps have the binlog co-ordinates from which replication begins. This can be accomplished by setting --master-data to 1 when using mysqldump.
    */
  var dumpFilePath: js.UndefOr[String] = js.native
  
  /** This is always *sql#mysqlReplicaConfiguration*. */
  var kind: js.UndefOr[String] = js.native
  
  /** Interval in milliseconds between replication heartbeats. */
  var masterHeartbeatPeriod: js.UndefOr[String] = js.native
  
  /** The password for the replication connection. */
  var password: js.UndefOr[String] = js.native
  
  /** A list of permissible ciphers to use for SSL encryption. */
  var sslCipher: js.UndefOr[String] = js.native
  
  /** The username for the replication connection. */
  var username: js.UndefOr[String] = js.native
  
  /** Whether or not to check the primary instance's Common Name value in the certificate that it sends during the SSL handshake. */
  var verifyServerCertificate: js.UndefOr[Boolean] = js.native
}
object MySqlReplicaConfiguration {
  
  @scala.inline
  def apply(): MySqlReplicaConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MySqlReplicaConfiguration]
  }
  
  @scala.inline
  implicit class MySqlReplicaConfigurationMutableBuilder[Self <: MySqlReplicaConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaCertificate(value: String): Self = StObject.set(x, "caCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaCertificateUndefined: Self = StObject.set(x, "caCertificate", js.undefined)
    
    @scala.inline
    def setClientCertificate(value: String): Self = StObject.set(x, "clientCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientCertificateUndefined: Self = StObject.set(x, "clientCertificate", js.undefined)
    
    @scala.inline
    def setClientKey(value: String): Self = StObject.set(x, "clientKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientKeyUndefined: Self = StObject.set(x, "clientKey", js.undefined)
    
    @scala.inline
    def setConnectRetryInterval(value: Double): Self = StObject.set(x, "connectRetryInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectRetryIntervalUndefined: Self = StObject.set(x, "connectRetryInterval", js.undefined)
    
    @scala.inline
    def setDumpFilePath(value: String): Self = StObject.set(x, "dumpFilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDumpFilePathUndefined: Self = StObject.set(x, "dumpFilePath", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMasterHeartbeatPeriod(value: String): Self = StObject.set(x, "masterHeartbeatPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterHeartbeatPeriodUndefined: Self = StObject.set(x, "masterHeartbeatPeriod", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setSslCipher(value: String): Self = StObject.set(x, "sslCipher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslCipherUndefined: Self = StObject.set(x, "sslCipher", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    @scala.inline
    def setVerifyServerCertificate(value: Boolean): Self = StObject.set(x, "verifyServerCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifyServerCertificateUndefined: Self = StObject.set(x, "verifyServerCertificate", js.undefined)
  }
}
