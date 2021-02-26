package typingsSlinky.reactCopyWrite

import org.scalablytyped.runtime.Instantiable0
import slinky.core.ReactComponentClass
import typingsSlinky.reactCopyWrite.mod.AnyDeepMemberOfState
import typingsSlinky.reactCopyWrite.mod.ConsumerProps
import typingsSlinky.reactCopyWrite.mod.MutateFn
import typingsSlinky.reactCopyWrite.mod.Mutator
import typingsSlinky.reactCopyWrite.mod.ProviderProps
import typingsSlinky.reactCopyWrite.mod.SelectorFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Consumer[T /* <: js.Object */] extends StObject {
    
    var Consumer: Instantiable0[ReactComponentClass[ConsumerProps[T]]] = js.native
    
    var Provider: Instantiable0[ReactComponentClass[ProviderProps[T]]] = js.native
    
    var createSelector: SelectorFn[T] = js.native
    
    var mutate: Mutator[T] = js.native
  }
  object Consumer {
    
    @scala.inline
    def apply[T /* <: js.Object */](
      Consumer: Instantiable0[ReactComponentClass[ConsumerProps[T]]],
      Provider: Instantiable0[ReactComponentClass[ProviderProps[T]]],
      createSelector: T => AnyDeepMemberOfState[T],
      mutate: /* mutator */ MutateFn[T] => Unit
    ): Consumer[T] = {
      val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any], createSelector = js.Any.fromFunction1(createSelector), mutate = js.Any.fromFunction1(mutate))
      __obj.asInstanceOf[Consumer[T]]
    }
    
    @scala.inline
    implicit class ConsumerMutableBuilder[Self <: Consumer[_], T /* <: js.Object */] (val x: Self with Consumer[T]) extends AnyVal {
      
      @scala.inline
      def setConsumer(value: Instantiable0[ReactComponentClass[ConsumerProps[T]]]): Self = StObject.set(x, "Consumer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateSelector(value: T => AnyDeepMemberOfState[T]): Self = StObject.set(x, "createSelector", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMutate(value: /* mutator */ MutateFn[T] => Unit): Self = StObject.set(x, "mutate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProvider(value: Instantiable0[ReactComponentClass[ProviderProps[T]]]): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
    }
  }
}
