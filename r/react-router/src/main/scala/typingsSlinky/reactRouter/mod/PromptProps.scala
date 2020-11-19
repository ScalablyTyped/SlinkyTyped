package typingsSlinky.reactRouter.mod

import typingsSlinky.history.mod.Action
import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromptProps extends js.Object {
  
  var message: String | (js.Function2[/* location */ Location[LocationState], /* action */ Action, String | Boolean]) = js.native
  
  var when: js.UndefOr[Boolean] = js.native
}
object PromptProps {
  
  @scala.inline
  def apply(
    message: String | (js.Function2[/* location */ Location[LocationState], /* action */ Action, String | Boolean])
  ): PromptProps = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptProps]
  }
  
  @scala.inline
  implicit class PromptPropsOps[Self <: PromptProps] (val x: Self) extends AnyVal {
    
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
    def setMessageFunction2(value: (/* location */ Location[LocationState], /* action */ Action) => String | Boolean): Self = this.set("message", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMessage(
      value: String | (js.Function2[/* location */ Location[LocationState], /* action */ Action, String | Boolean])
    ): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhen(value: Boolean): Self = this.set("when", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhen: Self = this.set("when", js.undefined)
  }
}
