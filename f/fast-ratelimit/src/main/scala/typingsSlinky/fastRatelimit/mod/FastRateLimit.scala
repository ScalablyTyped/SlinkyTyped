package typingsSlinky.fastRatelimit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fast-ratelimit", "FastRateLimit")
@js.native
class FastRateLimit protected () extends js.Object {
  /**
    * FastRateLimit constructor
    * @param options
    */
  def this(options: FastRateLimitOptions) = this()
  
  /**
    * FastRateLimit.prototype.consume
    */
  def consume(namespace: String): js.Promise[Unit] = js.native
  
  /**
    * FastRateLimit.prototype.consumeSync
    */
  def consumeSync(namespace: String): Boolean = js.native
  
  /**
    * FastRateLimit.prototype.hasToken
    */
  def hasToken(namespace: String): js.Promise[Unit] = js.native
  
  /**
    * FastRateLimit.prototype.hasTokenSync
    */
  def hasTokenSync(namespace: String): Boolean = js.native
}
