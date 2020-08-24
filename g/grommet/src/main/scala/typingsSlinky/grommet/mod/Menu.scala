package typingsSlinky.grommet.mod

import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import typingsSlinky.grommet.buttonMod.ButtonType
import typingsSlinky.grommet.grommetStrings.icon
import typingsSlinky.grommet.menuMod.MenuProps
import typingsSlinky.grommet.utilsMod.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/es6", "Menu")
@js.native
object Menu extends TopLevel[ReactComponentClass[MenuProps with (Omit[ButtonType, icon])]]

