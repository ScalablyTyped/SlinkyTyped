package typingsSlinky.readableDashStream.readableDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("readable-stream", "Writable")
@js.native
class Writable ()
  extends typingsSlinky.node.streamMod.Writable {
  def this(options: WritableOptions) = this()
  var _writableState: WritableState = js.native
  def _undestroy(): Unit = js.native
  def destroy(error: js.Error): this.type = js.native
  def destroy(error: js.Error, callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): this.type = js.native
}

