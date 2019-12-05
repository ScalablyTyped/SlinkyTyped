package typingsSlinky.ccaptureDotJs

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ccaptureDotJs.CCapture.Settings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CCapture")
@js.native
class CCapture_ protected () extends js.Object {
  def this(settings: Settings) = this()
  def capture(canvas: HTMLElement): Unit = js.native
  def save(): Unit = js.native
  def save(cb: js.Function1[/* blob */ Blob, Unit]): Unit = js.native
  def start(): Unit = js.native
  def stop(): Unit = js.native
}

