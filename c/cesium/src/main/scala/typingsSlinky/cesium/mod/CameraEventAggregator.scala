package typingsSlinky.cesium.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CameraEventAggregator")
@js.native
class CameraEventAggregator () extends js.Object {
  def this(element: HTMLCanvasElement) = this()
  
  var anyButtonDown: Boolean = js.native
  
  var currentMousePosition: Cartesian2 = js.native
  
  def destroy(): Unit = js.native
  
  def getButtonPressTime(`type`: CameraEventType): js.Date = js.native
  def getButtonPressTime(`type`: CameraEventType, modifier: KeyboardEventModifier): js.Date = js.native
  
  def getButtonReleaseTime(`type`: CameraEventType): js.Date = js.native
  def getButtonReleaseTime(`type`: CameraEventType, modifier: KeyboardEventModifier): js.Date = js.native
  
  def getLastMovement(`type`: CameraEventType): js.Any = js.native
  def getLastMovement(`type`: CameraEventType, modifier: KeyboardEventModifier): js.Any = js.native
  
  def getMovement(`type`: CameraEventType): js.Any = js.native
  def getMovement(`type`: CameraEventType, modifier: KeyboardEventModifier): js.Any = js.native
  
  def getStartMousePosition(`type`: CameraEventType): Cartesian2 = js.native
  def getStartMousePosition(`type`: CameraEventType, modifier: KeyboardEventModifier): Cartesian2 = js.native
  
  def isButtonDown(`type`: CameraEventType): Boolean = js.native
  def isButtonDown(`type`: CameraEventType, modifier: KeyboardEventModifier): Boolean = js.native
  
  def isDestroyed(): Boolean = js.native
  
  def isMoving(`type`: CameraEventType): Boolean = js.native
  def isMoving(`type`: CameraEventType, modifier: KeyboardEventModifier): Boolean = js.native
  
  def reset(): Unit = js.native
}
