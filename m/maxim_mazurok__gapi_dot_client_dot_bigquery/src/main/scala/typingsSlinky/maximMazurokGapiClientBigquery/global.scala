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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object bigquery {
        
        @JSGlobal("gapi.client.bigquery.datasets")
        @js.native
        val datasets: DatasetsResource = js.native
        
        @JSGlobal("gapi.client.bigquery.jobs")
        @js.native
        val jobs: JobsResource = js.native
        
        @JSGlobal("gapi.client.bigquery.models")
        @js.native
        val models: ModelsResource = js.native
        
        @JSGlobal("gapi.client.bigquery.projects")
        @js.native
        val projects: ProjectsResource = js.native
        
        @JSGlobal("gapi.client.bigquery.routines")
        @js.native
        val routines: RoutinesResource = js.native
        
        @JSGlobal("gapi.client.bigquery.rowAccessPolicies")
        @js.native
        val rowAccessPolicies: RowAccessPoliciesResource = js.native
        
        @JSGlobal("gapi.client.bigquery.tabledata")
        @js.native
        val tabledata: TabledataResource = js.native
        
        @JSGlobal("gapi.client.bigquery.tables")
        @js.native
        val tables: TablesResource = js.native
      }
      
      /** Load BigQuery API v2 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: bigquery, version: v2): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: bigquery, version: v2, callback: js.Function0[_]): Unit = js.native
    }
  }
}
