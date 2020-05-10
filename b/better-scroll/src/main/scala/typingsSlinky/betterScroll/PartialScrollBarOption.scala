package typingsSlinky.betterScroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<better-scroll.better-scroll.ScrollBarOption> */
@js.native
trait PartialScrollBarOption extends js.Object {
  var fade: js.UndefOr[Boolean] = js.native
}

object PartialScrollBarOption {
  @scala.inline
  def apply(): PartialScrollBarOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialScrollBarOption]
  }
  @scala.inline
  implicit class PartialScrollBarOptionOps[Self <: PartialScrollBarOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fade")(js.undefined)
        ret
    }
  }
  
}

