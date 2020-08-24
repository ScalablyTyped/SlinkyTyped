package typingsSlinky.framebus

import typingsSlinky.framebus.typesMod.FramebusSubscriber
import typingsSlinky.framebus.typesMod.global.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("framebus/dist/lib/constants", JSImport.Namespace)
@js.native
object constantsMod extends js.Object {
  val childWindows: js.Array[Window] = js.native
  val prefix: /* "/ *framebus* /" */ String = js.native
  val subscribers: FramebusSubscriber = js.native
}

