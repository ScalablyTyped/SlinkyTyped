package typingsSlinky.fileEntryCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyzedFilesInfo extends js.Object {
  val changedFiles: js.Array[String] = js.native
  val notChangedFiles: js.Array[String] = js.native
  val notFoundFiles: js.Array[String] = js.native
}

object AnalyzedFilesInfo {
  @scala.inline
  def apply(changedFiles: js.Array[String], notChangedFiles: js.Array[String], notFoundFiles: js.Array[String]): AnalyzedFilesInfo = {
    val __obj = js.Dynamic.literal(changedFiles = changedFiles.asInstanceOf[js.Any], notChangedFiles = notChangedFiles.asInstanceOf[js.Any], notFoundFiles = notFoundFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzedFilesInfo]
  }
  @scala.inline
  implicit class AnalyzedFilesInfoOps[Self <: AnalyzedFilesInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangedFiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotChangedFiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notChangedFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotFoundFiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFoundFiles")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

