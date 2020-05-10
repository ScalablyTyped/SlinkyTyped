package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.raw.Blob
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalItemUpdateThumbnailParams extends Object {
  /**
    * The file name used for the thumbnail in [thumbnailUrl](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#thumbnailUrl).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#updateThumbnail)
    */
  var filename: js.UndefOr[String] = js.native
  /**
    * A URL, Data URI, Blob, or File. The accepted formats are `GIF`, `JPG`, and `PNG`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#updateThumbnail)
    */
  var thumbnail: Blob | String = js.native
}

object PortalItemUpdateThumbnailParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    thumbnail: Blob | String
  ): PortalItemUpdateThumbnailParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalItemUpdateThumbnailParams]
  }
  @scala.inline
  implicit class PortalItemUpdateThumbnailParamsOps[Self <: PortalItemUpdateThumbnailParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThumbnailBlob(value: Blob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbnail(value: Blob | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.undefined)
        ret
    }
  }
  
}

