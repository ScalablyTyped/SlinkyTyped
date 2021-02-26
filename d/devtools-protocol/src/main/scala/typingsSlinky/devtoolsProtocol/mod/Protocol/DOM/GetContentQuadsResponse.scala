package typingsSlinky.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetContentQuadsResponse extends StObject {
  
  /**
    * Quads that describe node layout relative to viewport.
    */
  var quads: js.Array[Quad] = js.native
}
object GetContentQuadsResponse {
  
  @scala.inline
  def apply(quads: js.Array[Quad]): GetContentQuadsResponse = {
    val __obj = js.Dynamic.literal(quads = quads.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContentQuadsResponse]
  }
  
  @scala.inline
  implicit class GetContentQuadsResponseMutableBuilder[Self <: GetContentQuadsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuads(value: js.Array[Quad]): Self = StObject.set(x, "quads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuadsVarargs(value: Quad*): Self = StObject.set(x, "quads", js.Array(value :_*))
  }
}
