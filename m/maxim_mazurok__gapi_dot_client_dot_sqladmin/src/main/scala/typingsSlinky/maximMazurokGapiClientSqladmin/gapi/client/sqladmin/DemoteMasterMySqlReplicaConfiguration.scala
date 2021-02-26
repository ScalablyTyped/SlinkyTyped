package typingsSlinky.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DemoteMasterMySqlReplicaConfiguration extends StObject {
  
  /** PEM representation of the trusted CA's x509 certificate. */
  var caCertificate: js.UndefOr[String] = js.native
  
  /** PEM representation of the replica's x509 certificate. */
  var clientCertificate: js.UndefOr[String] = js.native
  
  /**
    * PEM representation of the replica's private key. The corresponsing public key is encoded in the client's certificate. The format of the replica's private key can be either PKCS #1
    * or PKCS #8.
    */
  var clientKey: js.UndefOr[String] = js.native
  
  /** This is always *sql#demoteMasterMysqlReplicaConfiguration*. */
  var kind: js.UndefOr[String] = js.native
  
  /** The password for the replication connection. */
  var password: js.UndefOr[String] = js.native
  
  /** The username for the replication connection. */
  var username: js.UndefOr[String] = js.native
}
object DemoteMasterMySqlReplicaConfiguration {
  
  @scala.inline
  def apply(): DemoteMasterMySqlReplicaConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DemoteMasterMySqlReplicaConfiguration]
  }
  
  @scala.inline
  implicit class DemoteMasterMySqlReplicaConfigurationMutableBuilder[Self <: DemoteMasterMySqlReplicaConfiguration] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
