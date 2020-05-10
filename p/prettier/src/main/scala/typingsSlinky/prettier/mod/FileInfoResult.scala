package typingsSlinky.prettier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileInfoResult extends js.Object {
  var ignored: Boolean = js.native
  var inferredParser: String | Null = js.native
}

object FileInfoResult {
  @scala.inline
  def apply(ignored: Boolean): FileInfoResult = {
    val __obj = js.Dynamic.literal(ignored = ignored.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileInfoResult]
  }
  @scala.inline
  implicit class FileInfoResultOps[Self <: FileInfoResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnored(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInferredParser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inferredParser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInferredParserNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inferredParser")(null)
        ret
    }
  }
  
}

