package typingsSlinky.reactHotkeys.mod

import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.ComponentClass[js.Object, typingsSlinky.react.mod.ComponentState]
  - java.lang.String
  - typingsSlinky.react.mod.SFC[typingsSlinky.reactHotkeys.mod.ComponentProps]
*/
trait ReactComponent extends js.Object

object ReactComponent {
  @scala.inline
  implicit def apply(value: ComponentClass[js.Object, js.Object]): ReactComponent = value.asInstanceOf[ReactComponent]
  @scala.inline
  implicit def apply(value: SFC[ComponentProps]): ReactComponent = value.asInstanceOf[ReactComponent]
  @scala.inline
  implicit def apply(value: String): ReactComponent = value.asInstanceOf[ReactComponent]
}

