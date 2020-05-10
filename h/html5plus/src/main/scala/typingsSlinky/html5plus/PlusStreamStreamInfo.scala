package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，流应用信息
  * 流应用标识、图标、是否下载完成等信息。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
  */
@js.native
trait PlusStreamStreamInfo extends js.Object {
  /**
    * 流应用是否下载完成
    * true表示流应用下载完成，false表示流应用未下载完成。
    * 	注意，流应用未下载完成以让可以正常启动运行，启动后会自动下载。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var complete: js.UndefOr[Boolean] = js.native
  /**
    * 流应用的图标
    * 流应用下载的图标路径（本地路径），如果未下载完成则返回空。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var icon: js.UndefOr[String] = js.native
  /**
    * 流应用标识
    * 流应用唯一字符串标识。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var id: js.UndefOr[String] = js.native
}

object PlusStreamStreamInfo {
  @scala.inline
  def apply(): PlusStreamStreamInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusStreamStreamInfo]
  }
  @scala.inline
  implicit class PlusStreamStreamInfoOps[Self <: PlusStreamStreamInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
  }
  
}

