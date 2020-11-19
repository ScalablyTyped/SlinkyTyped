package typingsSlinky.bullArena.mod.BullArena

import typingsSlinky.redis.mod.ClientOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.bullArena.mod.BullArena.PortHostConnectionOptions
  - typingsSlinky.bullArena.mod.BullArena.RedisUrlConnectionOptions
  - typingsSlinky.bullArena.mod.BullArena.RedisClientConnectionOptions
*/
trait ConnectionOptions extends js.Object
object ConnectionOptions {
  
  @scala.inline
  def PortHostConnectionOptions(host: String): ConnectionOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
  
  @scala.inline
  def RedisUrlConnectionOptions(url: String): ConnectionOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
  
  @scala.inline
  def RedisClientConnectionOptions(redis: ClientOpts): ConnectionOptions = {
    val __obj = js.Dynamic.literal(redis = redis.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
}
