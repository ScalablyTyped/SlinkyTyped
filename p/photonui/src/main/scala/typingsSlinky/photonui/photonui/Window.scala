package typingsSlinky.photonui.photonui

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.photonui.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends BaseWindow {
  var closeButtonVisible: Boolean = js.native
  var modal: Boolean = js.native
  var movable: Boolean = js.native
  var title: String = js.native
  def moveToBack(): Unit = js.native
  def moveToFront(): Unit = js.native
}

object Window {
  @scala.inline
  def apply(
    absolutePosition: X,
    addClass: String => Unit,
    center: () => Unit,
    child: Widget,
    childName: String,
    closeButtonVisible: Boolean,
    containerNode: HTMLElement,
    contextMenu: PopupWindow,
    contextMenuName: String,
    destroy: () => Unit,
    height: Double,
    hide: () => Unit,
    horizontalChildExpansion: Boolean,
    html: HTMLElement,
    layoutOptions: StringDictionary[js.Any],
    maxHeight: Double,
    maxWidth: Double,
    minHeight: Double,
    minWidth: Double,
    modal: Boolean,
    movable: Boolean,
    moveToBack: () => Unit,
    moveToFront: () => Unit,
    name: String,
    offsetHeight: Double,
    offsetWidth: Double,
    padding: Double,
    parent: Widget,
    parentName: String,
    position: X,
    registerCallback: (String, String, js.Function, js.Any) => Unit,
    removeCallback: String => Unit,
    removeChild: Widget => Unit,
    removeClass: String => Unit,
    show: () => Unit,
    title: String,
    tooltip: String,
    unparent: () => Unit,
    verticalChildExpansion: Boolean,
    visible: Boolean,
    width: Double,
    x: Double,
    y: Double
  ): Window = {
    val __obj = js.Dynamic.literal(absolutePosition = absolutePosition.asInstanceOf[js.Any], addClass = js.Any.fromFunction1(addClass), center = js.Any.fromFunction0(center), child = child.asInstanceOf[js.Any], childName = childName.asInstanceOf[js.Any], closeButtonVisible = closeButtonVisible.asInstanceOf[js.Any], containerNode = containerNode.asInstanceOf[js.Any], contextMenu = contextMenu.asInstanceOf[js.Any], contextMenuName = contextMenuName.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), height = height.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), horizontalChildExpansion = horizontalChildExpansion.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], layoutOptions = layoutOptions.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], modal = modal.asInstanceOf[js.Any], movable = movable.asInstanceOf[js.Any], moveToBack = js.Any.fromFunction0(moveToBack), moveToFront = js.Any.fromFunction0(moveToFront), name = name.asInstanceOf[js.Any], offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentName = parentName.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], registerCallback = js.Any.fromFunction4(registerCallback), removeCallback = js.Any.fromFunction1(removeCallback), removeChild = js.Any.fromFunction1(removeChild), removeClass = js.Any.fromFunction1(removeClass), show = js.Any.fromFunction0(show), title = title.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], unparent = js.Any.fromFunction0(unparent), verticalChildExpansion = verticalChildExpansion.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseButtonVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButtonVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMovable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoveToBack(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveToBack")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMoveToFront(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveToFront")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

