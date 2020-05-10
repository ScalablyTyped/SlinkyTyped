package typingsSlinky.ethereumProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraceParams extends js.Object {
  var disableMemory: js.UndefOr[Boolean] = js.native
  var disableStack: js.UndefOr[Boolean] = js.native
  var disableStorage: js.UndefOr[Boolean] = js.native
}

object TraceParams {
  @scala.inline
  def apply(): TraceParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraceParams]
  }
  @scala.inline
  implicit class TraceParamsOps[Self <: TraceParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableMemory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableMemory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableMemory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableMemory")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableStack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableStack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStack")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableStorage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStorage")(js.undefined)
        ret
    }
  }
  
}

