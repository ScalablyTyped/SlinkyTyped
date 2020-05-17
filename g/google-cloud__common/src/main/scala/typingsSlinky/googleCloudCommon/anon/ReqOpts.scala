package typingsSlinky.googleCloudCommon.anon

import typingsSlinky.teenyRequest.mod.CoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReqOpts extends js.Object {
  var reqOpts: js.UndefOr[CoreOptions] = js.native
}

object ReqOpts {
  @scala.inline
  def apply(): ReqOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReqOpts]
  }
  @scala.inline
  implicit class ReqOptsOps[Self <: ReqOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReqOpts(value: CoreOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reqOpts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReqOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reqOpts")(js.undefined)
        ret
    }
  }
  
}

