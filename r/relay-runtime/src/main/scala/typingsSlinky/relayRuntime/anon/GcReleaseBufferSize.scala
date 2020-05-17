package typingsSlinky.relayRuntime.anon

import typingsSlinky.relayRuntime.relayStoreTypesMod.OperationLoader
import typingsSlinky.relayRuntime.relayStoreTypesMod.Scheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GcReleaseBufferSize extends js.Object {
  var gcReleaseBufferSize: js.UndefOr[Double | Null] = js.native
  var gcScheduler: js.UndefOr[Scheduler | Null] = js.native
  var operationLoader: js.UndefOr[OperationLoader | Null] = js.native
}

object GcReleaseBufferSize {
  @scala.inline
  def apply(): GcReleaseBufferSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GcReleaseBufferSize]
  }
  @scala.inline
  implicit class GcReleaseBufferSizeOps[Self <: GcReleaseBufferSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGcReleaseBufferSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcReleaseBufferSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGcReleaseBufferSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcReleaseBufferSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGcReleaseBufferSizeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcReleaseBufferSize")(null)
        ret
    }
    @scala.inline
    def withGcScheduler(value: /* callback */ js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcScheduler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGcScheduler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcScheduler")(js.undefined)
        ret
    }
    @scala.inline
    def withGcSchedulerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcScheduler")(null)
        ret
    }
    @scala.inline
    def withOperationLoader(value: OperationLoader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationLoader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationLoader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationLoader")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationLoaderNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationLoader")(null)
        ret
    }
  }
  
}

