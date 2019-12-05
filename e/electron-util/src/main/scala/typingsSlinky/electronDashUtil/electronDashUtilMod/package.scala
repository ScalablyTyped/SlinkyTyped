package typingsSlinky.electronDashUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object electronDashUtilMod {
  import typingsSlinky.electronDashUtil.electronDashUtilStrings.linux
  import typingsSlinky.electronDashUtil.electronDashUtilStrings.macos
  import typingsSlinky.electronDashUtil.electronDashUtilStrings.windows
  import typingsSlinky.typeDashFest.typeDashFestMod.RequireAtLeastOne

  type AboutMenuItemOptions = ShowAboutWindowOptions
  type Choices[Macos, Windows, Linux, Default] = RequireAtLeastOne[_Choices[Macos, Windows, Linux, Default], macos | windows | linux]
}
