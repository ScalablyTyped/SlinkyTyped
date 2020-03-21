package typingsSlinky.readableStream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _Readable
  extends typingsSlinky.node.streamMod.Readable {
  // static ReadableState: _Readable.ReadableState;
  var _readableState: ReadableState = js.native
  def _undestroy(): Unit = js.native
  def destroy(err: js.Error, callback: js.Function1[/* error */ js.Error | Null, Unit]): this.type = js.native
}

