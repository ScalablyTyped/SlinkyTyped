package typingsSlinky.cpx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyncOptions extends js.Object {
  /** remove files that copied on past before copy. */
  var clean: js.UndefOr[Boolean] = js.native
  /** Follow symbolic links when copying from them. */
  var dereference: js.UndefOr[Boolean] = js.native
  /** Copy empty directories which is matched with the glob. */
  var includeEmptyDirs: js.UndefOr[Boolean] = js.native
  /** Preserve UID, GID, ATIME, and MTIME of files. */
  var preserve: js.UndefOr[Boolean] = js.native
  /** Do not overwrite files on destination if the source file is older. */
  var update: js.UndefOr[Boolean] = js.native
}

object SyncOptions {
  @scala.inline
  def apply(): SyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncOptions]
  }
  @scala.inline
  implicit class SyncOptionsOps[Self <: SyncOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClean(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clean")(js.undefined)
        ret
    }
    @scala.inline
    def withDereference(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dereference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDereference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dereference")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeEmptyDirs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeEmptyDirs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeEmptyDirs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeEmptyDirs")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserve(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserve")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
  }
  
}

