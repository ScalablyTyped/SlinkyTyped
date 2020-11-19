package typingsSlinky.j5IoTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILEDModule extends js.Object {
  
  def createLED(): ILED = js.native
}
object ILEDModule {
  
  @scala.inline
  def apply(createLED: () => ILED): ILEDModule = {
    val __obj = js.Dynamic.literal(createLED = js.Any.fromFunction0(createLED))
    __obj.asInstanceOf[ILEDModule]
  }
  
  @scala.inline
  implicit class ILEDModuleOps[Self <: ILEDModule] (val x: Self) extends AnyVal {
    
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
    def setCreateLED(value: () => ILED): Self = this.set("createLED", js.Any.fromFunction0(value))
  }
}
