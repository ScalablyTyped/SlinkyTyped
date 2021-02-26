package typingsSlinky.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Campaign Creative Association List Response
  */
@js.native
trait SchemaCampaignCreativeAssociationsListResponse extends StObject {
  
  /**
    * Campaign creative association collection
    */
  var campaignCreativeAssociations: js.UndefOr[js.Array[SchemaCampaignCreativeAssociation]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#campaignCreativeAssociationsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaCampaignCreativeAssociationsListResponse {
  
  @scala.inline
  def apply(): SchemaCampaignCreativeAssociationsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCampaignCreativeAssociationsListResponse]
  }
  
  @scala.inline
  implicit class SchemaCampaignCreativeAssociationsListResponseMutableBuilder[Self <: SchemaCampaignCreativeAssociationsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCampaignCreativeAssociations(value: js.Array[SchemaCampaignCreativeAssociation]): Self = StObject.set(x, "campaignCreativeAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignCreativeAssociationsUndefined: Self = StObject.set(x, "campaignCreativeAssociations", js.undefined)
    
    @scala.inline
    def setCampaignCreativeAssociationsVarargs(value: SchemaCampaignCreativeAssociation*): Self = StObject.set(x, "campaignCreativeAssociations", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
