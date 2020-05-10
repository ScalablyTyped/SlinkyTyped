package typingsSlinky.rcDrawer

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.TouchEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.std.Document_
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-drawer/lib/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  val transitionEnd: String = js.native
  val transitionStr: String = js.native
  val windowIsUndefined: Boolean = js.native
  def addEventListener(
    target: HTMLElement,
    eventType: String,
    callback: js.Function1[/* e */ SyntheticTouchEvent[Element] | TouchEvent | Event_, Unit]
  ): Unit = js.native
  def addEventListener(
    target: HTMLElement,
    eventType: String,
    callback: js.Function1[/* e */ SyntheticTouchEvent[Element] | TouchEvent | Event_, Unit],
    options: js.Any
  ): Unit = js.native
  def dataToArray(vars: js.Any): js.Array[_] = js.native
  def getTouchParentScroll(root: HTMLElement, currentTarget: Document_, differX: Double, differY: Double): Boolean = js.native
  def getTouchParentScroll(root: HTMLElement, currentTarget: HTMLElement, differX: Double, differY: Double): Boolean = js.native
  def isNumeric(value: String): Boolean = js.native
  def isNumeric(value: Double): Boolean = js.native
  def removeEventListener(
    target: HTMLElement,
    eventType: String,
    callback: js.Function1[/* e */ SyntheticTouchEvent[Element] | TouchEvent | Event_, Unit]
  ): Unit = js.native
  def removeEventListener(
    target: HTMLElement,
    eventType: String,
    callback: js.Function1[/* e */ SyntheticTouchEvent[Element] | TouchEvent | Event_, Unit],
    options: js.Any
  ): Unit = js.native
  def transformArguments(arg: js.Any, cb: js.Any): js.Array[_] = js.native
}

