package typingsSlinky.redisErrors

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redis-errors", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class AbortError () extends Error {
    
    var args: js.UndefOr[js.Array[_]] = js.native
    
    var command: js.UndefOr[String] = js.native
  }
  
  @js.native
  class InterruptError () extends Error {
    
    var args: js.UndefOr[js.Array[_]] = js.native
    
    var command: js.UndefOr[String] = js.native
    
    var origin: js.Error = js.native
  }
  
  @js.native
  class ParserError protected () extends Error {
    def this(message: String, buffer: String, offset: Double) = this()
    
    var buffer: String = js.native
    
    var offset: Double = js.native
  }
  
  @js.native
  class RedisError () extends Error
  
  @js.native
  class ReplyError protected () extends Error {
    def this(message: String) = this()
    
    var args: js.UndefOr[js.Array[_]] = js.native
    
    var code: js.UndefOr[String] = js.native
    
    var command: js.UndefOr[String] = js.native
  }
}
