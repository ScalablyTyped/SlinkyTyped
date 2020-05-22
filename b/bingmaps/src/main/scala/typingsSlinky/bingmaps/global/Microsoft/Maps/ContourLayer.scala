package typingsSlinky.bingmaps.global.Microsoft.Maps

import typingsSlinky.bingmaps.Microsoft.Maps.IContourLayerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.ContourLayer")
@js.native
class ContourLayer protected ()
  extends typingsSlinky.bingmaps.Microsoft.Maps.ContourLayer {
  /**
    * @constructor
    * @param contourLines The contour lines that compose this layer.
    * @param options The contour layer options.
    */
  def this(contourLines: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.ContourLine]) = this()
  def this(
    contourLines: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.ContourLine],
    options: IContourLayerOptions
  ) = this()
  /** Clears all data in the layer. */
  /* CompleteClass */
  override def clear(): Unit = js.native
}

