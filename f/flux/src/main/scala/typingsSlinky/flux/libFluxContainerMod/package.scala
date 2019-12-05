package typingsSlinky.flux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFluxContainerMod {
  import slinky.core.ReactComponentClass
  import typingsSlinky.flux.libFluxStoreMod.^

  type Component[TProps, TState, TContext] = ComponentConstructor[TProps] with (ComponentStatic[TProps, TState, TContext])
  type ComponentConstructor[TProps] = ReactComponentClass[TProps] | ReactComponentClass[TProps]
  type StoresList = js.Array[^[js.Any]]
}
