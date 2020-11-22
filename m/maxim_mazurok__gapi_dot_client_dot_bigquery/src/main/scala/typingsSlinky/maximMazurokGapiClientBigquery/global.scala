package typingsSlinky.maximMazurokGapiClientBigquery

import typingsSlinky.maximMazurokGapiClientBigquery.gapi.client.bigquery.DatasetsResource
import typingsSlinky.maximMazurokGapiClientBigquery.gapi.client.bigquery.JobsResource
import typingsSlinky.maximMazurokGapiClientBigquery.gapi.client.bigquery.ModelsResource
import typingsSlinky.maximMazurokGapiClientBigquery.gapi.client.bigquery.ProjectsResource
import typingsSlinky.maximMazurokGapiClientBigquery.gapi.client.bigquery.RoutinesResource
import typingsSlinky.maximMazurokGapiClientBigquery.gapi.client.bigquery.RowAccessPoliciesResource
import typingsSlinky.maximMazurokGapiClientBigquery.gapi.client.bigquery.TabledataResource
import typingsSlinky.maximMazurokGapiClientBigquery.gapi.client.bigquery.TablesResource
import typingsSlinky.maximMazurokGapiClientBigquery.maximMazurokGapiClientBigqueryStrings.bigquery
import typingsSlinky.maximMazurokGapiClientBigquery.maximMazurokGapiClientBigqueryStrings.v2
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
      
      /** Load BigQuery API v2 */
      def load(name: bigquery, version: v2): js.Thenable[Unit] = js.native
      def load(name: bigquery, version: v2, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object bigquery extends js.Object {
        
        val datasets: DatasetsResource = js.native
        
        val jobs: JobsResource = js.native
        
        val models: ModelsResource = js.native
        
        val projects: ProjectsResource = js.native
        
        val routines: RoutinesResource = js.native
        
        val rowAccessPolicies: RowAccessPoliciesResource = js.native
        
        val tabledata: TabledataResource = js.native
        
        val tables: TablesResource = js.native
      }
    }
  }
}
