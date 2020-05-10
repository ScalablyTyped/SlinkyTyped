package typingsSlinky.procfsStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileDescriptor extends js.Object {
  var fd: js.UndefOr[String] = js.native
  var info: FileDescriptorInfo = js.native
  var path: String = js.native
  var stat: FileDescriptorStat | Boolean = js.native
}

object FileDescriptor {
  @scala.inline
  def apply(info: FileDescriptorInfo, path: String, stat: FileDescriptorStat | Boolean): FileDescriptor = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileDescriptor]
  }
  @scala.inline
  implicit class FileDescriptorOps[Self <: FileDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfo(value: FileDescriptorInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStat(value: FileDescriptorStat | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fd")(js.undefined)
        ret
    }
  }
  
}

