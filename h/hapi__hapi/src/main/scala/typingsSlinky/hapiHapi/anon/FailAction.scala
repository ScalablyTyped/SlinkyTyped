package typingsSlinky.hapiHapi.anon

import typingsSlinky.hapiHapi.mod.Lifecycle.ReturnValue
import typingsSlinky.hapiHapi.mod.ResponseToolkit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailAction extends js.Object {
  
  var failAction: js.UndefOr[typingsSlinky.hapiHapi.mod.Lifecycle.FailAction] = js.native
  
  var parse: js.UndefOr[Boolean] = js.native
}
object FailAction {
  
  @scala.inline
  def apply(): FailAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailAction]
  }
  
  @scala.inline
  implicit class FailActionOps[Self <: FailAction] (val x: Self) extends AnyVal {
    
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
    def setFailActionFunction3(
      value: (/* request */ typingsSlinky.hapiHapi.mod.Request, /* h */ ResponseToolkit, /* err */ js.UndefOr[js.Error]) => ReturnValue
    ): Self = this.set("failAction", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFailAction(value: typingsSlinky.hapiHapi.mod.Lifecycle.FailAction): Self = this.set("failAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailAction: Self = this.set("failAction", js.undefined)
    
    @scala.inline
    def setParse(value: Boolean): Self = this.set("parse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParse: Self = this.set("parse", js.undefined)
  }
}
