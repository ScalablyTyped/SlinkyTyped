package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemReference extends js.Object {
  // Unique identifier of the drive instance that contains the item. Read-only.
  var driveId: js.UndefOr[String] = js.native
  // Identifies the type of drive. See [drive][] resource for values.
  var driveType: js.UndefOr[String] = js.native
  // Unique identifier of the item in the drive. Read-only.
  var id: js.UndefOr[String] = js.native
  // The name of the item being referenced. Read-only.
  var name: js.UndefOr[String] = js.native
  // Path that can be used to navigate to the item. Read-only.
  var path: js.UndefOr[String] = js.native
  // A unique identifier for a shared resource that can be accessed via the [Shares][] API.
  var shareId: js.UndefOr[String] = js.native
  // Returns identifiers useful for SharePoint REST compatibility. Read-only.
  var sharepointIds: js.UndefOr[SharepointIds] = js.native
  var siteId: js.UndefOr[String] = js.native
}

object ItemReference {
  @scala.inline
  def apply(): ItemReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemReference]
  }
  @scala.inline
  implicit class ItemReferenceOps[Self <: ItemReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDriveId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriveId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveId")(js.undefined)
        ret
    }
    @scala.inline
    def withDriveType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriveType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveType")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withShareId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShareId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareId")(js.undefined)
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
  }
  
}

