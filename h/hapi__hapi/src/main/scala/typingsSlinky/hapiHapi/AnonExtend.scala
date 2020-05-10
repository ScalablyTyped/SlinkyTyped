package typingsSlinky.hapiHapi

import typingsSlinky.hapiHapi.hapiHapiBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExtend extends js.Object {
  @JSName("apply")
  var apply: `true` = js.native
  var extend: `true` = js.native
}

object AnonExtend {
  @scala.inline
  def apply(apply: `true`, extend: `true`): AnonExtend = {
    val __obj = js.Dynamic.literal(apply = apply.asInstanceOf[js.Any], extend = extend.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtend]
  }
  @scala.inline
  implicit class AnonExtendOps[Self <: AnonExtend] (val x: Self) extends AnyVal {
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
    def withExtend(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

