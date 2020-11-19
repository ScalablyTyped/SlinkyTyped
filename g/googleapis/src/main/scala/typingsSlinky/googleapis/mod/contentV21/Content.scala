package typingsSlinky.googleapis.mod.contentV21

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Content API for Shopping
  *
  * Manages product items, inventory, and Merchant Center accounts for Google
  * Shopping.
  *
  * @example
  * const {google} = require('googleapis');
  * const content = google.content('v2.1');
  *
  * @namespace content
  * @type {Function}
  * @version v2.1
  * @variation v2.1
  * @param {object=} options Options for Content
  */
@JSImport("googleapis", "content_v2_1.Content")
@js.native
class Content protected ()
  extends typingsSlinky.googleapis.v21Mod.contentV21.Content {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
