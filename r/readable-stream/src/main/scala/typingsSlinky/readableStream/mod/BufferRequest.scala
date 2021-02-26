package typingsSlinky.readableStream.mod

import typingsSlinky.node.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferRequest extends StObject {
  
  def callback(): Unit = js.native
  def callback(error: js.Error): Unit = js.native
  
  var chunk: js.Any = js.native
  
  // TODO
  var encoding: BufferEncoding = js.native
  
  var isBuf: Boolean = js.native
  
  var next: BufferRequest | Null = js.native
}
