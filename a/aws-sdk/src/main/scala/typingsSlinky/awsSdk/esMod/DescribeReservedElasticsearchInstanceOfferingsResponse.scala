package typingsSlinky.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReservedElasticsearchInstanceOfferingsResponse extends StObject {
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.esMod.NextToken] = js.native
  
  /**
    * List of reserved Elasticsearch instance offerings
    */
  var ReservedElasticsearchInstanceOfferings: js.UndefOr[ReservedElasticsearchInstanceOfferingList] = js.native
}
object DescribeReservedElasticsearchInstanceOfferingsResponse {
  
  @scala.inline
  def apply(): DescribeReservedElasticsearchInstanceOfferingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedElasticsearchInstanceOfferingsResponse]
  }
  
  @scala.inline
  implicit class DescribeReservedElasticsearchInstanceOfferingsResponseMutableBuilder[Self <: DescribeReservedElasticsearchInstanceOfferingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setReservedElasticsearchInstanceOfferings(value: ReservedElasticsearchInstanceOfferingList): Self = StObject.set(x, "ReservedElasticsearchInstanceOfferings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedElasticsearchInstanceOfferingsUndefined: Self = StObject.set(x, "ReservedElasticsearchInstanceOfferings", js.undefined)
    
    @scala.inline
    def setReservedElasticsearchInstanceOfferingsVarargs(value: ReservedElasticsearchInstanceOffering*): Self = StObject.set(x, "ReservedElasticsearchInstanceOfferings", js.Array(value :_*))
  }
}
