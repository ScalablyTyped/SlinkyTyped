package typingsSlinky.qIo.Qio

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reader extends ForEach {
  
  def close(): Unit = js.native
  
  var node: ReadableStream = js.native
  
  def read(): Promise[Buffer] = js.native
  def read(charset: String): Promise[String] = js.native
}
