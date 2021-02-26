package typingsSlinky.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A simple user profile resource.
  */
@js.native
trait SchemaGoogleAppsScriptTypeUser extends StObject {
  
  /**
    * The user&#39;s domain.
    */
  var domain: js.UndefOr[String] = js.native
  
  /**
    * The user&#39;s identifying email address.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * The user&#39;s display name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The user&#39;s photo.
    */
  var photoUrl: js.UndefOr[String] = js.native
}
object SchemaGoogleAppsScriptTypeUser {
  
  @scala.inline
  def apply(): SchemaGoogleAppsScriptTypeUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeUser]
  }
  
  @scala.inline
  implicit class SchemaGoogleAppsScriptTypeUserMutableBuilder[Self <: SchemaGoogleAppsScriptTypeUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
  }
}
