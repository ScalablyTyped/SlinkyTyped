package typingsSlinky.cssFontLoadingModule.mod.global

import typingsSlinky.cssFontLoadingModule.mod.FontFaceSetLoadEventInit
import typingsSlinky.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FontFaceSetLoadEvent")
@js.native
class FontFaceSetLoadEvent protected () extends Event {
  def this(`type`: String) = this()
  def this(`type`: String, eventInitDict: FontFaceSetLoadEventInit) = this()
  val fontfaces: js.Array[FontFace] = js.native
}

