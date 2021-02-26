package typingsSlinky.photonui.photonui

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.photonui.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// -----------------------------------
@js.native
trait Viewport extends Container {
  
  var height: Double = js.native
  
  var horizontalScrollbar: Boolean = js.native
  
  var maxHeight: Double = js.native
  
  var maxWidth: Double = js.native
  
  var minHeight: Double = js.native
  
  var minWidth: Double = js.native
  
  var padding: Double = js.native
  
  var verticalScrollbar: Boolean = js.native
  
  var width: Double = js.native
}
object Viewport {
  
  @scala.inline
  def apply(
    absolutePosition: X,
    addClass: String => Unit,
    child: Widget,
    childName: String,
    containerNode: HTMLElement,
    contextMenu: PopupWindow,
    contextMenuName: String,
    destroy: () => Unit,
    height: Double,
    hide: () => Unit,
    horizontalChildExpansion: Boolean,
    horizontalScrollbar: Boolean,
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
    registerCallback: (String, String, js.Function, js.Any) => Unit,
    removeCallback: String => Unit,
    removeChild: Widget => Unit,
    removeClass: String => Unit,
    show: () => Unit,
    tooltip: String,
    unparent: () => Unit,
    verticalChildExpansion: Boolean,
    verticalScrollbar: Boolean,
    visible: Boolean,
    width: Double
  ): Viewport = {
    val __obj = js.Dynamic.literal(absolutePosition = absolutePosition.asInstanceOf[js.Any], addClass = js.Any.fromFunction1(addClass), child = child.asInstanceOf[js.Any], childName = childName.asInstanceOf[js.Any], containerNode = containerNode.asInstanceOf[js.Any], contextMenu = contextMenu.asInstanceOf[js.Any], contextMenuName = contextMenuName.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), height = height.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), horizontalChildExpansion = horizontalChildExpansion.asInstanceOf[js.Any], horizontalScrollbar = horizontalScrollbar.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], layoutOptions = layoutOptions.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentName = parentName.asInstanceOf[js.Any], registerCallback = js.Any.fromFunction4(registerCallback), removeCallback = js.Any.fromFunction1(removeCallback), removeChild = js.Any.fromFunction1(removeChild), removeClass = js.Any.fromFunction1(removeClass), show = js.Any.fromFunction0(show), tooltip = tooltip.asInstanceOf[js.Any], unparent = js.Any.fromFunction0(unparent), verticalChildExpansion = verticalChildExpansion.asInstanceOf[js.Any], verticalScrollbar = verticalScrollbar.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Viewport]
  }
  
  @scala.inline
  implicit class ViewportMutableBuilder[Self <: Viewport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalScrollbar(value: Boolean): Self = StObject.set(x, "horizontalScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalScrollbar(value: Boolean): Self = StObject.set(x, "verticalScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
