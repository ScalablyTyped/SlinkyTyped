package typingsSlinky.nanoevents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NanoEvents[T /* <: js.Object */] extends js.Object {
  def emit[U /* <: /* keyof T */ String */](
    name: U,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[U] */ js.Any
  ): Unit = js.native
  def on[U /* <: /* keyof T */ String */](
    name: U,
    callBack: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[U] */ /* arg */ js.Any, 
      _
    ]
  ): js.Function0[Unit] = js.native
}

object NanoEvents {
  @scala.inline
  def apply[T](
    emit: (js.Any, /* import warning: importer.ImportType#apply Failed type conversion: T[U] */ js.Any) => Unit,
    on: (js.Any, js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[U] */ /* arg */ js.Any, 
      _
    ]) => js.Function0[Unit]
  ): NanoEvents[T] = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[NanoEvents[T]]
  }
  @scala.inline
  implicit class NanoEventsOps[Self[t] <: NanoEvents[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withEmit(
      value: (js.Any, /* import warning: importer.ImportType#apply Failed type conversion: T[U] */ js.Any) => Unit
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOn(
      value: (js.Any, js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: T[U] */ /* arg */ js.Any, 
          _
        ]) => js.Function0[Unit]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

