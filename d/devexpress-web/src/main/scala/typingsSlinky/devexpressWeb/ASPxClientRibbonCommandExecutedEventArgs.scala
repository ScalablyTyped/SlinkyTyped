package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRibbon.CommandExecuted event.
  */
@js.native
trait ASPxClientRibbonCommandExecutedEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets an item object related to the event.
    */
  var item: ASPxClientRibbonItem = js.native
  /**
    * Gets an optional parameter that complements the processed command.
    */
  var parameter: String = js.native
}

object ASPxClientRibbonCommandExecutedEventArgs {
  @scala.inline
  def apply(item: ASPxClientRibbonItem, parameter: String, processOnServer: Boolean): ASPxClientRibbonCommandExecutedEventArgs = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRibbonCommandExecutedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientRibbonCommandExecutedEventArgsOps[Self <: ASPxClientRibbonCommandExecutedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(value: ASPxClientRibbonItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

