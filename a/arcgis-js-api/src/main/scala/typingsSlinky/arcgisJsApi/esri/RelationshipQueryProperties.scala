package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationshipQueryProperties extends js.Object {
  /**
    * Specify the geodatabase version to query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#gdbVersion)
    */
  var gdbVersion: js.UndefOr[String] = js.native
  /**
    * Specify the number of decimal places for the geometries returned by the query operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#geometryPrecision)
    */
  var geometryPrecision: js.UndefOr[Double] = js.native
  /**
    * The historic moment to query. This parameter applies only if the `supportsHistoricMoment` on [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) property of the layer is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#historicMoment)
    */
  var historicMoment: js.UndefOr[DateProperties] = js.native
  /**
    * The maximum allowable offset used for generalizing geometries returned by the query operation. The offset is in the units of `outSpatialReference`. If `outSpatialReference` is not defined, the [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#spatialReference) of the view is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#maxAllowableOffset)
    */
  var maxAllowableOffset: js.UndefOr[Double] = js.native
  /**
    * An array of objectIds for the features in the layer/table being queried.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#objectIds)
    */
  var objectIds: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Attribute fields to include in the FeatureSet. Fields must exist in the map layer. You must list actual field names rather than the alias names. You are, however, able to use the alias names when you display the results.  When specifying the output fields, you should limit the fields to only those you expect to use in the query or the results. The fewer fields you include, the faster the response will be.  Each query must have access to the Shape and ObjectId fields for a layer. However, your list of fields does not need to include these two fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#outFields)
    */
  var outFields: js.UndefOr[js.Array[String]] = js.native
  /**
    * The spatial reference for the returned geometry. If `outSpatialReference` is not defined, the [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#spatialReference) of the view is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
  /**
    * The ID of the relationship to be queried. The ids for the relationships the table or layer participates in are listed in the ArcGIS Services directory. The ID of the relationship to be queried. The relationships that this layer/table participates in are included in the Feature Service Layer resource response. Records in tables/layers corresponding to the related table/layer of the relationship are queried.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#relationshipId)
    */
  var relationshipId: js.UndefOr[Double] = js.native
  /**
    * If `true`, each feature in the [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html) includes the geometry. Set to `false` (default) if you do not plan to include highlighted features on a map since the geometry makes up a significant portion of the response.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#returnGeometry)
    *
    * @default false
    */
  var returnGeometry: js.UndefOr[Boolean] = js.native
  /**
    * The definition expression to be applied to the related table or layer. Only records in the list of [objectIds](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#objectIds) that satisfy the definition expression are queried for related records.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#where)
    */
  var where: js.UndefOr[String] = js.native
}

object RelationshipQueryProperties {
  @scala.inline
  def apply(): RelationshipQueryProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationshipQueryProperties]
  }
  @scala.inline
  implicit class RelationshipQueryPropertiesOps[Self <: RelationshipQueryProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGdbVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gdbVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGdbVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gdbVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withGeometryPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometryPrecision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeometryPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometryPrecision")(js.undefined)
        ret
    }
    @scala.inline
    def withHistoricMomentDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historicMoment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHistoricMoment(value: DateProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historicMoment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistoricMoment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historicMoment")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAllowableOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAllowableOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAllowableOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAllowableOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectIds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectIds")(js.undefined)
        ret
    }
    @scala.inline
    def withOutFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outFields")(js.undefined)
        ret
    }
    @scala.inline
    def withOutSpatialReference(value: SpatialReferenceProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outSpatialReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutSpatialReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outSpatialReference")(js.undefined)
        ret
    }
    @scala.inline
    def withRelationshipId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationshipId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelationshipId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationshipId")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnGeometry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnGeometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnGeometry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnGeometry")(js.undefined)
        ret
    }
    @scala.inline
    def withWhere(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("where")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhere: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("where")(js.undefined)
        ret
    }
  }
  
}

