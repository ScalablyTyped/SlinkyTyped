package typingsSlinky.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Component Systems contain the logic and functionality to update all Components of a particular type.
  * @param app - The application managing this system.
  */
@JSImport("playcanvas", "ComponentSystem")
@js.native
class ComponentSystem protected ()
  extends typingsSlinky.playcanvas.pc.EventHandler {
  def this(app: typingsSlinky.playcanvas.pc.Application) = this()
}

