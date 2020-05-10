package typingsSlinky.materialUiCore.themeListenerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Broadcast[S] extends js.Object {
  def getState(): S = js.native
  def setState(state: S): Unit = js.native
  def subscribe(callback: js.Function1[/* state */ S, Unit]): Double = js.native
  def unsubscribe(subscriptionId: Double): Unit = js.native
}

object Broadcast {
  @scala.inline
  def apply[S](
    getState: () => S,
    setState: S => Unit,
    subscribe: js.Function1[/* state */ S, Unit] => Double,
    unsubscribe: Double => Unit
  ): Broadcast[S] = {
    val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), setState = js.Any.fromFunction1(setState), subscribe = js.Any.fromFunction1(subscribe), unsubscribe = js.Any.fromFunction1(unsubscribe))
    __obj.asInstanceOf[Broadcast[S]]
  }
  @scala.inline
  implicit class BroadcastOps[Self[s] <: Broadcast[s], S] (val x: Self[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[S] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[S] with Other]
    @scala.inline
    def withGetState(value: () => S): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetState(value: S => Unit): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSubscribe(value: js.Function1[/* state */ S, Unit] => Double): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnsubscribe(value: Double => Unit): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsubscribe")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

