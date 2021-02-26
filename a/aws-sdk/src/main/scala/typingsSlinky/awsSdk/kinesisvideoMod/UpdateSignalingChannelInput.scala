package typingsSlinky.awsSdk.kinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSignalingChannelInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the signaling channel that you want to update.
    */
  var ChannelARN: ResourceARN = js.native
  
  /**
    * The current version of the signaling channel that you want to update.
    */
  var CurrentVersion: Version = js.native
  
  /**
    * The structure containing the configuration for the SINGLE_MASTER type of the signaling channel that you want to update. 
    */
  var SingleMasterConfiguration: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoMod.SingleMasterConfiguration] = js.native
}
object UpdateSignalingChannelInput {
  
  @scala.inline
  def apply(ChannelARN: ResourceARN, CurrentVersion: Version): UpdateSignalingChannelInput = {
    val __obj = js.Dynamic.literal(ChannelARN = ChannelARN.asInstanceOf[js.Any], CurrentVersion = CurrentVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSignalingChannelInput]
  }
  
  @scala.inline
  implicit class UpdateSignalingChannelInputMutableBuilder[Self <: UpdateSignalingChannelInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelARN(value: ResourceARN): Self = StObject.set(x, "ChannelARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentVersion(value: Version): Self = StObject.set(x, "CurrentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleMasterConfiguration(value: SingleMasterConfiguration): Self = StObject.set(x, "SingleMasterConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleMasterConfigurationUndefined: Self = StObject.set(x, "SingleMasterConfiguration", js.undefined)
  }
}
