package typingsSlinky.node.streamMod

import typingsSlinky.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stream", "Transform")
@js.native
class Transform () extends Duplex {
  def this(opts: TransformOptions) = this()
  
  def _flush(callback: TransformCallback): Unit = js.native
  
  def _transform(chunk: js.Any, encoding: BufferEncoding, callback: TransformCallback): Unit = js.native
}
