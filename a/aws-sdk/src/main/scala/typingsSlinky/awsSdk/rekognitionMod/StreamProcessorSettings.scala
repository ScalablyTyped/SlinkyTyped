package typingsSlinky.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamProcessorSettings extends StObject {
  
  /**
    * Face search settings to use on a streaming video. 
    */
  var FaceSearch: js.UndefOr[FaceSearchSettings] = js.native
}
object StreamProcessorSettings {
  
  @scala.inline
  def apply(): StreamProcessorSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamProcessorSettings]
  }
  
  @scala.inline
  implicit class StreamProcessorSettingsMutableBuilder[Self <: StreamProcessorSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFaceSearch(value: FaceSearchSettings): Self = StObject.set(x, "FaceSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceSearchUndefined: Self = StObject.set(x, "FaceSearch", js.undefined)
  }
}
