package typingsSlinky.mockFs.filesystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SymlinkOptions extends js.Object {
  /** The last symlink access time. Defaults to `new Date()`. */
  var atime: js.UndefOr[js.Date] = js.native
  /** The time of symlink creation. Defaults to `new Date()`. */
  var birthtime: js.UndefOr[js.Date] = js.native
  /** The last symlink change time. Defaults to `new Date()`. */
  var ctime: js.UndefOr[js.Date] = js.native
  /** The group id. Defaults to `process.getgid()`. */
  var gid: js.UndefOr[Double] = js.native
  /** Symlink mode (permission and sticky bits). Defaults to `0666`. */
  var mode: js.UndefOr[Double] = js.native
  /** The last symlink modification time. Defaults to `new Date()`. */
  var mtime: js.UndefOr[js.Date] = js.native
  /** Path to the source (required). */
  var path: String = js.native
  /** The user id. Defaults to `process.getuid()`. */
  var uid: js.UndefOr[Double] = js.native
}

object SymlinkOptions {
  @scala.inline
  def apply(path: String): SymlinkOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymlinkOptions]
  }
  @scala.inline
  implicit class SymlinkOptionsOps[Self <: SymlinkOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
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

