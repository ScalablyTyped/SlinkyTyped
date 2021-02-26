package typingsSlinky.ckeditorCkeditor5Utils.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BindChain extends StObject {
  
  def to(observable: Observable, bindProperties: (Observable | String | js.Function)*): Unit = js.native
  
  def toMany(observable: js.Array[Observable], bindProperties: (Observable | String | js.Function)*): Unit = js.native
}
object BindChain {
  
  @scala.inline
  def apply(
    to: (Observable, /* repeated */ Observable | String | js.Function) => Unit,
    toMany: (js.Array[Observable], /* repeated */ Observable | String | js.Function) => Unit
  ): BindChain = {
    val __obj = js.Dynamic.literal(to = js.Any.fromFunction2(to), toMany = js.Any.fromFunction2(toMany))
    __obj.asInstanceOf[BindChain]
  }
  
  @scala.inline
  implicit class BindChainMutableBuilder[Self <: BindChain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTo(value: (Observable, /* repeated */ Observable | String | js.Function) => Unit): Self = StObject.set(x, "to", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToMany(value: (js.Array[Observable], /* repeated */ Observable | String | js.Function) => Unit): Self = StObject.set(x, "toMany", js.Any.fromFunction2(value))
  }
}
