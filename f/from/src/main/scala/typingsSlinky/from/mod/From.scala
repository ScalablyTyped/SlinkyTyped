package typingsSlinky.from.mod

import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait From extends js.Object {
  
  def apply(chunks: js.Array[_]): ReadableStream = js.native
  def apply(getChunk: js.Function2[/* count */ Double, /* next */ js.Function0[_], _]): ReadableStream = js.native
  
  def emit(`type`: String, data: js.Any): Unit = js.native
}
