package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListElasticsearchInstanceTypesRequest extends js.Object {
  /**
    * DomainName represents the name of the Domain that we are trying to modify. This should be present only if we are querying for list of available Elasticsearch instance types when modifying existing domain. 
    */
  var DomainName: js.UndefOr[typingsSlinky.awsSdk.esMod.DomainName] = js.native
  /**
    * Version of Elasticsearch for which list of supported elasticsearch instance types are needed. 
    */
  var ElasticsearchVersion: ElasticsearchVersionString = js.native
  /**
    *  Set this value to limit the number of results returned. Value provided must be greater than 30 else it wont be honored. 
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.esMod.MaxResults] = js.native
  /**
    * NextToken should be sent in case if earlier API call produced result containing NextToken. It is used for pagination. 
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.esMod.NextToken] = js.native
}

object ListElasticsearchInstanceTypesRequest {
  @scala.inline
  def apply(ElasticsearchVersion: ElasticsearchVersionString): ListElasticsearchInstanceTypesRequest = {
    val __obj = js.Dynamic.literal(ElasticsearchVersion = ElasticsearchVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListElasticsearchInstanceTypesRequest]
  }
  @scala.inline
  implicit class ListElasticsearchInstanceTypesRequestOps[Self <: ListElasticsearchInstanceTypesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElasticsearchVersion(value: ElasticsearchVersionString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticsearchVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainName(value: DomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
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

