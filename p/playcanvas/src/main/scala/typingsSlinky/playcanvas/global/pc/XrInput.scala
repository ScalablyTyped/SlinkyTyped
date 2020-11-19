package typingsSlinky.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to input sources for WebXR.
  * @property inputSources - List of active {@link pc.XrInputSource}.
  * @param manager - WebXR Manager.
  */
@JSGlobal("pc.XrInput")
@js.native
class XrInput protected ()
  extends typingsSlinky.playcanvas.pc.XrInput {
  def this(manager: typingsSlinky.playcanvas.pc.XrManager) = this()
}
