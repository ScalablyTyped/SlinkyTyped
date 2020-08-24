package typingsSlinky.blueprintjsTable.contextMenuTargetWrapperMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContextMenuTargetWrapper extends IProps {
  var style: CSSProperties = js.native
  def renderContextMenu(e: SyntheticMouseEvent[HTMLElement]): ReactElement = js.native
}

object IContextMenuTargetWrapper {
  @scala.inline
  def apply(renderContextMenu: SyntheticMouseEvent[HTMLElement] => ReactElement, style: CSSProperties): IContextMenuTargetWrapper = {
    val __obj = js.Dynamic.literal(renderContextMenu = js.Any.fromFunction1(renderContextMenu), style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextMenuTargetWrapper]
  }
  @scala.inline
  implicit class IContextMenuTargetWrapperOps[Self <: IContextMenuTargetWrapper] (val x: Self) extends AnyVal {
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
    def setRenderContextMenu(value: SyntheticMouseEvent[HTMLElement] => ReactElement): Self = this.set("renderContextMenu", js.Any.fromFunction1(value))
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
  }
  
}

