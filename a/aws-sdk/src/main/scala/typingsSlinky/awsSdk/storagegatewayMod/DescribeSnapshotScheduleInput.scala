package typingsSlinky.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSnapshotScheduleInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the volume. Use the ListVolumes operation to return a list of gateway volumes.
    */
  var VolumeARN: typingsSlinky.awsSdk.storagegatewayMod.VolumeARN = js.native
}
object DescribeSnapshotScheduleInput {
  
  @scala.inline
  def apply(VolumeARN: VolumeARN): DescribeSnapshotScheduleInput = {
    val __obj = js.Dynamic.literal(VolumeARN = VolumeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSnapshotScheduleInput]
  }
  
  @scala.inline
  implicit class DescribeSnapshotScheduleInputMutableBuilder[Self <: DescribeSnapshotScheduleInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVolumeARN(value: VolumeARN): Self = StObject.set(x, "VolumeARN", value.asInstanceOf[js.Any])
  }
}
