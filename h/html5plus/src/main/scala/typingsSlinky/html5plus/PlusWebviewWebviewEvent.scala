package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Webview窗口事件
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
@js.native
trait PlusWebviewWebviewEvent extends js.Object {
  /**
    * Webview窗口关闭事件
    * 通过WebviewObject对象的addEventListener方法添加事件监听函数，当Webview窗口关闭时触发此事件，回调函数类型为EventCallback。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var close: js.UndefOr[String] = js.native
  /**
    * Webview窗口回弹事件
    * 通过WebviewObject对象的setBounce方法开启回弹效果设置顶部下拉回弹changeoffset属性后，当用户向下拖拽窗口时触发发此事件，回调函数类型为BounceEventCallback。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var dragBounce: js.UndefOr[String] = js.native
  /**
    * Webview窗口加载错误事件
    * 通过WebviewObject对象的addEventListener方法添加事件监听函数，当Webview窗口加载错误时触发此事件，回调函数类型为EventCallback。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var error: js.UndefOr[String] = js.native
  /**
    * Webview窗口隐藏事件
    * 通过WebviewObject对象的addEventListener方法添加事件监听函数，当Webview窗口隐藏（窗口动画完成后）时触发此事件，回调函数类型为EventCallback。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var hide: js.UndefOr[String] = js.native
  /**
    * Webview窗口页面加载完成事件
    * 通过WebviewObject对象的addEventListener方法添加事件监听函数，当Webview窗口页面加载完成时触发此事件，回调函数类型为EventCallback。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var loaded: js.UndefOr[String] = js.native
  /**
    * Webview窗口页面开始加载事件
    * 通过WebviewObject对象的addEventListener方法添加事件监听函数，当Webview窗口开始加载新页面时触发此事件，回调函数类型为EventCallback。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var loading: js.UndefOr[String] = js.native
  /**
    * Webview窗口显示遮罩层时点击事件
    * 通过WebviewObject对象的addEventListener方法添加事件监听函数，当Webview窗口通过mask属性设置显示遮罩层并且点击时触发此事件，回调函数类型为EventCallback。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var maskClick: js.UndefOr[String] = js.native
  /**
    * Webview窗口侧滑返回事件
    * 通过WebviewObject对象的addEventListener方法添加事件监听函数，当Webview窗口侧滑返回时触发此事件，回调函数类型为PopGestureCallback。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var popGesture: js.UndefOr[String] = js.native
  /**
    * Webview窗口加载进度变化事件
    * 通过WebviewObject对象的addEventListener方法添加事件监听函数，当Webview窗口加载页面进度变化时触发此事件。
    * 	回调函数原型为void PorgressCandedCallback(Event e),可通过e.progress获取窗口加载进度，取值范围为0-100。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var progressChanged: js.UndefOr[String] = js.native
  /**
    * Webview窗口下拉刷新事件
    * Webview窗口打开下拉刷新功能后，用户操作下拉刷新时或调用beginPullToRefresh方法时触发，用于通知业务逻辑可以开始执行刷新操作。
    * 	更新操作完成后调用窗口的endPullToRefresh方法结束下拉刷新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var pullToRefresh: js.UndefOr[String] = js.native
  /**
    * Webview窗口渲染完成事件
    * 通过WebviewObject对象的addEventListener方法添加事件监听函数，当Webview窗口渲染完成时触发此事件，回调函数类型为EventCallback。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var rendered: js.UndefOr[String] = js.native
  /**
    * Webview窗口开始渲染事件
    * 通过WebviewObject对象的addEventListener方法添加事件监听函数，当Webview窗口开始渲染内容时触发此事件，回调函数类型为EventCallback。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var rendering: js.UndefOr[String] = js.native
  /**
    * Webview窗口显示事件
    * 通过WebviewObject对象的addEventListener方法添加事件监听函数，当Webview窗口显示（窗口动画完成后）时触发此事件，回调函数类型为EventCallback。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var show: js.UndefOr[String] = js.native
  /**
    * Webview窗口回弹事件
    * 通过WebviewObject对象的setBounce方法开启回弹效果设置左右侧侧滑slideoffset属性后，当用户向左右侧拖拽窗口侧滑时触发发此事件，回调函数类型为BounceEventCallback。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var slideBounce: js.UndefOr[String] = js.native
  /**
    * Webview加载页面标题更新事件
    * 通过WebviewObject对象的addEventListener方法添加事件监听函数，当Webview窗口加载新页面更新标题时触发此事件，回调函数类型为SuccessCallback。
    * 	注意：此事件会先于loaded事件触发，通常在加载网络页面时通过此事件可更快获取到页面的标题。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var titleUpdate: js.UndefOr[String] = js.native
  /**
    * Webview窗口接收到触屏事件
    * 通过WebviewObject对象的addEventListener方法添加事件监听函数，当用户操作按下到Webview窗口时触发此事件，回调函数类型为SuccessCallback。
    * 	注意：每按下屏幕触发一次此事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var touchstart: js.UndefOr[String] = js.native
}

object PlusWebviewWebviewEvent {
  @scala.inline
  def apply(): PlusWebviewWebviewEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewWebviewEvent]
  }
  @scala.inline
  implicit class PlusWebviewWebviewEventOps[Self <: PlusWebviewWebviewEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
    @scala.inline
    def withDragBounce(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragBounce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragBounce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragBounce")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withHide(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.undefined)
        ret
    }
    @scala.inline
    def withLoaded(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaded")(js.undefined)
        ret
    }
    @scala.inline
    def withLoading(value: String): Self = {
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
    def withMaskClick(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskClick")(js.undefined)
        ret
    }
    @scala.inline
    def withPopGesture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popGesture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopGesture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popGesture")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressChanged(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withPullToRefresh(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullToRefresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullToRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullToRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withRendered(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendered")(js.undefined)
        ret
    }
    @scala.inline
    def withRendering(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendering")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideBounce(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideBounce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideBounce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideBounce")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleUpdate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchstart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchstart")(js.undefined)
        ret
    }
  }
  
}

