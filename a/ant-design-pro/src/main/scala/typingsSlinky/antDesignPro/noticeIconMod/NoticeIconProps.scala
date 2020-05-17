package typingsSlinky.antDesignPro.noticeIconMod

import org.scalajs.dom.raw.MouseEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.antDesignPro.anon.Dictkey
import typingsSlinky.antDesignPro.noticeIconTabMod.NoticeIconData
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoticeIconProps extends js.Object {
  var bell: js.UndefOr[TagMod[Any]] = js.native
  var className: js.UndefOr[String] = js.native
  var clearClose: js.UndefOr[Boolean] = js.native
  var count: js.UndefOr[Double] = js.native
  var loading: js.UndefOr[Boolean] = js.native
  var locale: js.UndefOr[Dictkey] = js.native
  var onClear: js.UndefOr[js.Function1[/* tabName */ String, Unit]] = js.native
  var onItemClick: js.UndefOr[js.Function2[/* item */ NoticeIconData, /* tabProps */ NoticeIconProps, Unit]] = js.native
  var onPopupVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
  var onTabChange: js.UndefOr[js.Function1[/* tabTile */ String, Unit]] = js.native
  var onViewMore: js.UndefOr[js.Function2[/* tabProps */ NoticeIconProps, /* e */ MouseEvent, Unit]] = js.native
  var popupVisible: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object NoticeIconProps {
  @scala.inline
  def apply(): NoticeIconProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoticeIconProps]
  }
  @scala.inline
  implicit class NoticeIconPropsOps[Self <: NoticeIconProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBellReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBell(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bell")(js.undefined)
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
    def withClearClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearClose")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withLoading(value: Boolean): Self = {
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
    def withLocale(value: Dictkey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClear(value: /* tabName */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClear")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemClick(value: (/* item */ NoticeIconData, /* tabProps */ NoticeIconProps) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnItemClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPopupVisibleChange(value: /* visible */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPopupVisibleChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPopupVisibleChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPopupVisibleChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTabChange(value: /* tabTile */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTabChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTabChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTabChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnViewMore(value: (/* tabProps */ NoticeIconProps, /* e */ MouseEvent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewMore")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnViewMore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewMore")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupVisible")(js.undefined)
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

