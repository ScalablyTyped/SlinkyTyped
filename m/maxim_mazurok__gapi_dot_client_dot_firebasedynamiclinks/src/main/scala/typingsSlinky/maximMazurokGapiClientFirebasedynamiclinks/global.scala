package typingsSlinky.maximMazurokGapiClientFirebasedynamiclinks

import typingsSlinky.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks.ManagedShortLinksResource
import typingsSlinky.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks.ShortLinksResource
import typingsSlinky.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks.V1Resource
import typingsSlinky.maximMazurokGapiClientFirebasedynamiclinks.maximMazurokGapiClientFirebasedynamiclinksStrings.firebasedynamiclinks
import typingsSlinky.maximMazurokGapiClientFirebasedynamiclinks.maximMazurokGapiClientFirebasedynamiclinksStrings.v1
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
      
      /** Load Firebase Dynamic Links API v1 */
      def load(name: firebasedynamiclinks, version: v1): js.Thenable[Unit] = js.native
      def load(name: firebasedynamiclinks, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object firebasedynamiclinks extends js.Object {
        
        val managedShortLinks: ManagedShortLinksResource = js.native
        
        val shortLinks: ShortLinksResource = js.native
        
        val v1: V1Resource = js.native
      }
    }
  }
}
