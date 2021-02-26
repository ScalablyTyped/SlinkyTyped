package typingsSlinky.mirrorx.mod

import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromptProps extends StObject {
  
  var message: String | (js.Function1[/* location */ Location[LocationState], String | Boolean]) = js.native
  
  var when: js.UndefOr[Boolean] = js.native
}
object PromptProps {
  
  @scala.inline
  def apply(message: String | (js.Function1[/* location */ Location[LocationState], String | Boolean])): PromptProps = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptProps]
  }
  
  @scala.inline
  implicit class PromptPropsMutableBuilder[Self <: PromptProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String | (js.Function1[/* location */ Location[LocationState], String | Boolean])): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageFunction1(value: /* location */ Location[LocationState] => String | Boolean): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWhen(value: Boolean): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
  }
}
