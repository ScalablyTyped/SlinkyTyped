package typingsSlinky.minappEnv.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Proxy[T /* <: js.Object */] extends StObject {
  
  var proxy: T = js.native
  
  def revoke(): Unit = js.native
}
object Proxy {
  
  @scala.inline
  def apply[T /* <: js.Object */](proxy: T, revoke: () => Unit): Proxy[T] = {
    val __obj = js.Dynamic.literal(proxy = proxy.asInstanceOf[js.Any], revoke = js.Any.fromFunction0(revoke))
    __obj.asInstanceOf[Proxy[T]]
  }
  
  @scala.inline
  implicit class ProxyMutableBuilder[Self <: Proxy[_], T /* <: js.Object */] (val x: Self with Proxy[T]) extends AnyVal {
    
    @scala.inline
    def setProxy(value: T): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevoke(value: () => Unit): Self = StObject.set(x, "revoke", js.Any.fromFunction0(value))
  }
}
