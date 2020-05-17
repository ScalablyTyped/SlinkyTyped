package typingsSlinky.domMediacaptureRecord

import org.scalajs.dom.raw.Blob
import typingsSlinky.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlobEvent extends Event {
  val data: Blob = js.native
  val timecode: Double = js.native
}

