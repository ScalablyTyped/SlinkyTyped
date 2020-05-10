package typingsSlinky.forkTsCheckerWebpackPlugin

import typingsSlinky.typescript.mod.Diagnostic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRemovedFiles extends js.Object {
  var removedFiles: js.Array[String] = js.native
  var results: js.Array[Diagnostic] = js.native
  var updatedFiles: js.Array[String] = js.native
}

object AnonRemovedFiles {
  @scala.inline
  def apply(removedFiles: js.Array[String], results: js.Array[Diagnostic], updatedFiles: js.Array[String]): AnonRemovedFiles = {
    val __obj = js.Dynamic.literal(removedFiles = removedFiles.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], updatedFiles = updatedFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRemovedFiles]
  }
  @scala.inline
  implicit class AnonRemovedFilesOps[Self <: AnonRemovedFiles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemovedFiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removedFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResults(value: js.Array[Diagnostic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedFiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedFiles")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

