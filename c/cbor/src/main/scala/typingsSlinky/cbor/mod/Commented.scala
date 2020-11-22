package typingsSlinky.cbor.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cbor", "Commented")
@js.native
class Commented () extends Transform {
  def this(options: CommentedOptions) = this()
}
/* static members */
@JSImport("cbor", "Commented")
@js.native
object Commented extends js.Object {
  
  def comment(input: String): js.Promise[String] = js.native
  def comment(input: String, cb: commentCallback): Unit = js.native
  def comment(input: String, options: String): js.Promise[String] = js.native
  def comment(input: String, options: String, cb: commentCallback): Unit = js.native
  def comment(input: String, options: CommentOptions): js.Promise[String] = js.native
  def comment(input: String, options: CommentOptions, cb: commentCallback): Unit = js.native
  def comment(input: Buffer): js.Promise[String] = js.native
  def comment(input: Buffer, cb: commentCallback): Unit = js.native
  def comment(input: Buffer, options: String): js.Promise[String] = js.native
  def comment(input: Buffer, options: String, cb: commentCallback): Unit = js.native
  def comment(input: Buffer, options: CommentOptions): js.Promise[String] = js.native
  def comment(input: Buffer, options: CommentOptions, cb: commentCallback): Unit = js.native
  def comment(input: js.typedarray.ArrayBufferView): js.Promise[String] = js.native
  def comment(input: js.typedarray.ArrayBufferView, cb: commentCallback): Unit = js.native
  def comment(input: js.typedarray.ArrayBufferView, options: String): js.Promise[String] = js.native
  def comment(input: js.typedarray.ArrayBufferView, options: String, cb: commentCallback): Unit = js.native
  def comment(input: js.typedarray.ArrayBufferView, options: CommentOptions): js.Promise[String] = js.native
  def comment(input: js.typedarray.ArrayBufferView, options: CommentOptions, cb: commentCallback): Unit = js.native
}
