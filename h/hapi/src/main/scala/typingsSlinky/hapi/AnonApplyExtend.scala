package typingsSlinky.hapi

import typingsSlinky.hapi.hapiBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApplyExtend extends js.Object {
  @JSName("apply")
  var apply: `true` = js.native
  var extend: js.UndefOr[Boolean] = js.native
}

object AnonApplyExtend {
  @scala.inline
  def apply(apply: `true`): AnonApplyExtend = {
    val __obj = js.Dynamic.literal(apply = apply.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApplyExtend]
  }
  @scala.inline
  implicit class AnonApplyExtendOps[Self <: AnonApplyExtend] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApply(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(js.undefined)
        ret
    }
  }
  
}

