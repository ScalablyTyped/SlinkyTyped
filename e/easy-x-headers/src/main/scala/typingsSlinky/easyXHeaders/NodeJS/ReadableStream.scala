package typingsSlinky.easyXHeaders.NodeJS

import typingsSlinky.easyXHeaders.anon.End
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadableStream extends EventEmitter {
  
  def pause(): Unit = js.native
  
  def pipe[T /* <: WritableStream */](destination: T): T = js.native
  def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
  
  def read(): String | Buffer = js.native
  def read(size: Double): String | Buffer = js.native
  
  var readable: Boolean = js.native
  
  def resume(): Unit = js.native
  
  def setEncoding(encoding: String): Unit = js.native
  
  def unpipe[T /* <: WritableStream */](): Unit = js.native
  def unpipe[T /* <: WritableStream */](destination: T): Unit = js.native
  
  def unshift(chunk: String): Unit = js.native
  def unshift(chunk: Buffer): Unit = js.native
  
  def wrap(oldStream: ReadableStream): ReadableStream = js.native
}
