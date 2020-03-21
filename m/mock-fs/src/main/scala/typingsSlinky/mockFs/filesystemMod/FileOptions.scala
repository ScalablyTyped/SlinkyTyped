package typingsSlinky.mockFs.filesystemMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileOptions extends js.Object {
  /**
    * The last file access time. Defaults to `new Date()`. Updated when
    * file contents are accessed.
    */
  var atime: js.UndefOr[js.Date] = js.undefined
  /**
    * The time of file creation. Defaults to `new Date()`.
    */
  var birthtime: js.UndefOr[js.Date] = js.undefined
  /** File contents */
  var content: js.UndefOr[String | Buffer] = js.undefined
  /**
    * The last file change time. Defaults to `new Date()`. Updated when
    * file owner or permissions change.
    */
  var ctime: js.UndefOr[js.Date] = js.undefined
  /** The group id. Defaults to `process.getgid()`. */
  var gid: js.UndefOr[Double] = js.undefined
  /** File mode (permission and sticky bits). Defaults to `0666`. */
  var mode: js.UndefOr[Double] = js.undefined
  /**
    * The last file modification time. Defaults to `new Date()`. Updated
    * when file contents change.
    */
  var mtime: js.UndefOr[js.Date] = js.undefined
  /** The user id. Defaults to `process.getuid()`. */
  var uid: js.UndefOr[Double] = js.undefined
}

object FileOptions {
  @scala.inline
  def apply(
    atime: js.Date = null,
    birthtime: js.Date = null,
    content: String | Buffer = null,
    ctime: js.Date = null,
    gid: Int | Double = null,
    mode: Int | Double = null,
    mtime: js.Date = null,
    uid: Int | Double = null
  ): FileOptions = {
    val __obj = js.Dynamic.literal()
    if (atime != null) __obj.updateDynamic("atime")(atime.asInstanceOf[js.Any])
    if (birthtime != null) __obj.updateDynamic("birthtime")(birthtime.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (ctime != null) __obj.updateDynamic("ctime")(ctime.asInstanceOf[js.Any])
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (mtime != null) __obj.updateDynamic("mtime")(mtime.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileOptions]
  }
}

