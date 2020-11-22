package typingsSlinky.maximMazurokGapiClientIap

import typingsSlinky.maximMazurokGapiClientIap.gapi.client.iap.ProjectsResource
import typingsSlinky.maximMazurokGapiClientIap.gapi.client.iap.V1Resource
import typingsSlinky.maximMazurokGapiClientIap.maximMazurokGapiClientIapStrings.iap
import typingsSlinky.maximMazurokGapiClientIap.maximMazurokGapiClientIapStrings.v1
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
      
      /** Load Cloud Identity-Aware Proxy API v1 */
      def load(name: iap, version: v1): js.Thenable[Unit] = js.native
      def load(name: iap, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object iap extends js.Object {
        
        val projects: ProjectsResource = js.native
        
        val v1: V1Resource = js.native
      }
    }
  }
}
