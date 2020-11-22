package typingsSlinky.maximMazurokGapiClientStreetviewpublish

import typingsSlinky.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish.PhotoResource
import typingsSlinky.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish.PhotosResource
import typingsSlinky.maximMazurokGapiClientStreetviewpublish.maximMazurokGapiClientStreetviewpublishStrings.streetviewpublish
import typingsSlinky.maximMazurokGapiClientStreetviewpublish.maximMazurokGapiClientStreetviewpublishStrings.v1
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
      
      /** Load Street View Publish API v1 */
      def load(name: streetviewpublish, version: v1): js.Thenable[Unit] = js.native
      def load(name: streetviewpublish, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object streetviewpublish extends js.Object {
        
        val photo: PhotoResource = js.native
        
        val photos: PhotosResource = js.native
      }
    }
  }
}
