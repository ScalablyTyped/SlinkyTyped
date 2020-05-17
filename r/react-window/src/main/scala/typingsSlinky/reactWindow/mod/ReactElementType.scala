package typingsSlinky.reactWindow.mod

import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.FunctionComponent[js.Any]
  - typingsSlinky.react.mod.ComponentClass[js.Any, typingsSlinky.react.mod.ComponentState]
  - java.lang.String
*/
trait ReactElementType extends js.Object

object ReactElementType {
  @scala.inline
  implicit def apply(value: ComponentClass[js.Any, js.Object]): ReactElementType = value.asInstanceOf[ReactElementType]
  @scala.inline
  implicit def apply(value: FunctionComponent[js.Any]): ReactElementType = value.asInstanceOf[ReactElementType]
  @scala.inline
  implicit def apply(value: String): ReactElementType = value.asInstanceOf[ReactElementType]
}

