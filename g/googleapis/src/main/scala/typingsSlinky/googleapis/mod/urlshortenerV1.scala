package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlshortenerV1 {
  
  @JSImport("googleapis", "urlshortener_v1.Resource$Url")
  @js.native
  class ResourceUrl protected ()
    extends typingsSlinky.googleapis.urlshortenerV1Mod.urlshortenerV1.ResourceUrl {
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
  @JSImport("googleapis", "urlshortener_v1.Urlshortener")
  @js.native
  class Urlshortener protected ()
    extends typingsSlinky.googleapis.urlshortenerV1Mod.urlshortenerV1.Urlshortener {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
