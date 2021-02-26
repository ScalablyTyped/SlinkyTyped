package typingsSlinky.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchModifyClusterSnapshotsOutputMessage extends StObject {
  
  /**
    * A list of any errors returned.
    */
  var Errors: js.UndefOr[BatchSnapshotOperationErrors] = js.native
  
  /**
    * A list of the snapshots that were modified.
    */
  var Resources: js.UndefOr[SnapshotIdentifierList] = js.native
}
object BatchModifyClusterSnapshotsOutputMessage {
  
  @scala.inline
  def apply(): BatchModifyClusterSnapshotsOutputMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchModifyClusterSnapshotsOutputMessage]
  }
  
  @scala.inline
  implicit class BatchModifyClusterSnapshotsOutputMessageMutableBuilder[Self <: BatchModifyClusterSnapshotsOutputMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: BatchSnapshotOperationErrors): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: SnapshotErrorMessage*): Self = StObject.set(x, "Errors", js.Array(value :_*))
    
    @scala.inline
    def setResources(value: SnapshotIdentifierList): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: String*): Self = StObject.set(x, "Resources", js.Array(value :_*))
  }
}
