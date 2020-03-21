package typingsSlinky.googleapis.mod.jobsV3p1beta1

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Talent Solution API
  *
  * Cloud Talent Solution provides the capability to create, read, update, and
  * delete job postings, as well as search jobs based on keywords and filters.
  *
  * @example
  * const {google} = require('googleapis');
  * const jobs = google.jobs('v3p1beta1');
  *
  * @namespace jobs
  * @type {Function}
  * @version v3p1beta1
  * @variation v3p1beta1
  * @param {object=} options Options for Jobs
  */
@JSImport("googleapis", "jobs_v3p1beta1.Jobs")
@js.native
class Jobs protected ()
  extends typingsSlinky.googleapis.v3p1beta1Mod.jobsV3p1beta1.Jobs {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

