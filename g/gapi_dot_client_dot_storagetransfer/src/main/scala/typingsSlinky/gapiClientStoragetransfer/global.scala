package typingsSlinky.gapiClientStoragetransfer

import typingsSlinky.gapiClientStoragetransfer.gapi.client.storagetransfer.GoogleServiceAccountsResource
import typingsSlinky.gapiClientStoragetransfer.gapi.client.storagetransfer.TransferJobsResource
import typingsSlinky.gapiClientStoragetransfer.gapi.client.storagetransfer.TransferOperationsResource
import typingsSlinky.gapiClientStoragetransfer.gapiClientStoragetransferStrings.storagetransfer
import typingsSlinky.gapiClientStoragetransfer.gapiClientStoragetransferStrings.v1
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
      
      val googleServiceAccounts: GoogleServiceAccountsResource = js.native
      
      /** Load Google Storage Transfer API v1 */
      def load(name: storagetransfer, version: v1): js.Thenable[Unit] = js.native
      def load(name: storagetransfer, version: v1, callback: js.Function0[_]): Unit = js.native
      
      val transferJobs: TransferJobsResource = js.native
      
      val transferOperations: TransferOperationsResource = js.native
    }
  }
}
