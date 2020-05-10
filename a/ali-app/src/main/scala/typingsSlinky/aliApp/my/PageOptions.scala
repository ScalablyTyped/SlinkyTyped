package typingsSlinky.aliApp.my

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 下拉刷新 https://docs.alipay.com/mini/api/ui-pulldown
/**
	 * Page 实现的接口对象
	 */
@js.native
trait PageOptions
  extends /* key */ StringDictionary[js.Any] {
  var data: js.Any = js.native
  /**
  		 * 下拉刷新
  		 * 在 Page 中定义 onPullDownRefresh 处理函数，监听该页面用户下拉刷新事件。
  		 * 需要在页面对应的 .json 配置文件中配置 "pullRefresh": true 选项，才能开启下拉刷新事件。
  		 * 当处理完数据刷新后，调用 my.stopPullDownRefresh 可以停止当前页面的下拉刷新。
  		 */
  var onPullDownRefresh: js.UndefOr[js.ThisFunction0[/* this */ Page, Unit]] = js.native
  def onError(): Unit = js.native
  def onHide(): Unit = js.native
  def onLaunch(options: Options): Unit = js.native
  def onShow(options: Options): Unit = js.native
}

object PageOptions {
  @scala.inline
  def apply(
    data: js.Any,
    onError: () => Unit,
    onHide: () => Unit,
    onLaunch: Options => Unit,
    onShow: Options => Unit
  ): PageOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], onError = js.Any.fromFunction0(onError), onHide = js.Any.fromFunction0(onHide), onLaunch = js.Any.fromFunction1(onLaunch), onShow = js.Any.fromFunction1(onShow))
    __obj.asInstanceOf[PageOptions]
  }
  @scala.inline
  implicit class PageOptionsOps[Self <: PageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnError(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnLaunch(value: Options => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLaunch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnShow(value: Options => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnPullDownRefresh(value: js.ThisFunction0[/* this */ Page, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPullDownRefresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPullDownRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPullDownRefresh")(js.undefined)
        ret
    }
  }
  
}

