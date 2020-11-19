package typingsSlinky.heredatalens.global.H.datalens

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.heredatalens.H.datalens.RasterLayer.TilePoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides pixel-wise rendering of data.
  * Layer used when you need to visualize more than 10k points. The layer requires source data to be located in pixel coordinates.
  * The rendering is implemented by drawing directly on a canvas.  The layer is often used together with a Data Lens query which groups rows by pixels.
  * This reduces the amount of data delivered to the client.
  */
@JSGlobal("H.datalens.RasterLayer")
@js.native
/**
  * Constructor
  */
class RasterLayer ()
  extends typingsSlinky.heredatalens.H.datalens.RasterLayer
/* static members */
@JSGlobal("H.datalens.RasterLayer")
@js.native
object RasterLayer extends js.Object {
  
  /**
    * Default value for dataToRows callback option.
    * It represents each row as an object where property names correspond to data column names.
    */
  var defaultDataToRows: js.Any = js.native
  
  /**
    * This is a default implementation of renderTile callback. This method represents each point as a black 1x1 pixel square.
    * @param points - Input data points within a tile
    * @param canvas - The target canvas
    */
  def defaultRenderTile(points: js.Array[TilePoint], canvas: HTMLCanvasElement): Unit = js.native
}
