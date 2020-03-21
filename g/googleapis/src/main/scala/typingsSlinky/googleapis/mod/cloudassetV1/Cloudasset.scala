package typingsSlinky.googleapis.mod.cloudassetV1

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Asset API
  *
  * The cloud asset API manages the history and inventory of cloud resources.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudasset = google.cloudasset('v1');
  *
  * @namespace cloudasset
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Cloudasset
  */
@JSImport("googleapis", "cloudasset_v1.Cloudasset")
@js.native
class Cloudasset protected ()
  extends typingsSlinky.googleapis.cloudassetV1Mod.cloudassetV1.Cloudasset {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

