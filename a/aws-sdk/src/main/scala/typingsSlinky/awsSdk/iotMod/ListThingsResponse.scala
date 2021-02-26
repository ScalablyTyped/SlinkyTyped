package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListThingsResponse extends StObject {
  
  /**
    * The token to use to get the next set of results. Will not be returned if operation has returned all results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The things.
    */
  var things: js.UndefOr[ThingAttributeList] = js.native
}
object ListThingsResponse {
  
  @scala.inline
  def apply(): ListThingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThingsResponse]
  }
  
  @scala.inline
  implicit class ListThingsResponseMutableBuilder[Self <: ListThingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setThings(value: ThingAttributeList): Self = StObject.set(x, "things", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingsUndefined: Self = StObject.set(x, "things", js.undefined)
    
    @scala.inline
    def setThingsVarargs(value: ThingAttribute*): Self = StObject.set(x, "things", js.Array(value :_*))
  }
}
