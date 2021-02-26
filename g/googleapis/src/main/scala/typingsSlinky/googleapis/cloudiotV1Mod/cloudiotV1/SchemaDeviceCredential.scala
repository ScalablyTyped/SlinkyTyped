package typingsSlinky.googleapis.cloudiotV1Mod.cloudiotV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A server-stored device credential used for authentication.
  */
@js.native
trait SchemaDeviceCredential extends StObject {
  
  /**
    * [Optional] The time at which this credential becomes invalid. This
    * credential will be ignored for new client authentication requests after
    * this timestamp; however, it will not be automatically deleted.
    */
  var expirationTime: js.UndefOr[String] = js.native
  
  /**
    * A public key used to verify the signature of JSON Web Tokens (JWTs). When
    * adding a new device credential, either via device creation or via
    * modifications, this public key credential may be required to be signed by
    * one of the registry level certificates. More specifically, if the
    * registry contains at least one certificate, any new device credential
    * must be signed by one of the registry certificates. As a result, when the
    * registry contains certificates, only X.509 certificates are accepted as
    * device credentials. However, if the registry does not contain a
    * certificate, self-signed certificates and public keys will be accepted.
    * New device credentials must be different from every registry-level
    * certificate.
    */
  var publicKey: js.UndefOr[SchemaPublicKeyCredential] = js.native
}
object SchemaDeviceCredential {
  
  @scala.inline
  def apply(): SchemaDeviceCredential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceCredential]
  }
  
  @scala.inline
  implicit class SchemaDeviceCredentialMutableBuilder[Self <: SchemaDeviceCredential] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpirationTime(value: String): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
    
    @scala.inline
    def setPublicKey(value: SchemaPublicKeyCredential): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
  }
}
