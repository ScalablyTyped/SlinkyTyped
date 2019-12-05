package typingsSlinky.rcDashDrawer

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.TouchEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-drawer/lib/utils", JSImport.Namespace)
@js.native
object libUtilsMod extends js.Object {
  val transitionEnd: String = js.native
  val transitionStr: String = js.native
  val windowIsUndefined: Boolean = js.native
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
  def getTouchParentScroll(root: HTMLElement, currentTarget: Document, differX: Double, differY: Double): Boolean = js.native
  def getTouchParentScroll(root: HTMLElement, currentTarget: typingsSlinky.std.HTMLElement, differX: Double, differY: Double): Boolean = js.native
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
}

