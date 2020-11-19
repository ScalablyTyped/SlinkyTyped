package typingsSlinky.googleapis.mod.cloudidentityV1

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Identity API
  *
  * API for provisioning and managing identity resources.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudidentity = google.cloudidentity('v1');
  *
  * @namespace cloudidentity
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Cloudidentity
  */
@JSImport("googleapis", "cloudidentity_v1.Cloudidentity")
@js.native
class Cloudidentity protected ()
  extends typingsSlinky.googleapis.cloudidentityV1Mod.cloudidentityV1.Cloudidentity {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
