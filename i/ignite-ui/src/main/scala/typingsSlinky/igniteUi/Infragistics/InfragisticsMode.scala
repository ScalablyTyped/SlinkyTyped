package typingsSlinky.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfragisticsMode extends js.Object {
  
  def isActive(): Unit = js.native
}
object InfragisticsMode {
  
  @scala.inline
  def apply(isActive: () => Unit): InfragisticsMode = {
    val __obj = js.Dynamic.literal(isActive = js.Any.fromFunction0(isActive))
    __obj.asInstanceOf[InfragisticsMode]
  }
  
  @scala.inline
  implicit class InfragisticsModeOps[Self <: InfragisticsMode] (val x: Self) extends AnyVal {
    
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
    def setIsActive(value: () => Unit): Self = this.set("isActive", js.Any.fromFunction0(value))
  }
}
