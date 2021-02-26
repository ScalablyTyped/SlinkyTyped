package typingsSlinky.materialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.materialUi.appCanvasMod.AppCanvasProps
import typingsSlinky.materialUi.appCanvasMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AppCanvas {
  
  @JSImport("material-ui/internal/AppCanvas", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: AppCanvas.type): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AppCanvasProps): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
