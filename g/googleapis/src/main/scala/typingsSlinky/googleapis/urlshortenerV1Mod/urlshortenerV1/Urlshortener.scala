package typingsSlinky.googleapis.urlshortenerV1Mod.urlshortenerV1

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@JSImport("googleapis/build/src/apis/urlshortener/v1", "urlshortener_v1.Urlshortener")
@js.native
class Urlshortener protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var url: ResourceUrl = js.native
}
