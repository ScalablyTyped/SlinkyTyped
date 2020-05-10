package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItem extends BaseItem {
  // Analytics about the view activities that took place on this item.
  var analytics: js.UndefOr[ItemAnalytics] = js.native
  // The content type of this list item
  var contentType: js.UndefOr[ContentTypeInfo] = js.native
  // For document libraries, the driveItem relationship exposes the listItem as a [driveItem][]
  var driveItem: js.UndefOr[DriveItem] = js.native
  // The values of the columns set on this list item.
  var fields: js.UndefOr[FieldValueSet] = js.native
  // Returns identifiers useful for SharePoint REST compatibility. Read-only.
  var sharepointIds: js.UndefOr[SharepointIds] = js.native
  // The list of previous versions of the list item.
  var versions: js.UndefOr[js.Array[ListItemVersion]] = js.native
}

object ListItem {
  @scala.inline
  def apply(): ListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItem]
  }
  @scala.inline
  implicit class ListItemOps[Self <: ListItem] (val x: Self) extends AnyVal {
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
    def withContentType(value: ContentTypeInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withDriveItem(value: DriveItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriveItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveItem")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: FieldValueSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
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
    def withVersions(value: js.Array[ListItemVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versions")(js.undefined)
        ret
    }
  }
  
}

