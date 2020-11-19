package typingsSlinky.chromeApps.chrome.webViewRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Edits one or more cookies of response.
  * Note that it is preferred to use the Cookies API because this is computationally less expensive.
  */
@js.native
trait EditResponseCookie extends OnRequestActions {
  
  val instanceType: String = js.native
  
  val typeGuard: typingsSlinky.chromeApps.chromeAppsStrings.EditResponseCookie = js.native
}
object EditResponseCookie {
  
  @scala.inline
  def apply(instanceType: String, typeGuard: typingsSlinky.chromeApps.chromeAppsStrings.EditResponseCookie): EditResponseCookie = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], typeGuard = typeGuard.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditResponseCookie]
  }
  
  @scala.inline
  implicit class EditResponseCookieOps[Self <: EditResponseCookie] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInstanceType(value: String): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeGuard(value: typingsSlinky.chromeApps.chromeAppsStrings.EditResponseCookie): Self = this.set("typeGuard", value.asInstanceOf[js.Any])
  }
}
