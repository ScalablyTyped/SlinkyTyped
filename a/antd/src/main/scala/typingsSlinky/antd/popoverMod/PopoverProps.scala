package typingsSlinky.antd.popoverMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.antd.getRenderPropValueMod.RenderFunction
import typingsSlinky.antd.tooltipMod.AbstractTooltipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverProps extends AbstractTooltipProps {
  var content: js.UndefOr[TagMod[Any] | RenderFunction] = js.undefined
  var title: js.UndefOr[TagMod[Any] | RenderFunction] = js.undefined
}

object PopoverProps {
  @scala.inline
  def apply(): PopoverProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopoverProps]
  }
  @scala.inline
  implicit class PopoverPropsOps[Self <: PopoverProps] (val x: Self) extends AnyVal {
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
    def setContentReactElement(value: ReactElement): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentFunction0(value: () => TagMod[Any]): Self = this.set("content", js.Any.fromFunction0(value))
    @scala.inline
    def setContent(value: TagMod[Any] | RenderFunction): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitleFunction0(value: () => TagMod[Any]): Self = this.set("title", js.Any.fromFunction0(value))
    @scala.inline
    def setTitle(value: TagMod[Any] | RenderFunction): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

