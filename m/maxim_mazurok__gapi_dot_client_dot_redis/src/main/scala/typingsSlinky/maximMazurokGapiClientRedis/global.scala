package typingsSlinky.maximMazurokGapiClientRedis

import typingsSlinky.maximMazurokGapiClientRedis.gapi.client.redis.ProjectsResource
import typingsSlinky.maximMazurokGapiClientRedis.maximMazurokGapiClientRedisStrings.redis
import typingsSlinky.maximMazurokGapiClientRedis.maximMazurokGapiClientRedisStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Google Cloud Memorystore for Redis API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: redis, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: redis, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object redis {
        
        @JSGlobal("gapi.client.redis.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
