package typingsSlinky.jointjs.anon

import typingsSlinky.jointjs.mod.dia.Paper
import typingsSlinky.jointjs.mod.dia.Paper.ProgressCallback
import typingsSlinky.jointjs.mod.dia.Paper.UpdateStats
import typingsSlinky.jointjs.mod.dia.Paper.ViewportCallback
import typingsSlinky.jointjs.mod.mvc.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Progress extends js.Object {
  var batchSize: js.UndefOr[Double] = js.native
  var progress: js.UndefOr[ProgressCallback] = js.native
  var viewport: js.UndefOr[ViewportCallback] = js.native
}

object Progress {
  @scala.inline
  def apply(): Progress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Progress]
  }
  @scala.inline
  implicit class ProgressOps[Self <: Progress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchSize")(js.undefined)
        ret
    }
    @scala.inline
    def withProgress(
      value: (/* done */ Boolean, /* processed */ Double, /* total */ Double, /* stats */ UpdateStats, /* paper */ Paper) => scala.Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.undefined)
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

