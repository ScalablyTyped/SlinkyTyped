package typingsSlinky.peekReadable

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("peek-readable", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class EndOfStreamError ()
    extends typingsSlinky.peekReadable.endOfFileStreamMod.EndOfStreamError
  
  @js.native
  class StreamReader protected () extends js.Object {
    def this(s: Readable) = this()
    /**
      * Read chunk from stream
      * @param buffer Buffer to store data read from stream in
      * @param offset Offset buffer
      * @param length Number of bytes to read
      * @returns {any}
      */
    var _read: js.Any = js.native
    var endOfStream: js.Any = js.native
    /**
      * Store peeked data
      * @type {Array}
      */
    var peekQueue: js.Any = js.native
    var reject: js.Any = js.native
    /**
      * Deferred read request
      */
    var request: js.Any = js.native
    var s: js.Any = js.native
    var tryRead: js.Any = js.native
    /**
      * Read ahead (peek) from stream. Subsequent read or peeks will return the same data
      * @param buffer - Buffer to store data read from stream in
      * @param offset - Offset buffer
      * @param length - Number of bytes to read
      * @returns Number of bytes peeked
      */
    def peek(buffer: Buffer, offset: Double, length: Double): js.Promise[Double] = js.native
    def peek(buffer: js.typedarray.Uint8Array, offset: Double, length: Double): js.Promise[Double] = js.native
    /**
      * Read chunk from stream
      * @param buffer - Target buffer to store data read from stream in
      * @param offset - Offset of target buffer
      * @param length - Number of bytes to read
      * @returns Number of bytes read
      */
    def read(buffer: Buffer, offset: Double, length: Double): js.Promise[Double] = js.native
    def read(buffer: js.typedarray.Uint8Array, offset: Double, length: Double): js.Promise[Double] = js.native
  }
  
}

