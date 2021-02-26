package typingsSlinky.materialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.materialUi.MaterialUI.Styles.MuiTheme
import typingsSlinky.materialUi.MaterialUI.ThemeWrapperProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ThemeWrapper {
  
  @scala.inline
  def apply(theme: MuiTheme): Default[tag.type, typingsSlinky.materialUi.global.MaterialUI.ThemeWrapper] = {
    val __props = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.materialUi.global.MaterialUI.ThemeWrapper](js.Array(this.component, __props.asInstanceOf[ThemeWrapperProps]))
  }
  
  @JSGlobal("__MaterialUI.ThemeWrapper")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ThemeWrapperProps): Default[tag.type, typingsSlinky.materialUi.global.MaterialUI.ThemeWrapper] = new Default[tag.type, typingsSlinky.materialUi.global.MaterialUI.ThemeWrapper](js.Array(this.component, p.asInstanceOf[js.Any]))
}
