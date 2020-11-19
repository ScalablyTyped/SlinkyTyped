package typingsSlinky.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Hit Test provides ability to get position and rotation of ray intersecting point with representation of real world geometry by underlying AR system.
  * @property supported - True if AR Hit Test is supported.
  * @property sources - list of active {@link pc.XrHitTestSource}.
  * @param manager - WebXR Manager.
  */
@JSGlobal("pc.XrHitTest")
@js.native
class XrHitTest protected ()
  extends typingsSlinky.playcanvas.pc.XrHitTest {
  def this(manager: typingsSlinky.playcanvas.pc.XrManager) = this()
}
