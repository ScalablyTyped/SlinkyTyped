package typingsSlinky.apolloEngineReportingProtobuf.protobufMod

import typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.ICachePolicy
import typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.IDetails
import typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.IHTTP
import typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.INode
import typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.IQueryPlanNode
import typingsSlinky.apolloEngineReportingProtobuf.protobufMod.google.protobuf.ITimestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITrace extends js.Object {
  /** Trace cachePolicy */
  var cachePolicy: js.UndefOr[ICachePolicy | Null] = js.native
  /** Trace clientAddress */
  var clientAddress: js.UndefOr[String | Null] = js.native
  /** Trace clientName */
  var clientName: js.UndefOr[String | Null] = js.native
  /** Trace clientReferenceId */
  var clientReferenceId: js.UndefOr[String | Null] = js.native
  /** Trace clientVersion */
  var clientVersion: js.UndefOr[String | Null] = js.native
  /** Trace details */
  var details: js.UndefOr[IDetails | Null] = js.native
  /** Trace durationNs */
  var durationNs: js.UndefOr[Double | Null] = js.native
  /** Trace endTime */
  var endTime: js.UndefOr[ITimestamp | Null] = js.native
  /** Trace forbiddenOperation */
  var forbiddenOperation: js.UndefOr[Boolean | Null] = js.native
  /** Trace fullQueryCacheHit */
  var fullQueryCacheHit: js.UndefOr[Boolean | Null] = js.native
  /** Trace http */
  var http: js.UndefOr[IHTTP | Null] = js.native
  /** Trace legacySignatureNeedsResigning */
  var legacySignatureNeedsResigning: js.UndefOr[String | Null] = js.native
  /** Trace originReportedDurationNs */
  var originReportedDurationNs: js.UndefOr[Double | Null] = js.native
  /** Trace originReportedEndTime */
  var originReportedEndTime: js.UndefOr[ITimestamp | Null] = js.native
  /** Trace originReportedStartTime */
  var originReportedStartTime: js.UndefOr[ITimestamp | Null] = js.native
  /** Trace persistedQueryHit */
  var persistedQueryHit: js.UndefOr[Boolean | Null] = js.native
  /** Trace persistedQueryRegister */
  var persistedQueryRegister: js.UndefOr[Boolean | Null] = js.native
  /** Trace queryPlan */
  var queryPlan: js.UndefOr[IQueryPlanNode | Null] = js.native
  /** Trace registeredOperation */
  var registeredOperation: js.UndefOr[Boolean | Null] = js.native
  /** Trace root */
  var root: js.UndefOr[INode | Null] = js.native
  /** Trace signature */
  var signature: js.UndefOr[String | Null] = js.native
  /** Trace startTime */
  var startTime: js.UndefOr[ITimestamp | Null] = js.native
}

object ITrace {
  @scala.inline
  def apply(): ITrace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITrace]
  }
  @scala.inline
  implicit class ITraceOps[Self <: ITrace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCachePolicy(value: ICachePolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachePolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCachePolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachePolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withCachePolicyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachePolicy")(null)
        ret
    }
    @scala.inline
    def withClientAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withClientAddressNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientAddress")(null)
        ret
    }
    @scala.inline
    def withClientName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientName")(js.undefined)
        ret
    }
    @scala.inline
    def withClientNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientName")(null)
        ret
    }
    @scala.inline
    def withClientReferenceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientReferenceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientReferenceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientReferenceId")(js.undefined)
        ret
    }
    @scala.inline
    def withClientReferenceIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientReferenceId")(null)
        ret
    }
    @scala.inline
    def withClientVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withClientVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientVersion")(null)
        ret
    }
    @scala.inline
    def withDetails(value: IDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(js.undefined)
        ret
    }
    @scala.inline
    def withDetailsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(null)
        ret
    }
    @scala.inline
    def withDurationNs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationNs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationNs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationNs")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationNsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationNs")(null)
        ret
    }
    @scala.inline
    def withEndTime(value: ITimestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTimeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(null)
        ret
    }
    @scala.inline
    def withForbiddenOperation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forbiddenOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForbiddenOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forbiddenOperation")(js.undefined)
        ret
    }
    @scala.inline
    def withForbiddenOperationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forbiddenOperation")(null)
        ret
    }
    @scala.inline
    def withFullQueryCacheHit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullQueryCacheHit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullQueryCacheHit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullQueryCacheHit")(js.undefined)
        ret
    }
    @scala.inline
    def withFullQueryCacheHitNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullQueryCacheHit")(null)
        ret
    }
    @scala.inline
    def withHttp(value: IHTTP): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http")(null)
        ret
    }
    @scala.inline
    def withLegacySignatureNeedsResigning(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legacySignatureNeedsResigning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegacySignatureNeedsResigning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legacySignatureNeedsResigning")(js.undefined)
        ret
    }
    @scala.inline
    def withLegacySignatureNeedsResigningNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legacySignatureNeedsResigning")(null)
        ret
    }
    @scala.inline
    def withOriginReportedDurationNs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originReportedDurationNs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginReportedDurationNs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originReportedDurationNs")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginReportedDurationNsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originReportedDurationNs")(null)
        ret
    }
    @scala.inline
    def withOriginReportedEndTime(value: ITimestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originReportedEndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginReportedEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originReportedEndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginReportedEndTimeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originReportedEndTime")(null)
        ret
    }
    @scala.inline
    def withOriginReportedStartTime(value: ITimestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originReportedStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginReportedStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originReportedStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginReportedStartTimeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originReportedStartTime")(null)
        ret
    }
    @scala.inline
    def withPersistedQueryHit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistedQueryHit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistedQueryHit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistedQueryHit")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistedQueryHitNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistedQueryHit")(null)
        ret
    }
    @scala.inline
    def withPersistedQueryRegister(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistedQueryRegister")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistedQueryRegister: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistedQueryRegister")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistedQueryRegisterNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistedQueryRegister")(null)
        ret
    }
    @scala.inline
    def withQueryPlan(value: IQueryPlanNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryPlan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryPlan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryPlan")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryPlanNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryPlan")(null)
        ret
    }
    @scala.inline
    def withRegisteredOperation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registeredOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegisteredOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registeredOperation")(js.undefined)
        ret
    }
    @scala.inline
    def withRegisteredOperationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registeredOperation")(null)
        ret
    }
    @scala.inline
    def withRoot(value: INode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withRootNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(null)
        ret
    }
    @scala.inline
    def withSignature(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(js.undefined)
        ret
    }
    @scala.inline
    def withSignatureNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(null)
        ret
    }
    @scala.inline
    def withStartTime(value: ITimestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTimeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(null)
        ret
    }
  }
  
}

