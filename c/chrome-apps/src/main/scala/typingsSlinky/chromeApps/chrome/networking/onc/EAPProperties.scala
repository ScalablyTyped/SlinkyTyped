package typingsSlinky.chromeApps.chrome.networking.onc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EAPProperties extends StObject {
  
  var AnonymousIdentity: js.UndefOr[String] = js.native
  
  /** @since Chrome 60. */
  var ClientCertPKCS11Id: js.UndefOr[String] = js.native
  
  var ClientCertPattern: js.UndefOr[CertPattern] = js.native
  
  var ClientCertRef: js.UndefOr[String] = js.native
  
  var ClientCertType: js.UndefOr[typingsSlinky.chromeApps.chrome.networking.onc.ClientCertType] = js.native
  
  var Identity: js.UndefOr[String] = js.native
  
  var Inner: js.UndefOr[String] = js.native
  
  /** The outer EAP type. Required by ONC, but may not be provided when translating from Shill. */
  var Outer: js.UndefOr[String] = js.native
  
  var Password: js.UndefOr[String] = js.native
  
  var SaveCredentials: js.UndefOr[Boolean] = js.native
  
  var ServerCAPEMs: js.UndefOr[js.Array[String]] = js.native
  
  var ServerCARefs: js.UndefOr[js.Array[String]] = js.native
  
  /** @since Chrome 60. */
  var SubjectMatch: js.UndefOr[ManagedDOMString] = js.native
  
  var UseProactiveKeyCaching: js.UndefOr[Boolean] = js.native
  
  var UseSytemCAs: js.UndefOr[Boolean] = js.native
}
object EAPProperties {
  
  @scala.inline
  def apply(): EAPProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EAPProperties]
  }
  
  @scala.inline
  implicit class EAPPropertiesMutableBuilder[Self <: EAPProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnonymousIdentity(value: String): Self = StObject.set(x, "AnonymousIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnonymousIdentityUndefined: Self = StObject.set(x, "AnonymousIdentity", js.undefined)
    
    @scala.inline
    def setClientCertPKCS11Id(value: String): Self = StObject.set(x, "ClientCertPKCS11Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientCertPKCS11IdUndefined: Self = StObject.set(x, "ClientCertPKCS11Id", js.undefined)
    
    @scala.inline
    def setClientCertPattern(value: CertPattern): Self = StObject.set(x, "ClientCertPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientCertPatternUndefined: Self = StObject.set(x, "ClientCertPattern", js.undefined)
    
    @scala.inline
    def setClientCertRef(value: String): Self = StObject.set(x, "ClientCertRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientCertRefUndefined: Self = StObject.set(x, "ClientCertRef", js.undefined)
    
    @scala.inline
    def setClientCertType(value: ClientCertType): Self = StObject.set(x, "ClientCertType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientCertTypeUndefined: Self = StObject.set(x, "ClientCertType", js.undefined)
    
    @scala.inline
    def setIdentity(value: String): Self = StObject.set(x, "Identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityUndefined: Self = StObject.set(x, "Identity", js.undefined)
    
    @scala.inline
    def setInner(value: String): Self = StObject.set(x, "Inner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerUndefined: Self = StObject.set(x, "Inner", js.undefined)
    
    @scala.inline
    def setOuter(value: String): Self = StObject.set(x, "Outer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterUndefined: Self = StObject.set(x, "Outer", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "Password", js.undefined)
    
    @scala.inline
    def setSaveCredentials(value: Boolean): Self = StObject.set(x, "SaveCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveCredentialsUndefined: Self = StObject.set(x, "SaveCredentials", js.undefined)
    
    @scala.inline
    def setServerCAPEMs(value: js.Array[String]): Self = StObject.set(x, "ServerCAPEMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerCAPEMsUndefined: Self = StObject.set(x, "ServerCAPEMs", js.undefined)
    
    @scala.inline
    def setServerCAPEMsVarargs(value: String*): Self = StObject.set(x, "ServerCAPEMs", js.Array(value :_*))
    
    @scala.inline
    def setServerCARefs(value: js.Array[String]): Self = StObject.set(x, "ServerCARefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerCARefsUndefined: Self = StObject.set(x, "ServerCARefs", js.undefined)
    
    @scala.inline
    def setServerCARefsVarargs(value: String*): Self = StObject.set(x, "ServerCARefs", js.Array(value :_*))
    
    @scala.inline
    def setSubjectMatch(value: ManagedDOMString): Self = StObject.set(x, "SubjectMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectMatchUndefined: Self = StObject.set(x, "SubjectMatch", js.undefined)
    
    @scala.inline
    def setUseProactiveKeyCaching(value: Boolean): Self = StObject.set(x, "UseProactiveKeyCaching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseProactiveKeyCachingUndefined: Self = StObject.set(x, "UseProactiveKeyCaching", js.undefined)
    
    @scala.inline
    def setUseSytemCAs(value: Boolean): Self = StObject.set(x, "UseSytemCAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseSytemCAsUndefined: Self = StObject.set(x, "UseSytemCAs", js.undefined)
  }
}
