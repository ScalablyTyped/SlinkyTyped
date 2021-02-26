package typingsSlinky.googleapis

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleAuthLibrary.googleauthMod.GoogleAuthOptions
import typingsSlinky.googleAuthLibrary.jwtclientMod.JWTOptions
import typingsSlinky.googleAuthLibrary.mod.GoogleAuth
import typingsSlinky.googleapis.anon.ReadonlyEndpoint
import typingsSlinky.googleapis.anon.TypeofOAuth2Client
import typingsSlinky.googleapis.apisMod.GeneratedAPIs
import typingsSlinky.googleapisCommon.apiMod.APIEndpoint
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googleapisMod {
  
  @JSImport("googleapis/build/src/googleapis", "AuthPlus")
  @js.native
  class AuthPlus () extends GoogleAuth {
    def this(opts: GoogleAuthOptions) = this()
    
    var Compute: Instantiable0[typingsSlinky.googleAuthLibrary.mod.Compute] = js.native
    
    var JWT: Instantiable1[/* options */ JWTOptions, typingsSlinky.googleAuthLibrary.mod.JWT] = js.native
    
    var OAuth2: TypeofOAuth2Client = js.native
  }
  
  @JSImport("googleapis/build/src/googleapis", "GoogleApis")
  @js.native
  /**
    * GoogleApis constructor.
    *
    * @example
    * const GoogleApis = require('googleapis').GoogleApis;
    * const google = new GoogleApis();
    *
    * @class GoogleApis
    * @param {Object} [options] Configuration options.
    */
  class GoogleApis ()
    extends GeneratedAPIs
       with /* index */ StringDictionary[APIEndpoint] {
    def this(options: GlobalOptions) = this()
    
    var _discovery: js.Any = js.native
    
    var _options: GlobalOptions = js.native
    
    /**
      * Add APIs endpoints to googleapis object
      * E.g. googleapis.drive and googleapis.datastore
      *
      * @name GoogleApis#addAPIs
      * @method
      * @param {Object} apis Apis to be added to this GoogleApis instance.
      * @private
      */
    var addAPIs: js.Any = js.native
    
    var auth: AuthPlus = js.native
    
    /**
      * Dynamically generate an apis object that can provide Endpoint objects for
      * the discovered APIs.
      *
      * @example
      * const {google} = require('googleapis');
      * const discoveryUrl =
      * 'https://myapp.appspot.com/_ah/api/discovery/v1/apis/';
      * google.discover(discoveryUrl, function (err) {
      *   const someapi = google.someapi('v1');
      * });
      *
      * @name GoogleApis#discover
      * @method
      * @param url Url to the discovery service for a set of APIs. e.g.,
      * https://www.googleapis.com/discovery/v1/apis
      * @param {Function} callback Callback function.
      */
    def discover(url: String): js.Promise[Unit] = js.native
    def discover(url: String, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    /**
      * Dynamically generate an Endpoint object from a discovery doc.
      *
      * @param path Url or file path to discover doc for a single API.
      * @param Options to configure the Endpoint object generated from the
      * discovery doc.
      * @returns A promise that resolves with the configured endpoint.
      */
    def discoverAPI(apiPath: String): js.Promise[ReadonlyEndpoint] = js.native
    def discoverAPI(apiPath: String, options: js.Object): js.Promise[ReadonlyEndpoint] = js.native
    
    var discoverAsync: js.Any = js.native
    
    /**
      * Obtain a Map of supported APIs, along with included API versions.
      */
    def getSupportedAPIs(): StringDictionary[js.Array[String]] = js.native
    
    /**
      * Set options.
      *
      * @param  {Object} [options] Configuration options.
      */
    def options(): Unit = js.native
    def options(options: GlobalOptions): Unit = js.native
  }
}
