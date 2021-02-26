package typingsSlinky.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCodeBindingSourceResponse extends StObject {
  
  var Body: js.UndefOr[typingsSlinky.awsSdk.schemasMod.Body] = js.native
}
object GetCodeBindingSourceResponse {
  
  @scala.inline
  def apply(): GetCodeBindingSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCodeBindingSourceResponse]
  }
  
  @scala.inline
  implicit class GetCodeBindingSourceResponseMutableBuilder[Self <: GetCodeBindingSourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Body): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
  }
}
