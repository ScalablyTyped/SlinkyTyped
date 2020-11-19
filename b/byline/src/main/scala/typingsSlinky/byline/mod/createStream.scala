package typingsSlinky.byline.mod

import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("byline", "createStream")
@js.native
object createStream extends js.Object {
  
  def apply(): LineStream = js.native
  def apply(stream: ReadableStream): LineStream = js.native
  def apply(stream: ReadableStream, options: LineStreamOptions): LineStream = js.native
}
