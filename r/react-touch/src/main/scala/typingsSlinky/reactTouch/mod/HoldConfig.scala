package typingsSlinky.reactTouch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HoldConfig extends js.Object {
  /** @default 1000 */
  var holdFor: js.UndefOr[Double] = js.native
  /** @default 250 */
  var updateEvery: js.UndefOr[Double] = js.native
}

object HoldConfig {
  @scala.inline
  def apply(): HoldConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoldConfig]
  }
  @scala.inline
  implicit class HoldConfigOps[Self <: HoldConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHoldFor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holdFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoldFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holdFor")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateEvery(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateEvery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateEvery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateEvery")(js.undefined)
        ret
    }
  }
  
}

