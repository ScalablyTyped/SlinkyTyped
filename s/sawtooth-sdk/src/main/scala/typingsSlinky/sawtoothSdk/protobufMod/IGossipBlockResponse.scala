package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGossipBlockResponse extends StObject {
  
  /** GossipBlockResponse content */
  var content: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
}
object IGossipBlockResponse {
  
  @scala.inline
  def apply(): IGossipBlockResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGossipBlockResponse]
  }
  
  @scala.inline
  implicit class IGossipBlockResponseMutableBuilder[Self <: IGossipBlockResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: js.typedarray.Uint8Array): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentNull: Self = StObject.set(x, "content", null)
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
