package typingsSlinky.chrome.anon

import typingsSlinky.chrome.chrome.declarativeContent.PageStateMatcherProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Actions extends StObject {
  
  var actions: js.UndefOr[js.Array[Type]] = js.native
  
  var conditions: js.UndefOr[js.Array[PageStateMatcherProperties]] = js.native
  
  var event: js.UndefOr[String] = js.native
}
object Actions {
  
  @scala.inline
  def apply(): Actions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Actions]
  }
  
  @scala.inline
  implicit class ActionsMutableBuilder[Self <: Actions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[Type]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: Type*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setConditions(value: js.Array[PageStateMatcherProperties]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: PageStateMatcherProperties*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    @scala.inline
    def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
  }
}
