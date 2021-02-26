package typingsSlinky.apolloReportingProtobuf.protobufMod

import typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.ICachePolicy
import typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.IDetails
import typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.IHTTP
import typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.INode
import typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.IQueryPlanNode
import typingsSlinky.apolloReportingProtobuf.protobufMod.google.protobuf.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITrace extends StObject {
  
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
  
  /** Trace unexecutedOperationBody */
  var unexecutedOperationBody: js.UndefOr[String | Null] = js.native
  
  /** Trace unexecutedOperationName */
  var unexecutedOperationName: js.UndefOr[String | Null] = js.native
}
object ITrace {
  
  @scala.inline
  def apply(): ITrace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITrace]
  }
  
  @scala.inline
  implicit class ITraceMutableBuilder[Self <: ITrace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCachePolicy(value: ICachePolicy): Self = StObject.set(x, "cachePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCachePolicyNull: Self = StObject.set(x, "cachePolicy", null)
    
    @scala.inline
    def setCachePolicyUndefined: Self = StObject.set(x, "cachePolicy", js.undefined)
    
    @scala.inline
    def setClientAddress(value: String): Self = StObject.set(x, "clientAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientAddressNull: Self = StObject.set(x, "clientAddress", null)
    
    @scala.inline
    def setClientAddressUndefined: Self = StObject.set(x, "clientAddress", js.undefined)
    
    @scala.inline
    def setClientName(value: String): Self = StObject.set(x, "clientName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientNameNull: Self = StObject.set(x, "clientName", null)
    
    @scala.inline
    def setClientNameUndefined: Self = StObject.set(x, "clientName", js.undefined)
    
    @scala.inline
    def setClientReferenceId(value: String): Self = StObject.set(x, "clientReferenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientReferenceIdNull: Self = StObject.set(x, "clientReferenceId", null)
    
    @scala.inline
    def setClientReferenceIdUndefined: Self = StObject.set(x, "clientReferenceId", js.undefined)
    
    @scala.inline
    def setClientVersion(value: String): Self = StObject.set(x, "clientVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientVersionNull: Self = StObject.set(x, "clientVersion", null)
    
    @scala.inline
    def setClientVersionUndefined: Self = StObject.set(x, "clientVersion", js.undefined)
    
    @scala.inline
    def setDetails(value: IDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsNull: Self = StObject.set(x, "details", null)
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setDurationNs(value: Double): Self = StObject.set(x, "durationNs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationNsNull: Self = StObject.set(x, "durationNs", null)
    
    @scala.inline
    def setDurationNsUndefined: Self = StObject.set(x, "durationNs", js.undefined)
    
    @scala.inline
    def setEndTime(value: ITimestamp): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setForbiddenOperation(value: Boolean): Self = StObject.set(x, "forbiddenOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForbiddenOperationNull: Self = StObject.set(x, "forbiddenOperation", null)
    
    @scala.inline
    def setForbiddenOperationUndefined: Self = StObject.set(x, "forbiddenOperation", js.undefined)
    
    @scala.inline
    def setFullQueryCacheHit(value: Boolean): Self = StObject.set(x, "fullQueryCacheHit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullQueryCacheHitNull: Self = StObject.set(x, "fullQueryCacheHit", null)
    
    @scala.inline
    def setFullQueryCacheHitUndefined: Self = StObject.set(x, "fullQueryCacheHit", js.undefined)
    
    @scala.inline
    def setHttp(value: IHTTP): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpNull: Self = StObject.set(x, "http", null)
    
    @scala.inline
    def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
    
    @scala.inline
    def setLegacySignatureNeedsResigning(value: String): Self = StObject.set(x, "legacySignatureNeedsResigning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegacySignatureNeedsResigningNull: Self = StObject.set(x, "legacySignatureNeedsResigning", null)
    
    @scala.inline
    def setLegacySignatureNeedsResigningUndefined: Self = StObject.set(x, "legacySignatureNeedsResigning", js.undefined)
    
    @scala.inline
    def setPersistedQueryHit(value: Boolean): Self = StObject.set(x, "persistedQueryHit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistedQueryHitNull: Self = StObject.set(x, "persistedQueryHit", null)
    
    @scala.inline
    def setPersistedQueryHitUndefined: Self = StObject.set(x, "persistedQueryHit", js.undefined)
    
    @scala.inline
    def setPersistedQueryRegister(value: Boolean): Self = StObject.set(x, "persistedQueryRegister", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistedQueryRegisterNull: Self = StObject.set(x, "persistedQueryRegister", null)
    
    @scala.inline
    def setPersistedQueryRegisterUndefined: Self = StObject.set(x, "persistedQueryRegister", js.undefined)
    
    @scala.inline
    def setQueryPlan(value: IQueryPlanNode): Self = StObject.set(x, "queryPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryPlanNull: Self = StObject.set(x, "queryPlan", null)
    
    @scala.inline
    def setQueryPlanUndefined: Self = StObject.set(x, "queryPlan", js.undefined)
    
    @scala.inline
    def setRegisteredOperation(value: Boolean): Self = StObject.set(x, "registeredOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisteredOperationNull: Self = StObject.set(x, "registeredOperation", null)
    
    @scala.inline
    def setRegisteredOperationUndefined: Self = StObject.set(x, "registeredOperation", js.undefined)
    
    @scala.inline
    def setRoot(value: INode): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNull: Self = StObject.set(x, "root", null)
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureNull: Self = StObject.set(x, "signature", null)
    
    @scala.inline
    def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    @scala.inline
    def setStartTime(value: ITimestamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setUnexecutedOperationBody(value: String): Self = StObject.set(x, "unexecutedOperationBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnexecutedOperationBodyNull: Self = StObject.set(x, "unexecutedOperationBody", null)
    
    @scala.inline
    def setUnexecutedOperationBodyUndefined: Self = StObject.set(x, "unexecutedOperationBody", js.undefined)
    
    @scala.inline
    def setUnexecutedOperationName(value: String): Self = StObject.set(x, "unexecutedOperationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnexecutedOperationNameNull: Self = StObject.set(x, "unexecutedOperationName", null)
    
    @scala.inline
    def setUnexecutedOperationNameUndefined: Self = StObject.set(x, "unexecutedOperationName", js.undefined)
  }
}
