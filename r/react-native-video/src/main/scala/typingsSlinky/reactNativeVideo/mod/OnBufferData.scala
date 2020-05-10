package typingsSlinky.reactNativeVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnBufferData extends js.Object {
  var isBuffering: Boolean = js.native
}

object OnBufferData {
  @scala.inline
  def apply(isBuffering: Boolean): OnBufferData = {
    val __obj = js.Dynamic.literal(isBuffering = isBuffering.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBufferData]
  }
  @scala.inline
  implicit class OnBufferDataOps[Self <: OnBufferData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsBuffering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBuffering")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

