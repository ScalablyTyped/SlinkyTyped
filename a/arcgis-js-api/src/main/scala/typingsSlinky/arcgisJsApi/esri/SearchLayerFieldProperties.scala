package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`global-id`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`small-integer`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.blob
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.date
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.double
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.guid
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.integer
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.long
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.oid
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.raster
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.single
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.string
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchLayerFieldProperties extends js.Object {
  /**
    * Whether or not the field is an exact match.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchLayerField.html#exactMatch)
    */
  var exactMatch: js.UndefOr[Boolean] = js.native
  /**
    * The name of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchLayerField.html#name)
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The data type of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchLayerField.html#type)
    */
  var `type`: js.UndefOr[
    `small-integer` | integer | single | double | long | string | date | oid | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.geometry | blob | raster | guid | `global-id` | xml
  ] = js.native
}

object SearchLayerFieldProperties {
  @scala.inline
  def apply(): SearchLayerFieldProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchLayerFieldProperties]
  }
  @scala.inline
  implicit class SearchLayerFieldPropertiesOps[Self <: SearchLayerFieldProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withType(
      value: `small-integer` | integer | single | double | long | string | date | oid | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.geometry | blob | raster | guid | `global-id` | xml
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

