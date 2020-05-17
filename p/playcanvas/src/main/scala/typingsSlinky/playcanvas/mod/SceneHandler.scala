package typingsSlinky.playcanvas.mod

import typingsSlinky.playcanvas.pc.ResourceHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.SceneHandler
  * @implements {pc.ResourceHandler}
  * @classdesc Resource handler used for loading {@link pc.Scene} resources.
  * @param {pc.Application} app - The running {@link pc.Application}.
  */
@JSImport("playcanvas", "SceneHandler")
@js.native
class SceneHandler protected () extends ResourceHandler {
  def this(app: typingsSlinky.playcanvas.pc.Application) = this()
}

