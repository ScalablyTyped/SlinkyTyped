package typingsSlinky.esriLeafletGeocoder.mod.esri.Geocoding

import typingsSlinky.leaflet.mod.ControlPosition
import typingsSlinky.leaflet.mod.LatLngBoundsExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeosearchObject extends js.Object {
  var allowMultipleResults: js.UndefOr[Boolean] = js.native
  var collapseAfterResult: js.UndefOr[Boolean] = js.native
  var expanded: js.UndefOr[Boolean] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var position: js.UndefOr[ControlPosition] = js.native
  var providers: js.UndefOr[js.Array[GeosearchProvider]] = js.native
  var searchBounds: js.UndefOr[LatLngBoundsExpression | Null] = js.native
  var title: js.UndefOr[String] = js.native
  var useMapBounds: js.UndefOr[Boolean | Double] = js.native
  var zoomToResult: js.UndefOr[Boolean] = js.native
}

object GeosearchObject {
  @scala.inline
  def apply(): GeosearchObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeosearchObject]
  }
  @scala.inline
  implicit class GeosearchObjectOps[Self <: GeosearchObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowMultipleResults(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultipleResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMultipleResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultipleResults")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapseAfterResult(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseAfterResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseAfterResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseAfterResult")(js.undefined)
        ret
    }
    @scala.inline
    def withExpanded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: ControlPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withProviders(value: js.Array[GeosearchProvider]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providers")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchBounds(value: LatLngBoundsExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchBounds")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchBoundsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchBounds")(null)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withUseMapBounds(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMapBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseMapBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMapBounds")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomToResult(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomToResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomToResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomToResult")(js.undefined)
        ret
    }
  }
  
}

