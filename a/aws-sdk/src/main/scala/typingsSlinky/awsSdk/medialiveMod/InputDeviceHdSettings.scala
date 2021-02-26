package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputDeviceHdSettings extends StObject {
  
  /**
    * If you specified Auto as the configured input, specifies which of the sources is currently active (SDI or HDMI).
    */
  var ActiveInput: js.UndefOr[InputDeviceActiveInput] = js.native
  
  /**
    * The source at the input device that is currently active. You can specify this source.
    */
  var ConfiguredInput: js.UndefOr[InputDeviceConfiguredInput] = js.native
  
  /**
    * The state of the input device.
    */
  var DeviceState: js.UndefOr[InputDeviceState] = js.native
  
  /**
    * The frame rate of the video source.
    */
  var Framerate: js.UndefOr[double] = js.native
  
  /**
    * The height of the video source, in pixels.
    */
  var Height: js.UndefOr[integer] = js.native
  
  /**
    * The current maximum bitrate for ingesting this source, in bits per second. You can specify this maximum.
    */
  var MaxBitrate: js.UndefOr[integer] = js.native
  
  /**
    * The scan type of the video source.
    */
  var ScanType: js.UndefOr[InputDeviceScanType] = js.native
  
  /**
    * The width of the video source, in pixels.
    */
  var Width: js.UndefOr[integer] = js.native
}
object InputDeviceHdSettings {
  
  @scala.inline
  def apply(): InputDeviceHdSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputDeviceHdSettings]
  }
  
  @scala.inline
  implicit class InputDeviceHdSettingsMutableBuilder[Self <: InputDeviceHdSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveInput(value: InputDeviceActiveInput): Self = StObject.set(x, "ActiveInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveInputUndefined: Self = StObject.set(x, "ActiveInput", js.undefined)
    
    @scala.inline
    def setConfiguredInput(value: InputDeviceConfiguredInput): Self = StObject.set(x, "ConfiguredInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfiguredInputUndefined: Self = StObject.set(x, "ConfiguredInput", js.undefined)
    
    @scala.inline
    def setDeviceState(value: InputDeviceState): Self = StObject.set(x, "DeviceState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceStateUndefined: Self = StObject.set(x, "DeviceState", js.undefined)
    
    @scala.inline
    def setFramerate(value: double): Self = StObject.set(x, "Framerate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramerateUndefined: Self = StObject.set(x, "Framerate", js.undefined)
    
    @scala.inline
    def setHeight(value: integer): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "Height", js.undefined)
    
    @scala.inline
    def setMaxBitrate(value: integer): Self = StObject.set(x, "MaxBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBitrateUndefined: Self = StObject.set(x, "MaxBitrate", js.undefined)
    
    @scala.inline
    def setScanType(value: InputDeviceScanType): Self = StObject.set(x, "ScanType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanTypeUndefined: Self = StObject.set(x, "ScanType", js.undefined)
    
    @scala.inline
    def setWidth(value: integer): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "Width", js.undefined)
  }
}
