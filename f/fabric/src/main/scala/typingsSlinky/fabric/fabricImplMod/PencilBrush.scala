package typingsSlinky.fabric.fabricImplMod

import typingsSlinky.fabric.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric/fabric-impl", "PencilBrush")
@js.native
class PencilBrush () extends BaseBrush {
  
  /**
    * Converts points to SVG path
    * @param points Array of points
    */
  def convertPointsToSVGPath(points: js.Array[X]): js.Array[String] = js.native
  def convertPointsToSVGPath(points: js.Array[X], minX: js.UndefOr[scala.Nothing], minY: Double): js.Array[String] = js.native
  def convertPointsToSVGPath(points: js.Array[X], minX: Double): js.Array[String] = js.native
  def convertPointsToSVGPath(points: js.Array[X], minX: Double, minY: Double): js.Array[String] = js.native
  
  /**
    * Creates fabric.Path object to add on canvas
    * @param pathData Path data
    */
  def createPath(pathData: String): Path = js.native
}
