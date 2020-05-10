package typingsSlinky.node.asyncHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncResourceOptions extends js.Object {
  /**
    * Disables automatic `emitDestroy` when the object is garbage collected.
    * This usually does not need to be set (even if `emitDestroy` is called
    * manually), unless the resource's `asyncId` is retrieved and the
    * sensitive API's `emitDestroy` is called with it.
    * Default: `false`
    */
  var requireManualDestroy: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the execution context that created this async event.
    * Default: `executionAsyncId()`
    */
  var triggerAsyncId: js.UndefOr[Double] = js.native
}

object AsyncResourceOptions {
  @scala.inline
  def apply(): AsyncResourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncResourceOptions]
  }
  @scala.inline
  implicit class AsyncResourceOptionsOps[Self <: AsyncResourceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequireManualDestroy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireManualDestroy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireManualDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireManualDestroy")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerAsyncId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerAsyncId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerAsyncId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerAsyncId")(js.undefined)
        ret
    }
  }
  
}

