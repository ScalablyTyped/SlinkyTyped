package typingsSlinky.antDesignReactNative.portalHostMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalMethods extends js.Object {
  
  def mount(children: ReactElement): Double = js.native
  
  def unmount(key: Double): Unit = js.native
  
  def update(key: Double, children: ReactElement): Unit = js.native
}
object PortalMethods {
  
  @scala.inline
  def apply(mount: ReactElement => Double, unmount: Double => Unit, update: (Double, ReactElement) => Unit): PortalMethods = {
    val __obj = js.Dynamic.literal(mount = js.Any.fromFunction1(mount), unmount = js.Any.fromFunction1(unmount), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[PortalMethods]
  }
  
  @scala.inline
  implicit class PortalMethodsOps[Self <: PortalMethods] (val x: Self) extends AnyVal {
    
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
    def setMount(value: ReactElement => Double): Self = this.set("mount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnmount(value: Double => Unit): Self = this.set("unmount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: (Double, ReactElement) => Unit): Self = this.set("update", js.Any.fromFunction2(value))
  }
}
