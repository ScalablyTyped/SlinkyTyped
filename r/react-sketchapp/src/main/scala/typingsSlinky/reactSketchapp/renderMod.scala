package typingsSlinky.reactSketchapp

import slinky.core.facade.ReactElement
import typingsSlinky.reactSketchapp.typesMod.SketchLayer
import typingsSlinky.reactSketchapp.typesMod.WrappedSketchLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderMod {
  
  @JSImport("react-sketchapp/render", "render")
  @js.native
  def render(element: ReactElement): SketchLayer | js.Array[SketchLayer] = js.native
  @JSImport("react-sketchapp/render", "render")
  @js.native
  def render(element: ReactElement, container: SketchLayer): SketchLayer | js.Array[SketchLayer] = js.native
  @JSImport("react-sketchapp/render", "render")
  @js.native
  def render(element: ReactElement, container: WrappedSketchLayer): SketchLayer | js.Array[SketchLayer] = js.native
  
  @JSImport("react-sketchapp/render", "renderLayers")
  @js.native
  def renderLayers(layers: js.Array[_], container: SketchLayer): SketchLayer = js.native
  
  @JSImport("react-sketchapp/render", "renderToJSON")
  @js.native
  def renderToJSON(element: ReactElement): js.Object = js.native
}
