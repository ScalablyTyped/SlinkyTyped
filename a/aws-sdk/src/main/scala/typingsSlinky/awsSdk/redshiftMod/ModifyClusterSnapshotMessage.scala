package typingsSlinky.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyClusterSnapshotMessage extends StObject {
  
  /**
    * A Boolean option to override an exception if the retention period has already passed.
    */
  var Force: js.UndefOr[Boolean] = js.native
  
  /**
    * The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained indefinitely. If the manual snapshot falls outside of the new retention period, you can specify the force option to immediately delete the snapshot. The value must be either -1 or an integer between 1 and 3,653.
    */
  var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The identifier of the snapshot whose setting you want to modify.
    */
  var SnapshotIdentifier: String = js.native
}
object ModifyClusterSnapshotMessage {
  
  @scala.inline
  def apply(SnapshotIdentifier: String): ModifyClusterSnapshotMessage = {
    val __obj = js.Dynamic.literal(SnapshotIdentifier = SnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClusterSnapshotMessage]
  }
  
  @scala.inline
  implicit class ModifyClusterSnapshotMessageMutableBuilder[Self <: ModifyClusterSnapshotMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForce(value: Boolean): Self = StObject.set(x, "Force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "Force", js.undefined)
    
    @scala.inline
    def setManualSnapshotRetentionPeriod(value: IntegerOptional): Self = StObject.set(x, "ManualSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualSnapshotRetentionPeriodUndefined: Self = StObject.set(x, "ManualSnapshotRetentionPeriod", js.undefined)
    
    @scala.inline
    def setSnapshotIdentifier(value: String): Self = StObject.set(x, "SnapshotIdentifier", value.asInstanceOf[js.Any])
  }
}
