package typingsSlinky.apolloClient.watchQueryOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.apolloClient.apolloClientStrings.none
  - typingsSlinky.apolloClient.apolloClientStrings.ignore
  - typingsSlinky.apolloClient.apolloClientStrings.all
*/
trait ErrorPolicy extends js.Object

object ErrorPolicy {
  @scala.inline
  def all: typingsSlinky.apolloClient.apolloClientStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ignore: typingsSlinky.apolloClient.apolloClientStrings.ignore = this.cast("ignore")
  @scala.inline
  def none: typingsSlinky.apolloClient.apolloClientStrings.none = this.cast("none")
}

