package typingsSlinky.redisMock

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.redis.mod.ClientOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redis-mock", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val Multi: Instantiable0[typingsSlinky.redis.mod.Multi] = js.native
  
  val RedisClient: Instantiable1[/* options */ ClientOpts, typingsSlinky.redis.mod.RedisClient] = js.native
  
  def createClient(): typingsSlinky.redis.mod.RedisClient = js.native
  def createClient(options: ClientOpts): typingsSlinky.redis.mod.RedisClient = js.native
  def createClient(port: Double): typingsSlinky.redis.mod.RedisClient = js.native
  def createClient(port: Double, host: js.UndefOr[scala.Nothing], options: ClientOpts): typingsSlinky.redis.mod.RedisClient = js.native
  def createClient(port: Double, host: String): typingsSlinky.redis.mod.RedisClient = js.native
  def createClient(port: Double, host: String, options: ClientOpts): typingsSlinky.redis.mod.RedisClient = js.native
  def createClient(unix_socket: String): typingsSlinky.redis.mod.RedisClient = js.native
  def createClient(unix_socket: String, options: ClientOpts): typingsSlinky.redis.mod.RedisClient = js.native
  
  @JSName("debug_mode")
  var debugMode: Boolean = js.native
  
  def print(err: Null, reply: js.Any): Unit = js.native
  def print(err: js.Error, reply: js.Any): Unit = js.native
  
  @js.native
  class AbortError ()
    extends typingsSlinky.redis.mod.AbortError
  
  @js.native
  class AggregateError ()
    extends typingsSlinky.redis.mod.AbortError
  
  @js.native
  class ParserError ()
    extends typingsSlinky.redis.mod.ParserError
  
  @js.native
  class RedisError ()
    extends typingsSlinky.redis.mod.RedisError
  
  @js.native
  class ReplyError ()
    extends typingsSlinky.redis.mod.ReplyError
}
