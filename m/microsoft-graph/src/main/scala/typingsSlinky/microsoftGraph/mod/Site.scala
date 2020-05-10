package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Site extends BaseItem {
  // Analytics about the view activities that took place in this site.
  var analytics: js.UndefOr[ItemAnalytics] = js.native
  // The collection of column definitions reusable across lists under this site.
  var columns: js.UndefOr[js.Array[ColumnDefinition]] = js.native
  // The collection of content types defined for this site.
  var contentTypes: js.UndefOr[js.Array[ContentType]] = js.native
  // The full title for the site. Read-only.
  var displayName: js.UndefOr[String] = js.native
  // The default drive (document library) for this site.
  var drive: js.UndefOr[Drive] = js.native
  // The collection of drives (document libraries) under this site.
  var drives: js.UndefOr[js.Array[Drive]] = js.native
  // Used to address any item contained in this site. This collection cannot be enumerated.
  var items: js.UndefOr[js.Array[BaseItem]] = js.native
  // The collection of lists under this site.
  var lists: js.UndefOr[js.Array[List]] = js.native
  // Calls the OneNote service for notebook related operations.
  var onenote: js.UndefOr[Onenote] = js.native
  // If present, indicates that this is the root site in the site collection. Read-only.
  var root: js.UndefOr[Root] = js.native
  // Returns identifiers useful for SharePoint REST compatibility. Read-only.
  var sharepointIds: js.UndefOr[SharepointIds] = js.native
  // Provides details about the site's site collection. Available only on the root site. Read-only.
  var siteCollection: js.UndefOr[SiteCollection] = js.native
  // The collection of the sub-sites under this site.
  var sites: js.UndefOr[js.Array[Site]] = js.native
}

object Site {
  @scala.inline
  def apply(): Site = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Site]
  }
  @scala.inline
  implicit class SiteOps[Self <: Site] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalytics(value: ItemAnalytics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analytics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalytics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analytics")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[ColumnDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withContentTypes(value: js.Array[ContentType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withDrive(value: Drive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drive")(js.undefined)
        ret
    }
    @scala.inline
    def withDrives(value: js.Array[Drive]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drives")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[BaseItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withLists(value: js.Array[List]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lists")(js.undefined)
        ret
    }
    @scala.inline
    def withOnenote(value: Onenote): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onenote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnenote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onenote")(js.undefined)
        ret
    }
    @scala.inline
    def withRoot(value: Root): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withSharepointIds(value: SharepointIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharepointIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharepointIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharepointIds")(js.undefined)
        ret
    }
    @scala.inline
    def withSiteCollection(value: SiteCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteCollection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiteCollection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteCollection")(js.undefined)
        ret
    }
    @scala.inline
    def withSites(value: js.Array[Site]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSites: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sites")(js.undefined)
        ret
    }
  }
  
}

