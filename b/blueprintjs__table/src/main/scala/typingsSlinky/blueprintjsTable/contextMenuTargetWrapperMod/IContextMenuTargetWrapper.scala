package typingsSlinky.blueprintjsTable.contextMenuTargetWrapperMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContextMenuTargetWrapper extends IProps {
  var style: CSSProperties
  def renderContextMenu(e: SyntheticMouseEvent[HTMLElement]): ReactElement
}

object IContextMenuTargetWrapper {
  @scala.inline
  def apply(
    renderContextMenu: SyntheticMouseEvent[HTMLElement] => ReactElement,
    style: CSSProperties,
    className: String = null
  ): IContextMenuTargetWrapper = {
    val __obj = js.Dynamic.literal(renderContextMenu = js.Any.fromFunction1(renderContextMenu), style = style.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextMenuTargetWrapper]
  }
}

