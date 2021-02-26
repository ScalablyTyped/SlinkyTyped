package typingsSlinky.reactBootstrapTable.mod

import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowSelectedButtonProps extends StObject {
  
  /**
    * Bootstrap css style class for the button, e.g. 'btn-warning'
    */
  var btnContextual: js.UndefOr[String] = js.native
  
  /**
    * Glyphicon glyph string for the button, e.g. 'glyphicon-edit'
    */
  var btnGlyphicon: js.UndefOr[String] = js.native
  
  /**
    * Custom class for the button
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Function to be called to activate the normal onClick functionality for this button.
    */
  var onClick: js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[_], Unit]] = js.native
  
  /**
    * Label for when clicking the button will toggle the table back into "show all rows" mode.
    */
  var showAllText: js.UndefOr[String] = js.native
  
  /**
    * Label for when clicking the button will toggle the table into "show only selected rows" mode.
    */
  var showOnlySelectText: js.UndefOr[String] = js.native
}
object ShowSelectedButtonProps {
  
  @scala.inline
  def apply(): ShowSelectedButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowSelectedButtonProps]
  }
  
  @scala.inline
  implicit class ShowSelectedButtonPropsMutableBuilder[Self <: ShowSelectedButtonProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBtnContextual(value: String): Self = StObject.set(x, "btnContextual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBtnContextualUndefined: Self = StObject.set(x, "btnContextual", js.undefined)
    
    @scala.inline
    def setBtnGlyphicon(value: String): Self = StObject.set(x, "btnGlyphicon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBtnGlyphiconUndefined: Self = StObject.set(x, "btnGlyphicon", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* e */ SyntheticMouseEvent[_] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setShowAllText(value: String): Self = StObject.set(x, "showAllText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAllTextUndefined: Self = StObject.set(x, "showAllText", js.undefined)
    
    @scala.inline
    def setShowOnlySelectText(value: String): Self = StObject.set(x, "showOnlySelectText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOnlySelectTextUndefined: Self = StObject.set(x, "showOnlySelectText", js.undefined)
  }
}
