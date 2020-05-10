package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Webview窗口下拉刷新样式
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
@js.native
trait PlusWebviewWebviewPullToRefreshStyles extends js.Object {
  /**
    * 下拉刷新控件颜色
    * 颜色值格式为"#RRGGBB"，如"#FF0000"为设置下拉属性控件为红色，默认值为"#2BD009"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var color: js.UndefOr[String] = js.native
  /**
    * 在下拉可刷新状态时显示的内容
    * 支持以下属性：
    * 	caption：在下拉可刷新状态时下拉刷新控件上显示的标题内容。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var contentdown: js.UndefOr[js.Any] = js.native
  /**
    * 在释放可刷新状态时显示的内容
    * 支持以下属性：
    * 	caption：在释放可刷新状态时下拉刷新控件上显示的标题内容。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var contentover: js.UndefOr[js.Any] = js.native
  /**
    * 在正在刷新状态时显示的内容
    * 支持以下属性：
    * 	caption：在正在刷新状态时下拉刷新控件上显示的标题内容。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var contentrefresh: js.UndefOr[js.Any] = js.native
  /**
    * 窗口的下拉刷新控件进入刷新状态的拉拽高度
    * 支持百分比，如"10%"；像素值，如"50px"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var height: js.UndefOr[String] = js.native
  /**
    * 下拉刷新控件的起始位置
    * 仅对"circle"样式下拉刷新控件有效，用于定义刷新控件下拉时的起始位置。
    * 	相对于Webview的顶部偏移量，支持百分比，如"10%"；像素值，如"50px"。
    * 	默认值为"0px"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var offset: js.UndefOr[String] = js.native
  /**
    * 窗口可下拉拖拽的范围
    * 支持百分比，如"10%"；像素值，如"50px"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var range: js.UndefOr[String] = js.native
  /**
    * 下拉刷新样式
    * 用于定义下拉刷新风格样式，可取值：
    * 	"default" - 经典下拉刷新样式（下拉拖动时页面内容跟随）；
    * 	"circle" - 圆圈样式下拉刷新控件样式（下拉拖动时仅刷新控件跟随）。
    * 	默认值为"default"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var style: js.UndefOr[String] = js.native
  /**
    * 是否开启Webview窗口的下拉刷新功能
    * true表示开启窗口的下拉刷新功能；
    * 	false表示关闭窗口的下拉刷新功能。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var support: js.UndefOr[Boolean] = js.native
}

object PlusWebviewWebviewPullToRefreshStyles {
  @scala.inline
  def apply(): PlusWebviewWebviewPullToRefreshStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewWebviewPullToRefreshStyles]
  }
  @scala.inline
  implicit class PlusWebviewWebviewPullToRefreshStylesOps[Self <: PlusWebviewWebviewPullToRefreshStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withContentdown(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentdown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentdown")(js.undefined)
        ret
    }
    @scala.inline
    def withContentover(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentover")(js.undefined)
        ret
    }
    @scala.inline
    def withContentrefresh(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentrefresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentrefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentrefresh")(js.undefined)
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
    def withOffset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: String): Self = {
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
    def withSupport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("support")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("support")(js.undefined)
        ret
    }
  }
  
}

