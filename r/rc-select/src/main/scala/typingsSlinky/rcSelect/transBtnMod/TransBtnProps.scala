package typingsSlinky.rcSelect.transBtnMod

import org.scalajs.dom.raw.HTMLSpanElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcSelect.interfaceMod.RenderNode
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransBtnProps extends js.Object {
  var children: js.UndefOr[ReactElement] = js.undefined
  var className: String
  var customizeIcon: RenderNode
  var customizeIconProps: js.UndefOr[js.Any] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.undefined
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.undefined
}

object TransBtnProps {
  @scala.inline
  def apply(className: String): TransBtnProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransBtnProps]
  }
  @scala.inline
  implicit class TransBtnPropsOps[Self <: TransBtnProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setCustomizeIconReactElement(value: ReactElement): Self = this.set("customizeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomizeIconFunction1(value: /* props */ js.Any => ReactElement): Self = this.set("customizeIcon", js.Any.fromFunction1(value))
    @scala.inline
    def setCustomizeIcon(value: RenderNode): Self = this.set("customizeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomizeIcon: Self = this.set("customizeIcon", js.undefined)
    @scala.inline
    def setCustomizeIconProps(value: js.Any): Self = this.set("customizeIconProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomizeIconProps: Self = this.set("customizeIconProps", js.undefined)
    @scala.inline
    def setOnClick(value: SyntheticMouseEvent[HTMLSpanElement] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnMouseDown(value: SyntheticMouseEvent[HTMLSpanElement] => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
  }
  
}

