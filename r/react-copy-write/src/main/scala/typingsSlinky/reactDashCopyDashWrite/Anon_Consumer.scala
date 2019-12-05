package typingsSlinky.reactDashCopyDashWrite

import org.scalablytyped.runtime.Instantiable0
import slinky.core.ReactComponentClass
import typingsSlinky.reactDashCopyDashWrite.reactDashCopyDashWriteMod.AnyDeepMemberOfState
import typingsSlinky.reactDashCopyDashWrite.reactDashCopyDashWriteMod.ConsumerProps
import typingsSlinky.reactDashCopyDashWrite.reactDashCopyDashWriteMod.MutateFn
import typingsSlinky.reactDashCopyDashWrite.reactDashCopyDashWriteMod.Mutator
import typingsSlinky.reactDashCopyDashWrite.reactDashCopyDashWriteMod.ProviderProps
import typingsSlinky.reactDashCopyDashWrite.reactDashCopyDashWriteMod.SelectorFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Consumer[T /* <: js.Object */] extends js.Object {
  var Consumer: Instantiable0[ReactComponentClass[ConsumerProps[T]]]
  var Provider: Instantiable0[ReactComponentClass[ProviderProps[T]]]
  var createSelector: SelectorFn[T]
  var mutate: Mutator[T]
}

object Anon_Consumer {
  @scala.inline
  def apply[T /* <: js.Object */](
    Consumer: Instantiable0[ReactComponentClass[ConsumerProps[T]]],
    Provider: Instantiable0[ReactComponentClass[ProviderProps[T]]],
    createSelector: T => AnyDeepMemberOfState[T],
    mutate: /* mutator */ MutateFn[T] => Unit
  ): Anon_Consumer[T] = {
    val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any], createSelector = js.Any.fromFunction1(createSelector), mutate = js.Any.fromFunction1(mutate))
  
    __obj.asInstanceOf[Anon_Consumer[T]]
  }
}

