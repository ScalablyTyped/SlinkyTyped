package typingsSlinky.mockFs.filesystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryOptions extends js.Object {
  /**
    * The last directory access time. Defaults to `new Date()`.
    */
  var atime: js.UndefOr[js.Date] = js.native
  /**
    * The time of directory creation. Defaults to `new Date()`.
    */
  var birthtime: js.UndefOr[js.Date] = js.native
  /**
    * The last directory change time. Defaults to `new Date()`. Updated
    * when owner or permissions change.
    */
  var ctime: js.UndefOr[js.Date] = js.native
  /** The group id. Defaults to `process.getgid()`. */
  var gid: js.UndefOr[Double] = js.native
  /**
    * Directory contents. Members will generate additional files,
    * directories, or symlinks.
    */
  var items: js.UndefOr[DirectoryItems] = js.native
  /** Directory mode (permission and sticky bits). Defaults to `0777`. */
  var mode: js.UndefOr[Double] = js.native
  /**
    * The last directory modification time. Defaults to `new Date()`.
    * Updated when an item is added, removed, or renamed.
    */
  var mtime: js.UndefOr[js.Date] = js.native
  /** The user id. Defaults to `process.getuid()`. */
  var uid: js.UndefOr[Double] = js.native
}

object DirectoryOptions {
  @scala.inline
  def apply(): DirectoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryOptions]
  }
  @scala.inline
  implicit class DirectoryOptionsOps[Self <: DirectoryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAtime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAtime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atime")(js.undefined)
        ret
    }
    @scala.inline
    def withBirthtime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("birthtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBirthtime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("birthtime")(js.undefined)
        ret
    }
    @scala.inline
    def withCtime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCtime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctime")(js.undefined)
        ret
    }
    @scala.inline
    def withGid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gid")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: DirectoryItems): Self = {
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
    def withMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withMtime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMtime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mtime")(js.undefined)
        ret
    }
    @scala.inline
    def withUid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(js.undefined)
        ret
    }
  }
  
}

