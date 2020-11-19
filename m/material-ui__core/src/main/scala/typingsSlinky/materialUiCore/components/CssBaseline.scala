package typingsSlinky.materialUiCore.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.materialUiCore.cssBaselineCssBaselineMod.CssBaselineProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CssBaseline {
  
  @JSImport("@material-ui/core", "CssBaseline")
  @js.native
  object component extends js.Object
  
  def withProps(p: CssBaselineProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: CssBaseline.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}
