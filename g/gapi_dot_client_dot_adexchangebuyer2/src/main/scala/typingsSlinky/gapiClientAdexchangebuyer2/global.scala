package typingsSlinky.gapiClientAdexchangebuyer2

import typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2.AccountsResource
import typingsSlinky.gapiClientAdexchangebuyer2.gapiClientAdexchangebuyer2Strings.adexchangebuyer2
import typingsSlinky.gapiClientAdexchangebuyer2.gapiClientAdexchangebuyer2Strings.v2beta1
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
      
      /** Load Ad Exchange Buyer API II v2beta1 */
      def load(name: adexchangebuyer2, version: v2beta1): js.Thenable[Unit] = js.native
      def load(name: adexchangebuyer2, version: v2beta1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
