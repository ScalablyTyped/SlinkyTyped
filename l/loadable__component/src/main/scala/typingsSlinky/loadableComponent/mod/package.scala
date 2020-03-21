package typingsSlinky.loadableComponent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DefaultComponent[P] = slinky.core.ReactComponentClass[P] | typingsSlinky.loadableComponent.mod.DefaultImportedComponent[P]
  type LoadableComponent[T] = (slinky.core.ReactComponentClass[T with typingsSlinky.loadableComponent.AnonFallback]) with typingsSlinky.loadableComponent.mod.LoadableComponentMethods[T]
  type LoadableLibrary[TModule] = slinky.core.ReactComponentClass[typingsSlinky.loadableComponent.AnonChildren[TModule]] with TModule with typingsSlinky.loadableComponent.mod.LoadableComponentMethods[js.Object]
}
