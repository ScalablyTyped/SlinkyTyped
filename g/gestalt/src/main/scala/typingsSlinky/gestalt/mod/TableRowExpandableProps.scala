package typingsSlinky.gestalt.mod

import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.gestalt.anon.Event
import typingsSlinky.gestalt.gestaltStrings.gray
import typingsSlinky.gestalt.gestaltStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableRowExpandableProps extends js.Object {
  
  var accessibilityCollapseLabel: String = js.native
  
  var accessibilityExpandLabel: String = js.native
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var expandedContents: ReactElement = js.native
  
  var hoverStyle: js.UndefOr[none | gray] = js.native
  
  var id: String = js.native
  
  var onExpand: js.UndefOr[
    AbstractEventHandler[
      (SyntheticMouseEvent[HTMLAnchorElement | HTMLButtonElement]) | (SyntheticKeyboardEvent[HTMLAnchorElement | HTMLButtonElement]), 
      js.Object
    ]
  ] = js.native
}
object TableRowExpandableProps {
  
  @scala.inline
  def apply(accessibilityCollapseLabel: String, accessibilityExpandLabel: String, id: String): TableRowExpandableProps = {
    val __obj = js.Dynamic.literal(accessibilityCollapseLabel = accessibilityCollapseLabel.asInstanceOf[js.Any], accessibilityExpandLabel = accessibilityExpandLabel.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableRowExpandableProps]
  }
  
  @scala.inline
  implicit class TableRowExpandablePropsOps[Self <: TableRowExpandableProps] (val x: Self) extends AnyVal {
    
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
    def setAccessibilityCollapseLabel(value: String): Self = this.set("accessibilityCollapseLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityExpandLabel(value: String): Self = this.set("accessibilityExpandLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setExpandedContents(value: ReactElement): Self = this.set("expandedContents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandedContents: Self = this.set("expandedContents", js.undefined)
    
    @scala.inline
    def setHoverStyle(value: none | gray): Self = this.set("hoverStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverStyle: Self = this.set("hoverStyle", js.undefined)
    
    @scala.inline
    def setOnExpand(
      value: /* arg */ js.Object with (Event[
          (SyntheticMouseEvent[HTMLAnchorElement | HTMLButtonElement]) | (SyntheticKeyboardEvent[HTMLAnchorElement | HTMLButtonElement])
        ]) => Unit
    ): Self = this.set("onExpand", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnExpand: Self = this.set("onExpand", js.undefined)
  }
}
