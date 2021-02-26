package typingsSlinky.materialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.MaterialUI.Styles.MuiTheme
import typingsSlinky.materialUi.MaterialUI.Styles.MuiThemeProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MuiThemeProvider {
  
  @JSImport("material-ui/styles", "MuiThemeProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.materialUi.stylesMod.MuiThemeProvider] {
    
    @scala.inline
    def muiTheme(value: MuiTheme): this.type = set("muiTheme", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MuiThemeProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MuiThemeProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
