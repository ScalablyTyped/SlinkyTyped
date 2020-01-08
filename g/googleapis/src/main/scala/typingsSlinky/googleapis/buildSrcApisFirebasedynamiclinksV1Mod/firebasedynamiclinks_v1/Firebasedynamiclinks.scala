package typingsSlinky.googleapis.buildSrcApisFirebasedynamiclinksV1Mod.firebasedynamiclinks_v1

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Firebase Dynamic Links API
  *
  * Programmatically creates and manages Firebase Dynamic Links.
  *
  * @example
  * const {google} = require('googleapis');
  * const firebasedynamiclinks = google.firebasedynamiclinks('v1');
  *
  * @namespace firebasedynamiclinks
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Firebasedynamiclinks
  */
@JSImport("googleapis/build/src/apis/firebasedynamiclinks/v1", "firebasedynamiclinks_v1.Firebasedynamiclinks")
@js.native
class Firebasedynamiclinks protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var managedShortLinks: Resource$Managedshortlinks = js.native
  var shortLinks: Resource$Shortlinks = js.native
  var v1: Resource$V1 = js.native
}

