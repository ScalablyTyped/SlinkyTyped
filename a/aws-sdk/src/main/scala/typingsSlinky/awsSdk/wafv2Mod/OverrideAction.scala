package typingsSlinky.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverrideAction extends StObject {
  
  /**
    * Override the rule action setting to count.
    */
  var Count: js.UndefOr[CountAction] = js.native
  
  /**
    * Don't override the rule action setting.
    */
  var None: js.UndefOr[NoneAction] = js.native
}
object OverrideAction {
  
  @scala.inline
  def apply(): OverrideAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverrideAction]
  }
  
  @scala.inline
  implicit class OverrideActionMutableBuilder[Self <: OverrideAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: CountAction): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    @scala.inline
    def setNone(value: NoneAction): Self = StObject.set(x, "None", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoneUndefined: Self = StObject.set(x, "None", js.undefined)
  }
}
