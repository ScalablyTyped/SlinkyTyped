package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jobsV3 {
  
  /**
    * Cloud Talent Solution API
    *
    * Cloud Talent Solution provides the capability to create, read, update, and
    * delete job postings, as well as search jobs based on keywords and filters.
    *
    * @example
    * const {google} = require('googleapis');
    * const jobs = google.jobs('v3');
    *
    * @namespace jobs
    * @type {Function}
    * @version v3
    * @variation v3
    * @param {object=} options Options for Jobs
    */
  @JSImport("googleapis", "jobs_v3.Jobs")
  @js.native
  class Jobs protected ()
    extends typingsSlinky.googleapis.jobsV3Mod.jobsV3.Jobs {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "jobs_v3.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typingsSlinky.googleapis.jobsV3Mod.jobsV3.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "jobs_v3.Resource$Projects$Clientevents")
  @js.native
  class ResourceProjectsClientevents protected ()
    extends typingsSlinky.googleapis.jobsV3Mod.jobsV3.ResourceProjectsClientevents {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "jobs_v3.Resource$Projects$Companies")
  @js.native
  class ResourceProjectsCompanies protected ()
    extends typingsSlinky.googleapis.jobsV3Mod.jobsV3.ResourceProjectsCompanies {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "jobs_v3.Resource$Projects$Jobs")
  @js.native
  class ResourceProjectsJobs protected ()
    extends typingsSlinky.googleapis.jobsV3Mod.jobsV3.ResourceProjectsJobs {
    def this(context: APIRequestContext) = this()
  }
}
