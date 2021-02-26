package typingsSlinky.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectClassNamesRequest extends StObject {
  
  var styleSheetId: StyleSheetId = js.native
}
object CollectClassNamesRequest {
  
  @scala.inline
  def apply(styleSheetId: StyleSheetId): CollectClassNamesRequest = {
    val __obj = js.Dynamic.literal(styleSheetId = styleSheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectClassNamesRequest]
  }
  
  @scala.inline
  implicit class CollectClassNamesRequestMutableBuilder[Self <: CollectClassNamesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyleSheetId(value: StyleSheetId): Self = StObject.set(x, "styleSheetId", value.asInstanceOf[js.Any])
  }
}
