package typingsSlinky.jestSnapshot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilesRemoved extends js.Object {
  var filesRemoved: Double = js.native
  var filesRemovedList: js.Array[String] = js.native
}

object FilesRemoved {
  @scala.inline
  def apply(filesRemoved: Double, filesRemovedList: js.Array[String]): FilesRemoved = {
    val __obj = js.Dynamic.literal(filesRemoved = filesRemoved.asInstanceOf[js.Any], filesRemovedList = filesRemovedList.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilesRemoved]
  }
  @scala.inline
  implicit class FilesRemovedOps[Self <: FilesRemoved] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilesRemoved(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filesRemoved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilesRemovedList(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filesRemovedList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

