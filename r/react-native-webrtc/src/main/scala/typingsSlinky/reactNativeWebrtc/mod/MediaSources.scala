package typingsSlinky.reactNativeWebrtc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaSources extends js.Object {
  var sourceId: String = js.native
}

object MediaSources {
  @scala.inline
  def apply(sourceId: String): MediaSources = {
    val __obj = js.Dynamic.literal(sourceId = sourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSources]
  }
  @scala.inline
  implicit class MediaSourcesOps[Self <: MediaSources] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

