package typingsSlinky.k6.encodingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.k6.k6Strings.std
  - typingsSlinky.k6.k6Strings.rawstd
  - typingsSlinky.k6.k6Strings.url
  - typingsSlinky.k6.k6Strings.rawurl
*/
trait Base64Variant extends js.Object

object Base64Variant {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def rawstd: typingsSlinky.k6.k6Strings.rawstd = this.cast("rawstd")
  @scala.inline
  def rawurl: typingsSlinky.k6.k6Strings.rawurl = this.cast("rawurl")
  @scala.inline
  def std: typingsSlinky.k6.k6Strings.std = this.cast("std")
  @scala.inline
  def url: typingsSlinky.k6.k6Strings.url = this.cast("url")
}

