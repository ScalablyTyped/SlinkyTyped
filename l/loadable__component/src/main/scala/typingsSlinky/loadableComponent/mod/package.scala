package typingsSlinky.loadableComponent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type LoadableComponent[T] = (slinky.core.ReactComponentClass[T with typingsSlinky.loadableComponent.anon.Fallback]) with typingsSlinky.loadableComponent.mod.LoadableComponentMethods[T]
  type LoadableLibrary[TModule] = slinky.core.ReactComponentClass[typingsSlinky.loadableComponent.anon.Children[TModule]] with TModule with typingsSlinky.loadableComponent.mod.LoadableComponentMethods[js.Object]
}
