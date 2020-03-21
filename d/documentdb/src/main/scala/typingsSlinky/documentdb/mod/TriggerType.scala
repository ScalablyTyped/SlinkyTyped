package typingsSlinky.documentdb.mod

import typingsSlinky.documentdb.documentdbStrings.post_
import typingsSlinky.documentdb.documentdbStrings.pre_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.documentdb.documentdbStrings.Pre
  - typingsSlinky.documentdb.documentdbStrings.Post
  - typingsSlinky.documentdb.documentdbStrings.pre_
  - typingsSlinky.documentdb.documentdbStrings.post_
*/
trait TriggerType extends js.Object

object TriggerType {
  @scala.inline
  def Post: typingsSlinky.documentdb.documentdbStrings.Post = this.cast("Post")
  @scala.inline
  def Pre: typingsSlinky.documentdb.documentdbStrings.Pre = this.cast("Pre")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def post: post_ = this.cast("post")
  @scala.inline
  def pre: pre_ = this.cast("pre")
}

