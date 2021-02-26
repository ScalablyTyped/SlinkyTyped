package typingsSlinky.libp2pGossipsub.anon

import typingsSlinky.peerId.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugName extends StObject {
  
  var debugName: String = js.native
  
  var multicodecs: js.Array[String] = js.native
  
  var options: EmitSelf = js.native
  
  var peerId: ^ = js.native
  
  var registrar: Handle = js.native
}
object DebugName {
  
  @scala.inline
  def apply(debugName: String, multicodecs: js.Array[String], options: EmitSelf, peerId: ^, registrar: Handle): DebugName = {
    val __obj = js.Dynamic.literal(debugName = debugName.asInstanceOf[js.Any], multicodecs = multicodecs.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], registrar = registrar.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugName]
  }
  
  @scala.inline
  implicit class DebugNameMutableBuilder[Self <: DebugName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebugName(value: String): Self = StObject.set(x, "debugName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMulticodecs(value: js.Array[String]): Self = StObject.set(x, "multicodecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMulticodecsVarargs(value: String*): Self = StObject.set(x, "multicodecs", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: EmitSelf): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerId(value: ^): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrar(value: Handle): Self = StObject.set(x, "registrar", value.asInstanceOf[js.Any])
  }
}
