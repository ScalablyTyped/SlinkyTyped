package typingsSlinky.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListVolumeRecoveryPointsOutput extends StObject {
  
  var GatewayARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.GatewayARN] = js.native
  
  /**
    * An array of VolumeRecoveryPointInfo objects.
    */
  var VolumeRecoveryPointInfos: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.VolumeRecoveryPointInfos] = js.native
}
object ListVolumeRecoveryPointsOutput {
  
  @scala.inline
  def apply(): ListVolumeRecoveryPointsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVolumeRecoveryPointsOutput]
  }
  
  @scala.inline
  implicit class ListVolumeRecoveryPointsOutputMutableBuilder[Self <: ListVolumeRecoveryPointsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
    
    @scala.inline
    def setVolumeRecoveryPointInfos(value: VolumeRecoveryPointInfos): Self = StObject.set(x, "VolumeRecoveryPointInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeRecoveryPointInfosUndefined: Self = StObject.set(x, "VolumeRecoveryPointInfos", js.undefined)
    
    @scala.inline
    def setVolumeRecoveryPointInfosVarargs(value: VolumeRecoveryPointInfo*): Self = StObject.set(x, "VolumeRecoveryPointInfos", js.Array(value :_*))
  }
}
