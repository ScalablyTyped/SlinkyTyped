package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportDesigner.ComponentAdded event.
  */
@js.native
trait ASPxClientReportDesignerComponentAddedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the model of a component that has been added to a report.
    */
  var Model: js.Any = js.native
  
  /**
    * Gets the parent of a component that has been added to a report.
    */
  var Parent: js.Any = js.native
}
object ASPxClientReportDesignerComponentAddedEventArgs {
  
  @scala.inline
  def apply(Model: js.Any, Parent: js.Any): ASPxClientReportDesignerComponentAddedEventArgs = {
    val __obj = js.Dynamic.literal(Model = Model.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportDesignerComponentAddedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientReportDesignerComponentAddedEventArgsMutableBuilder[Self <: ASPxClientReportDesignerComponentAddedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
