package typingsSlinky.builderUtil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtraSpawnOptions extends js.Object {
  var isPipeInput: js.UndefOr[Boolean] = js.native
}

object ExtraSpawnOptions {
  @scala.inline
  def apply(): ExtraSpawnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtraSpawnOptions]
  }
  @scala.inline
  implicit class ExtraSpawnOptionsOps[Self <: ExtraSpawnOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsPipeInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPipeInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPipeInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPipeInput")(js.undefined)
        ret
    }
  }
  
}

