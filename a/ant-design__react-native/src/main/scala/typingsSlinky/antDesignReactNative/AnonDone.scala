package typingsSlinky.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDone extends js.Object {
  /** 已加载完 */
  var done: String = js.native
  /** 加载中... */
  var loading: String = js.native
  /** 暂无数据 */
  var noData: String = js.native
  /** 下拉刷新 */
  var refreshableTitlePull: String = js.native
  /** 加载中... */
  var refreshableTitleRefreshing: String = js.native
  /** 释放加载 */
  var refreshableTitleRelease: String = js.native
}

object AnonDone {
  @scala.inline
  def apply(
    done: String,
    loading: String,
    noData: String,
    refreshableTitlePull: String,
    refreshableTitleRefreshing: String,
    refreshableTitleRelease: String
  ): AnonDone = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], noData = noData.asInstanceOf[js.Any], refreshableTitlePull = refreshableTitlePull.asInstanceOf[js.Any], refreshableTitleRefreshing = refreshableTitleRefreshing.asInstanceOf[js.Any], refreshableTitleRelease = refreshableTitleRelease.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDone]
  }
  @scala.inline
  implicit class AnonDoneOps[Self <: AnonDone] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoading(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefreshableTitlePull(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshableTitlePull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefreshableTitleRefreshing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshableTitleRefreshing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefreshableTitleRelease(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshableTitleRelease")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

