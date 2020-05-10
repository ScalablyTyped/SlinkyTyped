package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Drive extends BaseItem {
  /**
    * Describes the type of drive represented by this resource. OneDrive personal drives will return personal. OneDrive for
    * Business will return business. SharePoint document libraries will return documentLibrary. Read-only.
    */
  var driveType: js.UndefOr[String] = js.native
  // All items contained in the drive. Read-only. Nullable.
  var items: js.UndefOr[js.Array[DriveItem]] = js.native
  // For drives in SharePoint, the underlying document library list. Read-only. Nullable.
  var list: js.UndefOr[List] = js.native
  // Optional. The user account that owns the drive. Read-only.
  var owner: js.UndefOr[IdentitySet] = js.native
  // Optional. Information about the drive's storage space quota. Read-only.
  var quota: js.UndefOr[Quota] = js.native
  // The root folder of the drive. Read-only.
  var root: js.UndefOr[DriveItem] = js.native
  var sharePointIds: js.UndefOr[SharepointIds] = js.native
  // Collection of common folders available in OneDrive. Read-only. Nullable.
  var special: js.UndefOr[js.Array[DriveItem]] = js.native
  // If present, indicates that this is a system-managed drive. Read-only.
  var system: js.UndefOr[SystemFacet] = js.native
}

object Drive {
  @scala.inline
  def apply(): Drive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Drive]
  }
  @scala.inline
  implicit class DriveOps[Self <: Drive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withItems(value: js.Array[DriveItem]): Self = {
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
    def withList(value: List): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: IdentitySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
    @scala.inline
    def withQuota(value: Quota): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quota")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuota: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quota")(js.undefined)
        ret
    }
    @scala.inline
    def withRoot(value: DriveItem): Self = {
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
    def withSharePointIds(value: SharepointIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharePointIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharePointIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharePointIds")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecial(value: js.Array[DriveItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("special")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("special")(js.undefined)
        ret
    }
    @scala.inline
    def withSystem(value: SystemFacet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system")(js.undefined)
        ret
    }
  }
  
}

