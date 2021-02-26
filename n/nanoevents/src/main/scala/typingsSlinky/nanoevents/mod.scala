package typingsSlinky.nanoevents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nanoevents", JSImport.Namespace)
  @js.native
  class ^[T /* <: js.Object */] () extends NanoEvents[T]
  
  @js.native
  trait NanoEvents[T /* <: js.Object */] extends StObject {
    
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
    implicit class NanoEventsMutableBuilder[Self <: NanoEvents[_], T /* <: js.Object */] (val x: Self with NanoEvents[T]) extends AnyVal {
      
      @scala.inline
      def setEmit(
        value: (js.Any, /* import warning: importer.ImportType#apply Failed type conversion: T[U] */ js.Any) => Unit
      ): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOn(
        value: (js.Any, js.Function1[
              /* import warning: importer.ImportType#apply Failed type conversion: T[U] */ /* arg */ js.Any, 
              _
            ]) => js.Function0[Unit]
      ): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    }
  }
}
