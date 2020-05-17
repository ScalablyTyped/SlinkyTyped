package typingsSlinky.lasso.anon

import typingsSlinky.lasso.lassoMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lasso extends js.Object {
  var lasso: js.UndefOr[default] = js.native
  var sendOptions: js.UndefOr[js.Any] = js.native
}

object Lasso {
  @scala.inline
  def apply(): Lasso = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lasso]
  }
  @scala.inline
  implicit class LassoOps[Self <: Lasso] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLasso(value: default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lasso")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLasso: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lasso")(js.undefined)
        ret
    }
    @scala.inline
    def withSendOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendOptions")(js.undefined)
        ret
    }
  }
  
}

