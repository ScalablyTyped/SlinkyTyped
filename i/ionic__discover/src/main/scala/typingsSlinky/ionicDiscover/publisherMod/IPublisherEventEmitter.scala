package typingsSlinky.ionicDiscover.publisherMod

import typingsSlinky.ionicDiscover.ionicDiscoverStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPublisherEventEmitter extends js.Object {
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
}

object IPublisherEventEmitter {
  @scala.inline
  def apply(on: (error, js.Function1[/* err */ js.Error, Unit]) => IPublisherEventEmitter): IPublisherEventEmitter = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[IPublisherEventEmitter]
  }
  @scala.inline
  implicit class IPublisherEventEmitterOps[Self <: IPublisherEventEmitter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOn(value: (error, js.Function1[/* err */ js.Error, Unit]) => IPublisherEventEmitter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

