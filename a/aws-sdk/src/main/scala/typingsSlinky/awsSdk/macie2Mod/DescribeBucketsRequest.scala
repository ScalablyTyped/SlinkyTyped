package typingsSlinky.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBucketsRequest extends StObject {
  
  /**
    * The criteria to use to filter the query results.
    */
  var criteria: js.UndefOr[BucketCriteria] = js.native
  
  /**
    * The maximum number of items to include in each page of the response. The default value is 50.
    */
  var maxResults: js.UndefOr[integer] = js.native
  
  /**
    * The nextToken string that specifies which page of results to return in a paginated response.
    */
  var nextToken: js.UndefOr[string] = js.native
  
  /**
    * The criteria to use to sort the query results.
    */
  var sortCriteria: js.UndefOr[BucketSortCriteria] = js.native
}
object DescribeBucketsRequest {
  
  @scala.inline
  def apply(): DescribeBucketsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBucketsRequest]
  }
  
  @scala.inline
  implicit class DescribeBucketsRequestMutableBuilder[Self <: DescribeBucketsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCriteria(value: BucketCriteria): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
    
    @scala.inline
    def setMaxResults(value: integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSortCriteria(value: BucketSortCriteria): Self = StObject.set(x, "sortCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortCriteriaUndefined: Self = StObject.set(x, "sortCriteria", js.undefined)
  }
}
