package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`many-to-many`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`one-to-many`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`one-to-one`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationshipProperties extends js.Object {
  /**
    * The cardinality which specifies the number of objects in the origin [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) related to the number of objects in the destination [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html). Please see the [Desktop help](http://desktop.arcgis.com/en/arcmap/10.3/manage-data/relationships/relationship-class-properties.htm#GUID-989CB1D1-AC51-4A4C-8D9D-0AB9E647FFFD) for additional information on cardinality.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#cardinality)
    */
  var cardinality: js.UndefOr[`one-to-one` | `one-to-many` | `many-to-many`] = js.native
  /**
    * The unique ID for the relationship. These ids for the relationships the [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) participates in are listed in the ArcGIS Services directory.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#id)
    */
  var id: js.UndefOr[Double] = js.native
  /**
    * The field used to establish the relate within the [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#keyField)
    */
  var keyField: js.UndefOr[String] = js.native
  /**
    * The name of the relationship.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#name)
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The unique ID of the related [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#relatedTableId)
    */
  var relatedTableId: js.UndefOr[Double] = js.native
}

object RelationshipProperties {
  @scala.inline
  def apply(): RelationshipProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationshipProperties]
  }
  @scala.inline
  implicit class RelationshipPropertiesOps[Self <: RelationshipProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCardinality(value: `one-to-one` | `one-to-many` | `many-to-many`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardinality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCardinality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardinality")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyField")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRelatedTableId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedTableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelatedTableId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedTableId")(js.undefined)
        ret
    }
  }
  
}

