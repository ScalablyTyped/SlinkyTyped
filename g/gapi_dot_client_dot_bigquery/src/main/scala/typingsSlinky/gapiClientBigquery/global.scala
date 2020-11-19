package typingsSlinky.gapiClientBigquery

import typingsSlinky.gapiClientBigquery.gapi.client.bigquery.DatasetsResource
import typingsSlinky.gapiClientBigquery.gapi.client.bigquery.JobsResource
import typingsSlinky.gapiClientBigquery.gapi.client.bigquery.ProjectsResource
import typingsSlinky.gapiClientBigquery.gapi.client.bigquery.TabledataResource
import typingsSlinky.gapiClientBigquery.gapi.client.bigquery.TablesResource
import typingsSlinky.gapiClientBigquery.gapiClientBigqueryStrings.bigquery
import typingsSlinky.gapiClientBigquery.gapiClientBigqueryStrings.v2
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
      
      val datasets: DatasetsResource = js.native
      
      val jobs: JobsResource = js.native
      
      /** Load BigQuery API v2 */
      def load(name: bigquery, version: v2): js.Thenable[Unit] = js.native
      def load(name: bigquery, version: v2, callback: js.Function0[_]): Unit = js.native
      
      val projects: ProjectsResource = js.native
      
      val tabledata: TabledataResource = js.native
      
      val tables: TablesResource = js.native
    }
  }
}
