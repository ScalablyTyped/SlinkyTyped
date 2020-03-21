package typingsSlinky.reactSketchapp

import slinky.core.facade.ReactElement
import typingsSlinky.reactSketchapp.typesMod.SketchLayer
import typingsSlinky.reactSketchapp.typesMod.WrappedSketchLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-sketchapp/render", JSImport.Namespace)
@js.native
object renderMod extends js.Object {
  def render(element: ReactElement): SketchLayer | js.Array[SketchLayer] = js.native
  def render(element: ReactElement, container: SketchLayer): SketchLayer | js.Array[SketchLayer] = js.native
  def render(element: ReactElement, container: WrappedSketchLayer): SketchLayer | js.Array[SketchLayer] = js.native
  def renderLayers(layers: js.Array[_], container: SketchLayer): SketchLayer = js.native
  def renderToJSON(element: ReactElement): js.Object = js.native
}

