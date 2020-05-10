package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeoXmlDataSet extends js.Object {
  /**
    * An array of layers that are in the XML document.
    * In shapes in KML that are in a child documents and folders of the main document or folder are grouped together in a data Layer.
    * KML also supports GroundOverlay.
    */
  var layers: js.UndefOr[js.Array[Layer | GroundOverlay]] = js.native
  /**
    * An array of screen overlays that have been parsed from a KML file.
    */
  var screenOverlays: js.UndefOr[js.Array[KmlScreenOverlay]] = js.native
  /** An array of shapes that are in the XML document. */
  var shapes: js.UndefOr[js.Array[IPrimitive]] = js.native
  /**
    * Statistics about the content and processing time of a XML feed.
    */
  var stats: js.UndefOr[IGeoXmlStats] = js.native
  /**
    * Summary metadata provided at the document level of the XML feed data set.
    */
  var summary: js.UndefOr[IGeoXmlSummaryMetadata] = js.native
}

object IGeoXmlDataSet {
  @scala.inline
  def apply(): IGeoXmlDataSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeoXmlDataSet]
  }
  @scala.inline
  implicit class IGeoXmlDataSetOps[Self <: IGeoXmlDataSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayers(value: js.Array[Layer | GroundOverlay]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenOverlays(value: js.Array[KmlScreenOverlay]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenOverlays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenOverlays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenOverlays")(js.undefined)
        ret
    }
    @scala.inline
    def withShapes(value: js.Array[IPrimitive]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShapes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapes")(js.undefined)
        ret
    }
    @scala.inline
    def withStats(value: IGeoXmlStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(js.undefined)
        ret
    }
    @scala.inline
    def withSummary(value: IGeoXmlSummaryMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(js.undefined)
        ret
    }
  }
  
}

