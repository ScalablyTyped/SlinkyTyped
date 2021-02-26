package typingsSlinky.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A shielded Instance identity entry.
  */
@js.native
trait SchemaShieldedInstanceIdentity extends StObject {
  
  /**
    * An Endorsement Key (EK) issued to the Shielded Instance&#39;s vTPM.
    */
  var encryptionKey: js.UndefOr[SchemaShieldedInstanceIdentityEntry] = js.native
  
  /**
    * [Output Only] Type of the resource. Always
    * compute#shieldedInstanceIdentity for shielded Instance identity entry.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * An Attestation Key (AK) issued to the Shielded Instance&#39;s vTPM.
    */
  var signingKey: js.UndefOr[SchemaShieldedInstanceIdentityEntry] = js.native
}
object SchemaShieldedInstanceIdentity {
  
  @scala.inline
  def apply(): SchemaShieldedInstanceIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShieldedInstanceIdentity]
  }
  
  @scala.inline
  implicit class SchemaShieldedInstanceIdentityMutableBuilder[Self <: SchemaShieldedInstanceIdentity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryptionKey(value: SchemaShieldedInstanceIdentityEntry): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSigningKey(value: SchemaShieldedInstanceIdentityEntry): Self = StObject.set(x, "signingKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningKeyUndefined: Self = StObject.set(x, "signingKey", js.undefined)
  }
}
