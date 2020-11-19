package typingsSlinky.rawBody.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.rawBody.anon.OptionsencodingEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raw-body", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(stream: Readable): js.Promise[Buffer] = js.native
  /**
    * Gets the entire buffer of a stream either as a `Buffer` or a string.
    * Validates the stream's length against an expected length and maximum
    * limit. Ideal for parsing request bodies.
    */
  def apply(stream: Readable, callback: js.Function2[/* err */ RawBodyError, /* body */ Buffer, Unit]): Unit = js.native
  def apply(stream: Readable, options: OptionsencodingEncoding): js.Promise[String] = js.native
  def apply(
    stream: Readable,
    options: OptionsencodingEncoding,
    callback: js.Function2[/* err */ RawBodyError, /* body */ String, Unit]
  ): Unit = js.native
  def apply(stream: Readable, options: Encoding): js.Promise[String] = js.native
  def apply(
    stream: Readable,
    options: Encoding,
    callback: js.Function2[/* err */ RawBodyError, /* body */ String, Unit]
  ): Unit = js.native
  def apply(stream: Readable, options: Options): js.Promise[Buffer] = js.native
  def apply(
    stream: Readable,
    options: Options,
    callback: js.Function2[/* err */ RawBodyError, /* body */ Buffer, Unit]
  ): Unit = js.native
}
