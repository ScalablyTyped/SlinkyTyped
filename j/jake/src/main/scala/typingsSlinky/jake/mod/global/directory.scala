package typingsSlinky.jake.mod.global

import typingsSlinky.jake.mod.global.jake.DirectoryTask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("directory")
@js.native
object directory extends js.Object {
  
  /**
    * Creates a Jake DirectoryTask. Can be used as a prerequisite for FileTasks, or for simply ensuring a directory exists for use with a Task's action.
    * @param name The name of the DiretoryTask
    */
  def apply(name: String): DirectoryTask = js.native
}
