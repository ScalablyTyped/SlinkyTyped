package typingsSlinky.onoff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var activeLow: js.UndefOr[Boolean] = js.native
  var debounceTimeout: js.UndefOr[Double] = js.native
  var reconfigureDirection: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveLow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeLow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveLow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeLow")(js.undefined)
        ret
    }
    @scala.inline
    def withDebounceTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debounceTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebounceTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debounceTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withReconfigureDirection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconfigureDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconfigureDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconfigureDirection")(js.undefined)
        ret
    }
  }
  
}

