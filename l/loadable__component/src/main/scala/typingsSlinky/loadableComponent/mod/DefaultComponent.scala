package typingsSlinky.loadableComponent.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.ComponentType[P]
  - typingsSlinky.loadableComponent.mod.DefaultImportedComponent[P]
*/
trait DefaultComponent[P] extends js.Object

object DefaultComponent {
  @scala.inline
  implicit def apply[P](value: ReactComponentClass[P]): DefaultComponent[P] = value.asInstanceOf[DefaultComponent[P]]
  @scala.inline
  implicit def apply[P](value: DefaultImportedComponent[P]): DefaultComponent[P] = value.asInstanceOf[DefaultComponent[P]]
}

