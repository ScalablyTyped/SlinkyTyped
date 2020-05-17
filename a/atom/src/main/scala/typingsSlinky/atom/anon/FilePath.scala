package typingsSlinky.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilePath extends js.Object {
  var filePath: js.UndefOr[String] = js.native
  var replacements: Double = js.native
}

object FilePath {
  @scala.inline
  def apply(replacements: Double): FilePath = {
    val __obj = js.Dynamic.literal(replacements = replacements.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePath]
  }
  @scala.inline
  implicit class FilePathOps[Self <: FilePath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplacements(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(js.undefined)
        ret
    }
  }
  
}

