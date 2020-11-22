package typingsSlinky.konva.pointerEventsMod

import typingsSlinky.konva.shapeMod.Shape
import typingsSlinky.konva.shapeMod.ShapeConfig
import typingsSlinky.konva.stageMod.Stage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("konva/types/PointerEvents", "releaseCapture")
@js.native
object releaseCapture extends js.Object {
  
  def apply(pointerId: Double): Unit = js.native
  def apply(pointerId: Double, target: Shape[ShapeConfig]): Unit = js.native
  def apply(pointerId: Double, target: Stage): Unit = js.native
}
