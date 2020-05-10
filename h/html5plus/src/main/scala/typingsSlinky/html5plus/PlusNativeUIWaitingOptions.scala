package typingsSlinky.html5plus

import typingsSlinky.html5plus.html5plusStrings.black
import typingsSlinky.html5plus.html5plusStrings.close
import typingsSlinky.html5plus.html5plusStrings.none
import typingsSlinky.html5plus.html5plusStrings.transmit
import typingsSlinky.html5plus.html5plusStrings.white
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，原生等待对话框的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
  */
@js.native
trait PlusNativeUIWaitingOptions extends js.Object {
  /**
    * 返回键处理方式
    * 可取值"none"表示截获处理返回键，但不做任何响应；"close"表示截获处理返回键并关闭等待框；"transmit"表示不截获返回键，向后传递给Webview窗口继续处理（与未显示等待框的情况一致）。
    * - none: 截获返回键，不做任何响应
    * - close: 截获返回键并关闭等待框
    * - transmit: 不截获返回键，继续传递给Webview窗口
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var back: js.UndefOr[none | close | transmit] = js.native
  /**
    * 等待对话框显示区域的背景色
    * 背景色的值支持(参考CSS颜色规范)：颜色名称(参考CSS Color Names)/十六进制值/rgb值/rgba值，默认值为rgba(0,0,0,0.8)。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var background: js.UndefOr[String] = js.native
  /**
    * 等待框中文字的颜色
    * 颜色值支持(参考CSS颜色规范)：颜色名称(参考CSS Color Names)/十六进制值/rgb值/rgba值，默认值为白色。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var color: js.UndefOr[String] = js.native
  /**
    * 等待框背景区域的高度
    * 值支持像素绝对值（"500px"）或百分比（"50%"），如果不设置则根据内容自动计算合适的高度。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var height: js.UndefOr[String] = js.native
  /**
    * 自定义等待框上loading图标样式
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var loading: js.UndefOr[PlusNativeUIWaitingLoadingOptions] = js.native
  /**
    * 等待框是否模态显示
    * 模态显示时用户不可操作直到等待对话框关闭，否则用户在等待对话框显示时也可操作下面的内容，未设置时默认为true。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var modal: js.UndefOr[Boolean] = js.native
  /**
    * 等待对话框的内边距
    * 值支持像素值（"10px"）和百分比（"5%"），百分比相对于屏幕的宽计算，默认值为"3%"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var padding: js.UndefOr[String] = js.native
  /**
    * 点击等待显示区域是否自动关闭
    * true表示点击等待对话框显示区域时自动关闭，false则不关闭，未设置时默认值为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var padlock: js.UndefOr[Boolean] = js.native
  /**
    * 等待框显示区域的圆角
    * 值支持像素值（"10px"），未设置时使用默认值"10px"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var round: js.UndefOr[Double] = js.native
  /**
    * 等待框中文字的字体大小
    * 如"14px"表示使用14像素高的文字，未设置则使用系统默认字体大小。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var size: js.UndefOr[String] = js.native
  /**
    * 等待对话框样式
    * 可取值"black"、"white"，black表示等待框为黑色雪花样式，通常在背景主色为浅色时使用；white表示等待框为白色雪花样式，通常在背景主色为深色时使用。
    * 	仅在iOS平台有效，其它平台忽略此值，未设置时默认值为white。
    * - black: 黑色雪花样式，适合浅色界面使用
    * - white: 白色雪花样式，适合深色界面使用
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var style: js.UndefOr[black | white] = js.native
  /**
    * 等待对话框中标题文字的水平对齐方式
    * 对齐方式可选值包括："left"：水平居左对齐显示，"center"：水平居中对齐显示，"right"：水平居右对齐显示。默认值为水平居中对齐显示，即"center"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var textalign: js.UndefOr[String] = js.native
  /**
    * 等待框背景区域的宽度
    * 值支持像素值（"500px"）或百分比（"50%"），百分比相对于屏幕的宽计算，如果不设置则根据内容自动计算合适的宽度。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var width: js.UndefOr[String] = js.native
}

object PlusNativeUIWaitingOptions {
  @scala.inline
  def apply(): PlusNativeUIWaitingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNativeUIWaitingOptions]
  }
  @scala.inline
  implicit class PlusNativeUIWaitingOptionsOps[Self <: PlusNativeUIWaitingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBack(value: none | close | transmit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("back")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("back")(js.undefined)
        ret
    }
    @scala.inline
    def withBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withLoading(value: PlusNativeUIWaitingLoadingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.undefined)
        ret
    }
    @scala.inline
    def withModal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withPadlock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padlock")(js.undefined)
        ret
    }
    @scala.inline
    def withRound(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
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
    @scala.inline
    def withStyle(value: black | white): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTextalign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textalign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextalign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textalign")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

