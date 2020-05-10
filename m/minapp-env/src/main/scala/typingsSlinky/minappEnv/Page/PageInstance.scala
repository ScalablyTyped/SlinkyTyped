package typingsSlinky.minappEnv.Page

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.minappEnv.IAnyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageInstance[D /* <: IAnyObject */, T /* <: IAnyObject */] extends PageInstanceBaseProps[D] {
  /** 生命周期回调—监听页面隐藏
    *
    * 页面隐藏/切入后台时触发。 如 `navigateTo` 或底部 `tab` 切换到其他页面，小程序切入后台等。
    */
  var onHide: js.UndefOr[js.Function0[Unit]] = js.native
  /** 生命周期回调—监听页面加载
    *
    * 页面加载时触发。一个页面只会调用一次，可以在 onLoad 的参数中获取打开当前页面路径中的参数。
    */
  var onLoad: js.UndefOr[js.Function1[/* query */ js.UndefOr[StringDictionary[String]], Unit]] = js.native
  /** 页面滚动触发事件的处理函数
    *
    * 监听用户滑动页面事件。
    */
  var onPageScroll: js.UndefOr[js.Function1[/* options */ js.UndefOr[IPageScrollOption], Unit]] = js.native
  /** 监听用户下拉动作
    *
    * 监听用户下拉刷新事件。
    * - 需要在`app.json`的`window`选项中或页面配置中开启`enablePullDownRefresh`。
    * - 可以通过`wx.startPullDownRefresh`触发下拉刷新，调用后触发下拉刷新动画，效果与用户手动下拉刷新一致。
    * - 当处理完数据刷新后，`wx.stopPullDownRefresh`可以停止当前页面的下拉刷新。
    */
  var onPullDownRefresh: js.UndefOr[js.Function0[Unit]] = js.native
  /** 页面上拉触底事件的处理函数
    *
    * 监听用户上拉触底事件。
    * - 可以在`app.json`的`window`选项中或页面配置中设置触发距离`onReachBottomDistance`。
    * - 在触发距离内滑动期间，本事件只会被触发一次。
    */
  var onReachBottom: js.UndefOr[js.Function0[Unit]] = js.native
  /** 生命周期回调—监听页面初次渲染完成
    * 
    * 页面初次渲染完成时触发。一个页面只会调用一次，代表页面已经准备妥当，可以和视图层进行交互。
    * 
    
    * 注意：对界面内容进行设置的 API 如`wx.setNavigationBarTitle`，请在`onReady`之后进行。
    */
  var onReady: js.UndefOr[js.Function0[Unit]] = js.native
  /** 用户点击右上角转发
    *
    * 监听用户点击页面内转发按钮（`<button>` 组件 `open-type="share"`）或右上角菜单“转发”按钮的行为，并自定义转发内容。
    *
    * **注意：只有定义了此事件处理函数，右上角菜单才会显示“转发”按钮**
    *
    * 此事件需要 return 一个 Object，用于自定义转发内容
    */
  var onShareAppMessage: js.UndefOr[
    js.Function1[/* options */ js.UndefOr[IShareAppMessageOption], ICustomShareContent]
  ] = js.native
  /** 生命周期回调—监听页面显示
    *
    * 页面显示/切入前台时触发。
    */
  var onShow: js.UndefOr[js.Function0[Unit]] = js.native
  /** 当前是 tab 页时，点击 tab 时触发，最低基础库： `1.9.0` */
  var onTabItemTap: js.UndefOr[js.Function1[/* options */ js.UndefOr[ITabItemTapOption], Unit]] = js.native
  /** 生命周期回调—监听页面卸载
    *
    * 页面卸载时触发。如`redirectTo`或`navigateBack`到其他页面时。
    */
  var onUnload: js.UndefOr[js.Function0[Unit]] = js.native
}

object PageInstance {
  @scala.inline
  def apply[D, T](): PageInstance[D, T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageInstance[D, T]]
  }
  @scala.inline
  implicit class PageInstanceOps[Self[d, t] <: PageInstance[d, t], D, T] (val x: Self[D, T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D, T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D, T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[D, T]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[D, T]) with Other]
    @scala.inline
    def withOnHide(value: () => Unit): Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnHide: Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoad(value: /* query */ js.UndefOr[StringDictionary[String]] => Unit): Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoad: Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPageScroll(value: /* options */ js.UndefOr[IPageScrollOption] => Unit): Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPageScroll: Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPullDownRefresh(value: () => Unit): Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPullDownRefresh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPullDownRefresh: Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPullDownRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReachBottom(value: () => Unit): Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReachBottom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnReachBottom: Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReachBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReady(value: () => Unit): Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReady")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnReady: Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReady")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShareAppMessage(value: /* options */ js.UndefOr[IShareAppMessageOption] => ICustomShareContent): Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShareAppMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnShareAppMessage: Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShareAppMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(value: () => Unit): Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnShow: Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTabItemTap(value: /* options */ js.UndefOr[ITabItemTapOption] => Unit): Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTabItemTap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTabItemTap: Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTabItemTap")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnload(value: () => Unit): Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnload")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnUnload: Self[D, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnload")(js.undefined)
        ret
    }
  }
  
}

