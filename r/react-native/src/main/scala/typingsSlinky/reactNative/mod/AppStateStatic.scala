package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppStateStatic extends js.Object {
  var currentState: AppStateStatus = js.native
  /**
    * Add a handler to AppState changes by listening to the change event
    * type and providing the handler
    */
  def addEventListener(`type`: AppStateEvent, listener: js.Function1[/* state */ AppStateStatus, Unit]): Unit = js.native
  /**
    * Remove a handler by passing the change event type and the handler
    */
  def removeEventListener(`type`: AppStateEvent, listener: js.Function1[/* state */ AppStateStatus, Unit]): Unit = js.native
}

object AppStateStatic {
  @scala.inline
  def apply(
    addEventListener: (AppStateEvent, js.Function1[/* state */ AppStateStatus, Unit]) => Unit,
    currentState: AppStateStatus,
    removeEventListener: (AppStateEvent, js.Function1[/* state */ AppStateStatus, Unit]) => Unit
  ): AppStateStatic = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), currentState = currentState.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2(removeEventListener))
    __obj.asInstanceOf[AppStateStatic]
  }
  @scala.inline
  implicit class AppStateStaticOps[Self <: AppStateStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddEventListener(value: (AppStateEvent, js.Function1[/* state */ AppStateStatus, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCurrentState(value: AppStateStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveEventListener(value: (AppStateEvent, js.Function1[/* state */ AppStateStatus, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

