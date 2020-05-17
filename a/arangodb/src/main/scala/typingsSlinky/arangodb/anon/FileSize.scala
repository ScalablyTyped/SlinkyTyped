package typingsSlinky.arangodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSize extends js.Object {
  var count: Double = js.native
  var fileSize: Double = js.native
}

object FileSize {
  @scala.inline
  def apply(count: Double, fileSize: Double): FileSize = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSize]
  }
  @scala.inline
  implicit class FileSizeOps[Self <: FileSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

