package typingsSlinky.fflate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fflate", "AsyncDecompress")
@js.native
/**
  * Creates an asynchronous decompression stream
  * @param cb The callback to call whenever data is decompressed
  */
class AsyncDecompress () extends js.Object {
  def this(cb: AsyncFlateStreamHandler) = this()
  
  var G: js.Any = js.native
  
  var I: js.Any = js.native
  
  var Z: js.Any = js.native
  
  /**
    * The handler to call whenever data is available
    */
  def ondata(err: js.Error, data: js.typedarray.Uint8Array, `final`: Boolean): Unit = js.native
  /**
    * The handler to call whenever data is available
    */
  @JSName("ondata")
  var ondata_Original: AsyncFlateStreamHandler = js.native
  
  /**
    * Pushes a chunk to be decompressed
    * @param chunk The chunk to push
    * @param final Whether this is the last chunk
    */
  def push(chunk: js.typedarray.Uint8Array): Unit = js.native
  def push(chunk: js.typedarray.Uint8Array, `final`: Boolean): Unit = js.native
}
