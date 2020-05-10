package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BookmarksProperties
  extends WidgetProperties
     with GoToProperties {
  /**
    * Specifies how new bookmarks will be created if [editingEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#editingEnabled) is set to `true`. Can be used to enable or disable taking screenshots or creating an extent based on the current view when a bookmark is created. See [BookmarkCreationOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkCreationOptions) for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#bookmarkCreationOptions)
    */
  var bookmarkCreationOptions: js.UndefOr[BookmarkCreationOptions] = js.native
  /**
    * A collection of [Bookmark](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html)s.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#bookmarks)
    */
  var bookmarks: js.UndefOr[CollectionProperties[BookmarkProperties]] = js.native
  /**
    * When true, the widget is visually withdrawn and cannot be interacted with.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#disabled)
    *
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the widget is able to be edited. When `true`, allows bookmarks to be added, edited, reordered, or deleted from within the widget. Any edits made will only be shown locally and will not be saved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#editingEnabled)
    *
    * @default false
    */
  var editingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.native
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [BookmarksViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#viewModel)
    */
  var viewModel: js.UndefOr[BookmarksViewModelProperties] = js.native
  /**
    * The visible elements that are displayed within the widget. This property provides the ability to turn individual elements of the widget's display on/off.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#visibleElements)
    */
  var visibleElements: js.UndefOr[BookmarksVisibleElements] = js.native
}

object BookmarksProperties {
  @scala.inline
  def apply(): BookmarksProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BookmarksProperties]
  }
  @scala.inline
  implicit class BookmarksPropertiesOps[Self <: BookmarksProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBookmarkCreationOptions(value: BookmarkCreationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmarkCreationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBookmarkCreationOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmarkCreationOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withBookmarks(value: CollectionProperties[BookmarkProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmarks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBookmarks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmarks")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEditingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIconClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClass")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: MapViewProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
    @scala.inline
    def withViewModel(value: BookmarksViewModelProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModel")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleElements(value: BookmarksVisibleElements): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleElements")(js.undefined)
        ret
    }
  }
  
}

