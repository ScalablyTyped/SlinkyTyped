package typingsSlinky.got.mod

import typingsSlinky.node.httpsMod.RequestOptions
import typingsSlinky.node.urlMod.URL_
import typingsSlinky.node.urlMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.httpsMod.RequestOptions
  - typingsSlinky.node.urlMod.Url
  - typingsSlinky.node.urlMod.URL_
*/
trait GotUrl extends js.Object

object GotUrl {
  @scala.inline
  implicit def apply(value: RequestOptions): GotUrl = value.asInstanceOf[GotUrl]
  @scala.inline
  implicit def apply(value: String): GotUrl = value.asInstanceOf[GotUrl]
  @scala.inline
  implicit def apply(value: URL_): GotUrl = value.asInstanceOf[GotUrl]
  @scala.inline
  implicit def apply(value: Url): GotUrl = value.asInstanceOf[GotUrl]
}

