package typingsSlinky.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SAMLOptionsOutput extends StObject {
  
  /**
    * True if SAML is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Describes the SAML Identity Provider's information.
    */
  var Idp: js.UndefOr[SAMLIdp] = js.native
  
  /**
    * The key used for matching the SAML Roles attribute.
    */
  var RolesKey: js.UndefOr[String] = js.native
  
  /**
    * The duration, in minutes, after which a user session becomes inactive.
    */
  var SessionTimeoutMinutes: js.UndefOr[IntegerClass] = js.native
  
  /**
    * The key used for matching the SAML Subject attribute.
    */
  var SubjectKey: js.UndefOr[String] = js.native
}
object SAMLOptionsOutput {
  
  @scala.inline
  def apply(): SAMLOptionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SAMLOptionsOutput]
  }
  
  @scala.inline
  implicit class SAMLOptionsOutputMutableBuilder[Self <: SAMLOptionsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    @scala.inline
    def setIdp(value: SAMLIdp): Self = StObject.set(x, "Idp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdpUndefined: Self = StObject.set(x, "Idp", js.undefined)
    
    @scala.inline
    def setRolesKey(value: String): Self = StObject.set(x, "RolesKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolesKeyUndefined: Self = StObject.set(x, "RolesKey", js.undefined)
    
    @scala.inline
    def setSessionTimeoutMinutes(value: IntegerClass): Self = StObject.set(x, "SessionTimeoutMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionTimeoutMinutesUndefined: Self = StObject.set(x, "SessionTimeoutMinutes", js.undefined)
    
    @scala.inline
    def setSubjectKey(value: String): Self = StObject.set(x, "SubjectKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectKeyUndefined: Self = StObject.set(x, "SubjectKey", js.undefined)
  }
}
