package typingsSlinky.openlayers.mod.olx.source

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.openlayers.mod.AttributionLike
import typingsSlinky.openlayers.mod.CanvasFunctionType
import typingsSlinky.openlayers.mod.Extent_
import typingsSlinky.openlayers.mod.ProjectionLike
import typingsSlinky.openlayers.mod.Size
import typingsSlinky.openlayers.mod.olx.LogoOptions
import typingsSlinky.openlayers.mod.proj.Projection
import typingsSlinky.openlayers.mod.source.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageCanvasOptions extends StObject {
  
  var attributions: js.UndefOr[AttributionLike] = js.native
  
  def canvasFunction(extent: Extent_, resolution: Double, pixelRatio: Double, size: Size, proj: Projection): HTMLCanvasElement = js.native
  @JSName("canvasFunction")
  var canvasFunction_Original: CanvasFunctionType = js.native
  
  var logo: js.UndefOr[String | LogoOptions] = js.native
  
  var projection: ProjectionLike = js.native
  
  var ratio: js.UndefOr[Double] = js.native
  
  var resolutions: js.UndefOr[js.Array[Double]] = js.native
  
  var state: js.UndefOr[State] = js.native
}
