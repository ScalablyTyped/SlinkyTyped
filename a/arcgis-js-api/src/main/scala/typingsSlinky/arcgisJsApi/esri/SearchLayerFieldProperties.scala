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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExactMatch(value: Boolean): Self = this.set("exactMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExactMatch: Self = this.set("exactMatch", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setType(
      value: `small-integer` | integer | single | double | long | string | date | oid | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.geometry | blob | raster | guid | `global-id` | xml
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
