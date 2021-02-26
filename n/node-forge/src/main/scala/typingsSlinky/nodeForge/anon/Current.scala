package typingsSlinky.nodeForge.anon

import typingsSlinky.nodeForge.mod.tls.ConnectionState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Current extends StObject {
  
  var current: ConnectionState = js.native
  
  var pending: ConnectionState | Null = js.native
}
object Current {
  
  @scala.inline
  def apply(current: ConnectionState): Current = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current]
  }
  
  @scala.inline
  implicit class CurrentMutableBuilder[Self <: Current] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrent(value: ConnectionState): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPending(value: ConnectionState): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingNull: Self = StObject.set(x, "pending", null)
  }
}
