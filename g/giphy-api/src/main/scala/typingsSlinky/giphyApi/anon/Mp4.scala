package typingsSlinky.giphyApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mp4 extends js.Object {
  var mp4: String = js.native
}

object Mp4 {
  @scala.inline
  def apply(mp4: String): Mp4 = {
    val __obj = js.Dynamic.literal(mp4 = mp4.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mp4]
  }
  @scala.inline
  implicit class Mp4Ops[Self <: Mp4] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMp4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mp4")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

