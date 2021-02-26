package typingsSlinky.maximMazurokGapiClientFirebasedynamiclinks

import typingsSlinky.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks.ManagedShortLinksResource
import typingsSlinky.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks.ShortLinksResource
import typingsSlinky.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks.V1Resource
import typingsSlinky.maximMazurokGapiClientFirebasedynamiclinks.maximMazurokGapiClientFirebasedynamiclinksStrings.firebasedynamiclinks
import typingsSlinky.maximMazurokGapiClientFirebasedynamiclinks.maximMazurokGapiClientFirebasedynamiclinksStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object firebasedynamiclinks {
        
        @JSGlobal("gapi.client.firebasedynamiclinks.managedShortLinks")
        @js.native
        val managedShortLinks: ManagedShortLinksResource = js.native
        
        @JSGlobal("gapi.client.firebasedynamiclinks.shortLinks")
        @js.native
        val shortLinks: ShortLinksResource = js.native
        
        @JSGlobal("gapi.client.firebasedynamiclinks.v1")
        @js.native
        val v1: V1Resource = js.native
      }
      
      /** Load Firebase Dynamic Links API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: firebasedynamiclinks, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: firebasedynamiclinks, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
