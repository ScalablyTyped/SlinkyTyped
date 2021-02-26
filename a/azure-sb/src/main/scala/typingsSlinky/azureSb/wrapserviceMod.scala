package typingsSlinky.azureSb

import typingsSlinky.azureSb.anon.SignRequest
import typingsSlinky.azureSb.mod.Azure.ServiceBus.ResponseCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wrapserviceMod {
  
  @JSImport("azure-sb/lib/wrapservice", JSImport.Namespace)
  @js.native
  class ^ protected () extends WrapService {
    def this(acsHost: String) = this()
    def this(acsHost: String, issuer: String) = this()
    def this(acsHost: String, issuer: js.UndefOr[scala.Nothing], accessKey: String) = this()
    def this(acsHost: String, issuer: String, accessKey: String) = this()
  }
  
  @js.native
  trait WrapService extends StObject {
    
    var accessKey: js.UndefOr[String] = js.native
    
    var authenticationProvider: SignRequest = js.native
    
    var issuer: js.UndefOr[String] = js.native
    
    var strictSSL: Boolean = js.native
    
    def wrapAccessToken(uri: String, callback: ResponseCallback): Unit = js.native
    def wrapAccessToken(uri: String, options: js.Object, callback: ResponseCallback): Unit = js.native
  }
}
