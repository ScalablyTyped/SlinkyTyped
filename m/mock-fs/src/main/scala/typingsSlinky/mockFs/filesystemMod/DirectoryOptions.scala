package typingsSlinky.mockFs.filesystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryOptions extends js.Object {
  /**
    * The last directory access time. Defaults to `new Date()`.
    */
  var atime: js.UndefOr[js.Date] = js.undefined
  /**
    * The time of directory creation. Defaults to `new Date()`.
    */
  var birthtime: js.UndefOr[js.Date] = js.undefined
  /**
    * The last directory change time. Defaults to `new Date()`. Updated
    * when owner or permissions change.
    */
  var ctime: js.UndefOr[js.Date] = js.undefined
  /** The group id. Defaults to `process.getgid()`. */
  var gid: js.UndefOr[Double] = js.undefined
  /**
    * Directory contents. Members will generate additional files,
    * directories, or symlinks.
    */
  var items: js.UndefOr[DirectoryItems] = js.undefined
  /** Directory mode (permission and sticky bits). Defaults to `0777`. */
  var mode: js.UndefOr[Double] = js.undefined
  /**
    * The last directory modification time. Defaults to `new Date()`.
    * Updated when an item is added, removed, or renamed.
    */
  var mtime: js.UndefOr[js.Date] = js.undefined
  /** The user id. Defaults to `process.getuid()`. */
  var uid: js.UndefOr[Double] = js.undefined
}

object DirectoryOptions {
  @scala.inline
  def apply(
    atime: js.Date = null,
    birthtime: js.Date = null,
    ctime: js.Date = null,
    gid: js.UndefOr[Double] = js.undefined,
    items: DirectoryItems = null,
    mode: js.UndefOr[Double] = js.undefined,
    mtime: js.Date = null,
    uid: js.UndefOr[Double] = js.undefined
  ): DirectoryOptions = {
    val __obj = js.Dynamic.literal()
    if (atime != null) __obj.updateDynamic("atime")(atime.asInstanceOf[js.Any])
    if (birthtime != null) __obj.updateDynamic("birthtime")(birthtime.asInstanceOf[js.Any])
    if (ctime != null) __obj.updateDynamic("ctime")(ctime.asInstanceOf[js.Any])
    if (!js.isUndefined(gid)) __obj.updateDynamic("gid")(gid.get.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(mode)) __obj.updateDynamic("mode")(mode.get.asInstanceOf[js.Any])
    if (mtime != null) __obj.updateDynamic("mtime")(mtime.asInstanceOf[js.Any])
    if (!js.isUndefined(uid)) __obj.updateDynamic("uid")(uid.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryOptions]
  }
}

