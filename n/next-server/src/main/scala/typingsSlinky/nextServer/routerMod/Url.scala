package typingsSlinky.nextServer.routerMod

import typingsSlinky.node.urlMod.UrlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.urlMod.UrlObject
  - java.lang.String
*/
trait Url extends js.Object

object Url {
  @scala.inline
  implicit def apply(value: String): Url = value.asInstanceOf[Url]
  @scala.inline
  implicit def apply(value: UrlObject): Url = value.asInstanceOf[Url]
}

