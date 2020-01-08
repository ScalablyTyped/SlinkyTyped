package typingsSlinky.googleapis.googleapisMod

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "urlshortener_v1")
@js.native
object urlshortener_v1 extends js.Object {
  @js.native
  class Resource$Url protected ()
    extends typingsSlinky.googleapis.buildSrcApisUrlshortenerV1Mod.urlshortener_v1.Resource$Url {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * URL Shortener API
    *
    * Lets you create, inspect, and manage goo.gl short URLs
    *
    * @example
    * const {google} = require('googleapis');
    * const urlshortener = google.urlshortener('v1');
    *
    * @namespace urlshortener
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Urlshortener
    */
  @js.native
  class Urlshortener protected ()
    extends typingsSlinky.googleapis.buildSrcApisUrlshortenerV1Mod.urlshortener_v1.Urlshortener {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
}

