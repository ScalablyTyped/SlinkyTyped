package typingsSlinky.domMediacaptureRecord

import org.scalajs.dom.raw.Blob
import typingsSlinky.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlobEvent extends Event {
  
  val data: Blob = js.native
  
  val timecode: Double = js.native
}
