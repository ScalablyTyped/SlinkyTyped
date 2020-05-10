package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 一组用于定义页面或控件关闭的动画效果
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
@js.native
trait PlusWebviewAnimationTypeClose extends js.Object {
  /**
    * 自动选择动画效果
    * 自动选择显示窗口相对于的动画效果。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var auto: js.UndefOr[String] = js.native
  /**
    * 从不透明到透明逐渐隐藏动画
    * 页面从不透明到透明逐渐隐藏关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `fade-out`: js.UndefOr[String] = js.native
  /**
    * 无动画
    * 立即关闭页面，无任何动画效果。
    * 	此效果忽略动画时间参数，立即关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var none: js.UndefOr[String] = js.native
  /**
    * 从右侧平移出栈动画效果
    * 页面从屏幕右侧滑出消失，同时上一个页面带阴影效果从屏幕左侧滑入显示。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `pop-out`: js.UndefOr[String] = js.native
  /**
    * 竖向向下侧滑出屏幕动画
    * 页面从屏幕中竖向向下侧滑动到屏幕外关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `slide-out-bottom`: js.UndefOr[String] = js.native
  /**
    * 横向向左侧滑出屏幕动画
    * 页面从屏幕中横向向左侧滑动到屏幕外关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `slide-out-left`: js.UndefOr[String] = js.native
  /**
    * 横向向右侧滑出屏幕动画
    * 页面从屏幕中横向向右侧滑动到屏幕外关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `slide-out-right`: js.UndefOr[String] = js.native
  /**
    * 竖向向上侧滑出屏幕动画
    * 页面从屏幕中竖向向上侧滑动到屏幕外关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `slide-out-top`: js.UndefOr[String] = js.native
  /**
    * 从大逐渐缩小并且从不透明到透明逐渐隐藏关闭动画
    * 页面逐渐向页面中心缩小并且从不透明到透明逐渐隐藏关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `zoom-fade-in`: js.UndefOr[String] = js.native
  /**
    * 从大逐渐缩小关闭动画
    * 页面逐渐向页面中心缩小关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `zoom-in`: js.UndefOr[String] = js.native
}

object PlusWebviewAnimationTypeClose {
  @scala.inline
  def apply(): PlusWebviewAnimationTypeClose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewAnimationTypeClose]
  }
  @scala.inline
  implicit class PlusWebviewAnimationTypeCloseOps[Self <: PlusWebviewAnimationTypeClose] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuto(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto")(js.undefined)
        ret
    }
    @scala.inline
    def `withFade-out`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fade-out")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFade-out`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fade-out")(js.undefined)
        ret
    }
    @scala.inline
    def withNone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(js.undefined)
        ret
    }
    @scala.inline
    def `withPop-out`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pop-out")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPop-out`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pop-out")(js.undefined)
        ret
    }
    @scala.inline
    def `withSlide-out-bottom`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slide-out-bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSlide-out-bottom`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slide-out-bottom")(js.undefined)
        ret
    }
    @scala.inline
    def `withSlide-out-left`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slide-out-left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSlide-out-left`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slide-out-left")(js.undefined)
        ret
    }
    @scala.inline
    def `withSlide-out-right`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slide-out-right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSlide-out-right`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slide-out-right")(js.undefined)
        ret
    }
    @scala.inline
    def `withSlide-out-top`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slide-out-top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSlide-out-top`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slide-out-top")(js.undefined)
        ret
    }
    @scala.inline
    def `withZoom-fade-in`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom-fade-in")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutZoom-fade-in`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom-fade-in")(js.undefined)
        ret
    }
    @scala.inline
    def `withZoom-in`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom-in")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutZoom-in`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom-in")(js.undefined)
        ret
    }
  }
  
}

