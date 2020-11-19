package typingsSlinky.googleapis.mod.polyV1

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Poly API
  *
  * The Poly API provides read access to assets hosted on &lt;a
  * href=&quot;https://poly.google.com&quot;&gt;poly.google.com&lt;/a&gt; to
  * all, and upload access to &lt;a
  * href=&quot;https://poly.google.com&quot;&gt;poly.google.com&lt;/a&gt; for
  * whitelisted accounts.
  *
  * @example
  * const {google} = require('googleapis');
  * const poly = google.poly('v1');
  *
  * @namespace poly
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Poly
  */
@JSImport("googleapis", "poly_v1.Poly")
@js.native
class Poly protected ()
  extends typingsSlinky.googleapis.polyV1Mod.polyV1.Poly {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
