package typingsSlinky.reactCopyWrite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // It'd be nice if this could somehow be improved! Perhaps we need variadic
  // kinds plus infer keyword? Alternatively unions may solve our issue if we had
  // the ability to restrict type widening.
  type AnyDeepMemberOfState[T] = js.Any
  type Consumer[T] = slinky.core.ReactComponentClass[typingsSlinky.reactCopyWrite.mod.ConsumerProps[T]]
  type MutateFn[T] = js.Function2[/* draft */ T, /* state */ T, scala.Unit]
  type Mutator[T] = js.Function1[/* mutator */ typingsSlinky.reactCopyWrite.mod.MutateFn[T], scala.Unit]
  type Provider[T] = slinky.core.ReactComponentClass[typingsSlinky.reactCopyWrite.mod.ProviderProps[T]]
  type RenderFn[T] = js.Function1[
    /* repeated */ typingsSlinky.std.ReturnType[typingsSlinky.reactCopyWrite.mod.SelectorFn[T]], 
    slinky.core.facade.ReactElement | js.Array[slinky.core.facade.ReactElement] | scala.Null
  ]
  type SelectorFn[T] = js.Function1[/* state */ T, typingsSlinky.reactCopyWrite.mod.AnyDeepMemberOfState[T]]
}
