package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change paragraph tab stops.
  */
@JSGlobal("ChangeTabsCommand")
@js.native
class ChangeTabsCommand ()
  extends typingsSlinky.devexpressWeb.ChangeTabsCommand {
  /**
    * Executes the ChangeTabsCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A TabsSettings object maintaining the information about tab stops.
    */
  /* CompleteClass */
  override def execute(settings: typingsSlinky.devexpressWeb.TabsSettings): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typingsSlinky.devexpressWeb.CommandState[typingsSlinky.devexpressWeb.TabsSettings] = js.native
}

