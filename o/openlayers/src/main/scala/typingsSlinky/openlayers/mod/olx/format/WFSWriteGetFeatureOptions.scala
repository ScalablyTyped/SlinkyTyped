package typingsSlinky.openlayers.mod.olx.format

import typingsSlinky.openlayers.mod.Extent_
import typingsSlinky.openlayers.mod.format.filter.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WFSWriteGetFeatureOptions extends js.Object {
  var bbox: js.UndefOr[Extent_] = js.native
  var count: js.UndefOr[Double] = js.native
  var featureNS: String = js.native
  var featurePrefix: String = js.native
  var featureTypes: js.Array[String] = js.native
  var filter: js.UndefOr[Filter] = js.native
  var geometryName: js.UndefOr[String] = js.native
  var handle: js.UndefOr[String] = js.native
  var maxFeatures: js.UndefOr[Double] = js.native
  var outputFormat: js.UndefOr[String] = js.native
  var propertyNames: js.UndefOr[js.Array[String]] = js.native
  var resultType: js.UndefOr[String] = js.native
  var srsName: js.UndefOr[String] = js.native
  var startIndex: js.UndefOr[Double] = js.native
}

object WFSWriteGetFeatureOptions {
  @scala.inline
  def apply(featureNS: String, featurePrefix: String, featureTypes: js.Array[String]): WFSWriteGetFeatureOptions = {
    val __obj = js.Dynamic.literal(featureNS = featureNS.asInstanceOf[js.Any], featurePrefix = featurePrefix.asInstanceOf[js.Any], featureTypes = featureTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[WFSWriteGetFeatureOptions]
  }
  @scala.inline
  implicit class WFSWriteGetFeatureOptionsOps[Self <: WFSWriteGetFeatureOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeatureNS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureNS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeaturePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featurePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeatureTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBbox(value: Extent_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bbox")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: Filter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withGeometryName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeometryName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometryName")(js.undefined)
        ret
    }
    @scala.inline
    def withHandle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFeatures(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFeatures")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withPropertyNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropertyNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyNames")(js.undefined)
        ret
    }
    @scala.inline
    def withResultType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultType")(js.undefined)
        ret
    }
    @scala.inline
    def withSrsName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srsName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrsName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srsName")(js.undefined)
        ret
    }
    @scala.inline
    def withStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(js.undefined)
        ret
    }
  }
  
}

