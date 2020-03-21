package typingsSlinky.linkifyjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.linkifyjs.linkifyjsStrings.url
  - typingsSlinky.linkifyjs.linkifyjsStrings.email
  - typingsSlinky.linkifyjs.linkifyjsStrings.hashtag
  - typingsSlinky.linkifyjs.linkifyjsStrings.mention
*/
trait LinkEntityType extends js.Object

object LinkEntityType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def email: typingsSlinky.linkifyjs.linkifyjsStrings.email = this.cast("email")
  @scala.inline
  def hashtag: typingsSlinky.linkifyjs.linkifyjsStrings.hashtag = this.cast("hashtag")
  @scala.inline
  def mention: typingsSlinky.linkifyjs.linkifyjsStrings.mention = this.cast("mention")
  @scala.inline
  def url: typingsSlinky.linkifyjs.linkifyjsStrings.url = this.cast("url")
}

