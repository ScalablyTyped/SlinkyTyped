package typingsSlinky.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents XR hit test source, which provides access to hit results of real world geometry from AR session.
  * @example
  * hitTestSource.on('result', function (position, rotation) {
  *     target.setPosition(position);
  * });
  * @param manager - WebXR Manager.
  * @param xrHitTestSource - XRHitTestSource object that is created by WebXR API.
  * @param transient - True if XRHitTestSource created for input source profile.
  */
@JSImport("playcanvas", "XrHitTestSource")
@js.native
class XrHitTestSource protected ()
  extends typingsSlinky.playcanvas.pc.XrHitTestSource {
  def this(manager: typingsSlinky.playcanvas.pc.XrManager, xrHitTestSource: js.Any, transient: Boolean) = this()
}
