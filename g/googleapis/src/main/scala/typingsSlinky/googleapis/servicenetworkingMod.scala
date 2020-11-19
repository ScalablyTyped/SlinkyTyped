package typingsSlinky.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.googleAuthLibrary.jwtclientMod.JWTOptions
import typingsSlinky.googleapis.googleapisStrings.v1
import typingsSlinky.googleapis.googleapisStrings.v1beta
import typingsSlinky.googleapis.servicenetworkingV1Mod.servicenetworkingV1.Options
import typingsSlinky.googleapis.servicenetworkingV1Mod.servicenetworkingV1.Servicenetworking
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import typingsSlinky.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/servicenetworking", JSImport.Namespace)
@js.native
object servicenetworkingMod extends js.Object {
  
  def servicenetworking(options: Options): Servicenetworking = js.native
  def servicenetworking(options: typingsSlinky.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta.Options): typingsSlinky.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta.Servicenetworking = js.native
  @JSName("servicenetworking")
  def servicenetworking_v1(version: v1): Servicenetworking = js.native
  @JSName("servicenetworking")
  def servicenetworking_v1beta(version: v1beta): typingsSlinky.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta.Servicenetworking = js.native
  
  @js.native
  object VERSIONS extends js.Object {
    
    @js.native
    class v1 protected () extends Servicenetworking {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                Servicenetworking
              ]
            ]
    
    @js.native
    class v1beta protected ()
      extends typingsSlinky.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta.Servicenetworking {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v1beta
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                typingsSlinky.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta.Servicenetworking
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
