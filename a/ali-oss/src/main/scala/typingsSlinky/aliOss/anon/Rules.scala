package typingsSlinky.aliOss.anon

import typingsSlinky.aliOss.mod.LifecycleRule
import typingsSlinky.aliOss.mod.NormalSuccessResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rules extends StObject {
  
  var res: NormalSuccessResponse = js.native
  
  var rules: js.Array[LifecycleRule] = js.native
}
object Rules {
  
  @scala.inline
  def apply(res: NormalSuccessResponse, rules: js.Array[LifecycleRule]): Rules = {
    val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rules]
  }
  
  @scala.inline
  implicit class RulesMutableBuilder[Self <: Rules] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRules(value: js.Array[LifecycleRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesVarargs(value: LifecycleRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
