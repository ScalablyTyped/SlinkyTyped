package typingsSlinky.gapiClientClouduseraccounts

import typingsSlinky.gapiClientClouduseraccounts.gapi.client.clouduseraccounts.GlobalAccountsOperationsResource
import typingsSlinky.gapiClientClouduseraccounts.gapi.client.clouduseraccounts.GroupsResource
import typingsSlinky.gapiClientClouduseraccounts.gapi.client.clouduseraccounts.LinuxResource
import typingsSlinky.gapiClientClouduseraccounts.gapi.client.clouduseraccounts.UsersResource
import typingsSlinky.gapiClientClouduseraccounts.gapiClientClouduseraccountsStrings.clouduseraccounts
import typingsSlinky.gapiClientClouduseraccounts.gapiClientClouduseraccountsStrings.vm_alpha
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
      
      val globalAccountsOperations: GlobalAccountsOperationsResource = js.native
      
      val groups: GroupsResource = js.native
      
      val linux: LinuxResource = js.native
      
      /** Load Cloud User Accounts API vm_alpha */
      def load(name: clouduseraccounts, version: vm_alpha): js.Thenable[Unit] = js.native
      def load(name: clouduseraccounts, version: vm_alpha, callback: js.Function0[_]): Unit = js.native
      
      val users: UsersResource = js.native
    }
  }
}
