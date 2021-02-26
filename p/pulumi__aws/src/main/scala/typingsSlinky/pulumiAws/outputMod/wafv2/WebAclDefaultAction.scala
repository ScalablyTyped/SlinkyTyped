package typingsSlinky.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclDefaultAction extends StObject {
  
  /**
    * Specifies that AWS WAF should allow requests by default.
    */
  var allow: js.UndefOr[WebAclDefaultActionAllow] = js.native
  
  /**
    * Specifies that AWS WAF should block requests by default.
    */
  var block: js.UndefOr[WebAclDefaultActionBlock] = js.native
}
object WebAclDefaultAction {
  
  @scala.inline
  def apply(): WebAclDefaultAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebAclDefaultAction]
  }
  
  @scala.inline
  implicit class WebAclDefaultActionMutableBuilder[Self <: WebAclDefaultAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow(value: WebAclDefaultActionAllow): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
    
    @scala.inline
    def setBlock(value: WebAclDefaultActionBlock): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
  }
}
