package typingsSlinky.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDestroyable extends StObject {
  
  def destroy(): Unit = js.native
}
object IDestroyable {
  
  @scala.inline
  def apply(destroy: () => Unit): IDestroyable = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[IDestroyable]
  }
  
  @scala.inline
  implicit class IDestroyableMutableBuilder[Self <: IDestroyable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
  }
}
