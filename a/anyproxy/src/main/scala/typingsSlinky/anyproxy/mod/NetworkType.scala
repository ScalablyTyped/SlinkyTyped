package typingsSlinky.anyproxy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.anyproxy.anyproxyStrings.http
  - typingsSlinky.anyproxy.anyproxyStrings.https
*/
trait NetworkType extends js.Object

object NetworkType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def http: typingsSlinky.anyproxy.anyproxyStrings.http = this.cast("http")
  @scala.inline
  def https: typingsSlinky.anyproxy.anyproxyStrings.https = this.cast("https")
}

