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

trait Consumer[T /* <: js.Object */] extends js.Object {
  var Consumer: Instantiable0[ReactComponentClass[ConsumerProps[T]]]
  var Provider: Instantiable0[ReactComponentClass[ProviderProps[T]]]
  var createSelector: SelectorFn[T]
  var mutate: Mutator[T]
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
}

