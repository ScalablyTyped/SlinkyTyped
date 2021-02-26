package typingsSlinky.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetComputedStyleForNodeResponse extends StObject {
  
  /**
    * Computed style for the specified DOM node.
    */
  var computedStyle: js.Array[CSSComputedStyleProperty] = js.native
}
object GetComputedStyleForNodeResponse {
  
  @scala.inline
  def apply(computedStyle: js.Array[CSSComputedStyleProperty]): GetComputedStyleForNodeResponse = {
    val __obj = js.Dynamic.literal(computedStyle = computedStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetComputedStyleForNodeResponse]
  }
  
  @scala.inline
  implicit class GetComputedStyleForNodeResponseMutableBuilder[Self <: GetComputedStyleForNodeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputedStyle(value: js.Array[CSSComputedStyleProperty]): Self = StObject.set(x, "computedStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputedStyleVarargs(value: CSSComputedStyleProperty*): Self = StObject.set(x, "computedStyle", js.Array(value :_*))
  }
}
