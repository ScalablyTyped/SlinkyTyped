package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeMenuActions, ASPxClientReportDesigner.PreviewCustomizeMenuActions and ASPxClientWebDocumentViewer.CustomizeMenuActions.
  */
@js.native
trait ASPxClientCustomizeMenuActionsEventArgs extends ASPxClientEventArgs {
  
  /**
    * Provides access to the collection of actions available in the toolbar and menu.
    */
  var Actions: js.Array[ASPxClientMenuAction] = js.native
  
  /**
    * Returns a menu action with the specified ID. An IAction object.
    * @param actionId A String value that specifies the action ID.
    */
  def GetById(actionId: String): ASPxClientMenuAction = js.native
}
object ASPxClientCustomizeMenuActionsEventArgs {
  
  @scala.inline
  def apply(Actions: js.Array[ASPxClientMenuAction], GetById: String => ASPxClientMenuAction): ASPxClientCustomizeMenuActionsEventArgs = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], GetById = js.Any.fromFunction1(GetById))
    __obj.asInstanceOf[ASPxClientCustomizeMenuActionsEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientCustomizeMenuActionsEventArgsMutableBuilder[Self <: ASPxClientCustomizeMenuActionsEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[ASPxClientMenuAction]): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsVarargs(value: ASPxClientMenuAction*): Self = StObject.set(x, "Actions", js.Array(value :_*))
    
    @scala.inline
    def setGetById(value: String => ASPxClientMenuAction): Self = StObject.set(x, "GetById", js.Any.fromFunction1(value))
  }
}
