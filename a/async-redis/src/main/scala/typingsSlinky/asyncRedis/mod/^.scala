package typingsSlinky.asyncRedis.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.redis.mod.ClientOpts
import typingsSlinky.redis.mod.RedisClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("async-redis", JSImport.Namespace)
@js.native
class ^ () extends Promisified[RedisClient] {
  def this(options: ClientOpts) = this()
  def this(port: Double) = this()
  def this(unix_socket: String) = this()
  def this(port: Double, host: String) = this()
  def this(unix_socket: String, options: ClientOpts) = this()
  def this(port: Double, host: js.UndefOr[scala.Nothing], options: ClientOpts) = this()
  def this(port: Double, host: String, options: ClientOpts) = this()
}
@JSImport("async-redis", JSImport.Namespace)
@js.native
object ^ extends TopLevel[AsyncRedisConstructor]
