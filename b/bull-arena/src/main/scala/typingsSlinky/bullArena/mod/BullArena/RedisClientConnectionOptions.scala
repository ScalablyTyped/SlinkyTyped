package typingsSlinky.bullArena.mod.BullArena

import typingsSlinky.redis.mod.ClientOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedisClientConnectionOptions extends ConnectionOptions {
  
  var redis: ClientOpts = js.native
}
object RedisClientConnectionOptions {
  
  @scala.inline
  def apply(redis: ClientOpts): RedisClientConnectionOptions = {
    val __obj = js.Dynamic.literal(redis = redis.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedisClientConnectionOptions]
  }
  
  @scala.inline
  implicit class RedisClientConnectionOptionsOps[Self <: RedisClientConnectionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRedis(value: ClientOpts): Self = this.set("redis", value.asInstanceOf[js.Any])
  }
}
