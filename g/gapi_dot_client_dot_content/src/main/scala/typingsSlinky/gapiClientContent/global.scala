package typingsSlinky.gapiClientContent

import typingsSlinky.gapiClientContent.gapi.client.content.AccountsResource
import typingsSlinky.gapiClientContent.gapi.client.content.AccountstatusesResource
import typingsSlinky.gapiClientContent.gapi.client.content.AccounttaxResource
import typingsSlinky.gapiClientContent.gapi.client.content.DatafeedsResource
import typingsSlinky.gapiClientContent.gapi.client.content.DatafeedstatusesResource
import typingsSlinky.gapiClientContent.gapi.client.content.InventoryResource
import typingsSlinky.gapiClientContent.gapi.client.content.OrdersResource
import typingsSlinky.gapiClientContent.gapi.client.content.ProductsResource
import typingsSlinky.gapiClientContent.gapi.client.content.ProductstatusesResource
import typingsSlinky.gapiClientContent.gapi.client.content.ShippingsettingsResource
import typingsSlinky.gapiClientContent.gapiClientContentStrings.content
import typingsSlinky.gapiClientContent.gapiClientContentStrings.v2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      val accounts: AccountsResource = js.native
      val accountstatuses: AccountstatusesResource = js.native
      val accounttax: AccounttaxResource = js.native
      val datafeeds: DatafeedsResource = js.native
      val datafeedstatuses: DatafeedstatusesResource = js.native
      val inventory: InventoryResource = js.native
      val orders: OrdersResource = js.native
      val products: ProductsResource = js.native
      val productstatuses: ProductstatusesResource = js.native
      val shippingsettings: ShippingsettingsResource = js.native
      /** Load Content API for Shopping v2 */
      def load(name: content, version: v2): js.Thenable[Unit] = js.native
      def load(name: content, version: v2, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

