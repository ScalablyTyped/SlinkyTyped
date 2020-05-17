package typingsSlinky.reactJsonschemaForm.mod

import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.StatelessComponent[typingsSlinky.reactJsonschemaForm.mod.WidgetProps]
  - typingsSlinky.react.mod.ComponentClass[
typingsSlinky.reactJsonschemaForm.mod.WidgetProps, 
typingsSlinky.react.mod.ComponentState]
*/
trait Widget extends js.Object

object Widget {
  @scala.inline
  implicit def apply(value: ComponentClass[WidgetProps, js.Object]): Widget = value.asInstanceOf[Widget]
  @scala.inline
  implicit def apply(value: StatelessComponent[WidgetProps]): Widget = value.asInstanceOf[Widget]
}

