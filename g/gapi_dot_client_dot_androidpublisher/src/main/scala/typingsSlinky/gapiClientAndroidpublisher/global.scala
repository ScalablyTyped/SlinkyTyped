package typingsSlinky.gapiClientAndroidpublisher

import typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher.EditsResource
import typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher.EntitlementsResource
import typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher.InappproductsResource
import typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher.PurchasesResource
import typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher.ReviewsResource
import typingsSlinky.gapiClientAndroidpublisher.gapiClientAndroidpublisherStrings.androidpublisher
import typingsSlinky.gapiClientAndroidpublisher.gapiClientAndroidpublisherStrings.v2
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
      
      val edits: EditsResource = js.native
      
      val entitlements: EntitlementsResource = js.native
      
      val inappproducts: InappproductsResource = js.native
      
      /** Load Google Play Developer API v2 */
      def load(name: androidpublisher, version: v2): js.Thenable[Unit] = js.native
      def load(name: androidpublisher, version: v2, callback: js.Function0[_]): Unit = js.native
      
      val purchases: PurchasesResource = js.native
      
      val reviews: ReviewsResource = js.native
    }
  }
}
