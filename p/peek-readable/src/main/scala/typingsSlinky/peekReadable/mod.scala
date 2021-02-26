package typingsSlinky.peekReadable

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("peek-readable", "EndOfStreamError")
  @js.native
  class EndOfStreamError ()
    extends typingsSlinky.peekReadable.endOfFileStreamMod.EndOfStreamError
  
  @JSImport("peek-readable", "StreamReader")
  @js.native
  class StreamReader protected () extends StObject {
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
    
    def peek(buffer: js.typedarray.Uint8Array, offset: Double, length: Double): js.Promise[Double] = js.native
    /**
      * Read ahead (peek) from stream. Subsequent read or peeks will return the same data
      * @param buffer - Buffer to store data read from stream in
      * @param offset - Offset buffer
      * @param length - Number of bytes to read
      * @returns Number of bytes peeked
      */
    def peek(buffer: Buffer, offset: Double, length: Double): js.Promise[Double] = js.native
    
    /**
      * Store peeked data
      * @type {Array}
      */
    var peekQueue: js.Any = js.native
    
    def read(buffer: js.typedarray.Uint8Array, offset: Double, length: Double): js.Promise[Double] = js.native
    /**
      * Read chunk from stream
      * @param buffer - Target buffer to store data read from stream in
      * @param offset - Offset of target buffer
      * @param length - Number of bytes to read
      * @returns Number of bytes read
      */
    def read(buffer: Buffer, offset: Double, length: Double): js.Promise[Double] = js.native
    
    var reject: js.Any = js.native
    
    /**
      * Deferred read request
      */
    var request: js.Any = js.native
    
    var s: js.Any = js.native
    
    var tryRead: js.Any = js.native
  }
}
