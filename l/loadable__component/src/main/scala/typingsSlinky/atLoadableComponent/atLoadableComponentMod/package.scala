package typingsSlinky.atLoadableComponent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atLoadableComponentMod {
  import slinky.core.ReactComponentClass
  import typingsSlinky.atLoadableComponent.Anon_Children
  import typingsSlinky.atLoadableComponent.Anon_Fallback

  type DefaultComponent[P] = ReactComponentClass[P] | DefaultImportedComponent[P]
  type LoadableComponent[T] = (ReactComponentClass[T with Anon_Fallback]) with LoadableComponentMethods[T]
  type LoadableLibrary[TModule] = ReactComponentClass[Anon_Children[TModule]] with TModule with LoadableComponentMethods[js.Object]
}
