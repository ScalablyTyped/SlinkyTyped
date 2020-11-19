package typingsSlinky.reactBootstrap.accordionMod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.reactBootstrap.mod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccordionProps
  extends AllHTMLAttributes[Accordion]
     with ClassAttributes[Accordion] {
  
  var bsSize: js.UndefOr[Sizes] = js.native
  
  var bsStyle: js.UndefOr[String] = js.native
  
  var collapsible: js.UndefOr[Boolean] = js.native
  
  var defaultExpanded: js.UndefOr[Boolean] = js.native
  
  var eventKey: js.UndefOr[js.Any] = js.native
  
  var expanded: js.UndefOr[Boolean] = js.native
  
  var footer: js.UndefOr[ReactElement] = js.native
  
  var header: js.UndefOr[ReactElement] = js.native
}
object AccordionProps {
  
  @scala.inline
  def apply(): AccordionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccordionProps]
  }
  
  @scala.inline
  implicit class AccordionPropsOps[Self <: AccordionProps] (val x: Self) extends AnyVal {
    
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
    def setBsSize(value: Sizes): Self = this.set("bsSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBsSize: Self = this.set("bsSize", js.undefined)
    
    @scala.inline
    def setBsStyle(value: String): Self = this.set("bsStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBsStyle: Self = this.set("bsStyle", js.undefined)
    
    @scala.inline
    def setCollapsible(value: Boolean): Self = this.set("collapsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsible: Self = this.set("collapsible", js.undefined)
    
    @scala.inline
    def setDefaultExpanded(value: Boolean): Self = this.set("defaultExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultExpanded: Self = this.set("defaultExpanded", js.undefined)
    
    @scala.inline
    def setEventKey(value: js.Any): Self = this.set("eventKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventKey: Self = this.set("eventKey", js.undefined)
    
    @scala.inline
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    
    @scala.inline
    def setFooterReactElement(value: ReactElement): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooter(value: ReactElement): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setHeaderReactElement(value: ReactElement): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: ReactElement): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
  }
}
