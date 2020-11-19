package typingsSlinky.googleapis.mod.cloudbuildV1

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Build API
  *
  * Creates and manages builds on Google Cloud Platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudbuild = google.cloudbuild('v1');
  *
  * @namespace cloudbuild
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Cloudbuild
  */
@JSImport("googleapis", "cloudbuild_v1.Cloudbuild")
@js.native
class Cloudbuild protected ()
  extends typingsSlinky.googleapis.cloudbuildV1Mod.cloudbuildV1.Cloudbuild {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
