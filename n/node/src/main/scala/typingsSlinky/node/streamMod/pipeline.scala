package typingsSlinky.node.streamMod

import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.NodeJS.ReadWriteStream
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stream", "pipeline")
@js.native
object pipeline extends js.Object {
  
  def apply(
    stream1: ReadableStream,
    stream2: ReadWriteStream,
    streams: (ReadWriteStream | WritableStream | (js.Function1[/* err */ ErrnoException | Null, Unit]))*
  ): WritableStream = js.native
  def apply(
    stream1: ReadableStream,
    stream2: WritableStream,
    streams: (ReadWriteStream | WritableStream | (js.Function1[/* err */ ErrnoException | Null, Unit]))*
  ): WritableStream = js.native
  def apply(streams: js.Array[ReadableStream | WritableStream | ReadWriteStream]): WritableStream = js.native
  def apply(
    streams: js.Array[ReadableStream | WritableStream | ReadWriteStream],
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): WritableStream = js.native
  def apply[T /* <: WritableStream */](stream1: ReadableStream, stream2: T): T = js.native
  def apply[T /* <: WritableStream */](stream1: ReadableStream, stream2: T, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): T = js.native
  def apply[T /* <: WritableStream */](stream1: ReadableStream, stream2: ReadWriteStream, stream3: T): T = js.native
  def apply[T /* <: WritableStream */](
    stream1: ReadableStream,
    stream2: ReadWriteStream,
    stream3: T,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): T = js.native
  def apply[T /* <: WritableStream */](stream1: ReadableStream, stream2: ReadWriteStream, stream3: ReadWriteStream, stream4: T): T = js.native
  def apply[T /* <: WritableStream */](
    stream1: ReadableStream,
    stream2: ReadWriteStream,
    stream3: ReadWriteStream,
    stream4: T,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): T = js.native
  def apply[T /* <: WritableStream */](
    stream1: ReadableStream,
    stream2: ReadWriteStream,
    stream3: ReadWriteStream,
    stream4: ReadWriteStream,
    stream5: T
  ): T = js.native
  def apply[T /* <: WritableStream */](
    stream1: ReadableStream,
    stream2: ReadWriteStream,
    stream3: ReadWriteStream,
    stream4: ReadWriteStream,
    stream5: T,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): T = js.native
}
