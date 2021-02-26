package typingsSlinky.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeImagesRequest extends StObject {
  
  /**
    * The filter key and value with which to filter your DescribeImages results.
    */
  var filter: js.UndefOr[DescribeImagesFilter] = js.native
  
  /**
    * The list of image IDs for the requested repository.
    */
  var imageIds: js.UndefOr[ImageIdentifierList] = js.native
  
  /**
    * The maximum number of repository results returned by DescribeImages in paginated output. When this parameter is used, DescribeImages only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another DescribeImages request with the returned nextToken value. This value can be between 1 and 1000. If this parameter is not used, then DescribeImages returns up to 100 results and a nextToken value, if applicable. This option cannot be used when you specify images with imageIds.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    * The nextToken value returned from a previous paginated DescribeImages request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value. This value is null when there are no more results to return. This option cannot be used when you specify images with imageIds.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The AWS account ID associated with the registry that contains the repository in which to describe images. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  
  /**
    * The repository that contains the images to describe.
    */
  var repositoryName: RepositoryName = js.native
}
object DescribeImagesRequest {
  
  @scala.inline
  def apply(repositoryName: RepositoryName): DescribeImagesRequest = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeImagesRequest]
  }
  
  @scala.inline
  implicit class DescribeImagesRequestMutableBuilder[Self <: DescribeImagesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: DescribeImagesFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setImageIds(value: ImageIdentifierList): Self = StObject.set(x, "imageIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageIdsUndefined: Self = StObject.set(x, "imageIds", js.undefined)
    
    @scala.inline
    def setImageIdsVarargs(value: ImageIdentifier*): Self = StObject.set(x, "imageIds", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
