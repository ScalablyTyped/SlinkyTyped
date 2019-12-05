package typingsSlinky.reactDashBootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libNavDropdownMod {
  import typingsSlinky.react.reactMod.HTMLProps
  import typingsSlinky.reactDashBootstrap.reactDashBootstrapMod.Omit
  import typingsSlinky.reactDashBootstrap.reactDashBootstrapStrings.title

  type NavDropdownProps = NavDropdownBaseProps with (Omit[HTMLProps[NavDropdown], title])
}
