package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHandle extends StObject {
  
  def remove(): Unit = js.native
}
object IHandle {
  
  @scala.inline
  def apply(remove: () => Unit): IHandle = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[IHandle]
  }
  
  @scala.inline
  implicit class IHandleMutableBuilder[Self <: IHandle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
