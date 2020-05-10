package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerSearchSourceProperties extends SearchSourceProperties {
  /**
    * The results are displayed using this field. Defaults to the layer's `displayField` or the first string field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html#displayField)
    */
  var displayField: js.UndefOr[String] = js.native
  /**
    * Indicates to only return results that match the search value exactly. This property only applies to `string` field searches. `exactMatch` is always `true` when searching fields of type `number`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html#exactMatch)
    *
    * @default false
    */
  var exactMatch: js.UndefOr[Boolean] = js.native
  /**
    * The layer queried in the search. This is **required**.
    * > Layers created from client-side graphics are not supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html#layer)
    */
  var layer: js.UndefOr[LayerProperties] = js.native
  /**
    * The name of the source for display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html#name)
    */
  var name: js.UndefOr[String] = js.native
  /**
    * One or more field names used to order the query results. Specfiy `ASC` (ascending) or `DESC` (descending) after the field name to control the order. The default order is `ASC`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html#orderByFields)
    */
  var orderByFields: js.UndefOr[js.Array[String]] = js.native
  /**
    * An array of string values representing the names of fields in the feature layer to search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html#searchFields)
    */
  var searchFields: js.UndefOr[js.Array[String]] = js.native
  /**
    * A template string used to display multiple fields in a defined order when results are displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html#searchTemplate)
    */
  var searchTemplate: js.UndefOr[String] = js.native
  /**
    * A template string used to display multiple fields in a defined order when suggestions are displayed. This takes precedence over `displayField`. Field names in the template must have the following format: `{FieldName}`. An example suggestionTemplate could look something like: `Name: {OWNER}, Parcel: {PARCEL_ID}`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html#suggestionTemplate)
    */
  var suggestionTemplate: js.UndefOr[String] = js.native
}

object LayerSearchSourceProperties {
  @scala.inline
  def apply(): LayerSearchSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerSearchSourceProperties]
  }
  @scala.inline
  implicit class LayerSearchSourcePropertiesOps[Self <: LayerSearchSourceProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayField")(js.undefined)
        ret
    }
    @scala.inline
    def withExactMatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exactMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExactMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exactMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withLayer(value: LayerProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(js.undefined)
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
    def withOrderByFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderByFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderByFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderByFields")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchFields")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestionTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestionTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionTemplate")(js.undefined)
        ret
    }
  }
  
}

