package typingsSlinky.photonui.photonui

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.photonui.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopupWindow extends BaseWindow {
  
  def popupWidget(widget: Widget): Unit = js.native
  
  def popupXY(x: Double, y: Double): Unit = js.native
}
object PopupWindow {
  
  @scala.inline
  def apply(
    absolutePosition: X,
    addClass: String => Unit,
    center: () => Unit,
    child: Widget,
    childName: String,
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
    name: String,
    offsetHeight: Double,
    offsetWidth: Double,
    padding: Double,
    parent: Widget,
    parentName: String,
    popupWidget: Widget => Unit,
    popupXY: (Double, Double) => Unit,
    position: X,
    registerCallback: (String, String, js.Function, js.Any) => Unit,
    removeCallback: String => Unit,
    removeChild: Widget => Unit,
    removeClass: String => Unit,
    show: () => Unit,
    tooltip: String,
    unparent: () => Unit,
    verticalChildExpansion: Boolean,
    visible: Boolean,
    width: Double,
    x: Double,
    y: Double
  ): PopupWindow = {
    val __obj = js.Dynamic.literal(absolutePosition = absolutePosition.asInstanceOf[js.Any], addClass = js.Any.fromFunction1(addClass), center = js.Any.fromFunction0(center), child = child.asInstanceOf[js.Any], childName = childName.asInstanceOf[js.Any], containerNode = containerNode.asInstanceOf[js.Any], contextMenu = contextMenu.asInstanceOf[js.Any], contextMenuName = contextMenuName.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), height = height.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), horizontalChildExpansion = horizontalChildExpansion.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], layoutOptions = layoutOptions.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentName = parentName.asInstanceOf[js.Any], popupWidget = js.Any.fromFunction1(popupWidget), popupXY = js.Any.fromFunction2(popupXY), position = position.asInstanceOf[js.Any], registerCallback = js.Any.fromFunction4(registerCallback), removeCallback = js.Any.fromFunction1(removeCallback), removeChild = js.Any.fromFunction1(removeChild), removeClass = js.Any.fromFunction1(removeClass), show = js.Any.fromFunction0(show), tooltip = tooltip.asInstanceOf[js.Any], unparent = js.Any.fromFunction0(unparent), verticalChildExpansion = verticalChildExpansion.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupWindow]
  }
  
  @scala.inline
  implicit class PopupWindowOps[Self <: PopupWindow] (val x: Self) extends AnyVal {
    
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
    def setPopupWidget(value: Widget => Unit): Self = this.set("popupWidget", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPopupXY(value: (Double, Double) => Unit): Self = this.set("popupXY", js.Any.fromFunction2(value))
  }
}
