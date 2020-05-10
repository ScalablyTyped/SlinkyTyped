package typingsSlinky.mapbox.mod._Global_.L.mapbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Leaflet.Map.MapOptions * / any */ @js.native
trait MapOptions extends js.Object {
  var featureLayer: js.UndefOr[FeatureLayerOptions] = js.native
  var gridLayer: js.UndefOr[js.Any] = js.native
  var infoControl: js.UndefOr[ControlOptions] = js.native
  var legendControl: js.UndefOr[ControlOptions] = js.native
  var shareControl: js.UndefOr[ShareControlOptions] = js.native
  var tileLayer: js.UndefOr[TileLayerOptions] = js.native
}

object MapOptions {
  @scala.inline
  def apply(): MapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapOptions]
  }
  @scala.inline
  implicit class MapOptionsOps[Self <: MapOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeatureLayer(value: FeatureLayerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureLayer")(js.undefined)
        ret
    }
    @scala.inline
    def withGridLayer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLayer")(js.undefined)
        ret
    }
    @scala.inline
    def withInfoControl(value: ControlOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfoControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoControl")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendControl(value: ControlOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendControl")(js.undefined)
        ret
    }
    @scala.inline
    def withShareControl(value: ShareControlOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShareControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareControl")(js.undefined)
        ret
    }
    @scala.inline
    def withTileLayer(value: TileLayerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileLayer")(js.undefined)
        ret
    }
  }
  
}

