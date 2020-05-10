package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalBasemapsSourceProperties extends js.Object {
  /**
    * A collection of [Basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html)s.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-LocalBasemapsSource.html#basemaps)
    */
  var basemaps: js.UndefOr[CollectionProperties[BasemapProperties]] = js.native
}

object LocalBasemapsSourceProperties {
  @scala.inline
  def apply(): LocalBasemapsSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalBasemapsSourceProperties]
  }
  @scala.inline
  implicit class LocalBasemapsSourcePropertiesOps[Self <: LocalBasemapsSourceProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBasemaps(value: CollectionProperties[BasemapProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basemaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasemaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basemaps")(js.undefined)
        ret
    }
  }
  
}

