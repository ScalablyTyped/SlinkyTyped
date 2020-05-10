package typingsSlinky.rmcPullToRefresh.propsTypeMod

import slinky.core.TagMod
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.rmcPullToRefresh.rmcPullToRefreshStrings.down
import typingsSlinky.rmcPullToRefresh.rmcPullToRefreshStrings.up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropsType extends js.Object {
  var className: js.UndefOr[String] = js.native
  var damping: Double = js.native
  var direction: down | up = js.native
  var distanceToRefresh: Double = js.native
  var indicator: Indicator = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var refreshing: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  def getScrollContainer(): TagMod[Any] = js.native
  def onRefresh(): Unit = js.native
}

object PropsType {
  @scala.inline
  def apply(
    damping: Double,
    direction: down | up,
    distanceToRefresh: Double,
    getScrollContainer: () => TagMod[Any],
    indicator: Indicator,
    onRefresh: () => Unit
  ): PropsType = {
    val __obj = js.Dynamic.literal(damping = damping.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], distanceToRefresh = distanceToRefresh.asInstanceOf[js.Any], getScrollContainer = js.Any.fromFunction0(getScrollContainer), indicator = indicator.asInstanceOf[js.Any], onRefresh = js.Any.fromFunction0(onRefresh))
    __obj.asInstanceOf[PropsType]
  }
  @scala.inline
  implicit class PropsTypeOps[Self <: PropsType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDamping(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("damping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirection(value: down | up): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistanceToRefresh(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceToRefresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetScrollContainer(value: () => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScrollContainer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIndicator(value: Indicator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnRefresh(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRefresh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshing")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
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
  }
  
}

