package typingsSlinky.reactSortableHoc.mod

import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.ComponentClass[P, typingsSlinky.react.mod.ComponentState]
  - typingsSlinky.react.mod.SFC[P]
  - typingsSlinky.reactSortableHoc.mod.WrappedComponentFactory[P]
*/
trait WrappedComponent[P] extends js.Object

object WrappedComponent {
  @scala.inline
  implicit def apply[P](value: ComponentClass[P, js.Object]): WrappedComponent[P] = value.asInstanceOf[WrappedComponent[P]]
  @scala.inline
  implicit def apply[P](value: SFC[P]): WrappedComponent[P] = value.asInstanceOf[WrappedComponent[P]]
  @scala.inline
  implicit def apply[P](value: WrappedComponentFactory[P]): WrappedComponent[P] = value.asInstanceOf[WrappedComponent[P]]
}

