package typingsSlinky.expressRedisCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typingsSlinky.expressRedisCache.mod.ExpirationConfig
*/
trait ExpireOption extends js.Object

object ExpireOption {
  @scala.inline
  implicit def apply(value: Double): ExpireOption = value.asInstanceOf[ExpireOption]
  @scala.inline
  implicit def apply(value: ExpirationConfig): ExpireOption = value.asInstanceOf[ExpireOption]
}

