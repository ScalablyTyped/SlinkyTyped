package typingsSlinky.firefoxWebextBrowser.browser.contextMenus

import typingsSlinky.firefoxWebextBrowser.browser.extension.ViewType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information sent when a context menu item is clicked. */
@js.native
trait OnClickData extends js.Object {
  /** The id of the bookmark where the context menu was clicked, if it was on a bookmark. */
  var bookmarkId: String = js.native
  /** An integer value of button by which menu item was clicked. */
  var button: js.UndefOr[Double] = js.native
  /** A flag indicating the state of a checkbox or radio item after it is clicked. */
  var checked: js.UndefOr[Boolean] = js.native
  /** A flag indicating whether the element is editable (text input, textarea, etc.). */
  var editable: Boolean = js.native
  /** The id of the frame of the element where the context menu was clicked. */
  var frameId: js.UndefOr[Double] = js.native
  /** The URL of the frame of the element where the context menu was clicked, if it was in a frame. */
  var frameUrl: js.UndefOr[String] = js.native
  /** If the element is a link, the text of that link. */
  var linkText: js.UndefOr[String] = js.native
  /** If the element is a link, the URL it points to. */
  var linkUrl: js.UndefOr[String] = js.native
  /**
    * One of 'image', 'video', or 'audio' if the context menu was activated on one of these types of elements.
    */
  var mediaType: js.UndefOr[String] = js.native
  /** The ID of the menu item that was clicked. */
  var menuItemId: Double | String = js.native
  /** An array of keyboard modifiers that were held while the menu item was clicked. */
  var modifiers: js.Array[OnClickDataModifiers] = js.native
  /**
    * The URL of the page where the menu item was clicked. This property is not set if the click occured in a
    * context where there is no current page, such as in a launcher context menu.
    */
  var pageUrl: js.UndefOr[String] = js.native
  /** The parent ID, if any, for the item clicked. */
  var parentMenuItemId: js.UndefOr[Double | String] = js.native
  /** The text for the context selection, if any. */
  var selectionText: js.UndefOr[String] = js.native
  /** Will be present for elements with a 'src' URL. */
  var srcUrl: js.UndefOr[String] = js.native
  /**
    * An identifier of the clicked element, if any. Use menus.getTargetElement in the page to find the
    * corresponding element.
    */
  var targetElementId: js.UndefOr[Double] = js.native
  /** The type of view where the menu is clicked. May be unset if the menu is not associated with a view. */
  var viewType: js.UndefOr[ViewType] = js.native
  /** A flag indicating the state of a checkbox or radio item before it was clicked. */
  var wasChecked: js.UndefOr[Boolean] = js.native
}

object OnClickData {
  @scala.inline
  def apply(
    bookmarkId: String,
    editable: Boolean,
    menuItemId: Double | String,
    modifiers: js.Array[OnClickDataModifiers]
  ): OnClickData = {
    val __obj = js.Dynamic.literal(bookmarkId = bookmarkId.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], menuItemId = menuItemId.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnClickData]
  }
  @scala.inline
  implicit class OnClickDataOps[Self <: OnClickData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBookmarkId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmarkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuItemId(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifiers(value: js.Array[OnClickDataModifiers]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButton(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(js.undefined)
        ret
    }
    @scala.inline
    def withChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameId")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkText")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(js.undefined)
        ret
    }
    @scala.inline
    def withPageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withParentMenuItemId(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentMenuItemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentMenuItemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentMenuItemId")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionText")(js.undefined)
        ret
    }
    @scala.inline
    def withSrcUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrcUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetElementId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetElementId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetElementId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetElementId")(js.undefined)
        ret
    }
    @scala.inline
    def withViewType(value: ViewType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewType")(js.undefined)
        ret
    }
    @scala.inline
    def withWasChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wasChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWasChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wasChecked")(js.undefined)
        ret
    }
  }
  
}

