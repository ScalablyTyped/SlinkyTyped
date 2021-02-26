package typingsSlinky.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Removes the request header of the specified name.
  * Do not use SetRequestHeader and RemoveRequestHeader with
  * the same header name on the same request.
  * Each request header name occurs only once in each request.
  */
@js.native
trait RemoveRequestHeader extends OnRequestActions {
  
  val instanceType: String = js.native
  
  val typeGuard: typingsSlinky.chromeApps.chromeAppsStrings.RemoveRequestHeader = js.native
}
object RemoveRequestHeader {
  
  @scala.inline
  def apply(instanceType: String, typeGuard: typingsSlinky.chromeApps.chromeAppsStrings.RemoveRequestHeader): RemoveRequestHeader = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], typeGuard = typeGuard.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveRequestHeader]
  }
  
  @scala.inline
  implicit class RemoveRequestHeaderMutableBuilder[Self <: RemoveRequestHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeGuard(value: typingsSlinky.chromeApps.chromeAppsStrings.RemoveRequestHeader): Self = StObject.set(x, "typeGuard", value.asInstanceOf[js.Any])
  }
}
