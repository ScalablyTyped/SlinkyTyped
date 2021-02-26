package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows injection of keyboard and mouse events
  * @since LibreOffice 5.1
  */
@js.native
trait XToolkitRobot extends StObject {
  
  def keyPress(aKeyEvent: KeyEvent): Unit = js.native
  
  def keyRelease(aKeyEvent: KeyEvent): Unit = js.native
  
  def mouseMove(aMouseEvent: MouseEvent): Unit = js.native
  
  def mousePress(aMouseEvent: MouseEvent): Unit = js.native
  
  def mouseRelease(aMouseEvent: MouseEvent): Unit = js.native
}
object XToolkitRobot {
  
  @scala.inline
  def apply(
    keyPress: KeyEvent => Unit,
    keyRelease: KeyEvent => Unit,
    mouseMove: MouseEvent => Unit,
    mousePress: MouseEvent => Unit,
    mouseRelease: MouseEvent => Unit
  ): XToolkitRobot = {
    val __obj = js.Dynamic.literal(keyPress = js.Any.fromFunction1(keyPress), keyRelease = js.Any.fromFunction1(keyRelease), mouseMove = js.Any.fromFunction1(mouseMove), mousePress = js.Any.fromFunction1(mousePress), mouseRelease = js.Any.fromFunction1(mouseRelease))
    __obj.asInstanceOf[XToolkitRobot]
  }
  
  @scala.inline
  implicit class XToolkitRobotMutableBuilder[Self <: XToolkitRobot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyPress(value: KeyEvent => Unit): Self = StObject.set(x, "keyPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeyRelease(value: KeyEvent => Unit): Self = StObject.set(x, "keyRelease", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMouseMove(value: MouseEvent => Unit): Self = StObject.set(x, "mouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMousePress(value: MouseEvent => Unit): Self = StObject.set(x, "mousePress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMouseRelease(value: MouseEvent => Unit): Self = StObject.set(x, "mouseRelease", js.Any.fromFunction1(value))
  }
}
