package typingsSlinky.reactSlick.mod

import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.ComponentClass[TProps, typingsSlinky.react.mod.ComponentState]
  - typingsSlinky.react.mod.StatelessComponent[TProps]
*/
trait ComponentConstructor[TProps] extends js.Object

object ComponentConstructor {
  @scala.inline
  implicit def apply[TProps](value: ComponentClass[TProps, js.Object]): ComponentConstructor[TProps] = value.asInstanceOf[ComponentConstructor[TProps]]
  @scala.inline
  implicit def apply[TProps](value: StatelessComponent[TProps]): ComponentConstructor[TProps] = value.asInstanceOf[ComponentConstructor[TProps]]
}

