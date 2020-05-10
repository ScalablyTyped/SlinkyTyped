package typingsSlinky.materialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.materialUi.appCanvasMod.AppCanvasProps
import typingsSlinky.materialUi.appCanvasMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AppCanvas {
  @JSImport("material-ui/internal/AppCanvas", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: AppCanvasProps): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: AppCanvas.type): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, js.Dictionary.empty))()
}

