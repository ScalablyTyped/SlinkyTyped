package typingsSlinky.materialUi

import typingsSlinky.materialUi.MaterialUI.Styles.Colors
import typingsSlinky.materialUi.MaterialUI.Styles.MuiThemeProviderProps
import typingsSlinky.materialUi.MaterialUI.Styles.RawTheme
import typingsSlinky.materialUi.MaterialUI.Styles.Spacing
import typingsSlinky.materialUi.MaterialUI.Styles.Transitions
import typingsSlinky.materialUi.MaterialUI.Styles.Typography
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-ui/styles", JSImport.Namespace)
@js.native
object stylesMod extends js.Object {
  @js.native
  class MuiThemeProvider ()
    extends Component[MuiThemeProviderProps, js.Object, js.Any]
  
  var DarkRawTheme: RawTheme = js.native
  var LightRawTheme: RawTheme = js.native
  var colors: Colors = js.native
  var darkBaseTheme: RawTheme = js.native
  var lightBaseTheme: RawTheme = js.native
  var spacing: Spacing = js.native
  var transitions: Transitions = js.native
  var typography: Typography = js.native
  var zIndex: typingsSlinky.materialUi.MaterialUI.Styles.zIndex = js.native
  def getMuiTheme(muiTheme: typingsSlinky.materialUi.MaterialUI.Styles.MuiTheme*): typingsSlinky.materialUi.MaterialUI.Styles.MuiTheme = js.native
  type MuiTheme = typingsSlinky.materialUi.MaterialUI.Styles.MuiTheme
}

