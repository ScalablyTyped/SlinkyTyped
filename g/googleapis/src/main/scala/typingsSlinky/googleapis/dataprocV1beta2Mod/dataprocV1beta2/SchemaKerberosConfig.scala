package typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies Kerberos related configuration.
  */
@js.native
trait SchemaKerberosConfig extends StObject {
  
  /**
    * Optional. The admin server (IP or hostname) for the remote trusted realm
    * in a cross realm trust relationship.
    */
  var crossRealmTrustAdminServer: js.UndefOr[String] = js.native
  
  /**
    * Optional. The KDC (IP or hostname) for the remote trusted realm in a
    * cross realm trust relationship.
    */
  var crossRealmTrustKdc: js.UndefOr[String] = js.native
  
  /**
    * Optional. The remote realm the Dataproc on-cluster KDC will trust, should
    * the user enable cross realm trust.
    */
  var crossRealmTrustRealm: js.UndefOr[String] = js.native
  
  /**
    * Optional. The GCS uri of a KMS encrypted file containing the shared
    * password between the on-cluster Kerberos realm and the remote trusted
    * realm, in a cross realm trust relationship.
    */
  var crossRealmTrustSharedPasswordUri: js.UndefOr[String] = js.native
  
  /**
    * Optional. Flag to indicate whether to Kerberize the cluster.
    */
  var enableKerberos: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. The GCS uri of a KMS encrypted file containing the master key
    * of the KDC database.
    */
  var kdcDbKeyUri: js.UndefOr[String] = js.native
  
  /**
    * Optional. The GCS uri of a KMS encrypted file containing the password to
    * the user provided key. For the self-signed certificate, this password is
    * generated by Dataproc.
    */
  var keyPasswordUri: js.UndefOr[String] = js.native
  
  /**
    * Optional. The GCS uri of a KMS encrypted file containing the password to
    * the user provided keystore. For the self-signed certificate, this
    * password is generated by Dataproc.
    */
  var keystorePasswordUri: js.UndefOr[String] = js.native
  
  /**
    * Optional. The GCS uri of the keystore file used for SSL encryption. If
    * not provided, Dataproc will provide a self-signed certificate.
    */
  var keystoreUri: js.UndefOr[String] = js.native
  
  /**
    * Required. The uri of the KMS key used to encrypt various sensitive files.
    */
  var kmsKeyUri: js.UndefOr[String] = js.native
  
  /**
    * Required. The GCS uri of a KMS encrypted file containing the root
    * principal password.
    */
  var rootPrincipalPasswordUri: js.UndefOr[String] = js.native
  
  /**
    * Optional. The lifetime of the ticket granting ticket, in hours. If not
    * specified, or user specifies 0, then default value 10 will be used.
    */
  var tgtLifetimeHours: js.UndefOr[Double] = js.native
  
  /**
    * Optional. The GCS uri of a KMS encrypted file containing the password to
    * the user provided truststore. For the self-signed certificate, this
    * password is generated by Dataproc.
    */
  var truststorePasswordUri: js.UndefOr[String] = js.native
  
  /**
    * Optional. The GCS uri of the truststore file used for SSL encryption. If
    * not provided, Dataproc will provide a self-signed certificate.
    */
  var truststoreUri: js.UndefOr[String] = js.native
}
object SchemaKerberosConfig {
  
  @scala.inline
  def apply(): SchemaKerberosConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKerberosConfig]
  }
  
  @scala.inline
  implicit class SchemaKerberosConfigMutableBuilder[Self <: SchemaKerberosConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrossRealmTrustAdminServer(value: String): Self = StObject.set(x, "crossRealmTrustAdminServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossRealmTrustAdminServerUndefined: Self = StObject.set(x, "crossRealmTrustAdminServer", js.undefined)
    
    @scala.inline
    def setCrossRealmTrustKdc(value: String): Self = StObject.set(x, "crossRealmTrustKdc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossRealmTrustKdcUndefined: Self = StObject.set(x, "crossRealmTrustKdc", js.undefined)
    
    @scala.inline
    def setCrossRealmTrustRealm(value: String): Self = StObject.set(x, "crossRealmTrustRealm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossRealmTrustRealmUndefined: Self = StObject.set(x, "crossRealmTrustRealm", js.undefined)
    
    @scala.inline
    def setCrossRealmTrustSharedPasswordUri(value: String): Self = StObject.set(x, "crossRealmTrustSharedPasswordUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossRealmTrustSharedPasswordUriUndefined: Self = StObject.set(x, "crossRealmTrustSharedPasswordUri", js.undefined)
    
    @scala.inline
    def setEnableKerberos(value: Boolean): Self = StObject.set(x, "enableKerberos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableKerberosUndefined: Self = StObject.set(x, "enableKerberos", js.undefined)
    
    @scala.inline
    def setKdcDbKeyUri(value: String): Self = StObject.set(x, "kdcDbKeyUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKdcDbKeyUriUndefined: Self = StObject.set(x, "kdcDbKeyUri", js.undefined)
    
    @scala.inline
    def setKeyPasswordUri(value: String): Self = StObject.set(x, "keyPasswordUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPasswordUriUndefined: Self = StObject.set(x, "keyPasswordUri", js.undefined)
    
    @scala.inline
    def setKeystorePasswordUri(value: String): Self = StObject.set(x, "keystorePasswordUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeystorePasswordUriUndefined: Self = StObject.set(x, "keystorePasswordUri", js.undefined)
    
    @scala.inline
    def setKeystoreUri(value: String): Self = StObject.set(x, "keystoreUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeystoreUriUndefined: Self = StObject.set(x, "keystoreUri", js.undefined)
    
    @scala.inline
    def setKmsKeyUri(value: String): Self = StObject.set(x, "kmsKeyUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyUriUndefined: Self = StObject.set(x, "kmsKeyUri", js.undefined)
    
    @scala.inline
    def setRootPrincipalPasswordUri(value: String): Self = StObject.set(x, "rootPrincipalPasswordUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootPrincipalPasswordUriUndefined: Self = StObject.set(x, "rootPrincipalPasswordUri", js.undefined)
    
    @scala.inline
    def setTgtLifetimeHours(value: Double): Self = StObject.set(x, "tgtLifetimeHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTgtLifetimeHoursUndefined: Self = StObject.set(x, "tgtLifetimeHours", js.undefined)
    
    @scala.inline
    def setTruststorePasswordUri(value: String): Self = StObject.set(x, "truststorePasswordUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTruststorePasswordUriUndefined: Self = StObject.set(x, "truststorePasswordUri", js.undefined)
    
    @scala.inline
    def setTruststoreUri(value: String): Self = StObject.set(x, "truststoreUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTruststoreUriUndefined: Self = StObject.set(x, "truststoreUri", js.undefined)
  }
}
