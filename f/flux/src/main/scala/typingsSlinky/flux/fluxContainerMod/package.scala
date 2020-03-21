package typingsSlinky.flux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fluxContainerMod {
  type Component[TProps, TState, TContext] = typingsSlinky.flux.fluxContainerMod.ComponentConstructor[TProps] with (typingsSlinky.flux.fluxContainerMod.ComponentStatic[TProps, TState, TContext])
  type ComponentConstructor[TProps] = slinky.core.ReactComponentClass[TProps] | slinky.core.ReactComponentClass[TProps]
  type StoresList = js.Array[typingsSlinky.flux.fluxStoreMod.^[js.Any]]
}
