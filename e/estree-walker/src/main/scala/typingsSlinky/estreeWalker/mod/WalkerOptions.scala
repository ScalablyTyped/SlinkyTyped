package typingsSlinky.estreeWalker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WalkerOptions extends js.Object {
  var enter: js.UndefOr[WalkerListener] = js.native
  var leave: js.UndefOr[WalkerListener] = js.native
}

object WalkerOptions {
  @scala.inline
  def apply(): WalkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WalkerOptions]
  }
  @scala.inline
  implicit class WalkerOptionsOps[Self <: WalkerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnter(value: WalkerListener): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(js.undefined)
        ret
    }
    @scala.inline
    def withLeave(value: WalkerListener): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leave")(js.undefined)
        ret
    }
  }
  
}

