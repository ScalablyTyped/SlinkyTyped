package typingsSlinky.elm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortToElm[V] extends StObject {
  
  def send(value: V): Unit = js.native
}
object PortToElm {
  
  @scala.inline
  def apply[V](send: V => Unit): PortToElm[V] = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send))
    __obj.asInstanceOf[PortToElm[V]]
  }
  
  @scala.inline
  implicit class PortToElmMutableBuilder[Self <: PortToElm[_], V] (val x: Self with PortToElm[V]) extends AnyVal {
    
    @scala.inline
    def setSend(value: V => Unit): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
  }
}
