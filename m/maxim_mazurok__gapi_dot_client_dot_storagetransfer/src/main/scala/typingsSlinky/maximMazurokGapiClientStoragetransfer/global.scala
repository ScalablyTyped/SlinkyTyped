package typingsSlinky.maximMazurokGapiClientStoragetransfer

import typingsSlinky.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer.GoogleServiceAccountsResource
import typingsSlinky.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer.TransferJobsResource
import typingsSlinky.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer.TransferOperationsResource
import typingsSlinky.maximMazurokGapiClientStoragetransfer.maximMazurokGapiClientStoragetransferStrings.storagetransfer
import typingsSlinky.maximMazurokGapiClientStoragetransfer.maximMazurokGapiClientStoragetransferStrings.v1
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
      
      /** Load Storage Transfer API v1 */
      def load(name: storagetransfer, version: v1): js.Thenable[Unit] = js.native
      def load(name: storagetransfer, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object storagetransfer extends js.Object {
        
        val googleServiceAccounts: GoogleServiceAccountsResource = js.native
        
        val transferJobs: TransferJobsResource = js.native
        
        val transferOperations: TransferOperationsResource = js.native
      }
    }
  }
}
