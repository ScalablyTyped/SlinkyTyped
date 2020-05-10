package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 文件系统对象，用于管理特定本地文件目录
  * 文件系统对象表示一个应用可访问的根目录。name属性用于标识此根目录的名称，与LocalFileSystem中的文件系统类型一一对应。root属性为文件目录对象，用于实际操作文件系统，参考DirectoryEntry。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
  */
@js.native
trait PlusIoFileSystem extends js.Object {
  /**
    * 文件系统的名称
    * 值为文件系统类型常量值字符串，如“PRIVATE_WWW”、“PRIVATE_DOCUMENTS”。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var name: js.UndefOr[String] = js.native
  /**
    * 文件系统的根目录
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var root: js.UndefOr[PlusIoDirectoryEntry] = js.native
}

object PlusIoFileSystem {
  @scala.inline
  def apply(): PlusIoFileSystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusIoFileSystem]
  }
  @scala.inline
  implicit class PlusIoFileSystemOps[Self <: PlusIoFileSystem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRoot(value: PlusIoDirectoryEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
  }
  
}

