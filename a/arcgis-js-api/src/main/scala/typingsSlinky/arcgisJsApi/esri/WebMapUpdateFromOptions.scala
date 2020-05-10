package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebMapUpdateFromOptions extends Object {
  /**
    * When `true`, the thumbnail will not be updated for the webmap. Defaults to `false`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#updateFrom)
    */
  var thumbnailExcluded: js.UndefOr[Boolean] = js.native
  /**
    * The size of the thumbnail. Defaults to 600x400 (ratio 1.5:1). Note that the thumbnail size may currently not be larger than the size of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#updateFrom)
    */
  var thumbnailSize: js.UndefOr[WebMapUpdateFromOptionsThumbnailSize] = js.native
  /**
    * When `true`, the initial viewpoint of the view will be updated for the webmap. Defaults to `false`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#updateFrom)
    */
  var viewpointExcluded: js.UndefOr[Boolean] = js.native
}

object WebMapUpdateFromOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): WebMapUpdateFromOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[WebMapUpdateFromOptions]
  }
  @scala.inline
  implicit class WebMapUpdateFromOptionsOps[Self <: WebMapUpdateFromOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThumbnailExcluded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailExcluded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailExcluded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailExcluded")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailSize(value: WebMapUpdateFromOptionsThumbnailSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailSize")(js.undefined)
        ret
    }
    @scala.inline
    def withViewpointExcluded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewpointExcluded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewpointExcluded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewpointExcluded")(js.undefined)
        ret
    }
  }
  
}

