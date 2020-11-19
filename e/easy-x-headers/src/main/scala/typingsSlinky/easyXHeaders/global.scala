package typingsSlinky.easyXHeaders

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.easyXHeaders.NodeJS.Global
import typingsSlinky.easyXHeaders.NodeJS.Process
import typingsSlinky.easyXHeaders.NodeJS.Timer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  def clearImmediate(immediateId: js.Any): Unit = js.native
  
  def clearInterval(intervalId: Timer): Unit = js.native
  
  def clearTimeout(timeoutId: Timer): Unit = js.native
  
  @JSName("__dirname")
  var dirname: String = js.native
  
  // Same as module.exports
  var exports: js.Any = js.native
  
  @JSName("__filename")
  var filename: String = js.native
  
  var global: Global = js.native
  
  var process: Process = js.native
  
  def setImmediate(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): js.Any = js.native
  
  def setInterval(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timer = js.native
  
  def setTimeout(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timer = js.native
  
  @js.native
  class Buffer protected ()
    extends typingsSlinky.node.Buffer {
    /**
      * Allocates a new buffer containing the given {array} of octets.
      *
      * @param array The octets to store.
      */
    def this(array: js.Array[_]) = this()
    /**
      * Allocates a new buffer containing the given {array} of octets.
      *
      * @param array The octets to store.
      */
    def this(array: js.typedarray.Uint8Array) = this()
    /**
      * Allocates a new buffer of {size} octets.
      *
      * @param size count of octets to allocate.
      */
    def this(size: Double) = this()
    /**
      * Allocates a new buffer containing the given {str}.
      *
      * @param str String to store in buffer.
      * @param encoding encoding to use, optional.  Default is 'utf8'
      */
    def this(str: String) = this()
    def this(str: String, encoding: String) = this()
  }
  /**
    * Raw data is stored in instances of the Buffer class.
    * A Buffer is similar to an array of integers but corresponds to a raw memory allocation outside the V8 heap.  A Buffer cannot be resized.
    * Valid string encodings: 'ascii'|'utf8'|'utf16le'|'ucs2'(alias of 'utf16le')|'base64'|'binary'(deprecated)|'hex'
    */
  @js.native
  object Buffer
    extends Instantiable1[
          (/* array */ js.Array[js.Any]) | (/* size */ Double) | (/* str */ String) | (/* size */ js.typedarray.Uint8Array), 
          typingsSlinky.node.Buffer
        ]
       with Instantiable2[/* str */ String, /* encoding */ String, typingsSlinky.node.Buffer] {
    
    /**
      * Gives the actual byte length of a string. encoding defaults to 'utf8'.
      * This is not the same as String.prototype.length since that returns the number of characters in a string.
      *
      * @param string string to test.
      * @param encoding encoding used to evaluate (defaults to 'utf8')
      */
    def byteLength(string: String): Double = js.native
    def byteLength(string: String, encoding: String): Double = js.native
    
    /**
      * The same as buf1.compare(buf2).
      */
    def compare(buf1: typingsSlinky.node.Buffer, buf2: typingsSlinky.node.Buffer): Double = js.native
    
    /**
      * Returns a buffer which is the result of concatenating all the buffers in the list together.
      *
      * If the list has no items, or if the totalLength is 0, then it returns a zero-length buffer.
      * If the list has exactly one item, then the first item of the list is returned.
      * If the list has more than one item, then a new Buffer is created.
      *
      * @param list An array of Buffer objects to concatenate
      * @param totalLength Total length of the buffers when concatenated.
      *   If totalLength is not provided, it is read from the buffers in the list. However, this adds an additional loop to the function, so it is faster to provide the length explicitly.
      */
    def concat(list: js.Array[typingsSlinky.node.Buffer]): typingsSlinky.node.Buffer = js.native
    def concat(list: js.Array[typingsSlinky.node.Buffer], totalLength: Double): typingsSlinky.node.Buffer = js.native
    
    /**
      * Returns true if {obj} is a Buffer
      *
      * @param obj object to test.
      */
    def isBuffer(obj: js.Any): Boolean = js.native
    
    /**
      * Returns true if {encoding} is a valid encoding argument.
      * Valid string encodings in Node 0.12: 'ascii'|'utf8'|'utf16le'|'ucs2'(alias of 'utf16le')|'base64'|'binary'(deprecated)|'hex'
      *
      * @param encoding string to test.
      */
    def isEncoding(encoding: String): Boolean = js.native
  }
  
  /************************************************
  *                                               *
  *               GLOBAL INTERFACES               *
  *                                               *
  ************************************************/
  @js.native
  object NodeJS extends js.Object
  
  @js.native
  class SlowBuffer protected ()
    extends typingsSlinky.node.Buffer {
    def this(array: js.Array[_]) = this()
    def this(size: Double) = this()
    def this(size: js.typedarray.Uint8Array) = this()
    def this(str: String) = this()
    def this(str: String, encoding: String) = this()
  }
  @js.native
  object SlowBuffer
    extends Instantiable1[
          (/* array */ js.Array[js.Any]) | (/* size */ Double) | (/* str */ String) | (/* size */ js.typedarray.Uint8Array), 
          typingsSlinky.node.Buffer
        ]
       with Instantiable2[/* str */ String, /* encoding */ String, typingsSlinky.node.Buffer] {
    
    def byteLength(string: String): Double = js.native
    def byteLength(string: String, encoding: String): Double = js.native
    
    def concat(list: js.Array[typingsSlinky.node.Buffer]): typingsSlinky.node.Buffer = js.native
    def concat(list: js.Array[typingsSlinky.node.Buffer], totalLength: Double): typingsSlinky.node.Buffer = js.native
    
    def isBuffer(obj: js.Any): Boolean = js.native
  }
  
  @js.native
  object module extends js.Object {
    
    var children: js.Array[_] = js.native
    
    var exports: js.Any = js.native
    
    var filename: String = js.native
    
    var id: String = js.native
    
    var loaded: Boolean = js.native
    
    var parent: js.Any = js.native
    
    def require(id: String): js.Any = js.native
  }
  
  @js.native
  object require extends js.Object {
    
    def apply(id: String): js.Any = js.native
    
    var cache: js.Any = js.native
    
    var extensions: js.Any = js.native
    
    var main: js.Any = js.native
    
    def resolve(id: String): String = js.native
  }
}
