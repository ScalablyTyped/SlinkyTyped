package typingsSlinky.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2

import typingsSlinky.googleapis.anon.Code
import typingsSlinky.googleapis.anon.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Operation resource, used to manage asynchronous API requests. (==
  * resource_for v1.globalOperations ==) (== resource_for beta.globalOperations
  * ==) (== resource_for v1.regionOperations ==) (== resource_for
  * beta.regionOperations ==) (== resource_for v1.zoneOperations ==) (==
  * resource_for beta.zoneOperations ==)
  */
@js.native
trait SchemaOperation extends StObject {
  
  /**
    * [Output Only] The value of `requestId` if you provided it in the request.
    * Not present otherwise.
    */
  var clientOperationId: js.UndefOr[String] = js.native
  
  /**
    * [Deprecated] This field is deprecated.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] A textual description of the operation, which is set when
    * the operation is created.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The time that this operation was completed. This value is
    * in RFC3339 text format.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] If errors are generated during processing of the operation,
    * this field will be populated.
    */
  var error: js.UndefOr[`3`] = js.native
  
  /**
    * [Output Only] If the operation fails, this field contains the HTTP error
    * message that was returned, such as NOT FOUND.
    */
  var httpErrorMessage: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] If the operation fails, this field contains the HTTP error
    * status code that was returned. For example, a 404 means the resource was
    * not found.
    */
  var httpErrorStatusCode: js.UndefOr[Double] = js.native
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The time that this operation was requested. This value is
    * in RFC3339 text format.
    */
  var insertTime: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Type of the resource. Always compute#operation for
    * Operation resources.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Name of the resource.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The type of operation, such as insert, update, or delete,
    * and so on.
    */
  var operationType: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] An optional progress indicator that ranges from 0 to 100.
    * There is no requirement that this be linear or support any granularity of
    * operations. This should not be used to guess when the operation will be
    * complete. This number should monotonically increase as the operation
    * progresses.
    */
  var progress: js.UndefOr[Double] = js.native
  
  /**
    * [Output Only] The URL of the region where the operation resides. Only
    * available when performing regional operations. You must specify this
    * field as part of the HTTP request URL. It is not settable as a field in
    * the request body.
    */
  var region: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The time that this operation was started by the server.
    * This value is in RFC3339 text format.
    */
  var startTime: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The status of the operation, which can be one of the
    * following: PENDING, RUNNING, or DONE.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] An optional textual description of the current status of
    * the operation.
    */
  var statusMessage: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The unique target ID, which identifies a specific
    * incarnation of the target resource.
    */
  var targetId: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The URL of the resource that the operation modifies. For
    * operations related to creating a snapshot, this points to the persistent
    * disk that the snapshot was created from.
    */
  var targetLink: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] User who requested the operation, for example:
    * user@example.com.
    */
  var user: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] If warning messages are generated during processing of the
    * operation, this field will be populated.
    */
  var warnings: js.UndefOr[js.Array[Code]] = js.native
  
  /**
    * [Output Only] The URL of the zone where the operation resides. Only
    * available when performing per-zone operations. You must specify this
    * field as part of the HTTP request URL. It is not settable as a field in
    * the request body.
    */
  var zone: js.UndefOr[String] = js.native
}
object SchemaOperation {
  
  @scala.inline
  def apply(): SchemaOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperation]
  }
  
  @scala.inline
  implicit class SchemaOperationMutableBuilder[Self <: SchemaOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientOperationId(value: String): Self = StObject.set(x, "clientOperationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientOperationIdUndefined: Self = StObject.set(x, "clientOperationId", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setError(value: `3`): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setHttpErrorMessage(value: String): Self = StObject.set(x, "httpErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpErrorMessageUndefined: Self = StObject.set(x, "httpErrorMessage", js.undefined)
    
    @scala.inline
    def setHttpErrorStatusCode(value: Double): Self = StObject.set(x, "httpErrorStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpErrorStatusCodeUndefined: Self = StObject.set(x, "httpErrorStatusCode", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInsertTime(value: String): Self = StObject.set(x, "insertTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTimeUndefined: Self = StObject.set(x, "insertTime", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOperationType(value: String): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    @scala.inline
    def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
    
    @scala.inline
    def setTargetLink(value: String): Self = StObject.set(x, "targetLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetLinkUndefined: Self = StObject.set(x, "targetLink", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    @scala.inline
    def setWarnings(value: js.Array[Code]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: Code*): Self = StObject.set(x, "warnings", js.Array(value :_*))
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
