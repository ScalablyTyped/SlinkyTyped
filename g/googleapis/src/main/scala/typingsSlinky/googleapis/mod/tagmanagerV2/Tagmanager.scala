package typingsSlinky.googleapis.mod.tagmanagerV2

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Tag Manager API
  *
  * Accesses Tag Manager accounts and containers.
  *
  * @example
  * const {google} = require('googleapis');
  * const tagmanager = google.tagmanager('v2');
  *
  * @namespace tagmanager
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Tagmanager
  */
@JSImport("googleapis", "tagmanager_v2.Tagmanager")
@js.native
class Tagmanager protected ()
  extends typingsSlinky.googleapis.tagmanagerV2Mod.tagmanagerV2.Tagmanager {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
