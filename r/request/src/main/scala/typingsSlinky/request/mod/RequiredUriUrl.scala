package typingsSlinky.request.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.request.mod.UriOptions
  - typingsSlinky.request.mod.UrlOptions
*/
trait RequiredUriUrl extends OptionalUriUrl

object RequiredUriUrl {
  @scala.inline
  implicit def apply(value: UriOptions): RequiredUriUrl = value.asInstanceOf[RequiredUriUrl]
  @scala.inline
  implicit def apply(value: UrlOptions): RequiredUriUrl = value.asInstanceOf[RequiredUriUrl]
}

