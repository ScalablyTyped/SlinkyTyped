package typingsSlinky.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainStatus extends js.Object {
  var ARN: js.UndefOr[typingsSlinky.awsSdk.cloudsearchMod.ARN] = js.native
  /**
    * True if the search domain is created. It can take several minutes to initialize a domain when CreateDomain is called. Newly created search domains are returned from DescribeDomains with a false value for Created until domain creation is complete.
    */
  var Created: js.UndefOr[Boolean] = js.native
  /**
    * True if the search domain has been deleted. The system must clean up resources dedicated to the search domain when DeleteDomain is called. Newly deleted search domains are returned from DescribeDomains with a true value for IsDeleted for several minutes until resource cleanup is complete.
    */
  var Deleted: js.UndefOr[Boolean] = js.native
  /**
    * The service endpoint for updating documents in a search domain.
    */
  var DocService: js.UndefOr[ServiceEndpoint] = js.native
  var DomainId: typingsSlinky.awsSdk.cloudsearchMod.DomainId = js.native
  var DomainName: typingsSlinky.awsSdk.cloudsearchMod.DomainName = js.native
  var Limits: js.UndefOr[typingsSlinky.awsSdk.cloudsearchMod.Limits] = js.native
  /**
    * True if processing is being done to activate the current domain configuration.
    */
  var Processing: js.UndefOr[Boolean] = js.native
  /**
    * True if IndexDocuments needs to be called to activate the current domain configuration.
    */
  var RequiresIndexDocuments: Boolean = js.native
  /**
    * The number of search instances that are available to process search requests.
    */
  var SearchInstanceCount: js.UndefOr[InstanceCount] = js.native
  /**
    * The instance type that is being used to process search requests.
    */
  var SearchInstanceType: js.UndefOr[typingsSlinky.awsSdk.cloudsearchMod.SearchInstanceType] = js.native
  /**
    * The number of partitions across which the search index is spread.
    */
  var SearchPartitionCount: js.UndefOr[PartitionCount] = js.native
  /**
    * The service endpoint for requesting search results from a search domain.
    */
  var SearchService: js.UndefOr[ServiceEndpoint] = js.native
}

object DomainStatus {
  @scala.inline
  def apply(DomainId: DomainId, DomainName: DomainName, RequiresIndexDocuments: Boolean): DomainStatus = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], RequiresIndexDocuments = RequiresIndexDocuments.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainStatus]
  }
  @scala.inline
  implicit class DomainStatusOps[Self <: DomainStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainId(value: DomainId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainName(value: DomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequiresIndexDocuments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequiresIndexDocuments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withARN(value: ARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARN")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Created")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Deleted")(js.undefined)
        ret
    }
    @scala.inline
    def withDocService(value: ServiceEndpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocService")(js.undefined)
        ret
    }
    @scala.inline
    def withLimits(value: Limits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limits")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Processing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Processing")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchInstanceCount(value: InstanceCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SearchInstanceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchInstanceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SearchInstanceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchInstanceType(value: SearchInstanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SearchInstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SearchInstanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchPartitionCount(value: PartitionCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SearchPartitionCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchPartitionCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SearchPartitionCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchService(value: ServiceEndpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SearchService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SearchService")(js.undefined)
        ret
    }
  }
  
}

