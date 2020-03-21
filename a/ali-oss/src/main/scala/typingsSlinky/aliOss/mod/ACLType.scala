package typingsSlinky.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.aliOss.aliOssStrings.`public-read-write`
  - typingsSlinky.aliOss.aliOssStrings.`public-read`
  - typingsSlinky.aliOss.aliOssStrings.`private`
*/
trait ACLType extends js.Object

object ACLType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `private`: typingsSlinky.aliOss.aliOssStrings.`private` = this.cast("private")
  @scala.inline
  def `public-read`: typingsSlinky.aliOss.aliOssStrings.`public-read` = this.cast("public-read")
  @scala.inline
  def `public-read-write`: typingsSlinky.aliOss.aliOssStrings.`public-read-write` = this.cast("public-read-write")
}

