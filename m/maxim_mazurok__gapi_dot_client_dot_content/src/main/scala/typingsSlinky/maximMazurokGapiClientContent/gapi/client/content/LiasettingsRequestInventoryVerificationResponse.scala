package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiasettingsRequestInventoryVerificationResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#liasettingsRequestInventoryVerificationResponse". */
  var kind: js.UndefOr[String] = js.native
}
object LiasettingsRequestInventoryVerificationResponse {
  
  @scala.inline
  def apply(): LiasettingsRequestInventoryVerificationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiasettingsRequestInventoryVerificationResponse]
  }
  
  @scala.inline
  implicit class LiasettingsRequestInventoryVerificationResponseMutableBuilder[Self <: LiasettingsRequestInventoryVerificationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
