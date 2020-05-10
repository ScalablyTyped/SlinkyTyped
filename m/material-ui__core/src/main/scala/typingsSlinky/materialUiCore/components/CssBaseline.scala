package typingsSlinky.materialUiCore.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.materialUiCore.cssBaselineCssBaselineMod.CssBaselineProps
import typingsSlinky.materialUiCore.cssBaselineMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CssBaseline {
  @JSImport("@material-ui/core/CssBaseline", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: CssBaselineProps): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: CssBaseline.type): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, js.Dictionary.empty))()
}

