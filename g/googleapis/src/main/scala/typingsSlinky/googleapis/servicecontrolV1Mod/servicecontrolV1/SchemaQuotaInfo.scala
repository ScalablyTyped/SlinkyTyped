package typingsSlinky.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the quota information for a quota check response.
  */
@js.native
trait SchemaQuotaInfo extends js.Object {
  /**
    * Quota Metrics that have exceeded quota limits. For QuotaGroup-based
    * quota, this is QuotaGroup.name For QuotaLimit-based quota, this is
    * QuotaLimit.name See: google.api.Quota Deprecated: Use quota_metrics to
    * get per quota group limit exceeded status.
    */
  var limitExceeded: js.UndefOr[js.Array[String]] = js.native
  /**
    * Map of quota group name to the actual number of tokens consumed. If the
    * quota check was not successful, then this will not be populated due to no
    * quota consumption.  We are not merging this field with
    * &#39;quota_metrics&#39; field because of the complexity of scaling in
    * Chemist client code base. For simplicity, we will keep this field for
    * Castor (that scales quota usage) and &#39;quota_metrics&#39; for
    * SuperQuota (that doesn&#39;t scale quota usage).
    */
  var quotaConsumed: js.UndefOr[StringDictionary[Double]] = js.native
  /**
    * Quota metrics to indicate the usage. Depending on the check request, one
    * or more of the following metrics will be included:  1. For rate quota,
    * per quota group or per quota metric incremental usage will be specified
    * using the following delta metric:
    * &quot;serviceruntime.googleapis.com/api/consumer/quota_used_count&quot;
    * 2. For allocation quota, per quota metric total usage will be specified
    * using the following gauge metric:
    * &quot;serviceruntime.googleapis.com/allocation/consumer/quota_used_count&quot;
    * 3. For both rate quota and allocation quota, the quota limit reached
    * condition will be specified using the following boolean metric:
    * &quot;serviceruntime.googleapis.com/quota/exceeded&quot;
    */
  var quotaMetrics: js.UndefOr[js.Array[SchemaMetricValueSet]] = js.native
}

object SchemaQuotaInfo {
  @scala.inline
  def apply(): SchemaQuotaInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuotaInfo]
  }
  @scala.inline
  implicit class SchemaQuotaInfoOps[Self <: SchemaQuotaInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLimitExceeded(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitExceeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimitExceeded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitExceeded")(js.undefined)
        ret
    }
    @scala.inline
    def withQuotaConsumed(value: StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaConsumed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotaConsumed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaConsumed")(js.undefined)
        ret
    }
    @scala.inline
    def withQuotaMetrics(value: js.Array[SchemaMetricValueSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotaMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaMetrics")(js.undefined)
        ret
    }
  }
  
}

