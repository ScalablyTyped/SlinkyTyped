package typingsSlinky.androiduix.android.content

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.androiduix.android.app.Application
import typingsSlinky.androiduix.android.content.res.Resources
import typingsSlinky.androiduix.android.content.res.TypedArray
import typingsSlinky.androiduix.android.view.LayoutInflater
import typingsSlinky.androiduix.android.view.WindowManager
import typingsSlinky.androiduix.androidui.AndroidUI
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var androidUI: AndroidUI = js.native
  var mLayoutInflater: js.Any = js.native
  var mResources: js.Any = js.native
  def getApplicationContext(): Application = js.native
  def getLayoutInflater(): LayoutInflater = js.native
  def getResources(): Resources = js.native
  def getWindowManager(): WindowManager = js.native
  def obtainStyledAttributes(attrs: HTMLElement): TypedArray = js.native
  def obtainStyledAttributes(attrs: HTMLElement, defStyleAttr: Map[String, String]): TypedArray = js.native
}

