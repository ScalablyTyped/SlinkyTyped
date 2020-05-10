package typingsSlinky.minappEnv.App

import typingsSlinky.minappEnv.IAnyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppInstance[T /* <: IAnyObject */] extends js.Object {
  /** 错误监听函数
    *
    * 小程序发生脚本错误，或者 api
    */
  var onError: js.UndefOr[js.Function1[/* error */ js.UndefOr[String], Unit]] = js.native
  /** 生命周期回调—监听小程序隐藏
    *
    * 小程序从前台进入后台时
    */
  var onHide: js.UndefOr[js.Function0[Unit]] = js.native
  /** 生命周期回调—监听小程序初始化
    *
    * 小程序初始化完成时触发，全局只触发一次。
    */
  var onLaunch: js.UndefOr[js.Function1[/* options */ js.UndefOr[ILaunchShowOption], Unit]] = js.native
  /** 页面不存在监听函数
    *
    * 小程序要打开的页面不存在时触发，会带上页面信息回调该函数
    *
    * **注意：**
    * 1. 如果开发者没有添加 `onPageNotFound` 监听，当跳转页面不存在时，将推入微信客户端原生的页面不存在提示页面。
    * 2. 如果 `onPageNotFound` 回调中又重定向到另一个不存在的页面，将推入微信客户端原生的页面不存在提示页面，并且不再回调 `onPageNotFound`。
    *
    * 最低基础库： 1.9.90
    */
  var onPageNotFound: js.UndefOr[js.Function1[/* options */ js.UndefOr[IPageNotFoundOption], Unit]] = js.native
  /** 生命周期回调—监听小程序显示
    *
    * 小程序启动，或从后台进入前台显示时
    */
  var onShow: js.UndefOr[js.Function1[/* options */ js.UndefOr[ILaunchShowOption], Unit]] = js.native
}

object AppInstance {
  @scala.inline
  def apply[T](): AppInstance[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppInstance[T]]
  }
  @scala.inline
  implicit class AppInstanceOps[Self[t] <: AppInstance[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withOnError(value: /* error */ js.UndefOr[String] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHide(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnHide: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLaunch(value: /* options */ js.UndefOr[ILaunchShowOption] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLaunch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLaunch: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLaunch")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPageNotFound(value: /* options */ js.UndefOr[IPageNotFoundOption] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageNotFound")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPageNotFound: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageNotFound")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(value: /* options */ js.UndefOr[ILaunchShowOption] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnShow: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
  }
  
}

