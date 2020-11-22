package typingsSlinky.instagramPrivateApi.mediaRepositoryConfigureSidecarResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaRepositoryConfigureSidecarResponseInItem extends js.Object {
  
  var duration_in_video_in_sec: Null = js.native
  
  var position: js.Array[Double] = js.native
  
  var start_time_in_video_in_sec: Null = js.native
  
  var user: MediaRepositoryConfigureSidecarResponseUser = js.native
}
object MediaRepositoryConfigureSidecarResponseInItem {
  
  @scala.inline
  def apply(
    duration_in_video_in_sec: Null,
    position: js.Array[Double],
    start_time_in_video_in_sec: Null,
    user: MediaRepositoryConfigureSidecarResponseUser
  ): MediaRepositoryConfigureSidecarResponseInItem = {
    val __obj = js.Dynamic.literal(duration_in_video_in_sec = duration_in_video_in_sec.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], start_time_in_video_in_sec = start_time_in_video_in_sec.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRepositoryConfigureSidecarResponseInItem]
  }
  
  @scala.inline
  implicit class MediaRepositoryConfigureSidecarResponseInItemOps[Self <: MediaRepositoryConfigureSidecarResponseInItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDuration_in_video_in_sec(value: Null): Self = this.set("duration_in_video_in_sec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionVarargs(value: Double*): Self = this.set("position", js.Array(value :_*))
    
    @scala.inline
    def setPosition(value: js.Array[Double]): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_time_in_video_in_sec(value: Null): Self = this.set("start_time_in_video_in_sec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: MediaRepositoryConfigureSidecarResponseUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
