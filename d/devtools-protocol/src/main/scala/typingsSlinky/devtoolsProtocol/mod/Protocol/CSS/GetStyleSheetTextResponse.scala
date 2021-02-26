package typingsSlinky.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStyleSheetTextResponse extends StObject {
  
  /**
    * The stylesheet text.
    */
  var text: String = js.native
}
object GetStyleSheetTextResponse {
  
  @scala.inline
  def apply(text: String): GetStyleSheetTextResponse = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStyleSheetTextResponse]
  }
  
  @scala.inline
  implicit class GetStyleSheetTextResponseMutableBuilder[Self <: GetStyleSheetTextResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
