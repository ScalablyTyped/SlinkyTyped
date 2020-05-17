package typingsSlinky.hapi.anon

import typingsSlinky.hapi.hapiBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplyBoolean extends js.Object {
  @JSName("apply")
  var apply: js.UndefOr[Boolean] = js.native
  var extend: `true` = js.native
}

object ApplyBoolean {
  @scala.inline
  def apply(extend: `true`): ApplyBoolean = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyBoolean]
  }
  @scala.inline
  implicit class ApplyBooleanOps[Self <: ApplyBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtend(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApply(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApply: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(js.undefined)
        ret
    }
  }
  
}

