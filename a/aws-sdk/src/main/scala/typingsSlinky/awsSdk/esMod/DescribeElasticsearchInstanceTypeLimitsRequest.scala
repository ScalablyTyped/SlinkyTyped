package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeElasticsearchInstanceTypeLimitsRequest extends js.Object {
  /**
    *  DomainName represents the name of the Domain that we are trying to modify. This should be present only if we are querying for Elasticsearch  Limits  for existing domain. 
    */
  var DomainName: js.UndefOr[typingsSlinky.awsSdk.esMod.DomainName] = js.native
  /**
    *  Version of Elasticsearch for which  Limits  are needed. 
    */
  var ElasticsearchVersion: ElasticsearchVersionString = js.native
  /**
    *  The instance type for an Elasticsearch cluster for which Elasticsearch  Limits  are needed. 
    */
  var InstanceType: ESPartitionInstanceType = js.native
}

object DescribeElasticsearchInstanceTypeLimitsRequest {
  @scala.inline
  def apply(ElasticsearchVersion: ElasticsearchVersionString, InstanceType: ESPartitionInstanceType): DescribeElasticsearchInstanceTypeLimitsRequest = {
    val __obj = js.Dynamic.literal(ElasticsearchVersion = ElasticsearchVersion.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeElasticsearchInstanceTypeLimitsRequest]
  }
  @scala.inline
  implicit class DescribeElasticsearchInstanceTypeLimitsRequestOps[Self <: DescribeElasticsearchInstanceTypeLimitsRequest] (val x: Self) extends AnyVal {
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
    def withInstanceType(value: ESPartitionInstanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(value.asInstanceOf[js.Any])
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
  }
  
}

