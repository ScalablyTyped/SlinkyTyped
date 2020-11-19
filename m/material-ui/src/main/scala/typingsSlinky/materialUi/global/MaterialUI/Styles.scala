package typingsSlinky.materialUi.global.MaterialUI

import slinky.core.ReactComponentClass
import typingsSlinky.materialUi.MaterialUI.Styles.MuiTheme
import typingsSlinky.materialUi.MaterialUI.Styles.MuiThemeProviderProps
import typingsSlinky.materialUi.MaterialUI.Styles.RawTheme
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__MaterialUI.Styles")
@js.native
object Styles extends js.Object {
  
  var Colors: typingsSlinky.materialUi.MaterialUI.Styles.Colors = js.native
  
  var Spacing: typingsSlinky.materialUi.MaterialUI.Styles.Spacing = js.native
  
  var ThemePalette: typingsSlinky.materialUi.MaterialUI.Styles.ThemePalette = js.native
  
  var Transitions: typingsSlinky.materialUi.MaterialUI.Styles.Transitions = js.native
  
  var Typography: typingsSlinky.materialUi.MaterialUI.Styles.Typography = js.native
  
  var darkBaseTheme: RawTheme = js.native
  
  def getMuiTheme(muiTheme: MuiTheme*): MuiTheme = js.native
  
  var lightBaseTheme: RawTheme = js.native
  
  def muiThemeable(): js.Function1[
    /* component */ ReactComponentClass[typingsSlinky.materialUi.anon.MuiTheme], 
    ReactComponentClass[typingsSlinky.materialUi.anon.MuiTheme]
  ] = js.native
  
  var zIndex: typingsSlinky.materialUi.MaterialUI.Styles.zIndex = js.native
  
  @js.native
  class MuiThemeProvider ()
    extends Component[MuiThemeProviderProps, js.Object, js.Any]
}
