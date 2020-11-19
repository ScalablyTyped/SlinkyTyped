package typingsSlinky.mendixmodelsdk.anon

import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.fail
import typingsSlinky.mendixmodelsdk.transportInterfacesMod.CannotFixAppState
import typingsSlinky.mendixmodelsdk.transportInterfacesMod.IEnvironmentStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cause extends IEnvironmentStatus {
  
  var cause: js.UndefOr[String] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var state: CannotFixAppState = js.native
  
  var `type`: fail = js.native
}
object Cause {
  
  @scala.inline
  def apply(state: CannotFixAppState, `type`: fail): Cause = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cause]
  }
  
  @scala.inline
  implicit class CauseOps[Self <: Cause] (val x: Self) extends AnyVal {
    
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
    def setState(value: CannotFixAppState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: fail): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCause(value: String): Self = this.set("cause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCause: Self = this.set("cause", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
