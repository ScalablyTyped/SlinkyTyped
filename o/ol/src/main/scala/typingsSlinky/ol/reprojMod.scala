package typingsSlinky.ol

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.projectionMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/reproj", JSImport.Namespace)
@js.native
object reprojMod extends js.Object {
  
  def calculateSourceExtentResolution(sourceProj: default, targetProj: default, targetExtent: Extent, targetResolution: Double): Double = js.native
  
  def calculateSourceResolution(sourceProj: default, targetProj: default, targetCenter: Coordinate, targetResolution: Double): Double = js.native
  
  def render(
    width: Double,
    height: Double,
    pixelRatio: Double,
    sourceResolution: Double,
    sourceExtent: Extent,
    targetResolution: Double,
    targetExtent: Extent,
    triangulation: typingsSlinky.ol.triangulationMod.default,
    sources: js.Array[_],
    gutter: Double
  ): HTMLCanvasElement = js.native
  def render(
    width: Double,
    height: Double,
    pixelRatio: Double,
    sourceResolution: Double,
    sourceExtent: Extent,
    targetResolution: Double,
    targetExtent: Extent,
    triangulation: typingsSlinky.ol.triangulationMod.default,
    sources: js.Array[_],
    gutter: Double,
    opt_renderEdges: js.UndefOr[scala.Nothing],
    opt_contextOptions: js.Any
  ): HTMLCanvasElement = js.native
  def render(
    width: Double,
    height: Double,
    pixelRatio: Double,
    sourceResolution: Double,
    sourceExtent: Extent,
    targetResolution: Double,
    targetExtent: Extent,
    triangulation: typingsSlinky.ol.triangulationMod.default,
    sources: js.Array[_],
    gutter: Double,
    opt_renderEdges: Boolean
  ): HTMLCanvasElement = js.native
  def render(
    width: Double,
    height: Double,
    pixelRatio: Double,
    sourceResolution: Double,
    sourceExtent: Extent,
    targetResolution: Double,
    targetExtent: Extent,
    triangulation: typingsSlinky.ol.triangulationMod.default,
    sources: js.Array[_],
    gutter: Double,
    opt_renderEdges: Boolean,
    opt_contextOptions: js.Any
  ): HTMLCanvasElement = js.native
}
