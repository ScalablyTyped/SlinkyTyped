package typingsSlinky.readableStream.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("readable-stream", "Writable")
@js.native
class Writable ()
  extends typingsSlinky.node.streamMod.Writable {
  def this(options: WritableOptions) = this()
  
  def _undestroy(): Unit = js.native
  
  var _writableState: WritableState = js.native
  
  def destroy(
    error: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
  ): this.type = js.native
  def destroy(error: js.Error, callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): this.type = js.native
}
