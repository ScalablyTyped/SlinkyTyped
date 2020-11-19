package typingsSlinky.reactSketchapp.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactSketchapp.typesMod.SketchLayer
import typingsSlinky.reactSketchapp.typesMod.WrappedSketchLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-sketchapp", "render")
@js.native
object render extends js.Object {
  
  def apply(element: ReactElement): SketchLayer | js.Array[SketchLayer] = js.native
  def apply(element: ReactElement, container: SketchLayer): SketchLayer | js.Array[SketchLayer] = js.native
  def apply(element: ReactElement, container: WrappedSketchLayer): SketchLayer | js.Array[SketchLayer] = js.native
}
