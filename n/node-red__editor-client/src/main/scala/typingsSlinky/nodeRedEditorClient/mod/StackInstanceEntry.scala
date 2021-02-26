package typingsSlinky.nodeRedEditorClient.mod

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.nodeRedEditorClient.mod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackInstanceEntry extends StObject {
  
  def collapse(): js.UndefOr[Boolean] = js.native
  
  var collapsible: js.UndefOr[Boolean] = js.native
  
  var container: JQuery[HTMLDivElement] = js.native
  
  var content: JQuery[HTMLDivElement] = js.native
  
  var contentWrap: JQuery[HTMLDivElement] = js.native
  
  def expand(): js.UndefOr[Boolean] = js.native
  
  var header: JQuery[HTMLDivElement] = js.native
  
  def isExpanded(): Boolean = js.native
  
  var title: JQuery[HTMLDivElement] = js.native
  
  def toggle(): Boolean = js.native
}
object StackInstanceEntry {
  
  @scala.inline
  def apply(
    collapse: () => js.UndefOr[Boolean],
    container: JQuery[HTMLDivElement],
    content: JQuery[HTMLDivElement],
    contentWrap: JQuery[HTMLDivElement],
    expand: () => js.UndefOr[Boolean],
    header: JQuery[HTMLDivElement],
    isExpanded: () => Boolean,
    title: JQuery[HTMLDivElement],
    toggle: () => Boolean
  ): StackInstanceEntry = {
    val __obj = js.Dynamic.literal(collapse = js.Any.fromFunction0(collapse), container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentWrap = contentWrap.asInstanceOf[js.Any], expand = js.Any.fromFunction0(expand), header = header.asInstanceOf[js.Any], isExpanded = js.Any.fromFunction0(isExpanded), title = title.asInstanceOf[js.Any], toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[StackInstanceEntry]
  }
  
  @scala.inline
  implicit class StackInstanceEntryMutableBuilder[Self <: StackInstanceEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapse(value: () => js.UndefOr[Boolean]): Self = StObject.set(x, "collapse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
    
    @scala.inline
    def setContainer(value: JQuery[HTMLDivElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: JQuery[HTMLDivElement]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentWrap(value: JQuery[HTMLDivElement]): Self = StObject.set(x, "contentWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpand(value: () => js.UndefOr[Boolean]): Self = StObject.set(x, "expand", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHeader(value: JQuery[HTMLDivElement]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExpanded(value: () => Boolean): Self = StObject.set(x, "isExpanded", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTitle(value: JQuery[HTMLDivElement]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggle(value: () => Boolean): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
  }
}
