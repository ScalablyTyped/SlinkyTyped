package typingsSlinky.papaparse.mod

import org.scalajs.dom.raw.File
import typingsSlinky.node.NodeJS.ReadWriteStream
import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("papaparse", "parse")
@js.native
object parse extends js.Object {
  
  def apply(stream: NODE_STREAM_INPUT_TYPE): ReadWriteStream = js.native
  def apply(stream: NODE_STREAM_INPUT_TYPE, config: ParseConfig[_]): ReadWriteStream = js.native
  def apply[T](input: String): ParseResult[T] = js.native
  def apply[T](input: String, config: ParseConfig[T]): ParseResult[T] = js.native
  def apply[T](input: ReadableStream): ParseResult[T] = js.native
  def apply[T](input: ReadableStream, config: ParseConfig[T]): ParseResult[T] = js.native
  def apply[T](input: File): ParseResult[T] = js.native
  def apply[T](input: File, config: ParseConfig[T]): ParseResult[T] = js.native
}
