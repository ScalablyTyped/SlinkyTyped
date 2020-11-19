package typingsSlinky.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.googleAuthLibrary.jwtclientMod.JWTOptions
import typingsSlinky.googleapis.googleapisStrings.v2
import typingsSlinky.googleapis.googleapisStrings.v2beta1
import typingsSlinky.googleapis.loggingV2Mod.loggingV2.Logging
import typingsSlinky.googleapis.loggingV2Mod.loggingV2.Options
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import typingsSlinky.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/logging", JSImport.Namespace)
@js.native
object loggingMod extends js.Object {
  
  def logging(options: Options): Logging = js.native
  def logging(options: typingsSlinky.googleapis.loggingV2beta1Mod.loggingV2beta1.Options): typingsSlinky.googleapis.loggingV2beta1Mod.loggingV2beta1.Logging = js.native
  @JSName("logging")
  def logging_v2(version: v2): Logging = js.native
  @JSName("logging")
  def logging_v2beta1(version: v2beta1): typingsSlinky.googleapis.loggingV2beta1Mod.loggingV2beta1.Logging = js.native
  
  @js.native
  object VERSIONS extends js.Object {
    
    @js.native
    class v2 protected () extends Logging {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v2
      extends TopLevel[
              Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Logging]
            ]
    
    @js.native
    class v2beta1 protected ()
      extends typingsSlinky.googleapis.loggingV2beta1Mod.loggingV2beta1.Logging {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v2beta1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                typingsSlinky.googleapis.loggingV2beta1Mod.loggingV2beta1.Logging
              ]
            ]
  }
  
  @js.native
  object auth extends TopLevel[AuthPlus] {
    
    @js.native
    /**
      * Google Compute Engine service account credentials.
      *
      * Retrieve access token from the metadata server.
      * See: https://developers.google.com/compute/docs/authentication
      */
    class Compute ()
      extends typingsSlinky.googleAuthLibrary.mod.Compute
    
    @js.native
    class JWT protected ()
      extends typingsSlinky.googleAuthLibrary.mod.JWT {
      /**
        * JWT service account credentials.
        *
        * Retrieve access token using gtoken.
        *
        * @param email service account email address.
        * @param keyFile path to private key file.
        * @param key value of key
        * @param scopes list of requested scopes or a single scope.
        * @param subject impersonated account's email address.
        * @param key_id the ID of the key
        */
      def this(options: JWTOptions) = this()
    }
  }
}
