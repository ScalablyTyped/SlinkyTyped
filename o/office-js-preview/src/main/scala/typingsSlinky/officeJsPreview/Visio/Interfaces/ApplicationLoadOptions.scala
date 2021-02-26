package typingsSlinky.officeJsPreview.Visio.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the Application.
  *
  * [Api set:  1.1]
  */
@js.native
trait ApplicationLoadOptions extends StObject {
  
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Show or hide the iFrame application borders.
    *
    * [Api set:  1.1]
    */
  var showBorders: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Show or hide the standard toolbars.
    *
    * [Api set:  1.1]
    */
  var showToolbars: js.UndefOr[Boolean] = js.native
}
object ApplicationLoadOptions {
  
  @scala.inline
  def apply(): ApplicationLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationLoadOptions]
  }
  
  @scala.inline
  implicit class ApplicationLoadOptionsMutableBuilder[Self <: ApplicationLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setShowBorders(value: Boolean): Self = StObject.set(x, "showBorders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowBordersUndefined: Self = StObject.set(x, "showBorders", js.undefined)
    
    @scala.inline
    def setShowToolbars(value: Boolean): Self = StObject.set(x, "showToolbars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowToolbarsUndefined: Self = StObject.set(x, "showToolbars", js.undefined)
  }
}
