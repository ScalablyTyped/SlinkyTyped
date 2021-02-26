package typingsSlinky.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Adds the response header to the response of this web request.
  * As multiple response headers may share the same name,
  * you need to first remove and then add a new
  * response header in order to replace one.
  */
@js.native
trait AddResponseHeader extends OnRequestActions {
  
  val instanceType: String = js.native
  
  val typeGuard: typingsSlinky.chromeApps.chromeAppsStrings.AddResponseHeader = js.native
}
object AddResponseHeader {
  
  @scala.inline
  def apply(instanceType: String, typeGuard: typingsSlinky.chromeApps.chromeAppsStrings.AddResponseHeader): AddResponseHeader = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], typeGuard = typeGuard.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddResponseHeader]
  }
  
  @scala.inline
  implicit class AddResponseHeaderMutableBuilder[Self <: AddResponseHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeGuard(value: typingsSlinky.chromeApps.chromeAppsStrings.AddResponseHeader): Self = StObject.set(x, "typeGuard", value.asInstanceOf[js.Any])
  }
}
