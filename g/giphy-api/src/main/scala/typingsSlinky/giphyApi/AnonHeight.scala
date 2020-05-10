package typingsSlinky.giphyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHeight extends js.Object {
  var height: String = js.native
  var mp4: String = js.native
  var mp4_size: String = js.native
  var width: String = js.native
}

object AnonHeight {
  @scala.inline
  def apply(height: String, mp4: String, mp4_size: String, width: String): AnonHeight = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], mp4 = mp4.asInstanceOf[js.Any], mp4_size = mp4_size.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeight]
  }
  @scala.inline
  implicit class AnonHeightOps[Self <: AnonHeight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMp4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mp4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMp4_size(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mp4_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

