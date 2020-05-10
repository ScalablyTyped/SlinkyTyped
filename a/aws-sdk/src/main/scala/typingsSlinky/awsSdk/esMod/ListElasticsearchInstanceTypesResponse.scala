package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListElasticsearchInstanceTypesResponse extends js.Object {
  /**
    *  List of instance types supported by Amazon Elasticsearch service for given  ElasticsearchVersion  
    */
  var ElasticsearchInstanceTypes: js.UndefOr[ElasticsearchInstanceTypeList] = js.native
  /**
    * In case if there are more results available NextToken would be present, make further request to the same API with received NextToken to paginate remaining results. 
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.esMod.NextToken] = js.native
}

object ListElasticsearchInstanceTypesResponse {
  @scala.inline
  def apply(): ListElasticsearchInstanceTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListElasticsearchInstanceTypesResponse]
  }
  @scala.inline
  implicit class ListElasticsearchInstanceTypesResponseOps[Self <: ListElasticsearchInstanceTypesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElasticsearchInstanceTypes(value: ElasticsearchInstanceTypeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticsearchInstanceTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticsearchInstanceTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticsearchInstanceTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

