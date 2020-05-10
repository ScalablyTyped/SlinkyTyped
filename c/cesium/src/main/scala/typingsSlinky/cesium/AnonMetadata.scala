package typingsSlinky.cesium

import typingsSlinky.cesium.mod.Credit
import typingsSlinky.cesium.mod.Ellipsoid
import typingsSlinky.cesium.mod.GoogleEarthEnterpriseMetadata
import typingsSlinky.cesium.mod.Resource
import typingsSlinky.cesium.mod.TileDiscardPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMetadata extends js.Object {
  var credit: js.UndefOr[Credit | String] = js.native
  var ellipsoid: js.UndefOr[Ellipsoid] = js.native
  var metadata: GoogleEarthEnterpriseMetadata = js.native
  var tileDiscardPolicy: js.UndefOr[TileDiscardPolicy] = js.native
  var url: Resource | String = js.native
}

object AnonMetadata {
  @scala.inline
  def apply(metadata: GoogleEarthEnterpriseMetadata, url: Resource | String): AnonMetadata = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMetadata]
  }
  @scala.inline
  implicit class AnonMetadataOps[Self <: AnonMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetadata(value: GoogleEarthEnterpriseMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: Resource | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCredit(value: Credit | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credit")(js.undefined)
        ret
    }
    @scala.inline
    def withEllipsoid(value: Ellipsoid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsoid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEllipsoid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsoid")(js.undefined)
        ret
    }
    @scala.inline
    def withTileDiscardPolicy(value: TileDiscardPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileDiscardPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileDiscardPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileDiscardPolicy")(js.undefined)
        ret
    }
  }
  
}

