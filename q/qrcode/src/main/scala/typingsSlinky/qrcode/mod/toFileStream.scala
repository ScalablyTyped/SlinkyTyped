package typingsSlinky.qrcode.mod

import typingsSlinky.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("qrcode", "toFileStream")
@js.native
object toFileStream extends js.Object {
  
  def apply(stream: Writable, text: String): js.Promise[_] = js.native
  def apply(stream: Writable, text: String, callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
  def apply(stream: Writable, text: String, options: QRCodeToFileStreamOptions): js.Promise[_] = js.native
  def apply(
    stream: Writable,
    text: String,
    options: QRCodeToFileStreamOptions,
    callback: js.Function1[/* error */ js.Error, Unit]
  ): Unit = js.native
  def apply(stream: Writable, text: js.Array[QRCodeSegment]): js.Promise[_] = js.native
  def apply(
    stream: Writable,
    text: js.Array[QRCodeSegment],
    callback: js.Function1[/* error */ js.Error, Unit]
  ): Unit = js.native
  def apply(stream: Writable, text: js.Array[QRCodeSegment], options: QRCodeToFileStreamOptions): js.Promise[_] = js.native
  def apply(
    stream: Writable,
    text: js.Array[QRCodeSegment],
    options: QRCodeToFileStreamOptions,
    callback: js.Function1[/* error */ js.Error, Unit]
  ): Unit = js.native
}
