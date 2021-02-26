package typingsSlinky.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Removes one or more cookies of request.
  * Note that it is preferred to use the Cookies API because this is computationally less expensive.
  */
@js.native
trait RemoveRequestCookie extends OnRequestActions {
  
  val instanceType: String = js.native
  
  val typeGuard: typingsSlinky.chromeApps.chromeAppsStrings.RemoveRequestCookie = js.native
}
object RemoveRequestCookie {
  
  @scala.inline
  def apply(instanceType: String, typeGuard: typingsSlinky.chromeApps.chromeAppsStrings.RemoveRequestCookie): RemoveRequestCookie = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], typeGuard = typeGuard.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveRequestCookie]
  }
  
  @scala.inline
  implicit class RemoveRequestCookieMutableBuilder[Self <: RemoveRequestCookie] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeGuard(value: typingsSlinky.chromeApps.chromeAppsStrings.RemoveRequestCookie): Self = StObject.set(x, "typeGuard", value.asInstanceOf[js.Any])
  }
}
