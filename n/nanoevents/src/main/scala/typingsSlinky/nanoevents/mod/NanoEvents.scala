package typingsSlinky.nanoevents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply[T /* <: js.Object */](
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
  implicit class NanoEventsOps[Self <: NanoEvents[_], T /* <: js.Object */] (val x: Self with NanoEvents[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEmit(
      value: (js.Any, /* import warning: importer.ImportType#apply Failed type conversion: T[U] */ js.Any) => Unit
    ): Self = this.set("emit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOn(
      value: (js.Any, js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: T[U] */ /* arg */ js.Any, 
          _
        ]) => js.Function0[Unit]
    ): Self = this.set("on", js.Any.fromFunction2(value))
  }
}
