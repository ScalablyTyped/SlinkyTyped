package typingsSlinky.jake.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("fail")
@js.native
object fail extends js.Object {
  
  /**
    * Causes Jake execution to abort with an error. Allows passing an optional error code, which will be used to set the exit-code of exiting process.
    * @param err The error to thow when aborting execution. If this argument is an Error object, it will simply be thrown. If a String, it will be used as the error-message. (If it is a multi-line String, the first line will be used as the Error message, and the remaining lines will be used as the error-stack.)
    */
  def apply(err: (js.Any | js.Error | String)*): Unit = js.native
}
