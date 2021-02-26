package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyVolumeResult extends StObject {
  
  /**
    * Information about the volume modification.
    */
  var VolumeModification: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.VolumeModification] = js.native
}
object ModifyVolumeResult {
  
  @scala.inline
  def apply(): ModifyVolumeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyVolumeResult]
  }
  
  @scala.inline
  implicit class ModifyVolumeResultMutableBuilder[Self <: ModifyVolumeResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVolumeModification(value: VolumeModification): Self = StObject.set(x, "VolumeModification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeModificationUndefined: Self = StObject.set(x, "VolumeModification", js.undefined)
  }
}
