package typingsSlinky.firefoxWebextBrowser

import typingsSlinky.firefoxWebextBrowser.browser.extension.ViewType
import typingsSlinky.firefoxWebextBrowser.browser.menus.ContextType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFrameUrl extends js.Object {
  /** A list of all contexts that apply to the menu. */
  var contexts: js.Array[ContextType] = js.native
  var editable: Boolean = js.native
  var frameUrl: js.UndefOr[String] = js.native
  var linkText: js.UndefOr[String] = js.native
  var linkUrl: js.UndefOr[String] = js.native
  var mediaType: js.UndefOr[String] = js.native
  /** A list of IDs of the menu items that were shown. */
  var menuIds: Double | js.Array[String] = js.native
  var pageUrl: js.UndefOr[String] = js.native
  var selectionText: js.UndefOr[String] = js.native
  var srcUrl: js.UndefOr[String] = js.native
  var targetElementId: js.UndefOr[Double] = js.native
  var viewType: js.UndefOr[ViewType] = js.native
}

object AnonFrameUrl {
  @scala.inline
  def apply(contexts: js.Array[ContextType], editable: Boolean, menuIds: Double | js.Array[String]): AnonFrameUrl = {
    val __obj = js.Dynamic.literal(contexts = contexts.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], menuIds = menuIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFrameUrl]
  }
  @scala.inline
  implicit class AnonFrameUrlOps[Self <: AnonFrameUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContexts(value: js.Array[ContextType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contexts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuIds(value: Double | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuIds")(value.asInstanceOf[js.Any])
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
  }
  
}

