package typingsSlinky.maximMazurokGapiClientSqladmin

import typingsSlinky.maximMazurokGapiClientSqladmin.gapi.client.sqladmin.BackupRunsResource
import typingsSlinky.maximMazurokGapiClientSqladmin.gapi.client.sqladmin.DatabasesResource
import typingsSlinky.maximMazurokGapiClientSqladmin.gapi.client.sqladmin.FlagsResource
import typingsSlinky.maximMazurokGapiClientSqladmin.gapi.client.sqladmin.InstancesResource
import typingsSlinky.maximMazurokGapiClientSqladmin.gapi.client.sqladmin.OperationsResource
import typingsSlinky.maximMazurokGapiClientSqladmin.gapi.client.sqladmin.ProjectsResource
import typingsSlinky.maximMazurokGapiClientSqladmin.gapi.client.sqladmin.SslCertsResource
import typingsSlinky.maximMazurokGapiClientSqladmin.gapi.client.sqladmin.TiersResource
import typingsSlinky.maximMazurokGapiClientSqladmin.gapi.client.sqladmin.UsersResource
import typingsSlinky.maximMazurokGapiClientSqladmin.maximMazurokGapiClientSqladminStrings.sqladmin
import typingsSlinky.maximMazurokGapiClientSqladmin.maximMazurokGapiClientSqladminStrings.v1beta4
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
      
      /** Load Cloud SQL Admin API v1beta4 */
      def load(name: sqladmin, version: v1beta4): js.Thenable[Unit] = js.native
      def load(name: sqladmin, version: v1beta4, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object sqladmin extends js.Object {
        
        val backupRuns: BackupRunsResource = js.native
        
        val databases: DatabasesResource = js.native
        
        val flags: FlagsResource = js.native
        
        val instances: InstancesResource = js.native
        
        val operations: OperationsResource = js.native
        
        val projects: ProjectsResource = js.native
        
        val sslCerts: SslCertsResource = js.native
        
        val tiers: TiersResource = js.native
        
        val users: UsersResource = js.native
      }
    }
  }
}
