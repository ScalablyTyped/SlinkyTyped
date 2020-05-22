package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as a base for commands with a simple common command state.
  */
@JSGlobal("CommandWithSimpleStateBase")
@js.native
abstract class CommandWithSimpleStateBase ()
  extends typingsSlinky.devexpressWeb.CommandWithSimpleStateBase {
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typingsSlinky.devexpressWeb.SimpleCommandState = js.native
}

