package typingsSlinky.d3Geo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoConicProjection extends GeoProjection_ {
  
  /**
    * Return the standard parallels for the conic projection in degrees.
    */
  def parallels(): js.Tuple2[Double, Double] = js.native
  /**
    * Set the standard parallels for the conic projection in degrees and return the projection.
    *
    * @param value A two-dimensional array representing the standard parallels in degrees.
    */
  def parallels(value: js.Tuple2[Double, Double]): this.type = js.native
}
