package typingsSlinky.reactDashBootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libDropdownButtonMod {
  import typingsSlinky.react.reactMod.HTMLProps
  import typingsSlinky.reactDashBootstrap.reactDashBootstrapMod.Omit
  import typingsSlinky.reactDashBootstrap.reactDashBootstrapStrings.title

  type DropdownButtonProps = DropdownButtonBaseProps with (Omit[HTMLProps[DropdownButton], title])
}
