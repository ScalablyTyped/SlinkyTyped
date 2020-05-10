package typingsSlinky.materialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.materialUi.MaterialUI.Styles.MuiTheme
import typingsSlinky.materialUi.MaterialUI.ThemeWrapperProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ThemeWrapper {
  @JSGlobal("__MaterialUI.ThemeWrapper")
  @js.native
  object component extends js.Object
  
  def withProps(p: ThemeWrapperProps): Default[tag.type, typingsSlinky.materialUi.MaterialUI.ThemeWrapper] = new Default[tag.type, typingsSlinky.materialUi.MaterialUI.ThemeWrapper](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(theme: MuiTheme): Default[tag.type, typingsSlinky.materialUi.MaterialUI.ThemeWrapper] = {
    val __props = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.materialUi.MaterialUI.ThemeWrapper](js.Array(this.component, __props.asInstanceOf[ThemeWrapperProps]))
  }
}

