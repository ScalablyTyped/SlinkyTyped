package typingsSlinky.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestValidators extends StObject {
  
  /**
    * The current page of elements from this collection.
    */
  var items: js.UndefOr[ListOfRequestValidator] = js.native
  
  var position: js.UndefOr[String] = js.native
}
object RequestValidators {
  
  @scala.inline
  def apply(): RequestValidators = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestValidators]
  }
  
  @scala.inline
  implicit class RequestValidatorsMutableBuilder[Self <: RequestValidators] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: ListOfRequestValidator): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: RequestValidator*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
