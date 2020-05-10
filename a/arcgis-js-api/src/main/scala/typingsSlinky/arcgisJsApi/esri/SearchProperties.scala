package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchProperties extends js.Object {
  /**
    * Indicates whether the place finder is enabled in the web scene or the web map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-Search.html#addressSearchEnabled)
    */
  var addressSearchEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether search functionality is enabled in the web scene or the web map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-Search.html#enabled)
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * The hint provided with the search dialog.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-Search.html#hintText)
    */
  var hintText: js.UndefOr[String] = js.native
  /**
    * A collection of layers to be included in search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-Search.html#layers)
    */
  var layers: js.UndefOr[CollectionProperties[SearchLayerProperties]] = js.native
}

object SearchProperties {
  @scala.inline
  def apply(): SearchProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchProperties]
  }
  @scala.inline
  implicit class SearchPropertiesOps[Self <: SearchProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddressSearchEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressSearchEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddressSearchEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressSearchEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHintText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hintText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHintText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hintText")(js.undefined)
        ret
    }
    @scala.inline
    def withLayers(value: CollectionProperties[SearchLayerProperties]): Self = {
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
  }
  
}

