package typingsSlinky.maximMazurokGapiClientRedis

import typingsSlinky.maximMazurokGapiClientRedis.gapi.client.redis.ProjectsResource
import typingsSlinky.maximMazurokGapiClientRedis.maximMazurokGapiClientRedisStrings.redis
import typingsSlinky.maximMazurokGapiClientRedis.maximMazurokGapiClientRedisStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load Google Cloud Memorystore for Redis API v1 */
      def load(name: redis, version: v1): js.Thenable[Unit] = js.native
      def load(name: redis, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object redis extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
