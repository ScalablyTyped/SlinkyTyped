package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapActionDetail extends js.Object {
  /**
    * A description of the bootstrap action.
    */
  var BootstrapActionConfig: js.UndefOr[typingsSlinky.awsSdk.emrMod.BootstrapActionConfig] = js.native
}

object BootstrapActionDetail {
  @scala.inline
  def apply(): BootstrapActionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BootstrapActionDetail]
  }
  @scala.inline
  implicit class BootstrapActionDetailOps[Self <: BootstrapActionDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBootstrapActionConfig(value: BootstrapActionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BootstrapActionConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBootstrapActionConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BootstrapActionConfig")(js.undefined)
        ret
    }
  }
  
}

