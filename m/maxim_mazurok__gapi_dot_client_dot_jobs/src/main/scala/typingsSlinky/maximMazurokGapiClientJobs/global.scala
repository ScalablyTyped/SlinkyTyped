package typingsSlinky.maximMazurokGapiClientJobs

import typingsSlinky.maximMazurokGapiClientJobs.gapi.client.jobs.ProjectsResource
import typingsSlinky.maximMazurokGapiClientJobs.maximMazurokGapiClientJobsStrings.jobs
import typingsSlinky.maximMazurokGapiClientJobs.maximMazurokGapiClientJobsStrings.v3
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
      
      /** Load Cloud Talent Solution API v3 */
      def load(name: jobs, version: v3): js.Thenable[Unit] = js.native
      def load(name: jobs, version: v3, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object jobs extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
