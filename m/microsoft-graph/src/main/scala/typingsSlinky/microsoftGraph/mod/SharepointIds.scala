package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharepointIds extends js.Object {
  // The unique identifier (guid) for the item's list in SharePoint.
  var listId: js.UndefOr[String] = js.native
  // An integer identifier for the item within the containing list.
  var listItemId: js.UndefOr[String] = js.native
  // The unique identifier (guid) for the item within OneDrive for Business or a SharePoint site.
  var listItemUniqueId: js.UndefOr[String] = js.native
  // The unique identifier (guid) for the item's site collection (SPSite).
  var siteId: js.UndefOr[String] = js.native
  // The SharePoint URL for the site that contains the item.
  var siteUrl: js.UndefOr[String] = js.native
  // The unique identifier (guid) for the item's site (SPWeb).
  var webId: js.UndefOr[String] = js.native
}

object SharepointIds {
  @scala.inline
  def apply(): SharepointIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharepointIds]
  }
  @scala.inline
  implicit class SharepointIdsOps[Self <: SharepointIds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withListId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listId")(js.undefined)
        ret
    }
    @scala.inline
    def withListItemId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listItemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListItemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listItemId")(js.undefined)
        ret
    }
    @scala.inline
    def withListItemUniqueId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listItemUniqueId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListItemUniqueId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listItemUniqueId")(js.undefined)
        ret
    }
    @scala.inline
    def withSiteId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiteId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteId")(js.undefined)
        ret
    }
    @scala.inline
    def withSiteUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiteUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withWebId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webId")(js.undefined)
        ret
    }
  }
  
}

