package typingsSlinky.maximMazurokGapiClientSiteverification

import typingsSlinky.maximMazurokGapiClientSiteverification.gapi.client.siteverification.WebResourceResource
import typingsSlinky.maximMazurokGapiClientSiteverification.maximMazurokGapiClientSiteverificationStrings.siteverification
import typingsSlinky.maximMazurokGapiClientSiteverification.maximMazurokGapiClientSiteverificationStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Google Site Verification API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: siteverification, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: siteverification, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object siteverification {
        
        @JSGlobal("gapi.client.siteverification.webResource")
        @js.native
        val webResource: WebResourceResource = js.native
      }
    }
  }
}
