package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmbeddedSourceSettings extends StObject {
  
  /**
    * If upconvert, 608 data is both passed through via the "608 compatibility bytes" fields of the 708 wrapper as well as translated into 708. 708 data present in the source content will be discarded.
    */
  var Convert608To708: js.UndefOr[EmbeddedConvert608To708] = js.native
  
  /**
    * Set to "auto" to handle streams with intermittent and/or non-aligned SCTE-20 and Embedded captions.
    */
  var Scte20Detection: js.UndefOr[EmbeddedScte20Detection] = js.native
  
  /**
    * Specifies the 608/708 channel number within the video track from which to extract captions. Unused for passthrough.
    */
  var Source608ChannelNumber: js.UndefOr[integerMin1Max4] = js.native
  
  /**
    * This field is unused and deprecated.
    */
  var Source608TrackNumber: js.UndefOr[integerMin1Max5] = js.native
}
object EmbeddedSourceSettings {
  
  @scala.inline
  def apply(): EmbeddedSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmbeddedSourceSettings]
  }
  
  @scala.inline
  implicit class EmbeddedSourceSettingsMutableBuilder[Self <: EmbeddedSourceSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConvert608To708(value: EmbeddedConvert608To708): Self = StObject.set(x, "Convert608To708", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvert608To708Undefined: Self = StObject.set(x, "Convert608To708", js.undefined)
    
    @scala.inline
    def setScte20Detection(value: EmbeddedScte20Detection): Self = StObject.set(x, "Scte20Detection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScte20DetectionUndefined: Self = StObject.set(x, "Scte20Detection", js.undefined)
    
    @scala.inline
    def setSource608ChannelNumber(value: integerMin1Max4): Self = StObject.set(x, "Source608ChannelNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource608ChannelNumberUndefined: Self = StObject.set(x, "Source608ChannelNumber", js.undefined)
    
    @scala.inline
    def setSource608TrackNumber(value: integerMin1Max5): Self = StObject.set(x, "Source608TrackNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource608TrackNumberUndefined: Self = StObject.set(x, "Source608TrackNumber", js.undefined)
  }
}
