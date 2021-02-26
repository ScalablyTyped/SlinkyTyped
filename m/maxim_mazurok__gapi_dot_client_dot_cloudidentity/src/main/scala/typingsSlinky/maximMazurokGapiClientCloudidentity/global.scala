package typingsSlinky.maximMazurokGapiClientCloudidentity

import typingsSlinky.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity.DevicesResource
import typingsSlinky.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity.GroupsResource
import typingsSlinky.maximMazurokGapiClientCloudidentity.maximMazurokGapiClientCloudidentityStrings.cloudidentity
import typingsSlinky.maximMazurokGapiClientCloudidentity.maximMazurokGapiClientCloudidentityStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object cloudidentity {
        
        @JSGlobal("gapi.client.cloudidentity.devices")
        @js.native
        val devices: DevicesResource = js.native
        
        @JSGlobal("gapi.client.cloudidentity.groups")
        @js.native
        val groups: GroupsResource = js.native
      }
      
      /** Load Cloud Identity API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: cloudidentity, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: cloudidentity, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
