package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationSnapshotConfigurationUpdate extends StObject {
  
  /**
    * Describes updates to whether snapshots are enabled for a Flink-based Kinesis Data Analytics application.
    */
  var SnapshotsEnabledUpdate: BooleanObject = js.native
}
object ApplicationSnapshotConfigurationUpdate {
  
  @scala.inline
  def apply(SnapshotsEnabledUpdate: BooleanObject): ApplicationSnapshotConfigurationUpdate = {
    val __obj = js.Dynamic.literal(SnapshotsEnabledUpdate = SnapshotsEnabledUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationSnapshotConfigurationUpdate]
  }
  
  @scala.inline
  implicit class ApplicationSnapshotConfigurationUpdateMutableBuilder[Self <: ApplicationSnapshotConfigurationUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnapshotsEnabledUpdate(value: BooleanObject): Self = StObject.set(x, "SnapshotsEnabledUpdate", value.asInstanceOf[js.Any])
  }
}
