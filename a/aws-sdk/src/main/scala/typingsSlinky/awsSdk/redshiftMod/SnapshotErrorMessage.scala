package typingsSlinky.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotErrorMessage extends StObject {
  
  /**
    * The failure code for the error.
    */
  var FailureCode: js.UndefOr[String] = js.native
  
  /**
    * The text message describing the error.
    */
  var FailureReason: js.UndefOr[String] = js.native
  
  /**
    * A unique identifier for the cluster.
    */
  var SnapshotClusterIdentifier: js.UndefOr[String] = js.native
  
  /**
    * A unique identifier for the snapshot returning the error.
    */
  var SnapshotIdentifier: js.UndefOr[String] = js.native
}
object SnapshotErrorMessage {
  
  @scala.inline
  def apply(): SnapshotErrorMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotErrorMessage]
  }
  
  @scala.inline
  implicit class SnapshotErrorMessageMutableBuilder[Self <: SnapshotErrorMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailureCode(value: String): Self = StObject.set(x, "FailureCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureCodeUndefined: Self = StObject.set(x, "FailureCode", js.undefined)
    
    @scala.inline
    def setFailureReason(value: String): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    @scala.inline
    def setSnapshotClusterIdentifier(value: String): Self = StObject.set(x, "SnapshotClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotClusterIdentifierUndefined: Self = StObject.set(x, "SnapshotClusterIdentifier", js.undefined)
    
    @scala.inline
    def setSnapshotIdentifier(value: String): Self = StObject.set(x, "SnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotIdentifierUndefined: Self = StObject.set(x, "SnapshotIdentifier", js.undefined)
  }
}
