package typingsSlinky.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCommunicationsResponse extends StObject {
  
  /**
    * The communications for the case.
    */
  var communications: js.UndefOr[CommunicationList] = js.native
  
  /**
    * A resumption point for pagination.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object DescribeCommunicationsResponse {
  
  @scala.inline
  def apply(): DescribeCommunicationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCommunicationsResponse]
  }
  
  @scala.inline
  implicit class DescribeCommunicationsResponseMutableBuilder[Self <: DescribeCommunicationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommunications(value: CommunicationList): Self = StObject.set(x, "communications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommunicationsUndefined: Self = StObject.set(x, "communications", js.undefined)
    
    @scala.inline
    def setCommunicationsVarargs(value: Communication*): Self = StObject.set(x, "communications", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
