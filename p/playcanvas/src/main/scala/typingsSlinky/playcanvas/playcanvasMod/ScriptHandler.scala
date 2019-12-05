package typingsSlinky.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.ScriptHandler
  * @implements {pc.ResourceHandler}
  * @classdesc Resource handler for loading JavaScript files dynamically
  * Two types of JavaScript files can be loaded, PlayCanvas scripts which contain calls to {@link pc.createScript},
  * or regular JavaScript files, such as third-party libraries.
  * @param {pc.Application} app The running {@link pc.Application}
  */
@JSImport("playcanvas", "ScriptHandler")
@js.native
class ScriptHandler protected ()
  extends typingsSlinky.playcanvas.pc.ScriptHandler {
  def this(app: typingsSlinky.playcanvas.pc.Application) = this()
}

