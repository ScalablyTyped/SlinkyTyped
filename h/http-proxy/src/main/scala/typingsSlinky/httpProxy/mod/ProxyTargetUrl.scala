package typingsSlinky.httpProxy.mod

import typingsSlinky.httpProxy.anon.PartialUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.httpProxy.anon.PartialUrl
*/
trait ProxyTargetUrl extends ProxyTarget

object ProxyTargetUrl {
  @scala.inline
  implicit def apply(value: PartialUrl): ProxyTargetUrl = value.asInstanceOf[ProxyTargetUrl]
  @scala.inline
  implicit def apply(value: String): ProxyTargetUrl = value.asInstanceOf[ProxyTargetUrl]
}

