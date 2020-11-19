package typingsSlinky.easyXapiSupertest.streamMod

import typingsSlinky.easyXapiSupertest.NodeJS.ReadableStream
import typingsSlinky.easyXapiSupertest.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stream", "Readable")
@js.native
class Readable ()
  extends EventEmitter
     with ReadableStream {
  def this(opts: ReadableOptions) = this()
  
  def _read(size: Double): Unit = js.native
  
  def push(chunk: js.Any): Boolean = js.native
  def push(chunk: js.Any, encoding: String): Boolean = js.native
}
