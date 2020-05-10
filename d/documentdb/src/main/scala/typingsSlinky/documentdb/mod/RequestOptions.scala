package typingsSlinky.documentdb.mod

import typingsSlinky.documentdb.AnonCondition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestOptions extends js.Object {
  /** Conditions Associated with the request. */
  var accessCondition: js.UndefOr[AnonCondition] = js.native
  /** Consistency level required by the client. */
  var consistencyLevel: js.UndefOr[String] = js.native
  /**
    * Allow execution across multiple partitions
    *
    * If the collection is partitioned, this must be set to True unless the query filters against a single partition key
    * or if the collection has only a single partition.
    */
  var enableCrossPartitionQuery: js.UndefOr[Boolean] = js.native
  /** Specifies indexing directives (index, do not index ..etc). */
  var indexingDirective: js.UndefOr[String] = js.native
  /** If true, parallelize cross-partition queries */
  var maxDegreeOfParallelism: js.UndefOr[Boolean] = js.native
  /**
    * The user-specified throughput when creating document collections.
    *
    * Expressed in units of 100 request units per second. This can be between 400 and 250,000 (or higher by requesting a limit increase).
    *
    * If the x-ms-offer-throughput is over 10,000, then the collection must include a partitionKey definition.
    * If the x-ms-offer-throughput is equal to or under 10,000, then the collection must not include a partitionKey definition.
    *
    * One of x-ms-offer-throughput or x-ms-offer-type must be specified. Both headers cannot be specified together.
    */
  var offerThroughput: js.UndefOr[Double] = js.native
  /** Offer type when creating document collections. */
  var offerType: js.UndefOr[String] = js.native
  /**
    * The partition key value for the requested document or attachment operation.
    *
    * Required for operations against documents and attachments when the collection definition includes a partition key definition.
    */
  var partitionKey: js.UndefOr[String | js.Array[String]] = js.native
  /** If true, populate quota in response */
  var populateQuotaInfo: js.UndefOr[Boolean] = js.native
  /** Indicates what is the post trigger to be invoked after the operation. */
  var postTriggerInclude: js.UndefOr[String] = js.native
  /** Indicates what is the pre trigger to be invoked before the operation. */
  var preTriggerInclude: js.UndefOr[String] = js.native
  /** Expiry time (in seconds) for resource token associated with permission (applicable only for requests on permissions). */
  var resourceTokenExpirySeconds: js.UndefOr[Double] = js.native
  /** Token for use with Session consistency. */
  var sessionToken: js.UndefOr[String] = js.native
}

object RequestOptions {
  @scala.inline
  def apply(): RequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestOptions]
  }
  @scala.inline
  implicit class RequestOptionsOps[Self <: RequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessCondition(value: AnonCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessCondition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessCondition")(js.undefined)
        ret
    }
    @scala.inline
    def withConsistencyLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consistencyLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsistencyLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consistencyLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCrossPartitionQuery(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCrossPartitionQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCrossPartitionQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCrossPartitionQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexingDirective(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexingDirective")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexingDirective: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexingDirective")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDegreeOfParallelism(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDegreeOfParallelism")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDegreeOfParallelism: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDegreeOfParallelism")(js.undefined)
        ret
    }
    @scala.inline
    def withOfferThroughput(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerThroughput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfferThroughput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerThroughput")(js.undefined)
        ret
    }
    @scala.inline
    def withOfferType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfferType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerType")(js.undefined)
        ret
    }
    @scala.inline
    def withPartitionKey(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartitionKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitionKey")(js.undefined)
        ret
    }
    @scala.inline
    def withPopulateQuotaInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("populateQuotaInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopulateQuotaInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("populateQuotaInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withPostTriggerInclude(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postTriggerInclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostTriggerInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postTriggerInclude")(js.undefined)
        ret
    }
    @scala.inline
    def withPreTriggerInclude(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preTriggerInclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreTriggerInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preTriggerInclude")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceTokenExpirySeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceTokenExpirySeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceTokenExpirySeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceTokenExpirySeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionToken")(js.undefined)
        ret
    }
  }
  
}

