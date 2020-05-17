package typingsSlinky.iobroker.mod.global.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the return values of rm */
@js.native
trait RmResult extends js.Object {
  /** The name of the deleted file or directory */
  var file: String = js.native
  /** Whether the deleted object was a directory or a file */
  var isDir: Boolean = js.native
  /** The parent directory of the deleted file or directory */
  var path: String = js.native
}

object RmResult {
  @scala.inline
  def apply(file: String, isDir: Boolean, path: String): RmResult = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], isDir = isDir.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RmResult]
  }
  @scala.inline
  implicit class RmResultOps[Self <: RmResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDir(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

