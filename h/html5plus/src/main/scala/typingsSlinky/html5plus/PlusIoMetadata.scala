package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，保存文件或目录的状态信息对象
  * 可通过DirectoryEntry或FileEntry对象的getMetaData方法获取
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
  */
@js.native
trait PlusIoMetadata extends js.Object {
  /**
    * 包含的子目录数
    * 若自身是文件则其值为0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var directoryCount: js.UndefOr[Double] = js.native
  /**
    * 目录的文件数
    * 若自身是文件则其值为0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var fileCount: js.UndefOr[Double] = js.native
  /**
    * 文件或目录的最后修改时间
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var modificationTime: js.UndefOr[js.Date] = js.native
  /**
    * 文件的大小
    * 若获取的是目录对象的属性则值为0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var size: js.UndefOr[Double] = js.native
}

object PlusIoMetadata {
  @scala.inline
  def apply(): PlusIoMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusIoMetadata]
  }
  @scala.inline
  implicit class PlusIoMetadataOps[Self <: PlusIoMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectoryCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryCount")(js.undefined)
        ret
    }
    @scala.inline
    def withFileCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileCount")(js.undefined)
        ret
    }
    @scala.inline
    def withModificationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modificationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModificationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modificationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

