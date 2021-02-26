package typingsSlinky.pgProtocol

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBufferWriterMod {
  
  @JSImport("pg-protocol/dist/BufferWriter", "Writer")
  @js.native
  class Writer () extends StObject {
    def this(size: Double) = this()
    
    var _ensure: js.Any = js.native
    
    def add(otherBuffer: Buffer): Writer = js.native
    
    def addCString(string: String): Writer = js.native
    
    def addChar(c: String): Writer = js.native
    
    def addHeader(code: Double): Unit = js.native
    def addHeader(code: Double, last: Boolean): Unit = js.native
    
    def addInt16(num: Double): Writer = js.native
    
    def addInt32(num: Double): Writer = js.native
    
    def addString(): Writer = js.native
    def addString(string: String): Writer = js.native
    
    var buffer: js.Any = js.native
    
    def clear(): Unit = js.native
    
    val encoding: js.Any = js.native
    
    def flush(): Buffer = js.native
    def flush(code: Double): Buffer = js.native
    
    def getByteLength(): Double = js.native
    
    var headerPosition: js.Any = js.native
    
    def join(): Buffer = js.native
    def join(code: Double): Buffer = js.native
    
    var offset: js.Any = js.native
  }
}
