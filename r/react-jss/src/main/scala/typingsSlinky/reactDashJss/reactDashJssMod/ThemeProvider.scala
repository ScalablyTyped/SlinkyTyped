package typingsSlinky.reactDashJss.reactDashJssMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.theming.themingMod.DefaultTheme
import typingsSlinky.theming.themingMod.ThemeProviderFactory
import typingsSlinky.theming.themingMod.ThemeProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jss", "ThemeProvider")
@js.native
class ThemeProvider protected ()
  extends typingsSlinky.theming.themingMod.ThemeProvider {
  def this(props: ThemeProviderProps[DefaultTheme]) = this()
  def this(props: ThemeProviderProps[DefaultTheme], context: js.Any) = this()
}

@JSImport("react-jss", "ThemeProvider")
@js.native
object ThemeProvider extends TopLevel[ThemeProviderFactory[DefaultTheme]]

