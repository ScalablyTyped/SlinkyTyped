package typingsSlinky.googleapis.mod.healthcareV1alpha

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Healthcare API
  *
  * Manage, store, and access healthcare data in Google Cloud Platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const healthcare = google.healthcare('v1alpha');
  *
  * @namespace healthcare
  * @type {Function}
  * @version v1alpha
  * @variation v1alpha
  * @param {object=} options Options for Healthcare
  */
@JSImport("googleapis", "healthcare_v1alpha.Healthcare")
@js.native
class Healthcare protected ()
  extends typingsSlinky.googleapis.healthcareV1alphaMod.healthcareV1alpha.Healthcare {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
