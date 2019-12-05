package typingsSlinky.cesium

import typingsSlinky.cesium.cesiumMod.Cartesian2
import typingsSlinky.cesium.cesiumMod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisableCheckIfAllPixelsAreTransparent extends js.Object {
  var disableCheckIfAllPixelsAreTransparent: js.UndefOr[Boolean] = js.undefined
  var missingImageUrl: Resource | String
  var pixelsToCheck: js.Array[Cartesian2]
}

object Anon_DisableCheckIfAllPixelsAreTransparent {
  @scala.inline
  def apply(
    missingImageUrl: Resource | String,
    pixelsToCheck: js.Array[Cartesian2],
    disableCheckIfAllPixelsAreTransparent: js.UndefOr[Boolean] = js.undefined
  ): Anon_DisableCheckIfAllPixelsAreTransparent = {
    val __obj = js.Dynamic.literal(missingImageUrl = missingImageUrl.asInstanceOf[js.Any], pixelsToCheck = pixelsToCheck.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCheckIfAllPixelsAreTransparent)) __obj.updateDynamic("disableCheckIfAllPixelsAreTransparent")(disableCheckIfAllPixelsAreTransparent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DisableCheckIfAllPixelsAreTransparent]
  }
}

