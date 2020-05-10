package typingsSlinky.got.mod

import typingsSlinky.node.httpsMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternalRequestOptions extends RequestOptions {
  @JSName("agent")
  var agent_InternalRequestOptions: js.UndefOr[js.Any] = js.native
  // Redeclare options with `any` type for allow specify types incompatible with http.RequestOptions.
  @JSName("timeout")
  var timeout_InternalRequestOptions: js.UndefOr[js.Any] = js.native
}

object InternalRequestOptions {
  @scala.inline
  def apply(): InternalRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternalRequestOptions]
  }
  @scala.inline
  implicit class InternalRequestOptionsOps[Self <: InternalRequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: js.Any): Self = {
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

