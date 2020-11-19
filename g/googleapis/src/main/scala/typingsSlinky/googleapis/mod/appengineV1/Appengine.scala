package typingsSlinky.googleapis.mod.appengineV1

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * App Engine Admin API
  *
  * Provisions and manages developers&#39; App Engine applications.
  *
  * @example
  * const {google} = require('googleapis');
  * const appengine = google.appengine('v1');
  *
  * @namespace appengine
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Appengine
  */
@JSImport("googleapis", "appengine_v1.Appengine")
@js.native
class Appengine protected ()
  extends typingsSlinky.googleapis.appengineV1Mod.appengineV1.Appengine {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
