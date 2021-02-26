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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Cloud SQL Admin API v1beta4 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: sqladmin, version: v1beta4): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: sqladmin, version: v1beta4, callback: js.Function0[_]): Unit = js.native
      
      object sqladmin {
        
        @JSGlobal("gapi.client.sqladmin.backupRuns")
        @js.native
        val backupRuns: BackupRunsResource = js.native
        
        @JSGlobal("gapi.client.sqladmin.databases")
        @js.native
        val databases: DatabasesResource = js.native
        
        @JSGlobal("gapi.client.sqladmin.flags")
        @js.native
        val flags: FlagsResource = js.native
        
        @JSGlobal("gapi.client.sqladmin.instances")
        @js.native
        val instances: InstancesResource = js.native
        
        @JSGlobal("gapi.client.sqladmin.operations")
        @js.native
        val operations: OperationsResource = js.native
        
        @JSGlobal("gapi.client.sqladmin.projects")
        @js.native
        val projects: ProjectsResource = js.native
        
        @JSGlobal("gapi.client.sqladmin.sslCerts")
        @js.native
        val sslCerts: SslCertsResource = js.native
        
        @JSGlobal("gapi.client.sqladmin.tiers")
        @js.native
        val tiers: TiersResource = js.native
        
        @JSGlobal("gapi.client.sqladmin.users")
        @js.native
        val users: UsersResource = js.native
      }
    }
  }
}
