package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeoXmlStats extends js.Object {
  /** The number of characters in the XML feed. */
  var fileSize: Double = js.native
  /** Number of Ground Overlays in the XML feed. */
  var numGroundOverlays: Double = js.native
  /** Number of Microsoft.Maps.Location objects in the XML feed. */
  var numLocations: Double = js.native
  /** The number of network links in the XML feed. */
  var numNetworkLinks: Double = js.native
  /** Number of Microsoft.Maps.Polygons objects in the XML feed. */
  var numPolygons: Double = js.native
  /** Number of Microsoft.Maps.Polylines objects in the XML feed. */
  var numPolylines: Double = js.native
  /** Number of Microsoft.Maps.Pushpins objects in the XML feed. */
  var numPushpins: Double = js.native
  /** Number of Screen Overlays in the XML feed. */
  var numScreenOverlays: Double = js.native
  /** The amount of time in ms it took to process the XML feed. */
  var processingTime: Double = js.native
}

object IGeoXmlStats {
  @scala.inline
  def apply(
    fileSize: Double,
    numGroundOverlays: Double,
    numLocations: Double,
    numNetworkLinks: Double,
    numPolygons: Double,
    numPolylines: Double,
    numPushpins: Double,
    numScreenOverlays: Double,
    processingTime: Double
  ): IGeoXmlStats = {
    val __obj = js.Dynamic.literal(fileSize = fileSize.asInstanceOf[js.Any], numGroundOverlays = numGroundOverlays.asInstanceOf[js.Any], numLocations = numLocations.asInstanceOf[js.Any], numNetworkLinks = numNetworkLinks.asInstanceOf[js.Any], numPolygons = numPolygons.asInstanceOf[js.Any], numPolylines = numPolylines.asInstanceOf[js.Any], numPushpins = numPushpins.asInstanceOf[js.Any], numScreenOverlays = numScreenOverlays.asInstanceOf[js.Any], processingTime = processingTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoXmlStats]
  }
  @scala.inline
  implicit class IGeoXmlStatsOps[Self <: IGeoXmlStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumGroundOverlays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numGroundOverlays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumLocations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numLocations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumNetworkLinks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numNetworkLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumPolygons(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numPolygons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumPolylines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numPolylines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumPushpins(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numPushpins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumScreenOverlays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numScreenOverlays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessingTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

