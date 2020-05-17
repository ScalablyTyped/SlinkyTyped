package typingsSlinky.flexmonster.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgnoreScroll extends js.Object {
  var ignoreScroll: js.UndefOr[Boolean] = js.native
  var ignoreSorting: js.UndefOr[Boolean] = js.native
  var partial: js.UndefOr[Boolean] = js.native
}

object IgnoreScroll {
  @scala.inline
  def apply(): IgnoreScroll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreScroll]
  }
  @scala.inline
  implicit class IgnoreScrollOps[Self <: IgnoreScroll] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreSorting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreSorting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSorting")(js.undefined)
        ret
    }
    @scala.inline
    def withPartial(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partial")(js.undefined)
        ret
    }
  }
  
}

