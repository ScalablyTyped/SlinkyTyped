package typingsSlinky.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileGroupSettings extends StObject {
  
  /**
    * Use Destination (Destination) to specify the S3 output location and the output filename base. Destination accepts format identifiers. If you do not specify the base filename in the URI, the service will use the filename of the input file. If your job has multiple inputs, the service uses the filename of the first input file.
    */
  var Destination: js.UndefOr[stringPatternS3] = js.native
  
  /**
    * Settings associated with the destination. Will vary based on the type of destination
    */
  var DestinationSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.DestinationSettings] = js.native
}
object FileGroupSettings {
  
  @scala.inline
  def apply(): FileGroupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileGroupSettings]
  }
  
  @scala.inline
  implicit class FileGroupSettingsMutableBuilder[Self <: FileGroupSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: stringPatternS3): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationSettings(value: DestinationSettings): Self = StObject.set(x, "DestinationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationSettingsUndefined: Self = StObject.set(x, "DestinationSettings", js.undefined)
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
  }
}
