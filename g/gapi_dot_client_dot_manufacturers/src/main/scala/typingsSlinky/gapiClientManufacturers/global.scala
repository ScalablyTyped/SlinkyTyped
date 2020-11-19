package typingsSlinky.gapiClientManufacturers

import typingsSlinky.gapiClientManufacturers.gapi.client.manufacturers.AccountsResource
import typingsSlinky.gapiClientManufacturers.gapiClientManufacturersStrings.manufacturers
import typingsSlinky.gapiClientManufacturers.gapiClientManufacturersStrings.v1
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
      
      val accounts: AccountsResource = js.native
      
      /** Load Manufacturer Center API v1 */
      def load(name: manufacturers, version: v1): js.Thenable[Unit] = js.native
      def load(name: manufacturers, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
