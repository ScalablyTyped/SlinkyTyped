package typingsSlinky.atBlueprintjsTable.libEsmCommonContextMenuTargetWrapperMod

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.atBlueprintjsCore.libEsmCommonPropsMod.IProps
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContextMenuTargetWrapper extends IProps {
  var style: CSSProperties
  def renderContextMenu(e: SyntheticMouseEvent[HTMLElement]): Element
}

object IContextMenuTargetWrapper {
  @scala.inline
  def apply(
    renderContextMenu: SyntheticMouseEvent[HTMLElement] => Element,
    style: CSSProperties,
    className: String = null
  ): IContextMenuTargetWrapper = {
    val __obj = js.Dynamic.literal(renderContextMenu = js.Any.fromFunction1(renderContextMenu), style = style.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextMenuTargetWrapper]
  }
}

