package typingsSlinky.maximMazurokGapiClientStreetviewpublish

import typingsSlinky.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish.PhotoResource
import typingsSlinky.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish.PhotosResource
import typingsSlinky.maximMazurokGapiClientStreetviewpublish.maximMazurokGapiClientStreetviewpublishStrings.streetviewpublish
import typingsSlinky.maximMazurokGapiClientStreetviewpublish.maximMazurokGapiClientStreetviewpublishStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Street View Publish API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: streetviewpublish, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: streetviewpublish, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object streetviewpublish {
        
        @JSGlobal("gapi.client.streetviewpublish.photo")
        @js.native
        val photo: PhotoResource = js.native
        
        @JSGlobal("gapi.client.streetviewpublish.photos")
        @js.native
        val photos: PhotosResource = js.native
      }
    }
  }
}
