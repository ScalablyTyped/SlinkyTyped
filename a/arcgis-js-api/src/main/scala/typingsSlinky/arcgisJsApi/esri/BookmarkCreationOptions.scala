package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BookmarkCreationOptions extends Object {
  /**
    * Indicates whether the extent of the current view will become the [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#extent) of a newly created bookmark. Default is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkCreationOptions)
    */
  var captureExtent: js.UndefOr[Boolean] = js.native
  /**
    * An object that specifies the settings of the screenshot that will be used to create the bookmark's [thumbnail](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#thumbnail).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkCreationOptions)
    */
  var screenshotSettings: js.UndefOr[BookmarkCreationOptionsScreenshotSettings] = js.native
  /**
    * Indicates whether a screenshot is taken when a new bookmark is created. The screenshot will be set as the [thumbnail](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html#thumbnail) in the newly created bookmark. Default is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkCreationOptions)
    */
  var takeScreenshot: js.UndefOr[Boolean] = js.native
}

object BookmarkCreationOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): BookmarkCreationOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[BookmarkCreationOptions]
  }
  @scala.inline
  implicit class BookmarkCreationOptionsOps[Self <: BookmarkCreationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaptureExtent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenshotSettings(value: BookmarkCreationOptionsScreenshotSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenshotSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenshotSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenshotSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withTakeScreenshot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("takeScreenshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTakeScreenshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("takeScreenshot")(js.undefined)
        ret
    }
  }
  
}

