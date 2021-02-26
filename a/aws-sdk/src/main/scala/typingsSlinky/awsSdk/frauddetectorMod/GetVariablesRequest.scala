package typingsSlinky.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVariablesRequest extends StObject {
  
  /**
    * The max size per page determined for the get variable request. 
    */
  var maxResults: js.UndefOr[VariablesMaxResults] = js.native
  
  /**
    * The name of the variable. 
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The next page token of the get variable request. 
    */
  var nextToken: js.UndefOr[String] = js.native
}
object GetVariablesRequest {
  
  @scala.inline
  def apply(): GetVariablesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVariablesRequest]
  }
  
  @scala.inline
  implicit class GetVariablesRequestMutableBuilder[Self <: GetVariablesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: VariablesMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
