package typingsSlinky.domDashMediacaptureDashRecord

import org.scalajs.dom.raw.Blob
import typingsSlinky.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BlobEvent")
@js.native
class BlobEvent protected () extends Event {
  def this(`type`: String, eventInitDict: BlobEventInit) = this()
  val data: Blob = js.native
  val timecode: Double = js.native
}

