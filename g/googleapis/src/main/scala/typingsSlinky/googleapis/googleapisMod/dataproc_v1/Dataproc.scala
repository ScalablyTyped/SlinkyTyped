package typingsSlinky.googleapis.googleapisMod.dataproc_v1

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Dataproc API
  *
  * Manages Hadoop-based clusters and jobs on Google Cloud Platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const dataproc = google.dataproc('v1');
  *
  * @namespace dataproc
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Dataproc
  */
@JSImport("googleapis", "dataproc_v1.Dataproc")
@js.native
class Dataproc protected ()
  extends typingsSlinky.googleapis.buildSrcApisDataprocV1Mod.dataproc_v1.Dataproc {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

