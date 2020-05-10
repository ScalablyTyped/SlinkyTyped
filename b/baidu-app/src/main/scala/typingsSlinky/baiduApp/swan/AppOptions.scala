package typingsSlinky.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
/**
	 * App 实现的接口对象
	 * 开发者可以添加任意的函数或数据到 Object 参数中，用 this 可以访问
	 */
@js.native
trait AppOptions extends js.Object {
  /**
  		 * 全局Data
  		 */
  var globalData: js.UndefOr[js.Object] = js.native
  /**
  		 * 错误监听函数
  		 * 当小程序发生脚本错误或者 api 调用失败时
  		 * 会触发 onError 并带上错误信息
  		 */
  var onError: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.native
  /**
  		 * 监听小程序隐藏。
  		 * 当小程序从前台进入后台，会触发 onHide
  		 * 生命周期函数
  		 */
  var onHide: js.UndefOr[js.Function0[Unit]] = js.native
  /**
  		 * 监听小程序初始化。
  		 * 当小程序初始化完成时，会触发 onLaunch（全局只触发一次）
  		 * 生命周期函数
  		 */
  var onLaunch: js.UndefOr[js.Function1[/* option */ LaunchOptions, Unit]] = js.native
  /**
  		 * 监听小程序显示。
  		 * 当小程序启动，或从后台进入前台显示，会触发 onShow
  		 * 生命周期函数
  		 */
  var onShow: js.UndefOr[js.Function1[/* option */ LaunchOptions, Unit]] = js.native
  /**
  		 * 小程序退出时触发
  		 */
  var onUnlaunch: js.UndefOr[js.Function0[Unit]] = js.native
}

object AppOptions {
  @scala.inline
  def apply(): AppOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppOptions]
  }
  @scala.inline
  implicit class AppOptionsOps[Self <: AppOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobalData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalData")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: /* msg */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLaunch(value: /* option */ LaunchOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLaunch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLaunch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLaunch")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(value: /* option */ LaunchOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnlaunch(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnlaunch")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnUnlaunch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnlaunch")(js.undefined)
        ret
    }
  }
  
}

