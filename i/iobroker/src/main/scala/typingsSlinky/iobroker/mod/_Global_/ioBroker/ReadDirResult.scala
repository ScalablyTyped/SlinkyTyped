package typingsSlinky.iobroker.mod._Global_.ioBroker

import typingsSlinky.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the return values of readDir */
@js.native
trait ReadDirResult extends js.Object {
  /** Access rights */
  var acl: js.UndefOr[EvaluatedFileACL] = js.native
  /** Date of creation */
  var createdAt: js.UndefOr[Double] = js.native
  /** Name of the file or directory */
  var file: String = js.native
  /** Whether this is a directory or a file */
  var isDir: Boolean = js.native
  /** Date of last modification */
  var modifiedAt: js.UndefOr[Double] = js.native
  /** File system stats */
  var stats: Stats = js.native
}

object ReadDirResult {
  @scala.inline
  def apply(file: String, isDir: Boolean, stats: Stats): ReadDirResult = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], isDir = isDir.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadDirResult]
  }
  @scala.inline
  implicit class ReadDirResultOps[Self <: ReadDirResult] (val x: Self) extends AnyVal {
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
    def withStats(value: Stats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAcl(value: EvaluatedFileACL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acl")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedAt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(js.undefined)
        ret
    }
    @scala.inline
    def withModifiedAt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifiedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedAt")(js.undefined)
        ret
    }
  }
  
}

