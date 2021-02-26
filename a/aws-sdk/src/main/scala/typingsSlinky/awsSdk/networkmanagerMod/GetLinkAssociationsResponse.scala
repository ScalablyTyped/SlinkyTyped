package typingsSlinky.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLinkAssociationsResponse extends StObject {
  
  /**
    * The link associations.
    */
  var LinkAssociations: js.UndefOr[LinkAssociationList] = js.native
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object GetLinkAssociationsResponse {
  
  @scala.inline
  def apply(): GetLinkAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLinkAssociationsResponse]
  }
  
  @scala.inline
  implicit class GetLinkAssociationsResponseMutableBuilder[Self <: GetLinkAssociationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLinkAssociations(value: LinkAssociationList): Self = StObject.set(x, "LinkAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkAssociationsUndefined: Self = StObject.set(x, "LinkAssociations", js.undefined)
    
    @scala.inline
    def setLinkAssociationsVarargs(value: LinkAssociation*): Self = StObject.set(x, "LinkAssociations", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
