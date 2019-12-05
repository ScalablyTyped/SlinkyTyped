package typingsSlinky.needle.needleMod.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.needle.needleStrings.delete
  - typings.needle.needleStrings.patch
  - typings.needle.needleStrings.post
  - typings.needle.needleStrings.put
*/
trait NeedleReadWriteHttpVerbs extends js.Object

object NeedleReadWriteHttpVerbs {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete: typingsSlinky.needle.needleStrings.delete = this.cast("delete")
  @scala.inline
  def patch: typingsSlinky.needle.needleStrings.patch = this.cast("patch")
  @scala.inline
  def post: typingsSlinky.needle.needleStrings.post = this.cast("post")
  @scala.inline
  def put: typingsSlinky.needle.needleStrings.put = this.cast("put")
}

