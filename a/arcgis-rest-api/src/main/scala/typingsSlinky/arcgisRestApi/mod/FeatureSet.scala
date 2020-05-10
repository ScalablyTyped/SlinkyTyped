package typingsSlinky.arcgisRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureSet extends HasZM {
   // optional
  var displayFieldName: js.UndefOr[String] = js.native
  var features: js.Array[Feature] = js.native
   // for feature layers only.
  var fields: js.UndefOr[js.Array[Field]] = js.native
   // optional
  var geometryType: js.UndefOr[esriGeometryType] = js.native
   // optional
  var globalIdFieldName: js.UndefOr[String] = js.native
  var objectIdFieldName: js.UndefOr[String] = js.native
   // for feature layers only
  var spatialReference: js.UndefOr[SpatialReference] = js.native
}

object FeatureSet {
  @scala.inline
  def apply(features: js.Array[Feature]): FeatureSet = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureSet]
  }
  @scala.inline
  implicit class FeatureSetOps[Self <: FeatureSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeatures(value: js.Array[Feature]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayFieldName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayFieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayFieldName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayFieldName")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: js.Array[Field]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withGeometryType(value: esriGeometryType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeometryType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometryType")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalIdFieldName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalIdFieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalIdFieldName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalIdFieldName")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectIdFieldName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectIdFieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectIdFieldName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectIdFieldName")(js.undefined)
        ret
    }
    @scala.inline
    def withSpatialReference(value: SpatialReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spatialReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpatialReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spatialReference")(js.undefined)
        ret
    }
  }
  
}

