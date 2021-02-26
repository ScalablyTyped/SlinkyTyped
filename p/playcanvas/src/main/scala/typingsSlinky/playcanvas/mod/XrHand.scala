package typingsSlinky.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a hand with fingers and joints
  * @property fingers - List of fingers of a hand
  * @property joints - List of joints of hand
  * @property tips - List of joints that are tips of a fingers
  * @property wrist - Wrist of a hand, or null if it is not available by WebXR underlying system
  * @property tracking - True if tracking is available, otherwise tracking might be lost
  * @param inputSource - Input Source that hand is related to
  */
@JSImport("playcanvas", "XrHand")
@js.native
class XrHand protected ()
  extends typingsSlinky.playcanvas.pc.XrHand {
  def this(inputSource: typingsSlinky.playcanvas.pc.XrInputSource) = this()
}
