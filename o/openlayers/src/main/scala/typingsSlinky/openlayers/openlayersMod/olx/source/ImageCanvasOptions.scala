package typingsSlinky.openlayers.openlayersMod.olx.source

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.openlayers.openlayersMod.AttributionLike
import typingsSlinky.openlayers.openlayersMod.CanvasFunctionType
import typingsSlinky.openlayers.openlayersMod.Extent
import typingsSlinky.openlayers.openlayersMod.ProjectionLike
import typingsSlinky.openlayers.openlayersMod.Size
import typingsSlinky.openlayers.openlayersMod.olx.LogoOptions
import typingsSlinky.openlayers.openlayersMod.proj.Projection
import typingsSlinky.openlayers.openlayersMod.source.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageCanvasOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.native
  @JSName("canvasFunction")
  var canvasFunction_Original: CanvasFunctionType = js.native
  var logo: js.UndefOr[String | LogoOptions] = js.native
  var projection: ProjectionLike = js.native
  var ratio: js.UndefOr[Double] = js.native
  var resolutions: js.UndefOr[js.Array[Double]] = js.native
  var state: js.UndefOr[State] = js.native
  def canvasFunction(extent: Extent, resolution: Double, pixelRatio: Double, size: Size, proj: Projection): HTMLCanvasElement = js.native
}

