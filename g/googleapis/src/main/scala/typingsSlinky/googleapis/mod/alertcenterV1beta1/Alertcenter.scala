package typingsSlinky.googleapis.mod.alertcenterV1beta1

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * G Suite Alert Center API
  *
  * Manages alerts on issues affecting your domain.
  *
  * @example
  * const {google} = require('googleapis');
  * const alertcenter = google.alertcenter('v1beta1');
  *
  * @namespace alertcenter
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Alertcenter
  */
@JSImport("googleapis", "alertcenter_v1beta1.Alertcenter")
@js.native
class Alertcenter protected ()
  extends typingsSlinky.googleapis.v1beta1Mod.alertcenterV1beta1.Alertcenter {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
