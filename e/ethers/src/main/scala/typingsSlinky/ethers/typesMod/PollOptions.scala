package typingsSlinky.ethers.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PollOptions extends js.Object {
  var ceiling: js.UndefOr[Double] = js.native
  var floor: js.UndefOr[Double] = js.native
  var interval: js.UndefOr[Double] = js.native
  var onceBlock: js.UndefOr[OnceBlockable] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object PollOptions {
  @scala.inline
  def apply(): PollOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PollOptions]
  }
  @scala.inline
  implicit class PollOptionsOps[Self <: PollOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCeiling(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ceiling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCeiling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ceiling")(js.undefined)
        ret
    }
    @scala.inline
    def withFloor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floor")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withOnceBlock(value: OnceBlockable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onceBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnceBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onceBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

