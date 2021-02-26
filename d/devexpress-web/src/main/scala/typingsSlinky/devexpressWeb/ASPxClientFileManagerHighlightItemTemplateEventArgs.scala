package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.HighlightItemTemplate event.
  */
@js.native
trait ASPxClientFileManagerHighlightItemTemplateEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets a string that is a filter value specified by the filter box.
    */
  var filterValue: String = js.native
  
  /**
    * Get the name of the cascading style sheet (CSS) class associated with an item in the highlighted state.
    */
  var highlightCssClassName: String = js.native
  
  /**
    * Gets the name of the item currently being processed.
    */
  var itemName: String = js.native
  
  /**
    * Gets an element containing the item template.
    */
  var templateElement: String = js.native
}
object ASPxClientFileManagerHighlightItemTemplateEventArgs {
  
  @scala.inline
  def apply(filterValue: String, highlightCssClassName: String, itemName: String, templateElement: String): ASPxClientFileManagerHighlightItemTemplateEventArgs = {
    val __obj = js.Dynamic.literal(filterValue = filterValue.asInstanceOf[js.Any], highlightCssClassName = highlightCssClassName.asInstanceOf[js.Any], itemName = itemName.asInstanceOf[js.Any], templateElement = templateElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerHighlightItemTemplateEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientFileManagerHighlightItemTemplateEventArgsMutableBuilder[Self <: ASPxClientFileManagerHighlightItemTemplateEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterValue(value: String): Self = StObject.set(x, "filterValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightCssClassName(value: String): Self = StObject.set(x, "highlightCssClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemName(value: String): Self = StObject.set(x, "itemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateElement(value: String): Self = StObject.set(x, "templateElement", value.asInstanceOf[js.Any])
  }
}
