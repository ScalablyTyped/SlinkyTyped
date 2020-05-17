package typingsSlinky.iobroker.mod.global.ioBroker

import typingsSlinky.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the return values of chownFile */
@js.native
trait ChownFileResult extends js.Object {
  /** Access rights */
  var acl: FileACL = js.native
  /** Date of creation */
  var createdAt: Double = js.native
  /** Name of the file or directory */
  var file: String = js.native
  /** Whether this is a directory or a file */
  var isDir: Boolean = js.native
  /** Date of last modification */
  var modifiedAt: Double = js.native
  /** The parent directory of the processed file or directory */
  var path: String = js.native
  /** File system stats */
  var stats: Stats = js.native
}

object ChownFileResult {
  @scala.inline
  def apply(
    acl: FileACL,
    createdAt: Double,
    file: String,
    isDir: Boolean,
    modifiedAt: Double,
    path: String,
    stats: Stats
  ): ChownFileResult = {
    val __obj = js.Dynamic.literal(acl = acl.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], isDir = isDir.asInstanceOf[js.Any], modifiedAt = modifiedAt.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChownFileResult]
  }
  @scala.inline
  implicit class ChownFileResultOps[Self <: ChownFileResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcl(value: FileACL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedAt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withModifiedAt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStats(value: Stats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

