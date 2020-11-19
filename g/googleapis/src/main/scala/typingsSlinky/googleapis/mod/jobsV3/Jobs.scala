package typingsSlinky.googleapis.mod.jobsV3

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
