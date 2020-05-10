package typingsSlinky.androiduix.androidui.widget.PullRefreshLoadLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshLoadListener extends js.Object {
  def onLoadMore(prll: typingsSlinky.androiduix.androidui.widget.PullRefreshLoadLayout): Unit = js.native
  def onRefresh(prll: typingsSlinky.androiduix.androidui.widget.PullRefreshLoadLayout): Unit = js.native
}

object RefreshLoadListener {
  @scala.inline
  def apply(
    onLoadMore: typingsSlinky.androiduix.androidui.widget.PullRefreshLoadLayout => Unit,
    onRefresh: typingsSlinky.androiduix.androidui.widget.PullRefreshLoadLayout => Unit
  ): RefreshLoadListener = {
    val __obj = js.Dynamic.literal(onLoadMore = js.Any.fromFunction1(onLoadMore), onRefresh = js.Any.fromFunction1(onRefresh))
    __obj.asInstanceOf[RefreshLoadListener]
  }
  @scala.inline
  implicit class RefreshLoadListenerOps[Self <: RefreshLoadListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnLoadMore(value: typingsSlinky.androiduix.androidui.widget.PullRefreshLoadLayout => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadMore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnRefresh(value: typingsSlinky.androiduix.androidui.widget.PullRefreshLoadLayout => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRefresh")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

