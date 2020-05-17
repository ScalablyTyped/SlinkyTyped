package typingsSlinky.gapiClientVault

import typingsSlinky.gapiClientVault.gapi.client.vault.MattersResource
import typingsSlinky.gapiClientVault.gapiClientVaultStrings.v1
import typingsSlinky.gapiClientVault.gapiClientVaultStrings.vault
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
      val matters: MattersResource = js.native
      /** Load Google Vault API v1 */
      def load(name: vault, version: v1): js.Thenable[Unit] = js.native
      def load(name: vault, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

