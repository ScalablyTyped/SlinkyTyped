package typingsSlinky.readableStream.mod

import typingsSlinky.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ==== _stream_passthrough ====
@JSImport("readable-stream", "PassThrough")
@js.native
class PassThrough () extends Transform {
  def this(options: TransformOptions) = this()
  
  def _transform[T](
    chunk: T,
    encoding: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[T], Unit]
  ): Unit = js.native
  def _transform[T](
    chunk: T,
    encoding: String,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[T], Unit]
  ): Unit = js.native
  def _transform[T](
    chunk: T,
    encoding: Null,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[T], Unit]
  ): Unit = js.native
  def _transform[T](
    chunk: T,
    encoding: BufferEncoding,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[T], Unit]
  ): Unit = js.native
}
