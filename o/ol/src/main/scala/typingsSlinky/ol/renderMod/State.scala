package typingsSlinky.ol.renderMod

import org.scalajs.dom.raw.CanvasRenderingContext2D
import typingsSlinky.ol.olFeatureMod.FeatureLike
import typingsSlinky.ol.simpleGeometryMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var context: CanvasRenderingContext2D
  var feature: FeatureLike
  var geometry: default
  var pixelRatio: Double
  var resolution: Double
  var rotation: Double
}

object State {
  @scala.inline
  def apply(
    context: CanvasRenderingContext2D,
    feature: FeatureLike,
    geometry: default,
    pixelRatio: Double,
    resolution: Double,
    rotation: Double
  ): State = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[State]
  }
}

