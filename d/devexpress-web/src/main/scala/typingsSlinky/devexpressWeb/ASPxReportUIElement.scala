package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about a UI element of the Web Report Designer or Web Document Viewer.
  */
@js.native
trait ASPxReportUIElement extends StObject {
  
  /**
    * Provides access to an element model.
    */
  var model: js.Any = js.native
  
  /**
    * Provides access to the name of an HTML template used by an element.
    */
  var templateName: String = js.native
}
object ASPxReportUIElement {
  
  @scala.inline
  def apply(model: js.Any, templateName: String): ASPxReportUIElement = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxReportUIElement]
  }
  
  @scala.inline
  implicit class ASPxReportUIElementMutableBuilder[Self <: ASPxReportUIElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateName(value: String): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}
