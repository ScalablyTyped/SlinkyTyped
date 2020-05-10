package typingsSlinky.chromeApps.chrome.contextMenus

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnClickData extends js.Object {
  /**
    * A flag indicating the state of a checkbox or radio item after it is clicked.
    * @since Chrome 35.
    */
  var checked: js.UndefOr[Boolean] = js.native
  /**
    * A flag indicating whether the element is editable (text input, textarea, etc.).
    * @since Chrome 35.
    */
  var editable: Boolean = js.native
  /**
    * The ID of the frame of the element where the context menu was clicked,
    * if it was in a frame.
    * @since Chrome 35.
    */
  var frameId: js.UndefOr[integer] = js.native
  /**
    * The URL of the frame of the element where the context menu was clicked,
    * if it was in a frame.
    * @since Chrome 35.
    */
  var frameUrl: js.UndefOr[String] = js.native
  /**
    * If the element is a link, the URL it points to.
    * @since Chrome 35.
    */
  var linkUrl: js.UndefOr[String] = js.native
  /**
    * One of 'image', 'video', or 'audio' if the context menu was
    * activated on one of these types of elements.
    * @since Chrome 35.
    */
  var mediaType: js.UndefOr[MediaType] = js.native
  /**
    * The ID of the menu item that was clicked.
    * @since Chrome 35.
    */
  var menuItemId: integer | String = js.native
  /**
    * The URL of the page where the menu item was clicked.
    * This property is not set if the click occured in a
    * context where there is no current page, such as in
    * a launcher context menu.
    * @since Chrome 35.
    */
  var pageUrl: String = js.native
  /**
    * The parent ID, if any, for the item clicked.
    * @since Chrome 35.
    */
  var parentMenuItemId: js.UndefOr[integer | String] = js.native
  /**
    * The text for the context selection, if any.
    * @since Chrome 35.
    */
  var selectionText: js.UndefOr[String] = js.native
  /**
    * Will be present for elements with a 'src' URL.
    * @since Chrome 35.
    */
  var srcUrl: js.UndefOr[String] = js.native
  /**
    * A flag indicating the state of a checkbox or radio item before it was clicked.
    * @since Chrome 35.
    */
  var wasChecked: js.UndefOr[Boolean] = js.native
}

object OnClickData {
  @scala.inline
  def apply(editable: Boolean, menuItemId: integer | String, pageUrl: String): OnClickData = {
    val __obj = js.Dynamic.literal(editable = editable.asInstanceOf[js.Any], menuItemId = menuItemId.asInstanceOf[js.Any], pageUrl = pageUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnClickData]
  }
  @scala.inline
  implicit class OnClickDataOps[Self <: OnClickData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEditable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuItemId(value: integer | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageUrl")(value.asInstanceOf[js.Any])
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
    def withFrameId(value: integer): Self = {
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
    def withMediaType(value: MediaType): Self = {
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
    def withParentMenuItemId(value: integer | String): Self = {
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

