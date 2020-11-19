package typingsSlinky.rcDrawer

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.TouchEvent
import slinky.web.SyntheticTouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-drawer/es/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def addEventListener(
    target: HTMLElement,
    eventType: String,
    callback: js.Function1[/* e */ SyntheticTouchEvent[Element] | TouchEvent | Event, Unit]
  ): Unit = js.native
  def addEventListener(
    target: HTMLElement,
    eventType: String,
    callback: js.Function1[/* e */ SyntheticTouchEvent[Element] | TouchEvent | Event, Unit],
    options: js.Any
  ): Unit = js.native
  
  def dataToArray(vars: js.Any): js.Array[_] = js.native
  
  def getTouchParentScroll(root: HTMLElement, currentTarget: Null, differX: Double, differY: Double): Boolean = js.native
  def getTouchParentScroll(root: HTMLElement, currentTarget: Document, differX: Double, differY: Double): Boolean = js.native
  def getTouchParentScroll(root: HTMLElement, currentTarget: HTMLElement, differX: Double, differY: Double): Boolean = js.native
  
  def isNumeric(): Boolean = js.native
  def isNumeric(value: String): Boolean = js.native
  def isNumeric(value: Double): Boolean = js.native
  
  def removeEventListener(
    target: HTMLElement,
    eventType: String,
    callback: js.Function1[/* e */ SyntheticTouchEvent[Element] | TouchEvent | Event, Unit]
  ): Unit = js.native
  def removeEventListener(
    target: HTMLElement,
    eventType: String,
    callback: js.Function1[/* e */ SyntheticTouchEvent[Element] | TouchEvent | Event, Unit],
    options: js.Any
  ): Unit = js.native
  
  def transformArguments(arg: js.Any, cb: js.Any): js.Array[_] = js.native
  
  val transitionEnd: String = js.native
  
  val transitionStr: String = js.native
  
  val windowIsUndefined: Boolean = js.native
}
