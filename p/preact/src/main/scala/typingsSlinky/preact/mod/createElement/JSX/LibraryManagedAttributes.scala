package typingsSlinky.preact.mod.createElement.JSX

import typingsSlinky.preact.jsxMod.Defaultize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - Props
  - typingsSlinky.preact.jsxMod.Defaultize[Props, js.Any]
*/
trait LibraryManagedAttributes[Component, Props] extends js.Object

object LibraryManagedAttributes {
  @scala.inline
  implicit def apply[Component, Props](value: Defaultize[Props, js.Any]): LibraryManagedAttributes[Component, Props] = value.asInstanceOf[LibraryManagedAttributes[Component, Props]]
  @scala.inline
  implicit def apply[Component, Props](value: Props): LibraryManagedAttributes[Component, Props] = value.asInstanceOf[LibraryManagedAttributes[Component, Props]]
}

