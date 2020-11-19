package typingsSlinky.antDesignReactNative.portalHostMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalGuard extends js.Object {
  
  def add(e: ReactElement): Double = js.native
  
  var nextKey: js.Any = js.native
  
  def remove(key: Double): Unit = js.native
}
object PortalGuard {
  
  @scala.inline
  def apply(add: ReactElement => Double, nextKey: js.Any, remove: Double => Unit): PortalGuard = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), nextKey = nextKey.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[PortalGuard]
  }
  
  @scala.inline
  implicit class PortalGuardOps[Self <: PortalGuard] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: ReactElement => Double): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNextKey(value: js.Any): Self = this.set("nextKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
  }
}
