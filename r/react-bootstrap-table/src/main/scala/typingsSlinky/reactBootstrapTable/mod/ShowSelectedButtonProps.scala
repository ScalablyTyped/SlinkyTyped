package typingsSlinky.reactBootstrapTable.mod

import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowSelectedButtonProps extends js.Object {
  
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
  implicit class ShowSelectedButtonPropsOps[Self <: ShowSelectedButtonProps] (val x: Self) extends AnyVal {
    
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
    def setBtnContextual(value: String): Self = this.set("btnContextual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBtnContextual: Self = this.set("btnContextual", js.undefined)
    
    @scala.inline
    def setBtnGlyphicon(value: String): Self = this.set("btnGlyphicon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBtnGlyphicon: Self = this.set("btnGlyphicon", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* e */ SyntheticMouseEvent[_] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setShowAllText(value: String): Self = this.set("showAllText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowAllText: Self = this.set("showAllText", js.undefined)
    
    @scala.inline
    def setShowOnlySelectText(value: String): Self = this.set("showOnlySelectText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowOnlySelectText: Self = this.set("showOnlySelectText", js.undefined)
  }
}
