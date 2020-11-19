package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.aborted
import typingsSlinky.electron.electronStrings.data
import typingsSlinky.electron.electronStrings.end
import typingsSlinky.electron.electronStrings.error
import typingsSlinky.node.Buffer
import typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncomingMessage extends EventEmitter {
  
  @JSName("addListener")
  def addListener_aborted(event: aborted, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_data(event: data, listener: js.Function1[/* chunk */ Buffer, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_end(event: end, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function): this.type = js.native
  
  var headers: Record[String, js.Array[String]] = js.native
  
  var httpVersion: String = js.native
  
  var httpVersionMajor: Double = js.native
  
  var httpVersionMinor: Double = js.native
  
  // Docs: http://electronjs.org/docs/api/incoming-message
  /**
    * Emitted when a request has been canceled during an ongoing HTTP transaction.
    */
  @JSName("on")
  def on_aborted(event: aborted, listener: js.Function): this.type = js.native
  /**
    * The `data` event is the usual method of transferring response data into
    * applicative code.
    */
  @JSName("on")
  def on_data(event: data, listener: js.Function1[/* chunk */ Buffer, Unit]): this.type = js.native
  /**
    * Indicates that response body has ended.
    */
  @JSName("on")
  def on_end(event: end, listener: js.Function): this.type = js.native
  /**
    * Returns:
    *
    * `error` Error - Typically holds an error string identifying failure root cause.
    *
    * Emitted when an error was encountered while streaming response data events. For
    * instance, if the server closes the underlying while the response is still
    * streaming, an `error` event will be emitted on the response object and a `close`
    * event will subsequently follow on the request object.
    */
  @JSName("on")
  def on_error(event: error, listener: js.Function): this.type = js.native
  
  @JSName("once")
  def once_aborted(event: aborted, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_data(event: data, listener: js.Function1[/* chunk */ Buffer, Unit]): this.type = js.native
  @JSName("once")
  def once_end(event: end, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function): this.type = js.native
  
  @JSName("removeListener")
  def removeListener_aborted(event: aborted, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_data(event: data, listener: js.Function1[/* chunk */ Buffer, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_end(event: end, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(event: error, listener: js.Function): this.type = js.native
  
  var statusCode: Double = js.native
  
  var statusMessage: String = js.native
}
