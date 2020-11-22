package typingsSlinky.instagramPrivateApi.likedFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LikedFeedResponseInItem extends js.Object {
  
  var duration_in_video_in_sec: Null = js.native
  
  var position: js.Array[Double | String] = js.native
  
  var start_time_in_video_in_sec: Null = js.native
  
  var user: LikedFeedResponseUser = js.native
}
object LikedFeedResponseInItem {
  
  @scala.inline
  def apply(
    duration_in_video_in_sec: Null,
    position: js.Array[Double | String],
    start_time_in_video_in_sec: Null,
    user: LikedFeedResponseUser
  ): LikedFeedResponseInItem = {
    val __obj = js.Dynamic.literal(duration_in_video_in_sec = duration_in_video_in_sec.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], start_time_in_video_in_sec = start_time_in_video_in_sec.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[LikedFeedResponseInItem]
  }
  
  @scala.inline
  implicit class LikedFeedResponseInItemOps[Self <: LikedFeedResponseInItem] (val x: Self) extends AnyVal {
    
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
    def setPositionVarargs(value: (Double | String)*): Self = this.set("position", js.Array(value :_*))
    
    @scala.inline
    def setPosition(value: js.Array[Double | String]): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_time_in_video_in_sec(value: Null): Self = this.set("start_time_in_video_in_sec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: LikedFeedResponseUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
