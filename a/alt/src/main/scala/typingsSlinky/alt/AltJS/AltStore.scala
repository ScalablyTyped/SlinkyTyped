package typingsSlinky.alt.AltJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AltStore[S] extends js.Object {
  def emitChange(): Unit = js.native
  def getState(): S = js.native
  def listen(handler: js.Function1[/* state */ S, _]): js.Function0[Unit] = js.native
  def unlisten(handler: js.Function1[/* state */ S, _]): Unit = js.native
}

object AltStore {
  @scala.inline
  def apply[S](
    emitChange: () => Unit,
    getState: () => S,
    listen: js.Function1[/* state */ S, _] => js.Function0[Unit],
    unlisten: js.Function1[/* state */ S, _] => Unit
  ): AltStore[S] = {
    val __obj = js.Dynamic.literal(emitChange = js.Any.fromFunction0(emitChange), getState = js.Any.fromFunction0(getState), listen = js.Any.fromFunction1(listen), unlisten = js.Any.fromFunction1(unlisten))
    __obj.asInstanceOf[AltStore[S]]
  }
  @scala.inline
  implicit class AltStoreOps[Self[s] <: AltStore[s], S] (val x: Self[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[S] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[S] with Other]
    @scala.inline
    def withEmitChange(value: () => Unit): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetState(value: () => S): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withListen(value: js.Function1[/* state */ S, _] => js.Function0[Unit]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnlisten(value: js.Function1[/* state */ S, _] => Unit): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlisten")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

