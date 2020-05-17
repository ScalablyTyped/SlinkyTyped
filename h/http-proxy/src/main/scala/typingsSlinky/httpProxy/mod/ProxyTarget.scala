package typingsSlinky.httpProxy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.httpProxy.mod.ProxyTargetUrl
  - typingsSlinky.httpProxy.mod.ProxyTargetDetailed
*/
trait ProxyTarget extends js.Object

object ProxyTarget {
  @scala.inline
  implicit def apply(value: ProxyTargetDetailed): ProxyTarget = value.asInstanceOf[ProxyTarget]
  @scala.inline
  implicit def apply(value: ProxyTargetUrl): ProxyTarget = value.asInstanceOf[ProxyTarget]
}

