package typingsSlinky.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AntennaDownlinkDemodDecodeConfig extends StObject {
  
  /**
    * Information about the decode Config.
    */
  var decodeConfig: DecodeConfig = js.native
  
  /**
    * Information about the demodulation Config.
    */
  var demodulationConfig: DemodulationConfig = js.native
  
  /**
    * Information about the spectral Config.
    */
  var spectrumConfig: SpectrumConfig = js.native
}
object AntennaDownlinkDemodDecodeConfig {
  
  @scala.inline
  def apply(decodeConfig: DecodeConfig, demodulationConfig: DemodulationConfig, spectrumConfig: SpectrumConfig): AntennaDownlinkDemodDecodeConfig = {
    val __obj = js.Dynamic.literal(decodeConfig = decodeConfig.asInstanceOf[js.Any], demodulationConfig = demodulationConfig.asInstanceOf[js.Any], spectrumConfig = spectrumConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntennaDownlinkDemodDecodeConfig]
  }
  
  @scala.inline
  implicit class AntennaDownlinkDemodDecodeConfigMutableBuilder[Self <: AntennaDownlinkDemodDecodeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecodeConfig(value: DecodeConfig): Self = StObject.set(x, "decodeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDemodulationConfig(value: DemodulationConfig): Self = StObject.set(x, "demodulationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpectrumConfig(value: SpectrumConfig): Self = StObject.set(x, "spectrumConfig", value.asInstanceOf[js.Any])
  }
}
