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
import scala.scalajs.js.annotation._

@js.native
trait Consumer[T /* <: js.Object */] extends js.Object {
  var Consumer: Instantiable0[ReactComponentClass[ConsumerProps[T]]] = js.native
  var Provider: Instantiable0[ReactComponentClass[ProviderProps[T]]] = js.native
  var createSelector: SelectorFn[T] = js.native
  var mutate: Mutator[T] = js.native
}

object Consumer {
  @scala.inline
  def apply[T](
    Consumer: Instantiable0[ReactComponentClass[ConsumerProps[T]]],
    Provider: Instantiable0[ReactComponentClass[ProviderProps[T]]],
    createSelector: T => AnyDeepMemberOfState[T],
    mutate: /* mutator */ MutateFn[T] => Unit
  ): Consumer[T] = {
    val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any], createSelector = js.Any.fromFunction1(createSelector), mutate = js.Any.fromFunction1(mutate))
    __obj.asInstanceOf[Consumer[T]]
  }
  @scala.inline
  implicit class ConsumerOps[Self[t] <: Consumer[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withConsumer(value: Instantiable0[ReactComponentClass[ConsumerProps[T]]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Consumer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvider(value: Instantiable0[ReactComponentClass[ProviderProps[T]]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateSelector(value: T => AnyDeepMemberOfState[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSelector")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMutate(value: /* mutator */ MutateFn[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutate")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

