package typingsSlinky.googleapis.osloginV1betaMod.osloginV1beta

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The user profile information used for logging in to a virtual machine on
  * Google Compute Engine.
  */
@js.native
trait SchemaLoginProfile extends StObject {
  
  /**
    * A unique user ID.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The list of POSIX accounts associated with the user.
    */
  var posixAccounts: js.UndefOr[js.Array[SchemaPosixAccount]] = js.native
  
  /**
    * A map from SSH public key fingerprint to the associated key object.
    */
  var sshPublicKeys: js.UndefOr[StringDictionary[SchemaSshPublicKey]] = js.native
}
object SchemaLoginProfile {
  
  @scala.inline
  def apply(): SchemaLoginProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLoginProfile]
  }
  
  @scala.inline
  implicit class SchemaLoginProfileMutableBuilder[Self <: SchemaLoginProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPosixAccounts(value: js.Array[SchemaPosixAccount]): Self = StObject.set(x, "posixAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosixAccountsUndefined: Self = StObject.set(x, "posixAccounts", js.undefined)
    
    @scala.inline
    def setPosixAccountsVarargs(value: SchemaPosixAccount*): Self = StObject.set(x, "posixAccounts", js.Array(value :_*))
    
    @scala.inline
    def setSshPublicKeys(value: StringDictionary[SchemaSshPublicKey]): Self = StObject.set(x, "sshPublicKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSshPublicKeysUndefined: Self = StObject.set(x, "sshPublicKeys", js.undefined)
  }
}
