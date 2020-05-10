package typingsSlinky.ionicCore.stencilCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueApi extends js.Object {
  var clear: js.UndefOr[js.Function0[Unit]] = js.native
  var flush: js.UndefOr[js.Function1[/* cb */ js.UndefOr[js.Function0[Unit]], Unit]] = js.native
  def read(cb: RafCallback): Unit = js.native
  def tick(cb: RafCallback): Unit = js.native
  def write(cb: RafCallback): Unit = js.native
}

object QueueApi {
  @scala.inline
  def apply(read: RafCallback => Unit, tick: RafCallback => Unit, write: RafCallback => Unit): QueueApi = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read), tick = js.Any.fromFunction1(tick), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[QueueApi]
  }
  @scala.inline
  implicit class QueueApiOps[Self <: QueueApi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRead(value: RafCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTick(value: RafCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWrite(value: RafCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.undefined)
        ret
    }
    @scala.inline
    def withFlush(value: /* cb */ js.UndefOr[js.Function0[Unit]] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFlush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(js.undefined)
        ret
    }
  }
  
}

