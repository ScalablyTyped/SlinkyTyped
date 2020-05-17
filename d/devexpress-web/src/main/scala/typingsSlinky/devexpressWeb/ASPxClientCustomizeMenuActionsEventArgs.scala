package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class ASPxClientCustomizeMenuActionsEventArgsOps[Self <: ASPxClientCustomizeMenuActionsEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: js.Array[ASPxClientMenuAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetById(value: String => ASPxClientMenuAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetById")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

