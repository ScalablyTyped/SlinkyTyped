package typingsSlinky.cesium

import typingsSlinky.cesium.mod.Credit
import typingsSlinky.cesium.mod.Ellipsoid
import typingsSlinky.cesium.mod.GoogleEarthEnterpriseMetadata
import typingsSlinky.cesium.mod.Resource
import typingsSlinky.cesium.mod.TileDiscardPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMetadata extends js.Object {
  var credit: js.UndefOr[Credit | String] = js.undefined
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var metadata: GoogleEarthEnterpriseMetadata
  var tileDiscardPolicy: js.UndefOr[TileDiscardPolicy] = js.undefined
  var url: Resource | String
}

object AnonMetadata {
  @scala.inline
  def apply(
    metadata: GoogleEarthEnterpriseMetadata,
    url: Resource | String,
    credit: Credit | String = null,
    ellipsoid: Ellipsoid = null,
    tileDiscardPolicy: TileDiscardPolicy = null
  ): AnonMetadata = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (credit != null) __obj.updateDynamic("credit")(credit.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (tileDiscardPolicy != null) __obj.updateDynamic("tileDiscardPolicy")(tileDiscardPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMetadata]
  }
}

