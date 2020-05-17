package typingsSlinky.grpcGrpcJs.eventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmitterAugmentation1[Name /* <: String | js.Symbol */, Arg] extends js.Object {
  def addListener(event: Name, listener: js.Function1[/* arg1 */ Arg, Unit]): this.type = js.native
  def emit(event: Name, arg1: Arg): Boolean = js.native
  def on(event: Name, listener: js.Function1[/* arg1 */ Arg, Unit]): this.type = js.native
  def once(event: Name, listener: js.Function1[/* arg1 */ Arg, Unit]): this.type = js.native
  def prependListener(event: Name, listener: js.Function1[/* arg1 */ Arg, Unit]): this.type = js.native
  def prependOnceListener(event: Name, listener: js.Function1[/* arg1 */ Arg, Unit]): this.type = js.native
  def removeListener(event: Name, listener: js.Function1[/* arg1 */ Arg, Unit]): this.type = js.native
}

object EmitterAugmentation1 {
  @scala.inline
  def apply[Name, Arg](
    addListener: (Name, js.Function1[/* arg1 */ Arg, Unit]) => EmitterAugmentation1[Name, Arg],
    emit: (Name, Arg) => Boolean,
    on: (Name, js.Function1[/* arg1 */ Arg, Unit]) => EmitterAugmentation1[Name, Arg],
    once: (Name, js.Function1[/* arg1 */ Arg, Unit]) => EmitterAugmentation1[Name, Arg],
    prependListener: (Name, js.Function1[/* arg1 */ Arg, Unit]) => EmitterAugmentation1[Name, Arg],
    prependOnceListener: (Name, js.Function1[/* arg1 */ Arg, Unit]) => EmitterAugmentation1[Name, Arg],
    removeListener: (Name, js.Function1[/* arg1 */ Arg, Unit]) => EmitterAugmentation1[Name, Arg]
  ): EmitterAugmentation1[Name, Arg] = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), emit = js.Any.fromFunction2(emit), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), prependListener = js.Any.fromFunction2(prependListener), prependOnceListener = js.Any.fromFunction2(prependOnceListener), removeListener = js.Any.fromFunction2(removeListener))
    __obj.asInstanceOf[EmitterAugmentation1[Name, Arg]]
  }
  @scala.inline
  implicit class EmitterAugmentation1Ops[Self[name, arg] <: EmitterAugmentation1[name, arg], Name, Arg] (val x: Self[Name, Arg]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Name, Arg] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Name, Arg]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Name, Arg]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Name, Arg]) with Other]
    @scala.inline
    def withAddListener(value: (Name, js.Function1[/* arg1 */ Arg, Unit]) => EmitterAugmentation1[Name, Arg]): Self[Name, Arg] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEmit(value: (Name, Arg) => Boolean): Self[Name, Arg] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOn(value: (Name, js.Function1[/* arg1 */ Arg, Unit]) => EmitterAugmentation1[Name, Arg]): Self[Name, Arg] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnce(value: (Name, js.Function1[/* arg1 */ Arg, Unit]) => EmitterAugmentation1[Name, Arg]): Self[Name, Arg] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("once")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPrependListener(value: (Name, js.Function1[/* arg1 */ Arg, Unit]) => EmitterAugmentation1[Name, Arg]): Self[Name, Arg] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prependListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPrependOnceListener(value: (Name, js.Function1[/* arg1 */ Arg, Unit]) => EmitterAugmentation1[Name, Arg]): Self[Name, Arg] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prependOnceListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveListener(value: (Name, js.Function1[/* arg1 */ Arg, Unit]) => EmitterAugmentation1[Name, Arg]): Self[Name, Arg] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeListener")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

