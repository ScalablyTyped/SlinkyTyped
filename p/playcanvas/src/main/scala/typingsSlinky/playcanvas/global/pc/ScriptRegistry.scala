package typingsSlinky.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create an instance of a pc.ScriptRegistry.
  * Note: PlayCanvas scripts can access the Script Registry from inside the application with {@link pc.Application#scripts} {@link pc.ADDRESS_REPEAT}.
  * @param app - Application to attach registry to.
  */
@JSGlobal("pc.ScriptRegistry")
@js.native
class ScriptRegistry protected ()
  extends typingsSlinky.playcanvas.pc.ScriptRegistry {
  def this(app: typingsSlinky.playcanvas.pc.Application) = this()
}
