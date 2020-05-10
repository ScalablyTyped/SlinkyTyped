package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackHandlerStatic extends js.Object {
  def addEventListener(eventName: BackPressEventName, handler: js.Function0[js.UndefOr[Boolean | Null]]): NativeEventSubscription = js.native
  def exitApp(): Unit = js.native
  def removeEventListener(eventName: BackPressEventName, handler: js.Function0[js.UndefOr[Boolean | Null]]): Unit = js.native
}

object BackHandlerStatic {
  @scala.inline
  def apply(
    addEventListener: (BackPressEventName, js.Function0[js.UndefOr[Boolean | Null]]) => NativeEventSubscription,
    exitApp: () => Unit,
    removeEventListener: (BackPressEventName, js.Function0[js.UndefOr[Boolean | Null]]) => Unit
  ): BackHandlerStatic = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), exitApp = js.Any.fromFunction0(exitApp), removeEventListener = js.Any.fromFunction2(removeEventListener))
    __obj.asInstanceOf[BackHandlerStatic]
  }
  @scala.inline
  implicit class BackHandlerStaticOps[Self <: BackHandlerStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddEventListener(value: (BackPressEventName, js.Function0[js.UndefOr[Boolean | Null]]) => NativeEventSubscription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withExitApp(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitApp")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveEventListener(value: (BackPressEventName, js.Function0[js.UndefOr[Boolean | Null]]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

