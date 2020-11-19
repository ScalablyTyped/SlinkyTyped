package typingsSlinky.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.googleAuthLibrary.jwtclientMod.JWTOptions
import typingsSlinky.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1.Cloudfunctions
import typingsSlinky.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1.Options
import typingsSlinky.googleapis.googleapisStrings.v1
import typingsSlinky.googleapis.googleapisStrings.v1beta2
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import typingsSlinky.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudfunctions", JSImport.Namespace)
@js.native
object cloudfunctionsMod extends js.Object {
  
  def cloudfunctions(options: Options): Cloudfunctions = js.native
  def cloudfunctions(options: typingsSlinky.googleapis.v1beta2Mod.cloudfunctionsV1beta2.Options): typingsSlinky.googleapis.v1beta2Mod.cloudfunctionsV1beta2.Cloudfunctions = js.native
  @JSName("cloudfunctions")
  def cloudfunctions_v1(version: v1): Cloudfunctions = js.native
  @JSName("cloudfunctions")
  def cloudfunctions_v1beta2(version: v1beta2): typingsSlinky.googleapis.v1beta2Mod.cloudfunctionsV1beta2.Cloudfunctions = js.native
  
  @js.native
  object VERSIONS extends js.Object {
    
    @js.native
    class v1 protected () extends Cloudfunctions {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                Cloudfunctions
              ]
            ]
    
    @js.native
    class v1beta2 protected ()
      extends typingsSlinky.googleapis.v1beta2Mod.cloudfunctionsV1beta2.Cloudfunctions {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v1beta2
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                typingsSlinky.googleapis.v1beta2Mod.cloudfunctionsV1beta2.Cloudfunctions
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
