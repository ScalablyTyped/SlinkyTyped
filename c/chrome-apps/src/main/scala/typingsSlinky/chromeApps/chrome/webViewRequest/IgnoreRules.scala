package typingsSlinky.chromeApps.chrome.webViewRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Masks all rules that match the specified criteria.
  */
@js.native
trait IgnoreRules extends OnRequestActions {
  
  val instanceType: String = js.native
  
  val typeGuard: typingsSlinky.chromeApps.chromeAppsStrings.IgnoreRules = js.native
}
object IgnoreRules {
  
  @scala.inline
  def apply(instanceType: String, typeGuard: typingsSlinky.chromeApps.chromeAppsStrings.IgnoreRules): IgnoreRules = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], typeGuard = typeGuard.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoreRules]
  }
  
  @scala.inline
  implicit class IgnoreRulesOps[Self <: IgnoreRules] (val x: Self) extends AnyVal {
    
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
    def setTypeGuard(value: typingsSlinky.chromeApps.chromeAppsStrings.IgnoreRules): Self = this.set("typeGuard", value.asInstanceOf[js.Any])
  }
}
