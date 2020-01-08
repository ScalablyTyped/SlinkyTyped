package typingsSlinky.googleapis.googleapisMod.iam_v1

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identity and Access Management (IAM) API
  *
  * Manages identity and access control for Google Cloud Platform resources,
  * including the creation of service accounts, which you can use to
  * authenticate to Google and make API calls.
  *
  * @example
  * const {google} = require('googleapis');
  * const iam = google.iam('v1');
  *
  * @namespace iam
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Iam
  */
@JSImport("googleapis", "iam_v1.Iam")
@js.native
class Iam protected ()
  extends typingsSlinky.googleapis.buildSrcApisIamV1Mod.iam_v1.Iam {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

