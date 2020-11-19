package typingsSlinky.restify.mod.bunyan

import typingsSlinky.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Bunyan stream to capture records in a ring buffer and only pass through
  * on a higher-level record. E.g. buffer up all records but only dump when
  * getting a WARN or above.
  */
@JSImport("restify", "bunyan.RequestCaptureStream")
@js.native
class RequestCaptureStream protected () extends Stream {
  def this(opts: RequestCaptureOptions) = this()
  
  /** write to the stream */
  def write(record: js.Any): Unit = js.native
}
