package typingsSlinky.inboxsdk.mod.Router

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SectionDescriptor extends StObject {
  
  var contentElement: js.UndefOr[HTMLElement] = js.native
  
  var footerLinkText: js.UndefOr[String] = js.native
  
  var hasDropdown: js.UndefOr[Boolean] = js.native
  
  var onDropdownClick: js.UndefOr[js.Function1[/* event */ SectionDropdownClickEvent, Unit]] = js.native
  
  var onFooterLinkClick: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  
  var onTitleLinkClick: js.UndefOr[js.Function0[Unit]] = js.native
  
  var subtitle: js.UndefOr[String] = js.native
  
  var tableRows: js.UndefOr[js.Array[RowDescriptor]] = js.native
  
  var title: String = js.native
  
  var titleLinkText: js.UndefOr[String] = js.native
}
object SectionDescriptor {
  
  @scala.inline
  def apply(title: String): SectionDescriptor = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionDescriptor]
  }
  
  @scala.inline
  implicit class SectionDescriptorMutableBuilder[Self <: SectionDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentElement(value: HTMLElement): Self = StObject.set(x, "contentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentElementUndefined: Self = StObject.set(x, "contentElement", js.undefined)
    
    @scala.inline
    def setFooterLinkText(value: String): Self = StObject.set(x, "footerLinkText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterLinkTextUndefined: Self = StObject.set(x, "footerLinkText", js.undefined)
    
    @scala.inline
    def setHasDropdown(value: Boolean): Self = StObject.set(x, "hasDropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasDropdownUndefined: Self = StObject.set(x, "hasDropdown", js.undefined)
    
    @scala.inline
    def setOnDropdownClick(value: /* event */ SectionDropdownClickEvent => Unit): Self = StObject.set(x, "onDropdownClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDropdownClickUndefined: Self = StObject.set(x, "onDropdownClick", js.undefined)
    
    @scala.inline
    def setOnFooterLinkClick(value: /* event */ js.Any => Unit): Self = StObject.set(x, "onFooterLinkClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFooterLinkClickUndefined: Self = StObject.set(x, "onFooterLinkClick", js.undefined)
    
    @scala.inline
    def setOnTitleLinkClick(value: () => Unit): Self = StObject.set(x, "onTitleLinkClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnTitleLinkClickUndefined: Self = StObject.set(x, "onTitleLinkClick", js.undefined)
    
    @scala.inline
    def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    @scala.inline
    def setTableRows(value: js.Array[RowDescriptor]): Self = StObject.set(x, "tableRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableRowsUndefined: Self = StObject.set(x, "tableRows", js.undefined)
    
    @scala.inline
    def setTableRowsVarargs(value: RowDescriptor*): Self = StObject.set(x, "tableRows", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleLinkText(value: String): Self = StObject.set(x, "titleLinkText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleLinkTextUndefined: Self = StObject.set(x, "titleLinkText", js.undefined)
  }
}
