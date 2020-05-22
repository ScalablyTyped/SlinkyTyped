package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as a base for commands with the Boolean state.
  */
@JSGlobal("CommandWithBooleanStateBase")
@js.native
abstract class CommandWithBooleanStateBase ()
  extends typingsSlinky.devexpressWeb.CommandWithBooleanStateBase {
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typingsSlinky.devexpressWeb.CommandState[Boolean] = js.native
}

