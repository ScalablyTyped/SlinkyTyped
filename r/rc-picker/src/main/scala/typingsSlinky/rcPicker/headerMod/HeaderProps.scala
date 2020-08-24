package typingsSlinky.rcPicker.headerMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderProps extends js.Object {
  var children: js.UndefOr[ReactElement] = js.native
  var nextIcon: js.UndefOr[ReactElement] = js.native
  /** Next one step */
  var onNext: js.UndefOr[js.Function0[Unit]] = js.native
  /** Last one step */
  var onPrev: js.UndefOr[js.Function0[Unit]] = js.native
  /** Next multiple steps */
  var onSuperNext: js.UndefOr[js.Function0[Unit]] = js.native
  /** Last multiple steps */
  var onSuperPrev: js.UndefOr[js.Function0[Unit]] = js.native
  var prefixCls: String = js.native
  var prevIcon: js.UndefOr[ReactElement] = js.native
  var superNextIcon: js.UndefOr[ReactElement] = js.native
  var superPrevIcon: js.UndefOr[ReactElement] = js.native
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setNextIconReactElement(value: ReactElement): Self = this.set("nextIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextIcon(value: ReactElement): Self = this.set("nextIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextIcon: Self = this.set("nextIcon", js.undefined)
    @scala.inline
    def setOnNext(value: () => Unit): Self = this.set("onNext", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnNext: Self = this.set("onNext", js.undefined)
    @scala.inline
    def setOnPrev(value: () => Unit): Self = this.set("onPrev", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnPrev: Self = this.set("onPrev", js.undefined)
    @scala.inline
    def setOnSuperNext(value: () => Unit): Self = this.set("onSuperNext", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnSuperNext: Self = this.set("onSuperNext", js.undefined)
    @scala.inline
    def setOnSuperPrev(value: () => Unit): Self = this.set("onSuperPrev", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnSuperPrev: Self = this.set("onSuperPrev", js.undefined)
    @scala.inline
    def setPrevIconReactElement(value: ReactElement): Self = this.set("prevIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevIcon(value: ReactElement): Self = this.set("prevIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevIcon: Self = this.set("prevIcon", js.undefined)
    @scala.inline
    def setSuperNextIconReactElement(value: ReactElement): Self = this.set("superNextIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuperNextIcon(value: ReactElement): Self = this.set("superNextIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuperNextIcon: Self = this.set("superNextIcon", js.undefined)
    @scala.inline
    def setSuperPrevIconReactElement(value: ReactElement): Self = this.set("superPrevIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuperPrevIcon(value: ReactElement): Self = this.set("superPrevIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuperPrevIcon: Self = this.set("superPrevIcon", js.undefined)
  }
  
}

