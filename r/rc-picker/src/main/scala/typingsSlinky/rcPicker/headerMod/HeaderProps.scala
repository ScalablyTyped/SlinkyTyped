package typingsSlinky.rcPicker.headerMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderProps extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.native
  var nextIcon: js.UndefOr[TagMod[Any]] = js.native
  /** Next one step */
  var onNext: js.UndefOr[js.Function0[Unit]] = js.native
  /** Last one step */
  var onPrev: js.UndefOr[js.Function0[Unit]] = js.native
  /** Next multiple steps */
  var onSuperNext: js.UndefOr[js.Function0[Unit]] = js.native
  /** Last multiple steps */
  var onSuperPrev: js.UndefOr[js.Function0[Unit]] = js.native
  var prefixCls: String = js.native
  var prevIcon: js.UndefOr[TagMod[Any]] = js.native
  var superNextIcon: js.UndefOr[TagMod[Any]] = js.native
  var superPrevIcon: js.UndefOr[TagMod[Any]] = js.native
}

object HeaderProps {
  @scala.inline
  def apply(prefixCls: String): HeaderProps = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderProps]
  }
  @scala.inline
  implicit class HeaderPropsOps[Self <: HeaderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withNextIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextIcon(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNext(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNext")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPrev(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrev")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPrev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrev")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSuperNext(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuperNext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSuperNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuperNext")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSuperPrev(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuperPrev")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSuperPrev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuperPrev")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevIcon(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withSuperNextIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superNextIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuperNextIcon(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superNextIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuperNextIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superNextIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withSuperPrevIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superPrevIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuperPrevIcon(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superPrevIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuperPrevIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superPrevIcon")(js.undefined)
        ret
    }
  }
  
}

