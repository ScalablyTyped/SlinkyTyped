package typingsSlinky.easyXapiSupertest.streamMod

import typingsSlinky.easyXapiSupertest.NodeJS.ReadableStream
import typingsSlinky.easyXapiSupertest.NodeJS.WritableStream
import typingsSlinky.easyXapiSupertest.eventsMod.EventEmitter
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stream", "Transform")
@js.native
class Transform ()
  extends EventEmitter
     with ReadableStream
     with WritableStream {
  def this(opts: TransformOptions) = this()
  
  def _flush(callback: js.Function): Unit = js.native
  
  def _transform(chunk: String, encoding: String, callback: js.Function): Unit = js.native
  def _transform(chunk: Buffer, encoding: String, callback: js.Function): Unit = js.native
  
  def push(chunk: js.Any): Boolean = js.native
  def push(chunk: js.Any, encoding: String): Boolean = js.native
}
