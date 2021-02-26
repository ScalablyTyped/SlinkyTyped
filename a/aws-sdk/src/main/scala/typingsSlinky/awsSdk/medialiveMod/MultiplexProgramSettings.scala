package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiplexProgramSettings extends StObject {
  
  /**
    * Indicates which pipeline is preferred by the multiplex for program ingest.
    */
  var PreferredChannelPipeline: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.PreferredChannelPipeline] = js.native
  
  /**
    * Unique program number.
    */
  var ProgramNumber: integerMin0Max65535 = js.native
  
  /**
    * Transport stream service descriptor configuration for the Multiplex program.
    */
  var ServiceDescriptor: js.UndefOr[MultiplexProgramServiceDescriptor] = js.native
  
  /**
    * Program video settings configuration.
    */
  var VideoSettings: js.UndefOr[MultiplexVideoSettings] = js.native
}
object MultiplexProgramSettings {
  
  @scala.inline
  def apply(ProgramNumber: integerMin0Max65535): MultiplexProgramSettings = {
    val __obj = js.Dynamic.literal(ProgramNumber = ProgramNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiplexProgramSettings]
  }
  
  @scala.inline
  implicit class MultiplexProgramSettingsMutableBuilder[Self <: MultiplexProgramSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreferredChannelPipeline(value: PreferredChannelPipeline): Self = StObject.set(x, "PreferredChannelPipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredChannelPipelineUndefined: Self = StObject.set(x, "PreferredChannelPipeline", js.undefined)
    
    @scala.inline
    def setProgramNumber(value: integerMin0Max65535): Self = StObject.set(x, "ProgramNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceDescriptor(value: MultiplexProgramServiceDescriptor): Self = StObject.set(x, "ServiceDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceDescriptorUndefined: Self = StObject.set(x, "ServiceDescriptor", js.undefined)
    
    @scala.inline
    def setVideoSettings(value: MultiplexVideoSettings): Self = StObject.set(x, "VideoSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoSettingsUndefined: Self = StObject.set(x, "VideoSettings", js.undefined)
  }
}
