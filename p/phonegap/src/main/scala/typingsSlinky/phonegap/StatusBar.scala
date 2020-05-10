package typingsSlinky.phonegap

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Defined in lib.d.ts
interface LocalStorage {
  key;
  getItem;
  setItem;
  removeItem;
  clear;
}
*/
@js.native
trait StatusBar extends js.Object {
  var isVisible: Boolean = js.native
  def backgroundColorByHexString(hexString: String): Unit = js.native
  def backgroundColorByName(colorname: String): Unit = js.native
  def hide(): Unit = js.native
  def overlaysWebView(doOverlay: Boolean): Unit = js.native
  def show(): Unit = js.native
  def styleBlackOpaque(): Unit = js.native
  def styleBlackTranslucent(): Unit = js.native
  def styleDefault(): Unit = js.native
  def styleLightContent(): Unit = js.native
}

@JSGlobal("StatusBar")
@js.native
object StatusBar extends TopLevel[StatusBar]

