package typingsSlinky.materialUiCore.themeListenerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeListener[S] extends js.Object {
  def initial(context: MuiContext[S]): S | Null = js.native
  def subscribe(context: MuiContext[S], callback: js.Function1[/* state */ S, Unit]): Double | Null = js.native
  def unsubscribe(context: MuiContext[S], subscriptionId: Double): Unit = js.native
}

object ThemeListener {
  @scala.inline
  def apply[S](
    initial: MuiContext[S] => S | Null,
    subscribe: (MuiContext[S], js.Function1[/* state */ S, Unit]) => Double | Null,
    unsubscribe: (MuiContext[S], Double) => Unit
  ): ThemeListener[S] = {
    val __obj = js.Dynamic.literal(initial = js.Any.fromFunction1(initial), subscribe = js.Any.fromFunction2(subscribe), unsubscribe = js.Any.fromFunction2(unsubscribe))
    __obj.asInstanceOf[ThemeListener[S]]
  }
  @scala.inline
  implicit class ThemeListenerOps[Self[s] <: ThemeListener[s], S] (val x: Self[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[S] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[S] with Other]
    @scala.inline
    def withInitial(value: MuiContext[S] => S | Null): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSubscribe(value: (MuiContext[S], js.Function1[/* state */ S, Unit]) => Double | Null): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUnsubscribe(value: (MuiContext[S], Double) => Unit): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsubscribe")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

