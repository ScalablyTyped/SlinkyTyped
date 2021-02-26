package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeElements, ASPxClientReportDesigner.PreviewCustomizeElements and ASPxClientWebDocumentViewer.CustomizeElements events.
  */
@js.native
trait ASPxClientCustomizeElementsEventArgs extends ASPxClientEventArgs {
  
  /**
    * Provides access to the collection of UI elements.
    */
  var Elements: js.Array[ASPxReportUIElement] = js.native
  
  /**
    * Returns UI elements with the specified ID. An array of ASPxReportUIElement objects.
    * @param templateId A string that specifies the element ID.
    */
  def GetById(templateId: String): js.Array[ASPxReportUIElement] = js.native
}
object ASPxClientCustomizeElementsEventArgs {
  
  @scala.inline
  def apply(Elements: js.Array[ASPxReportUIElement], GetById: String => js.Array[ASPxReportUIElement]): ASPxClientCustomizeElementsEventArgs = {
    val __obj = js.Dynamic.literal(Elements = Elements.asInstanceOf[js.Any], GetById = js.Any.fromFunction1(GetById))
    __obj.asInstanceOf[ASPxClientCustomizeElementsEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientCustomizeElementsEventArgsMutableBuilder[Self <: ASPxClientCustomizeElementsEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElements(value: js.Array[ASPxReportUIElement]): Self = StObject.set(x, "Elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsVarargs(value: ASPxReportUIElement*): Self = StObject.set(x, "Elements", js.Array(value :_*))
    
    @scala.inline
    def setGetById(value: String => js.Array[ASPxReportUIElement]): Self = StObject.set(x, "GetById", js.Any.fromFunction1(value))
  }
}
