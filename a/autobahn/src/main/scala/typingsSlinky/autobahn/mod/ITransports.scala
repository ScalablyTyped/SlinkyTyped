package typingsSlinky.autobahn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITransports extends js.Object {
  def get(name: TransportType): ITransportFactoryFactory = js.native
  def isRegistered(name: TransportType): Boolean = js.native
  def list(): js.Array[TransportType] = js.native
  def register(name: TransportType, factory: ITransportFactoryFactory): Unit = js.native
}

object ITransports {
  @scala.inline
  def apply(
    get: TransportType => ITransportFactoryFactory,
    isRegistered: TransportType => Boolean,
    list: () => js.Array[TransportType],
    register: (TransportType, ITransportFactoryFactory) => Unit
  ): ITransports = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), isRegistered = js.Any.fromFunction1(isRegistered), list = js.Any.fromFunction0(list), register = js.Any.fromFunction2(register))
    __obj.asInstanceOf[ITransports]
  }
  @scala.inline
  implicit class ITransportsOps[Self <: ITransports] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: TransportType => ITransportFactoryFactory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsRegistered(value: TransportType => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRegistered")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: () => js.Array[TransportType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRegister(value: (TransportType, ITransportFactoryFactory) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

