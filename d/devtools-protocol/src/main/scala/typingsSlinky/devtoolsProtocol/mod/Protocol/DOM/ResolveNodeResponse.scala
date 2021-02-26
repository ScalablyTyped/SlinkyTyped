package typingsSlinky.devtoolsProtocol.mod.Protocol.DOM

import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolveNodeResponse extends StObject {
  
  /**
    * JavaScript object wrapper for given node.
    */
  var `object`: RemoteObject = js.native
}
object ResolveNodeResponse {
  
  @scala.inline
  def apply(`object`: RemoteObject): ResolveNodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveNodeResponse]
  }
  
  @scala.inline
  implicit class ResolveNodeResponseMutableBuilder[Self <: ResolveNodeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObject(value: RemoteObject): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
