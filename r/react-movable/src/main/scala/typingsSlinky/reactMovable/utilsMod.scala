package typingsSlinky.reactMovable

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-movable/lib/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def arrayMove[T](array: js.Array[T], from: Double, to: Double): js.Array[T] = js.native
  
  def arrayRemove[T](array: js.Array[T], index: Double): js.Array[T] = js.native
  
  def binarySearch(array: js.Array[Double], targetValue: Double): Double = js.native
  
  def checkIfInteractive(target: Element, rootElement: Element): Boolean = js.native
  
  def getTranslateOffset(element: Element): Double = js.native
  
  def isItemTransformed(element: Element): Boolean = js.native
  
  def isTouchEvent(event: TouchEvent with MouseEvent): Double = js.native
  
  def schd(fn: js.Function): js.Function1[/* repeated */ js.Any, Unit] = js.native
  
  def setItemTransition(element: Element, duration: Double): Unit = js.native
  def setItemTransition(element: Element, duration: Double, timing: String): Unit = js.native
  
  def transformItem(element: Element): Unit = js.native
  def transformItem(element: Element, offsetY: js.UndefOr[scala.Nothing], offsetX: Double): Unit = js.native
  def transformItem(element: Element, offsetY: Double): Unit = js.native
  def transformItem(element: Element, offsetY: Double, offsetX: Double): Unit = js.native
  def transformItem(element: Element, offsetY: Null, offsetX: Double): Unit = js.native
}
