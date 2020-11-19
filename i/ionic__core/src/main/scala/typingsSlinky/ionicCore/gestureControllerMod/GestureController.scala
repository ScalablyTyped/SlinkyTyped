package typingsSlinky.ionicCore.gestureControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GestureController extends js.Object {
  
  def canStart(gestureName: String): Boolean = js.native
  
  def capture(gestureName: String, id: Double, priority: Double): Boolean = js.native
  
  var capturedId: js.Any = js.native
  
  /**
    * Creates a blocker that will block any other gesture events from firing. Set in the ion-gesture component.
    */
  def createBlocker(): BlockerDelegate = js.native
  def createBlocker(opts: BlockerConfig): BlockerDelegate = js.native
  
  /**
    * Creates a gesture delegate based on the GestureConfig passed
    */
  def createGesture(config: GestureConfig): GestureDelegate = js.native
  
  def disableGesture(gestureName: String, id: Double): Unit = js.native
  
  def disableScroll(id: Double): Unit = js.native
  
  var disabledGestures: js.Any = js.native
  
  var disabledScroll: js.Any = js.native
  
  def enableGesture(gestureName: String, id: Double): Unit = js.native
  
  def enableScroll(id: Double): Unit = js.native
  
  var gestureId: js.Any = js.native
  
  def isCaptured(): Boolean = js.native
  
  def isDisabled(gestureName: String): Boolean = js.native
  
  def isScrollDisabled(): Boolean = js.native
  
  var newID: js.Any = js.native
  
  def release(id: Double): Unit = js.native
  
  var requestedStart: js.Any = js.native
  
  def start(gestureName: String, id: Double, priority: Double): Boolean = js.native
}
