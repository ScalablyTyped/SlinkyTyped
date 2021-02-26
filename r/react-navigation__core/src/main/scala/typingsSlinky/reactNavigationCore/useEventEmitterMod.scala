package typingsSlinky.reactNavigationCore

import typingsSlinky.reactNavigationCore.anon.TargetTypeEventName
import typingsSlinky.reactNavigationCore.anon.`10`
import typingsSlinky.reactNavigationCore.anon.`11`
import typingsSlinky.reactNavigationCore.anon.`2`
import typingsSlinky.reactNavigationCore.typesMod.EventArg
import typingsSlinky.reactNavigationCore.typesMod.EventConsumer
import typingsSlinky.std.Extract
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useEventEmitterMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useEventEmitter", JSImport.Default)
  @js.native
  def default[T /* <: Record[String, _] */](): NavigationEventEmitter[T] = js.native
  @JSImport("@react-navigation/core/lib/typescript/src/useEventEmitter", JSImport.Default)
  @js.native
  def default[T /* <: Record[String, _] */](listen: js.Function1[/* e */ js.Any, Unit]): NavigationEventEmitter[T] = js.native
  
  /* Inlined @react-navigation/core.@react-navigation/core/lib/typescript/src/types.EventEmitter<T> & {create (target : string): @react-navigation/core.@react-navigation/core/lib/typescript/src/types.EventConsumer<T>} */
  @js.native
  trait NavigationEventEmitter[T /* <: Record[String, _] */] extends StObject {
    
    def create(target: String): EventConsumer[T] = js.native
    
    /**
      * Emit an event to child screens.
      *
      * @param options.type Type of the event (e.g. `focus`, `blur`)
      * @param [options.data] Optional information regarding the event.
      * @param [options.target] Key of the target route which should receive the event.
      * If not specified, all routes receive the event.
      */
    def emit[EventName /* <: Extract[/* keyof T */ String, String] */](
      options: (TargetTypeEventName[EventName, T]) with (js.Object | `2`) with ((`11`[T, EventName]) | (`10`[T, EventName]))
    ): EventArg[
        EventName, 
        /* import warning: importer.ImportType#apply Failed type conversion: T[EventName]['canPreventDefault'] */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: T[EventName]['data'] */ js.Any
      ] = js.native
  }
  object NavigationEventEmitter {
    
    @scala.inline
    def apply[T /* <: Record[String, _] */](
      create: String => EventConsumer[T],
      emit: (TargetTypeEventName[js.Any, T]) with (js.Object | `2`) with ((`11`[T, js.Any]) | (`10`[T, js.Any])) => EventArg[
          js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: T[EventName]['canPreventDefault'] */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: T[EventName]['data'] */ js.Any
        ]
    ): NavigationEventEmitter[T] = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), emit = js.Any.fromFunction1(emit))
      __obj.asInstanceOf[NavigationEventEmitter[T]]
    }
    
    @scala.inline
    implicit class NavigationEventEmitterMutableBuilder[Self <: NavigationEventEmitter[_], T /* <: Record[String, _] */] (val x: Self with NavigationEventEmitter[T]) extends AnyVal {
      
      @scala.inline
      def setCreate(value: String => EventConsumer[T]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEmit(
        value: (TargetTypeEventName[js.Any, T]) with (js.Object | `2`) with ((`11`[T, js.Any]) | (`10`[T, js.Any])) => EventArg[
              js.Any, 
              /* import warning: importer.ImportType#apply Failed type conversion: T[EventName]['canPreventDefault'] */ js.Any, 
              /* import warning: importer.ImportType#apply Failed type conversion: T[EventName]['data'] */ js.Any
            ]
      ): Self = StObject.set(x, "emit", js.Any.fromFunction1(value))
    }
  }
}
