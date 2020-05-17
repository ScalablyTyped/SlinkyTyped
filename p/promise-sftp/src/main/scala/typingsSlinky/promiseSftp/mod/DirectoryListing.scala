package typingsSlinky.promiseSftp.mod

import typingsSlinky.promiseSftp.anon.Group
import typingsSlinky.promiseSftp.promiseSftpStrings.`-_`
import typingsSlinky.promiseSftp.promiseSftpStrings.d
import typingsSlinky.promiseSftp.promiseSftpStrings.l
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Output of `PromiseSftp#list()` */
@js.native
trait DirectoryListing extends js.Object {
  /** The last modified date of the entry. */
  var date: js.Date = js.native
  /** The group name or ID that this entry belongs to. *NIX only */
  var group: js.UndefOr[String] = js.native
  /** The name of the entry. */
  var name: String = js.native
  /** The user name or ID that this entry belongs to. *NIX only */
  var owner: js.UndefOr[String] = js.native
  /** The various permissions for this entry. *NIX only */
  var rights: js.UndefOr[Group] = js.native
  /** True if the sticky bit is set for this entry */
  var sticky: js.UndefOr[Boolean] = js.native
  /** For symlink entries, this is the symlink's target. *NIX only */
  var target: js.UndefOr[String] = js.native
  /** `d` for directory, `-` for file, and `l` for symlink only on *NIX. */
  var `type`: d | `-_` | l = js.native
}

object DirectoryListing {
  @scala.inline
  def apply(date: js.Date, name: String, `type`: d | `-_` | l): DirectoryListing = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryListing]
  }
  @scala.inline
  implicit class DirectoryListingOps[Self <: DirectoryListing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: d | `-_` | l): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: String): Self = {
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
    def withRights(value: Group): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rights")(js.undefined)
        ret
    }
    @scala.inline
    def withSticky(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sticky")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSticky: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sticky")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

