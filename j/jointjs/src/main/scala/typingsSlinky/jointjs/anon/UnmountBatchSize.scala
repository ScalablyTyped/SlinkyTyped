package typingsSlinky.jointjs.anon

import typingsSlinky.jointjs.mod.dia.Paper
import typingsSlinky.jointjs.mod.dia.Paper.ViewportCallback
import typingsSlinky.jointjs.mod.mvc.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmountBatchSize extends js.Object {
  var mountBatchSize: js.UndefOr[Double] = js.native
  var unmountBatchSize: js.UndefOr[Double] = js.native
  var viewport: js.UndefOr[ViewportCallback] = js.native
}

object UnmountBatchSize {
  @scala.inline
  def apply(): UnmountBatchSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmountBatchSize]
  }
  @scala.inline
  implicit class UnmountBatchSizeOps[Self <: UnmountBatchSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMountBatchSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountBatchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMountBatchSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountBatchSize")(js.undefined)
        ret
    }
    @scala.inline
    def withUnmountBatchSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmountBatchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnmountBatchSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmountBatchSize")(js.undefined)
        ret
    }
    @scala.inline
    def withViewport(value: (/* view */ View[js.Any], /* isDetached */ Boolean, /* paper */ Paper) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewport")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutViewport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewport")(js.undefined)
        ret
    }
  }
  
}

