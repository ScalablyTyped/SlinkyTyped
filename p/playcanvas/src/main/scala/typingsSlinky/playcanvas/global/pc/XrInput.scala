package typingsSlinky.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.XrInput
  * @augments pc.EventHandler
  * @classdesc Provides access to input sources for WebXR.
  * @description Provides access to input sources for WebXR.
  * @param {pc.XrManager} manager - WebXR Manager.
  * @property {pc.XrInputSource[]} inputSources List of active {pc.XrInputSource}
  */
@JSGlobal("pc.XrInput")
@js.native
class XrInput protected ()
  extends typingsSlinky.playcanvas.pc.XrInput {
  def this(manager: typingsSlinky.playcanvas.pc.XrManager) = this()
}

