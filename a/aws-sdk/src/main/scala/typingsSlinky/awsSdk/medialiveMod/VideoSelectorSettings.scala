package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoSelectorSettings extends StObject {
  
  var VideoSelectorPid: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.VideoSelectorPid] = js.native
  
  var VideoSelectorProgramId: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.VideoSelectorProgramId] = js.native
}
object VideoSelectorSettings {
  
  @scala.inline
  def apply(): VideoSelectorSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoSelectorSettings]
  }
  
  @scala.inline
  implicit class VideoSelectorSettingsMutableBuilder[Self <: VideoSelectorSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVideoSelectorPid(value: VideoSelectorPid): Self = StObject.set(x, "VideoSelectorPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoSelectorPidUndefined: Self = StObject.set(x, "VideoSelectorPid", js.undefined)
    
    @scala.inline
    def setVideoSelectorProgramId(value: VideoSelectorProgramId): Self = StObject.set(x, "VideoSelectorProgramId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoSelectorProgramIdUndefined: Self = StObject.set(x, "VideoSelectorProgramId", js.undefined)
  }
}
