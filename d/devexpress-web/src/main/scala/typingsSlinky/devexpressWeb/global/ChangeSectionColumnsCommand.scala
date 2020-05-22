package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the settings of individual section columns.
  */
@JSGlobal("ChangeSectionColumnsCommand")
@js.native
class ChangeSectionColumnsCommand ()
  extends typingsSlinky.devexpressWeb.ChangeSectionColumnsCommand {
  /**
    * Executes the ChangeSectionColumnsCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param columns An array of SectionColumn objects.
    */
  /* CompleteClass */
  override def execute(columns: js.Array[typingsSlinky.devexpressWeb.SectionColumn]): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typingsSlinky.devexpressWeb.CommandState[js.Array[typingsSlinky.devexpressWeb.SectionColumn]] = js.native
}

