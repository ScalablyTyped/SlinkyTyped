package typingsSlinky.aureliaBinding.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyObserver extends js.Object {
  /**
    * Subscribe to property change events.
    */
  def subscribe(callback: js.Function2[/* newValue */ js.Any, /* oldValue */ js.Any, Unit]): Disposable = js.native
}

object PropertyObserver {
  @scala.inline
  def apply(subscribe: js.Function2[/* newValue */ js.Any, /* oldValue */ js.Any, Unit] => Disposable): PropertyObserver = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[PropertyObserver]
  }
  @scala.inline
  implicit class PropertyObserverOps[Self <: PropertyObserver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubscribe(value: js.Function2[/* newValue */ js.Any, /* oldValue */ js.Any, Unit] => Disposable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

