package typingsSlinky.maximMazurokGapiClientAndroidpublisher

import typingsSlinky.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher.EditsResource
import typingsSlinky.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher.InappproductsResource
import typingsSlinky.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher.InternalappsharingartifactsResource
import typingsSlinky.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher.OrdersResource
import typingsSlinky.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher.PurchasesResource
import typingsSlinky.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher.ReviewsResource
import typingsSlinky.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher.SystemapksResource
import typingsSlinky.maximMazurokGapiClientAndroidpublisher.maximMazurokGapiClientAndroidpublisherStrings.androidpublisher
import typingsSlinky.maximMazurokGapiClientAndroidpublisher.maximMazurokGapiClientAndroidpublisherStrings.v3
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
      
      /** Load Google Play Android Developer API v3 */
      def load(name: androidpublisher, version: v3): js.Thenable[Unit] = js.native
      def load(name: androidpublisher, version: v3, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object androidpublisher extends js.Object {
        
        val edits: EditsResource = js.native
        
        val inappproducts: InappproductsResource = js.native
        
        val internalappsharingartifacts: InternalappsharingartifactsResource = js.native
        
        val orders: OrdersResource = js.native
        
        val purchases: PurchasesResource = js.native
        
        val reviews: ReviewsResource = js.native
        
        val systemapks: SystemapksResource = js.native
      }
    }
  }
}
