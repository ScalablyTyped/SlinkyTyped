package typingsSlinky.materialDashUi

import typingsSlinky.materialDashUi.__MaterialUI.Styles.Colors
import typingsSlinky.materialDashUi.__MaterialUI.Styles.MuiThemeProviderProps
import typingsSlinky.materialDashUi.__MaterialUI.Styles.RawTheme
import typingsSlinky.materialDashUi.__MaterialUI.Styles.Spacing
import typingsSlinky.materialDashUi.__MaterialUI.Styles.Transitions
import typingsSlinky.materialDashUi.__MaterialUI.Styles.Typography
import typingsSlinky.react.reactMod.Component
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
  var zIndex: typingsSlinky.materialDashUi.__MaterialUI.Styles.zIndex = js.native
  def getMuiTheme(muiTheme: typingsSlinky.materialDashUi.__MaterialUI.Styles.MuiTheme*): typingsSlinky.materialDashUi.__MaterialUI.Styles.MuiTheme = js.native
  type MuiTheme = typingsSlinky.materialDashUi.__MaterialUI.Styles.MuiTheme
}

