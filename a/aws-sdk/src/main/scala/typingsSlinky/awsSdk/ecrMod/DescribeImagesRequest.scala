package typingsSlinky.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeImagesRequest extends js.Object {
  
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
  implicit class DescribeImagesRequestOps[Self <: DescribeImagesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: DescribeImagesFilter): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setImageIdsVarargs(value: ImageIdentifier*): Self = this.set("imageIds", js.Array(value :_*))
    
    @scala.inline
    def setImageIds(value: ImageIdentifierList): Self = this.set("imageIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageIds: Self = this.set("imageIds", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setRegistryId(value: RegistryId): Self = this.set("registryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistryId: Self = this.set("registryId", js.undefined)
  }
}
