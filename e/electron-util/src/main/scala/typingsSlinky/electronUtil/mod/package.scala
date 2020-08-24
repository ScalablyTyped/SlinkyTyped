package typingsSlinky.electronUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AboutMenuItemOptions = typingsSlinky.electronUtil.mod.ShowAboutWindowOptions
  type Choices[Macos, Windows, Linux, Default] = typingsSlinky.typeFest.requireAtLeastOneMod.RequireAtLeastOne[
    typingsSlinky.electronUtil.mod._Choices[Macos, Windows, Linux, Default], 
    typingsSlinky.electronUtil.electronUtilStrings.macos | typingsSlinky.electronUtil.electronUtilStrings.windows | typingsSlinky.electronUtil.electronUtilStrings.linux
  ]
}
