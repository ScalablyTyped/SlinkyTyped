package typingsSlinky.reactNativeTabView.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Overscroll extends js.Object {
  var overscroll: js.UndefOr[Boolean] = js.native
}

object Overscroll {
  @scala.inline
  def apply(): Overscroll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Overscroll]
  }
  @scala.inline
  implicit class OverscrollOps[Self <: Overscroll] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOverscroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverscroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscroll")(js.undefined)
        ret
    }
  }
  
}

