package typingsSlinky.builderUtilRuntime.blockMapApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileChunks extends js.Object {
  var checksums: js.Array[String] = js.native
  var sizes: js.Array[Double] = js.native
}

object FileChunks {
  @scala.inline
  def apply(checksums: js.Array[String], sizes: js.Array[Double]): FileChunks = {
    val __obj = js.Dynamic.literal(checksums = checksums.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileChunks]
  }
  @scala.inline
  implicit class FileChunksOps[Self <: FileChunks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChecksums(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checksums")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

