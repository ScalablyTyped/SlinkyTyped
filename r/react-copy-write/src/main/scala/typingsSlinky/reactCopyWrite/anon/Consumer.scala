package typingsSlinky.reactCopyWrite.anon

import org.scalablytyped.runtime.Instantiable0
import slinky.core.ReactComponentClass
import typingsSlinky.reactCopyWrite.mod.AnyDeepMemberOfState
import typingsSlinky.reactCopyWrite.mod.ConsumerProps
import typingsSlinky.reactCopyWrite.mod.MutateFn
import typingsSlinky.reactCopyWrite.mod.Mutator
import typingsSlinky.reactCopyWrite.mod.ProviderProps
import typingsSlinky.reactCopyWrite.mod.SelectorFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Consumer[T /* <: js.Object */] extends js.Object {
  
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
  implicit class ConsumerOps[Self <: Consumer[_], T /* <: js.Object */] (val x: Self with Consumer[T]) extends AnyVal {
    
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
    def setConsumer(value: Instantiable0[ReactComponentClass[ConsumerProps[T]]]): Self = this.set("Consumer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: Instantiable0[ReactComponentClass[ProviderProps[T]]]): Self = this.set("Provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateSelector(value: T => AnyDeepMemberOfState[T]): Self = this.set("createSelector", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMutate(value: /* mutator */ MutateFn[T] => Unit): Self = this.set("mutate", js.Any.fromFunction1(value))
  }
}
