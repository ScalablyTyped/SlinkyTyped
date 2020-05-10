package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，打开文件参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
  */
@js.native
trait PlusRuntimeOpenFileOptions extends js.Object {
  /**
    * 优先使用的程序包名
    * 如果指定包名的程序已经安装，则调用其打开文件，若程序不支持打开文件则触发错误回调。
    * 	如果指定包名的程序未安装，则弹出系统支持打开此文件的列表，由用户选择程序打开。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var pname: js.UndefOr[String] = js.native
  /**
    * 弹出系统选择程序界面指示区域
    * JSON对象，格式如{top:10;left:10;width:200;height:200;}，所有值为像素值，左上坐标相对于容器webview的位置。仅在iPad设备平台有效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var popover: js.UndefOr[js.Any] = js.native
}

object PlusRuntimeOpenFileOptions {
  @scala.inline
  def apply(): PlusRuntimeOpenFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusRuntimeOpenFileOptions]
  }
  @scala.inline
  implicit class PlusRuntimeOpenFileOptionsOps[Self <: PlusRuntimeOpenFileOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pname")(js.undefined)
        ret
    }
    @scala.inline
    def withPopover(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popover")(js.undefined)
        ret
    }
  }
  
}

