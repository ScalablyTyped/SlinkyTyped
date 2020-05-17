package typingsSlinky.grpc.anon

import typingsSlinky.grpc.mod.Filename
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait File extends Filename {
  var file: String = js.native
  var root: String = js.native
}

object File {
  @scala.inline
  def apply(file: String, root: String): File = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  @scala.inline
  implicit class FileOps[Self <: File] (val x: Self) extends AnyVal {
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
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

