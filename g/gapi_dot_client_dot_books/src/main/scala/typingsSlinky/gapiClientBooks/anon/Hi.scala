package typingsSlinky.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hi extends js.Object {
  var hi: js.UndefOr[Latitude] = js.native
  var lo: js.UndefOr[Latitude] = js.native
}

object Hi {
  @scala.inline
  def apply(): Hi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hi]
  }
  @scala.inline
  implicit class HiOps[Self <: Hi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHi(value: Latitude): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hi")(js.undefined)
        ret
    }
    @scala.inline
    def withLo(value: Latitude): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lo")(js.undefined)
        ret
    }
  }
  
}

