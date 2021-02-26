package typingsSlinky.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request used for `CreateWorkerPool`.
  */
@js.native
trait SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateWorkerPoolRequest extends StObject {
  
  /**
    * Resource name of the instance in which to create the new worker pool.
    * Format: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`.
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * ID of the created worker pool. A valid pool ID must: be 6-50 characters
    * long, contain only lowercase letters, digits, hyphens and underscores,
    * start with a lowercase letter, and end with a lowercase letter or a
    * digit.
    */
  var poolId: js.UndefOr[String] = js.native
  
  /**
    * Specifies the worker pool to create. The name in the worker pool, if
    * specified, is ignored.
    */
  var workerPool: js.UndefOr[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool] = js.native
}
object SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateWorkerPoolRequest {
  
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateWorkerPoolRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateWorkerPoolRequest]
  }
  
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateWorkerPoolRequestMutableBuilder[Self <: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateWorkerPoolRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setPoolId(value: String): Self = StObject.set(x, "poolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolIdUndefined: Self = StObject.set(x, "poolId", js.undefined)
    
    @scala.inline
    def setWorkerPool(value: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool): Self = StObject.set(x, "workerPool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerPoolUndefined: Self = StObject.set(x, "workerPool", js.undefined)
  }
}
