package typingsSlinky.reactNativeVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnExternalPlaybackChangeData extends js.Object {
  var isExternalPlaybackActive: Boolean = js.native
}

object OnExternalPlaybackChangeData {
  @scala.inline
  def apply(isExternalPlaybackActive: Boolean): OnExternalPlaybackChangeData = {
    val __obj = js.Dynamic.literal(isExternalPlaybackActive = isExternalPlaybackActive.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnExternalPlaybackChangeData]
  }
  @scala.inline
  implicit class OnExternalPlaybackChangeDataOps[Self <: OnExternalPlaybackChangeData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsExternalPlaybackActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExternalPlaybackActive")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

