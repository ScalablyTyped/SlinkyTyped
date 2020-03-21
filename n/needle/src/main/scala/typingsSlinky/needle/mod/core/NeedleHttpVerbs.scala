package typingsSlinky.needle.mod.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.needle.needleStrings.get
  - typingsSlinky.needle.needleStrings.head
  - typingsSlinky.needle.needleStrings.delete
  - typingsSlinky.needle.needleStrings.patch
  - typingsSlinky.needle.needleStrings.post
  - typingsSlinky.needle.needleStrings.put
*/
trait NeedleHttpVerbs extends js.Object

object NeedleHttpVerbs {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete: typingsSlinky.needle.needleStrings.delete = this.cast("delete")
  @scala.inline
  def get: typingsSlinky.needle.needleStrings.get = this.cast("get")
  @scala.inline
  def head: typingsSlinky.needle.needleStrings.head = this.cast("head")
  @scala.inline
  def patch: typingsSlinky.needle.needleStrings.patch = this.cast("patch")
  @scala.inline
  def post: typingsSlinky.needle.needleStrings.post = this.cast("post")
  @scala.inline
  def put: typingsSlinky.needle.needleStrings.put = this.cast("put")
}

