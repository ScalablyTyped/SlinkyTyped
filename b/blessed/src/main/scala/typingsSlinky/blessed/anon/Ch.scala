package typingsSlinky.blessed.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ch extends js.Object {
  var ch: js.UndefOr[String] = js.native
  var style: js.UndefOr[js.Any] = js.native
  var track: js.UndefOr[js.Any] = js.native
}

object Ch {
  @scala.inline
  def apply(): Ch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ch]
  }
  @scala.inline
  implicit class ChOps[Self <: Ch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCh(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ch")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTrack(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track")(js.undefined)
        ret
    }
  }
  
}

