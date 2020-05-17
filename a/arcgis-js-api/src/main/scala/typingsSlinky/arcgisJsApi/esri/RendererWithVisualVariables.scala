package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arcgisJsApi.esri.SimpleRenderer
  - typingsSlinky.arcgisJsApi.esri.ClassBreaksRenderer
  - typingsSlinky.arcgisJsApi.esri.UniqueValueRenderer
  - typingsSlinky.arcgisJsApi.esri.DotDensityRenderer
*/
trait RendererWithVisualVariables
  extends typingsSlinky.arcgisJsApi.esri.renderers.Renderer
     with renderersRenderer

object RendererWithVisualVariables {
  @scala.inline
  implicit def apply(value: ClassBreaksRenderer): RendererWithVisualVariables = value.asInstanceOf[RendererWithVisualVariables]
  @scala.inline
  implicit def apply(value: DotDensityRenderer): RendererWithVisualVariables = value.asInstanceOf[RendererWithVisualVariables]
  @scala.inline
  implicit def apply(value: SimpleRenderer): RendererWithVisualVariables = value.asInstanceOf[RendererWithVisualVariables]
  @scala.inline
  implicit def apply(value: UniqueValueRenderer): RendererWithVisualVariables = value.asInstanceOf[RendererWithVisualVariables]
}

