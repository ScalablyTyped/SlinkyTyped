package typingsSlinky.googleapis.mod.serviceusageV1

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Service Usage API
  *
  * Enables services that service consumers want to use on Google Cloud
  * Platform, lists the available or enabled services, or disables services
  * that service consumers no longer use.
  *
  * @example
  * const {google} = require('googleapis');
  * const serviceusage = google.serviceusage('v1');
  *
  * @namespace serviceusage
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Serviceusage
  */
@JSImport("googleapis", "serviceusage_v1.Serviceusage")
@js.native
class Serviceusage protected ()
  extends typingsSlinky.googleapis.serviceusageV1Mod.serviceusageV1.Serviceusage {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
